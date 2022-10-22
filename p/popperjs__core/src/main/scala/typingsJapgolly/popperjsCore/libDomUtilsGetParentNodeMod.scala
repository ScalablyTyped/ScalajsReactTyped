package typingsJapgolly.popperjsCore

import org.scalajs.dom.Node
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetParentNodeMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getParentNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def default(element: ShadowRoot): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Node]
}
