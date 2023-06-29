// 핸드폰 번호 뒷자리 빼고 가리기

class test0629 {
    public String test0629(String phone_number) {
        String answer = "";
        String arr[] = phone_number.split("");

        for(int i=0; i < arr.length; i++){
            if(i < arr.length - 4) {
                answer += "*";
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}

