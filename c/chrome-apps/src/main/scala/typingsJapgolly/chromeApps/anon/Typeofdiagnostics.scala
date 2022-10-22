package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdiagnostics extends StObject {
  
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit
}
object Typeofdiagnostics {
  
  inline def apply(sendPacket: (js.Object, js.Function0[Unit]) => Callback): Typeofdiagnostics = {
    val __obj = js.Dynamic.literal(sendPacket = js.Any.fromFunction2((t0: js.Object, t1: js.Function0[Unit]) => (sendPacket(t0, t1)).runNow()))
    __obj.asInstanceOf[Typeofdiagnostics]
  }
  
  extension [Self <: Typeofdiagnostics](x: Self) {
    
    inline def setSendPacket(value: (js.Object, js.Function0[Unit]) => Callback): Self = StObject.set(x, "sendPacket", js.Any.fromFunction2((t0: js.Object, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
