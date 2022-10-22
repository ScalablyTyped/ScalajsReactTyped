package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String
  
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: String
  
  /** confirm框的内容 */
  var content: String
  
  @JSName("success")
  def success_MConfirmOptions(result: Confirm): Unit
  
  /** confirm框的标题 */
  var title: String
}
object ConfirmOptions {
  
  inline def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: Confirm => Callback,
    title: String
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], confirmButtonText = confirmButtonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Confirm) => success(t0).runNow()), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  extension [Self <: ConfirmOptions](x: Self) {
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Confirm => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Confirm) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
