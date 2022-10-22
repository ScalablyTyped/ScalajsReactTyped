package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationSource
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.OperationType
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilImmutableTreeMod.ImmutableTree
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreOperationAckUserWriteMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/operation/AckUserWrite", "AckUserWrite")
  @js.native
  open class AckUserWrite protected ()
    extends StObject
       with Operation {
    /**
      * @param affectedTree - A tree containing true for each affected path. Affected paths can't overlap.
      */
    def this(
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /** @inheritDoc */ revert: Boolean
    ) = this()
    
    /** @inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /* CompleteClass */
    var path: Path = js.native
    
    /** @inheritDoc */ var revert: Boolean = js.native
    
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
