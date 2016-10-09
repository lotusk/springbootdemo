package hello

import java.util.concurrent.TimeUnit

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.{RestController, ResponseBody, RequestMethod, RequestMapping}

import scala.beans.BeanProperty

/**
 * Created by lucifer on 16/8/16.
 */

class Message {
  @BeanProperty
  var value: String = _
}


@RestController
class ScalaSampleController {

  @RequestMapping(value = Array("/hello"), method = Array(RequestMethod.GET))
  @ResponseBody
  def hello(): Message = {
    TimeUnit.SECONDS.sleep(6)
    val message = new Message()
    message.value = "Hello, Scala for Spring!"
    print("heheheh")
    message
  }

//  def main(args: Array[String]) {
//    SpringApplication.run(classOf[].,args)
//  }
}


//object  ScalaSampleController{
//  def main(args: Array[String]) {
//    SpringApplication.run(classOf[ScalaSampleController])
//  }
//}
