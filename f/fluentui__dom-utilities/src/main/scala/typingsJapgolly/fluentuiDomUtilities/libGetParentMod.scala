package typingsJapgolly.fluentuiDomUtilities

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetParentMod {
  
  @JSImport("@fluentui/dom-utilities/lib/getParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getParent(child: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
}
