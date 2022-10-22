package typingsJapgolly.popperjsCore

import org.scalajs.dom.Node
import typingsJapgolly.popperjsCore.anon.ScrollTop
import typingsJapgolly.popperjsCore.libTypesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetWindowScrollMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getWindowScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Node): ScrollTop = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[ScrollTop]
  inline def default(node: Window): ScrollTop = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[ScrollTop]
}
