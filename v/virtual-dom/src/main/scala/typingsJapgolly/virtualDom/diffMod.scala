package typingsJapgolly.virtualDom

import typingsJapgolly.virtualDom.VirtualDOM.VPatch
import typingsJapgolly.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  inline def apply(left: VTree, right: VTree): js.Array[VPatch] = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[VPatch]]
  
  @JSImport("virtual-dom/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
