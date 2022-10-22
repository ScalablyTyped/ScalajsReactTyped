package typingsJapgolly.floatingUiDom

import org.scalajs.dom.Element
import typingsJapgolly.floatingUiCore.srcTypesMod.Rect
import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import typingsJapgolly.floatingUiCore.srcTypesMod.VirtualElement
import typingsJapgolly.floatingUiDom.srcUtilsIsMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetRectRelativeToOffsetParentMod {
  
  @JSImport("@floating-ui/dom/src/utils/getRectRelativeToOffsetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRectRelativeToOffsetParent(element: Element, offsetParent: Element, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: Element, offsetParent: Window, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: VirtualElement, offsetParent: Element, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRectRelativeToOffsetParent(element: VirtualElement, offsetParent: Window, strategy: Strategy): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectRelativeToOffsetParent")(element.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
