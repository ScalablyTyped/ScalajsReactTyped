package typingsJapgolly.uifabricUtilities

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.uifabricUtilities.libIrectangleMod.IRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomGetRectMod {
  
  @JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRect(): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")().asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: HTMLElement): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: Window): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
}
