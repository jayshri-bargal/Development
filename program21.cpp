//Accept string form user &convert that string into Upper case
#include<iostream>
using namespace std;

void struprX(char str[])
{
    while(*str!='\0')
    {
        if((*str >='a') && (*str <='z'))
        {
            *str = *str - 32;
        }
        str++;
    }
    
}
int main()
{
    char Arr[20];
    

    cout<<"Enter string"<<endl;
   cin.getline(Arr,20);

    struprX(Arr);
    cout<<"String in Upper case: "<<Arr<<endl;
    return 0;
}
