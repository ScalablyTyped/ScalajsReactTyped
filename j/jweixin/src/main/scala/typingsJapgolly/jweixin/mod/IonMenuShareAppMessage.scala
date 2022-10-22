package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.jweixinStrings.link
import typingsJapgolly.jweixin.jweixinStrings.music
import typingsJapgolly.jweixin.jweixinStrings.video或link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuShareAppMessage
  extends StObject
     with BaseParams {
  
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
  
  // 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.undefined
  
  // 分享标题
  var desc: String
  
  // 分享链接
  var imgUrl: String
  
  // 分享描述
  var link: String
  
  // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit
  
  var title: String
  
  // 分享图标
  var `type`: js.UndefOr[music | video或link | link] = js.undefined
}
object IonMenuShareAppMessage {
  
  inline def apply(cancel: Callback, desc: String, imgUrl: String, link: String, success: Callback, title: String): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = success.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
  
  extension [Self <: IonMenuShareAppMessage](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: music | video或link | link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
