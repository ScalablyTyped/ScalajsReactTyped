package typingsJapgolly.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 交互反馈 https://docs.alipay.com/mini/api/ui-feedback
trait AlertOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 按钮文字，默认确定 */
  var buttonText: String
  
  /** alert框的内容 */
  var content: String
  
  /** alert框的标题 */
  var title: String
}
object AlertOptions {
  
  inline def apply(buttonText: String, content: String, title: String): AlertOptions = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptions]
  }
  
  extension [Self <: AlertOptions](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
