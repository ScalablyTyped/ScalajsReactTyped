package typingsJapgolly.focusLock

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.focusLock.distEs5UtilsTabOrderMod.NodeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsAutoFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/auto-focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pickAutofocus(nodesIndexes: js.Array[NodeIndex], orderedNodes: js.Array[HTMLElement], groups: js.Array[Element]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAutofocus")(nodesIndexes.asInstanceOf[js.Any], orderedNodes.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
