package com.java.test;

import org.junit.Test;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import static org.junit.Assert.*;

public class programTest {

    @Test
    public void test_StringUtils_trim() {
        String str1 = "   zzh \t";
        String str2 = "zzh";
        assertEquals(str2,StringUtils.trim(str2));
    }

    @Test
    public void test_StringUtils_indexOf() {
        String str = "aabaabaa";
        assertEquals(5,StringUtils.indexOf(str, "b", 3));
    }

    @Test
    public void test_ArrayUtils_getlenth()
    {
        int[] arr = {1,7,3,8,1,0};
        assertEquals(6,ArrayUtils.getLength(arr));
    }


    @Test
    public void test_init()
    {
        program test1 =new program();
        int[] arr = test1.init(7);
        int temp= 1;
        for(int i=0; i<7; i++)
        {
            if(arr[i]<50&&arr[i]>=0)
                continue;
            else
                temp=0;
        }
        assertEquals(1,temp);
    }

    @Test
    public void test_same()
    {
        program test2 =new program();
        int[] arr1 = {1,7,3,8,1,0};
        int[] arr2 = {1,7,3,8,1,0};
        assertEquals(true,test2.same_array(arr1, arr2));
    }

    @Test
    public void test_not_same()
    {
        program test2 =new program();
        int[] arr1 = {1,7,3,8,1,0};
        int[] arr2 = {1,7,3,6,1,0};
        assertEquals(false,test2.same_array(arr1, arr2));
    }

    @Test
    public void test_add()
    {
        program test3 =new program();
        int[] arr1 = {1,2};
        arr1 = test3.add_array(arr1);
        assertEquals(3,arr1.length);
    }
}