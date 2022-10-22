package typingsJapgolly.simulant

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.Node
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(eventName: String): Event = ^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any]).asInstanceOf[Event]
  inline def apply(eventName: String, payload: StringDictionary[Any]): Event = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def apply(window: Window, eventName: String): Event = (^.asInstanceOf[js.Dynamic].apply(window.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def apply(window: Window, eventName: String, payload: StringDictionary[Any]): Event = (^.asInstanceOf[js.Dynamic].apply(window.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fire(el: Node, e: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fire(el: Node, e: String, payload: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fire(el: Node, e: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
