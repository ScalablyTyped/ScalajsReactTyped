package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于检测和识别图片中的动物信息
  */
trait animalClassifyOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var image: String
  
  // 返回预测得分top结果数，默认为6
  @JSName("success")
  var success_animalClassifyOptions: js.UndefOr[js.Function1[/* res */ animalClassifyResponse, Unit]] = js.undefined
  
  // 图像资源地址
  var top_num: js.UndefOr[Double] = js.undefined
}
object animalClassifyOptions {
  
  inline def apply(image: String): animalClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyOptions]
  }
  
  extension [Self <: animalClassifyOptions](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ animalClassifyResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ animalClassifyResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    inline def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
