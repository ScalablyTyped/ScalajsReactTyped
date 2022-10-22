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

object srcVirtualFsHostEmptyMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/empty", "Empty")
  @js.native
  open class Empty ()
    extends StObject
       with ReadonlyHost[js.Object] {
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    
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
    override def stat(path: Path_): (Observable_[Stats[js.Object] | Null]) | Null = js.native
  }
}
