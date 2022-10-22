package typingsJapgolly.fluentuiDomUtilities

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetChildrenMod {
  
  @JSImport("@fluentui/dom-utilities/lib/getChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getChildren(parent: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(parent.asInstanceOf[js.Any], allowVirtualChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
}
