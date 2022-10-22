package typingsJapgolly.uifabricUtilities

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomSetVirtualParentMod {
  
  @JSImport("@uifabric/utilities/lib/dom/setVirtualParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVirtualParent(child: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
