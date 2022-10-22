package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostCapabilities
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Stats
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostSafeMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/safe", "SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends StObject
       with ReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
    
    /* private */ var _delegate: Any = js.native
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    @JSName("capabilities")
    def capabilities_MSafeReadonlyHost: HostCapabilities = js.native
    
    /* CompleteClass */
    override def exists(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isDirectory(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isFile(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def list(path: Path_): Observable_[js.Array[PathFragment]] = js.native
    
    /* CompleteClass */
    override def read(path: Path_): Observable_[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def stat(path: Path_): (Observable_[Stats[StatsT] | Null]) | Null = js.native
  }
}
