package typingsJapgolly.focusLock

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsTabUtilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/tabUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFocusables(parents: js.Array[Element]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusables")(parents.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusables(parents: js.Array[Element], withGuards: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusables")(parents.asInstanceOf[js.Any], withGuards.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getParentAutofocusables(parent: Element): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentAutofocusables")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
}
