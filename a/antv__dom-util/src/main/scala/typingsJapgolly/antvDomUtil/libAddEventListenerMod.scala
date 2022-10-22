package typingsJapgolly.antvDomUtil

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvDomUtil.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAddEventListenerMod {
  
  @JSImport("@antv/dom-util/lib/add-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: HTMLElement, eventType: String, callback: Any): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Remove]
}
