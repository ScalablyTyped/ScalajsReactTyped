package typingsJapgolly.trtcJsSdk.mod

import typingsJapgolly.trtcJsSdk.anon.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamEventMap extends StObject {
  
  /** Audio/Video Player 状态变化事件 App 可根据状态变化来更新 UI，比如，通过监听 video player 状态变化来关闭或打开遮板。 */
  var `player-state-changed`: Reason
  
  /** 本地屏幕分享停止事件通知，仅对本地屏幕分享流有效。 */
  var `screen-sharing-stopped`: Unit
}
object StreamEventMap {
  
  inline def apply(`player-state-changed`: Reason, `screen-sharing-stopped`: Unit): StreamEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("player-state-changed")(`player-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("screen-sharing-stopped")(`screen-sharing-stopped`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventMap]
  }
  
  extension [Self <: StreamEventMap](x: Self) {
    
    inline def `setPlayer-state-changed`(value: Reason): Self = StObject.set(x, "player-state-changed", value.asInstanceOf[js.Any])
    
    inline def `setScreen-sharing-stopped`(value: Unit): Self = StObject.set(x, "screen-sharing-stopped", value.asInstanceOf[js.Any])
  }
}
