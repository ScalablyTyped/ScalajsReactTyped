package typingsJapgolly.popperjsCore

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.popperjsCore.libTypesMod.VisualViewport
import typingsJapgolly.popperjsCore.libTypesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsListScrollParentsMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/listScrollParents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Node): js.Array[Element | Window | VisualViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element | Window | VisualViewport]]
  inline def default(element: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Window | VisualViewport]]
}
