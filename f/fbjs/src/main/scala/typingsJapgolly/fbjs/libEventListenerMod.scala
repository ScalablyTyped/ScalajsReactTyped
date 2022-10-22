package typingsJapgolly.fbjs

import org.scalajs.dom.EventTarget
import typingsJapgolly.fbjs.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventListenerMod {
  
  @JSImport("fbjs/lib/EventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Listen to DOM events during the capture phase.
    */
  inline def capture(target: EventTarget, eventType: String, callback: Any): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  /**
    * Listen to DOM events during the bubble phase.
    */
  inline def listen(target: EventTarget, eventType: String, callback: Any): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  inline def registerDefault(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefault")().asInstanceOf[Unit]
}
