package typingsJapgolly.uifabricUtilities

import org.scalajs.dom.Element
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomGetWindowMod {
  
  @JSImport("@uifabric/utilities/lib/dom/getWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[js.UndefOr[Window]]
  inline def getWindow(rootElement: Element): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(rootElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Window]]
}
