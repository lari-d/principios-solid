public interface Trabalhador {
    void trabalhar();

    void participarDeReunioes();

    void tirarFerias();

    void gerenciarProjeto();

}

/*public class Desenvolvedor implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando...");
    }

    @Override
    public void participarDeReunioes() {
        System.out.println("Desenvolvedor participando de reuniões...");
    }

    @Override
    public void tirarFerias() {
        System.out.println("Desenvolvedor tirando férias...");
    }

    @Override
    public void gerenciarProjeto() {
        // Desenvolvedores não gerenciam projetos, então este método não faz sentido para eles
    }
}

public class Gerente implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando...");
    }

    @Override
    public void participarDeReunioes() {
        System.out.println("Gerente participando de reuniões...");
    }

    @Override
    public void tirarFerias() {
        System.out.println("Gerente tirando férias...");
    }
    
    @Override
    public void gerenciarProjeto() {
        System.out.println("Gerente gerenciando projeto...");
    }
}*/
//as duas classes Desenvolvedor e Gerente implementam a interface Trabalhador, mas o problema surge quando percebemos que 
//o método gerenciarProjeto() não faz sentido para um Desenvolvedor
// No entanto, devido à interface única, Desenvolvedor é forçado a implementar esse método
// o que viola o Princípio da Segregação de Interfaces (ISP).

// Interface para um trabalhador que pode trabalhar e participar de reuniões
public interface TrabalhadorComum {
    void trabalhar();
    void participarDeReunioes();
}

// Interface para um trabalhador que pode tirar férias
public interface TrabalhadorComFerias {
    void tirarFerias();
}

// Interface para um trabalhador que pode gerenciar projetos
public interface TrabalhadorComGerenciamentoProjeto {
    void gerenciarProjeto();
}

// Implementação para um desenvolvedor que implementa apenas as responsabilidades de TrabalhadorComum e TrabalhadorComFerias
public class Desenvolvedor implements TrabalhadorComum, TrabalhadorComFerias {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando...");
    }

    @Override
    public void participarDeReunioes() {
        System.out.println("Desenvolvedor participando de reuniões...");
    }
    
    @Override
    public void tirarFerias() {
        System.out.println("Desenvolvedor tirando férias...");
    }
}

// Implementação para um gerente que implementa todas as responsabilidades de TrabalhadorComum, TrabalhadorComFerias e TrabalhadorComGerenciamentoProjeto
public class Gerente implements TrabalhadorComum, TrabalhadorComFerias, TrabalhadorComGerenciamentoProjeto {
    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando...");
    }

    @Override
    public void participarDeReunioes() {
        System.out.println("Gerente participando de reuniões...");
    }

    @Override
    public void tirarFerias() {
        System.out.println("Gerente tirando férias...");
    }

    @Override
    public void gerenciarProjeto() {
        System.out.println("Gerente gerenciando projeto...");
    }
}