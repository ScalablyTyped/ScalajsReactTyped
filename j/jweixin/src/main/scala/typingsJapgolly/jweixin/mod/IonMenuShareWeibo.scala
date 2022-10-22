package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuShareWeibo
  extends StObject
     with BaseParams {
  
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
  
  // 分享标题
  var desc: String
  
  // 分享链接
  var imgUrl: String
  
  // 分享描述
  var link: String
  
  // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareWeibo(): Unit
  
  var title: String
}
object IonMenuShareWeibo {
  
  inline def apply(cancel: Callback, desc: String, imgUrl: String, link: String, success: Callback, title: String): IonMenuShareWeibo = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = success.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareWeibo]
  }
  
  extension [Self <: IonMenuShareWeibo](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
