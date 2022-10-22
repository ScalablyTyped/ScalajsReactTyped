package typingsJapgolly.focusLock

import org.scalajs.dom.Element
import typingsJapgolly.focusLock.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5FocusMergeMod {
  
  @JSImport("focus-lock/dist/es5/focusMerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFocusMerge(topNode: js.Array[Element]): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getFocusMerge(topNode: js.Array[Element], lastNode: Element): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getFocusMerge(topNode: Element): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getFocusMerge(topNode: Element, lastNode: Element): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
}
