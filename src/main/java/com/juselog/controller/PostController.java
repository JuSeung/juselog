package com.juselog.controller;

import com.juselog.request.PostCreate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class PostController {

    @PostMapping("/posts")
    public Map<String, String> get(@RequestBody @Valid PostCreate postCreate) {


        return Map.of();
    }


//        if (result.hasErrors()) {
//            1. 매번 메서드마다 값을 검증 해야 한다.
//               > 개발자가 까먹을 수 있다.
//               > 검증 부분에서 버그가 발생할 여지가 높다.
//               > 지겹다.(간지가 안난다)
//            2. 응답값에 HashMap -> 응답 클래스를 만들어 주는게 좋습니다.
//            3. 여러개의 에러처리 힘든
//            4. 세 번이상의 반복적인 작업은 피해야 한다.
//              - 코드 && 개발에 관한 모든것
//              - 자동화 고려
//            List<FieldError> fieldErrorList = result.getFieldErrors();
//            FieldError fieldError = fieldErrorList.get(0);
//
//            String fildName = fieldError.getField(); // title
//            String errorMessage = fieldError.getDefaultMessage(); // 에러메시지
//
//            Map<String, String> error = new HashMap<>();
//            error.put(fildName, errorMessage);
//            return error;
//        }

//        if (title == null || title.equals("")) {
//            // 1. 빡세다.(노가다)
//            // 2. 개발티 -> 무언가 3번 이상 반복작업을 할때 내가 뭔자 잘못 하고 있는건 아닐지 의심한다.
//            // 3. 누락 가능성
//            // 4. 생각보다 검증 해야할게 많다.(꼼꼼하지 않을 수 있다.)
//            // 5. 뭔가 개발자스럽지 않다.
//            throw new Exception("타이틀 값이 없어요.");
//        }
//
//        if (content == null || content.equals("")) {
//
//        }

        // get HttpMethod
        // 1. @RequestParam String title, @RequestParam String content
        // 2. @RequestParam Map<String, String> params

}
