package typingsJapgolly.seen.mod

import typingsJapgolly.seen.mod.Events.Dispatcher
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowEvents {
  
  @JSImport("seen", "WindowEvents")
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(`type`: String, listener: EventListener): Dispatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Dispatcher]
}
