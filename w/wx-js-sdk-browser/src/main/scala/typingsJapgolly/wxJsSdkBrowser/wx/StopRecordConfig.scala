package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkBrowser.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecordConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MStopRecordConfig(res: LocalId): Unit
}
object StopRecordConfig {
  
  inline def apply(success: LocalId => Callback): StopRecordConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: LocalId) => success(t0).runNow()))
    __obj.asInstanceOf[StopRecordConfig]
  }
  
  extension [Self <: StopRecordConfig](x: Self) {
    
    inline def setSuccess(value: LocalId => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: LocalId) => value(t0).runNow()))
  }
}
