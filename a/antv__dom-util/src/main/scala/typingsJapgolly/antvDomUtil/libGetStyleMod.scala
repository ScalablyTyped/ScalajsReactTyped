package typingsJapgolly.antvDomUtil

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetStyleMod {
  
  @JSImport("@antv/dom-util/lib/get-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dom: HTMLElement, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(dom: HTMLElement, name: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
