package typingsJapgolly.domHelpers

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsClosestMod {
  
  @JSImport("dom-helpers/cjs/closest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def default(node: Element, selector: String, stopAt: Element): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], stopAt.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
}
