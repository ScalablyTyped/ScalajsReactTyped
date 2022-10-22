package typingsJapgolly.floatingUiDom

import org.scalajs.dom.Element
import typingsJapgolly.floatingUiCore.srcTypesMod.ClientRectObject
import typingsJapgolly.floatingUiCore.srcTypesMod.VirtualElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetBoundingClientRectMod {
  
  @JSImport("@floating-ui/dom/src/utils/getBoundingClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoundingClientRect(element: Element): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: Element, includeScale: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: Element, includeScale: Boolean, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: Element, includeScale: Unit, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: VirtualElement): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: VirtualElement, includeScale: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: VirtualElement, includeScale: Boolean, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
  inline def getBoundingClientRect(element: VirtualElement, includeScale: Unit, isFixedStrategy: Boolean): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientRect")(element.asInstanceOf[js.Any], includeScale.asInstanceOf[js.Any], isFixedStrategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
}
