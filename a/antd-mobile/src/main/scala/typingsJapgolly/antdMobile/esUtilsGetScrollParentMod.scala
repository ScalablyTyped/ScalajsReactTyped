package typingsJapgolly.antdMobile

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetScrollParentMod {
  
  @JSImport("antd-mobile/es/utils/get-scroll-parent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScrollParent(el: Element): js.UndefOr[Window | Element | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Window | Element | Null]]
  inline def getScrollParent(el: Element, root: ScrollElement): js.UndefOr[Window | Element | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(el.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Window | Element | Null]]
  
  type ScrollElement = HTMLElement | Window
}
