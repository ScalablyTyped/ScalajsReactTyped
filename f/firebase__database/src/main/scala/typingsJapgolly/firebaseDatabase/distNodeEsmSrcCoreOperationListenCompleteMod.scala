package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationType
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreOperationListenCompleteMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/operation/ListenComplete", "ListenComplete")
  @js.native
  open class ListenComplete protected ()
    extends StObject
       with Operation {
    def this(source: OperationSource, path: Path) = this()
    
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /* CompleteClass */
    var path: Path = js.native
    
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
