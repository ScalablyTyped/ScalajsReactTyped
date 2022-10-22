package typingsJapgolly.domHelpers

import org.scalajs.dom.Element
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAddClassMod {
  
  @JSImport("dom-helpers/cjs/addClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
