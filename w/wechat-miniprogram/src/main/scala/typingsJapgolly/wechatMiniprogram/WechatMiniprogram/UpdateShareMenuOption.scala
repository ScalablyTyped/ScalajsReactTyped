package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShareMenuOption extends StObject {
  
  /** 动态消息的 activityId。通过 [updatableMessage.createActivityId](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/updatable-message/updatableMessage.createActivityId.html) 接口获取
    *
    * 最低基础库： `2.4.0` */
  var activityId: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateShareMenuCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateShareMenuFailCallback] = js.undefined
  
  /** 是否是私密消息。详见 [小程序私密消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share/private-message.html)
    *
    * 最低基础库： `2.13.0` */
  var isPrivateMessage: js.UndefOr[Boolean] = js.undefined
  
  /** 是否是动态消息，详见[动态消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share/updatable-message.html)
    *
    * 最低基础库： `2.4.0` */
  var isUpdatableMessage: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateShareMenuSuccessCallback] = js.undefined
  
  /** 动态消息的模板信息
    *
    * 最低基础库： `2.4.0` */
  var templateInfo: js.UndefOr[UpdatableMessageFrontEndTemplateInfo] = js.undefined
  
  /** 群待办消息的id，通过toDoActivityId可以把多个群待办消息聚合为同一个。通过 [updatableMessage.createActivityId](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/updatable-message/updatableMessage.createActivityId.html) 接口获取。详见[群待办消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html)
    *
    * 最低基础库： `2.11.0` */
  var toDoActivityId: js.UndefOr[String] = js.undefined
  
  /** 是否使用带 shareTicket 的转发[详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}
object UpdateShareMenuOption {
  
  inline def apply(): UpdateShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareMenuOption]
  }
  
  extension [Self <: UpdateShareMenuOption](x: Self) {
    
    inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setIsPrivateMessage(value: Boolean): Self = StObject.set(x, "isPrivateMessage", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateMessageUndefined: Self = StObject.set(x, "isPrivateMessage", js.undefined)
    
    inline def setIsUpdatableMessage(value: Boolean): Self = StObject.set(x, "isUpdatableMessage", value.asInstanceOf[js.Any])
    
    inline def setIsUpdatableMessageUndefined: Self = StObject.set(x, "isUpdatableMessage", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTemplateInfo(value: UpdatableMessageFrontEndTemplateInfo): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
    
    inline def setTemplateInfoUndefined: Self = StObject.set(x, "templateInfo", js.undefined)
    
    inline def setToDoActivityId(value: String): Self = StObject.set(x, "toDoActivityId", value.asInstanceOf[js.Any])
    
    inline def setToDoActivityIdUndefined: Self = StObject.set(x, "toDoActivityId", js.undefined)
    
    inline def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    inline def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
