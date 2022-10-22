package typingsJapgolly.popperjsCore

import org.scalajs.dom.Node
import typingsJapgolly.popperjsCore.libTypesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetNodeNameMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getNodeName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[String | Null]]
  inline def default(element: Node): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def default(element: Window): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
}
