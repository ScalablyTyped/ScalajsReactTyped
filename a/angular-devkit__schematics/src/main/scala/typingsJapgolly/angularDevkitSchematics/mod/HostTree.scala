package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "HostTree")
@js.native
open class HostTree ()
  extends typingsJapgolly.angularDevkitSchematics.srcTreeHostTreeMod.HostTree {
  def this(_backend: ReadonlyHost[js.Object]) = this()
}
/* static members */
object HostTree {
  
  @JSImport("@angular-devkit/schematics", "HostTree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHostTree(tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree): /* is @angular-devkit/schematics.@angular-devkit/schematics/src/tree/host-tree.HostTree */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHostTree")(tree.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/schematics.@angular-devkit/schematics/src/tree/host-tree.HostTree */ Boolean]
}
