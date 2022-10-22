package typingsJapgolly.framebus

import typingsJapgolly.framebus.distLibTypesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBroadcastMod {
  
  @JSImport("framebus/dist/lib/broadcast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcast(frame: Window, payload: String, origin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(frame.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
