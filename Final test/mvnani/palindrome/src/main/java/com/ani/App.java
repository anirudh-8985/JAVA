package com.ani;

/**
 * Hello world!
 *
 */
public class App 
{
    public String lowercase(String data)
    {
        int len = data.length();
        String output = "";

        for(int i=0; i<len; i++)
        {
            char temp = data.charAt(i);
            if(temp > 64 && temp < 91)
            {       
                int ascii = (int)temp;
                ascii += 32;
                temp = (char)ascii;
                output = output + temp;
            }

            else{
                output = output + temp;
            }
        }

        return output;
    }

    public String uppercase(String data)
    {
        int len = data.length();
        String output = "";

        for(int i=0; i<len; i++)
        {
            char temp = data.charAt(i);
            if(temp > 96 && temp < 123)
            {       
                int ascii = (int)temp;
                ascii -= 32;
                temp = (char)ascii;
                output = output + temp;
            }

            else{
                output = output + temp;
            }
        }

        return output;

    }

    public String converttoascii(String data)
    {
        int len = data.length();
        String output = "";
        int space = 32; // Ascii value for space.
    
        for(int i=0; i<len; i++)
        {
            char temp = data.charAt(i);
            if(temp > 31 && temp < 127)
            {       
                int ascii = (int)temp;
                output = output + ascii;
                output = output + (char)space;

            }

        }

        return output;

    }

    public String shift_amount(String data, String action)
    {
        
        
        int space = Integer.parseInt(action); 
        int len = data.length();
        String output = "";

        if(space > 0 && space <26) // if the range is from 1 to 25.
        {    
            for(int i=0; i<len; i++)
            {
                char temp = data.charAt(i);
                int j = (int)temp;
                if(j>64 && j<91)
                {
                     System.out.println(temp + "inside if");
                    j -= 65;
                    j += space;
                    if(j>25)
                    {
                        j -= 26;
                    }
                    j += 65;

                    temp = (char)j;
                    output = output + temp;

                }
      
                else
                {
                    j -= 97;
                    j += space;
                    if(j>25)
                    {
                        j -= 26;
                    }
                    j += 97;

                    temp = (char)j;
                    output = output + temp;

                }
                
            }
             return output;
        } 

        else if(space > -26 && space <0) // if the range is from -25 t0 -1.
        {
        
            for(int i=0; i<len; i++)
            {
                char temp = data.charAt(i);
                int j = (int)temp;
                if(j>64 && j<91)
                {
                     System.out.println(temp + "inside if");
                    j -= 65;
                    j += space;
                    if(j<0)
                    {
                        j += 26;
                    }
                    j += 65;

                    temp = (char)j;
                    output = output + temp;

                }
      
                else
                {
                    j -= 97;
                    j += space;
                    if(j<0)
                    {
                        j += 26;
                    }
                    j += 97;

                    temp = (char)j;
                    output = output + temp;

                }
                

            }

             return output;
        }

           

        else
        {
            String error = "Incorrect input";
            return error;
        }

    }

    public String labtest(String data, String option, String action)
    {
        if(option.equals("-c"))
        {
            if(action.equals("lower")){
                String lower = lowercase(data) ;
                return lower;

            }

            else
            {
                String upper = uppercase(data) ;
                return upper;

            }
        }

        else if(option.equals("-a"))
        {
            String ascii = converttoascii(data);
            return ascii;
        }

        else if (option.equals("-e")) {

            if(action.equals("0"))
            {
                return data;
            }
            
            else
            {
                String shift_amount = shift_amount(data,action);
                return shift_amount;
            }
        }

        else{
            String error = "Inputs are wrong";
            return error;
        }
    }
}





