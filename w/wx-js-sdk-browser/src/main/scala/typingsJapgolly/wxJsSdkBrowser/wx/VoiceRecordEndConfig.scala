package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkBrowser.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecordEndConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MVoiceRecordEndConfig(res: LocalId): Unit
}
object VoiceRecordEndConfig {
  
  inline def apply(complete: LocalId => Callback): VoiceRecordEndConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: LocalId) => complete(t0).runNow()))
    __obj.asInstanceOf[VoiceRecordEndConfig]
  }
  
  extension [Self <: VoiceRecordEndConfig](x: Self) {
    
    inline def setComplete(value: LocalId => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: LocalId) => value(t0).runNow()))
  }
}
