package typingsJapgolly.framebus

import org.scalajs.dom.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMessageMod {
  
  @JSImport("framebus/dist/lib/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onmessage(e: MessageEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onmessage")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
