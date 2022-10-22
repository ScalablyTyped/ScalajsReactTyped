package typingsJapgolly.focusLock

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsFirstFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/firstFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pickFirstFocus(nodes: js.Array[HTMLElement]): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("pickFirstFocus")(nodes.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def pickFocusable(nodes: js.Array[HTMLElement], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pickFocusable")(nodes.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
}
