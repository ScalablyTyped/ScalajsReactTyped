package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.video
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinVoIPChatOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[JoinVoIPChatCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[JoinVoIPChatFailCallback] = js.undefined
  
  /** 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。 */
  var groupId: String
  
  /** 静音设置 */
  var muteConfig: js.UndefOr[MuteConfig] = js.undefined
  
  /** 验证所需的随机字符串 */
  var nonceStr: String
  
  /** 房间类型
    *
    * 可选值：
    * - 'voice': 音频房间，用于语音通话;
    * - 'video': 视频房间，结合 [voip-room](https://developers.weixin.qq.com/miniprogram/dev/component/voip-room.html) 组件可显示成员画面; */
  var roomType: js.UndefOr[voice | video] = js.undefined
  
  /** 签名，用于验证小游戏的身份 */
  var signature: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[JoinVoIPChatSuccessCallback] = js.undefined
  
  /** 验证所需的时间戳 */
  var timeStamp: Double
}
object JoinVoIPChatOption {
  
  inline def apply(groupId: String, nonceStr: String, signature: String, timeStamp: Double): JoinVoIPChatOption = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinVoIPChatOption]
  }
  
  extension [Self <: JoinVoIPChatOption](x: Self) {
    
    inline def setComplete(value: /* res */ JoinVoIPChatError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ JoinVoIPChatError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ JoinVoIPChatError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ JoinVoIPChatError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMuteConfig(value: MuteConfig): Self = StObject.set(x, "muteConfig", value.asInstanceOf[js.Any])
    
    inline def setMuteConfigUndefined: Self = StObject.set(x, "muteConfig", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setRoomType(value: voice | video): Self = StObject.set(x, "roomType", value.asInstanceOf[js.Any])
    
    inline def setRoomTypeUndefined: Self = StObject.set(x, "roomType", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ JoinVoIPChatSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ JoinVoIPChatSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
