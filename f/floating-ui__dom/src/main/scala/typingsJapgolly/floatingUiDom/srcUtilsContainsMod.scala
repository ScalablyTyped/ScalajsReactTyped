package typingsJapgolly.floatingUiDom

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsContainsMod {
  
  @JSImport("@floating-ui/dom/src/utils/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
