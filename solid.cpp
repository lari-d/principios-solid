#include <iostream>
using namespace std;

class Circulo{
    private:
    float raio;
    const float pi = 3.14;
    
    public:
    //construtor
    Circulo(float r){
        this->raio = r;
    }

    float getRaio(){
        return this->raio;
    }

    void setRaio(float r){
        this->raio = r;
    }
    //viola o principio de responsabilidade única
    //pois calcula a area do circulo e imprime
    void areaCirculo(float r){
        float area = pi*r*r;
        cout << "area: " << area << endl;
    }
    //viola o principio de responsabilidade única
    //pois calcula o perimetro do circulo e imprime
    void perimetroCirculo(float r){
        float per = 2*pi*r;
        cout << "perimetro: " << per << endl;
    }

};

int main(){
    Circulo* a = new Circulo(10);
    a->printArea();
    a->printCirculo();

    delete a;
}

