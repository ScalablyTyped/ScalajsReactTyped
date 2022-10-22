package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
  * 片的菜品名称、卡路里信息、置信度。
  */
trait dishClassifyOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 图像资源地址
  var filter_threshold: js.UndefOr[Double] = js.undefined
  
  var image: String
  
  // 返回结果top n，默认5。
  @JSName("success")
  var success_dishClassifyOptions: js.UndefOr[js.Function1[/* res */ dishClassifyResponse, Unit]] = js.undefined
  
  // 默认0.95，可以通过该参数调节识别效果，降低非菜识别率.
  var top_num: js.UndefOr[Double] = js.undefined
}
object dishClassifyOptions {
  
  inline def apply(image: String): dishClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyOptions]
  }
  
  extension [Self <: dishClassifyOptions](x: Self) {
    
    inline def setFilter_threshold(value: Double): Self = StObject.set(x, "filter_threshold", value.asInstanceOf[js.Any])
    
    inline def setFilter_thresholdUndefined: Self = StObject.set(x, "filter_threshold", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ dishClassifyResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ dishClassifyResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    inline def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
