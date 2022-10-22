package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostResolverMod.ResolverHost
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostAliasMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/alias", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected () extends ResolverHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
    
    /* protected */ var _aliases: Map[Path_, Path_] = js.native
    
    def aliases: Map[Path_, Path_] = js.native
  }
}
