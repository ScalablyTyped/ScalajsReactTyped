package typingsJapgolly.jsplumb.mod

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPlumb {
  
  @JSImport("jsplumb", "jsPlumb")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(el: NodeList[Element & Node], clazz: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend(target: js.Object, source: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getInstance(): jsPlumbInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[jsPlumbInstance]
  inline def getInstance(_defaults: Defaults): jsPlumbInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(_defaults.asInstanceOf[js.Any]).asInstanceOf[jsPlumbInstance]
  
  inline def off(el: Any, event: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(el: Any, event: String, delegateSelector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], delegateSelector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(el: Any, event: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeClass(el: NodeList[Element & Node], clazz: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def revalidate(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revalidate")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
