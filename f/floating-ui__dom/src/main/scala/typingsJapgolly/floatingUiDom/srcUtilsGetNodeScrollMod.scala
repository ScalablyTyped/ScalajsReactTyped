package typingsJapgolly.floatingUiDom

import org.scalajs.dom.Element
import typingsJapgolly.floatingUiDom.srcTypesMod.NodeScroll
import typingsJapgolly.floatingUiDom.srcUtilsIsMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetNodeScrollMod {
  
  @JSImport("@floating-ui/dom/src/utils/getNodeScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeScroll(element: Element): NodeScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeScroll")(element.asInstanceOf[js.Any]).asInstanceOf[NodeScroll]
  inline def getNodeScroll(element: Window): NodeScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeScroll")(element.asInstanceOf[js.Any]).asInstanceOf[NodeScroll]
}
