package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.immutableTreeMod.ImmutableTree
import typingsJapgolly.firebaseDatabase.operationMod.Operation
import typingsJapgolly.firebaseDatabase.operationMod.OperationSource
import typingsJapgolly.firebaseDatabase.operationMod.OperationType
import typingsJapgolly.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/AckUserWrite", JSImport.Namespace)
@js.native
object ackUserWriteMod extends js.Object {
  @js.native
  class AckUserWrite protected () extends Operation {
    /**
      *
      * @param {!Path} path
      * @param {!ImmutableTree<!boolean>} affectedTree A tree containing true for each affected path. Affected paths can't overlap.
      * @param {!boolean} revert
      */
    def this(
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /** @inheritDoc */ revert: Boolean
    ) = this()
    /** @inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    override var path: Path = js.native
    /** @inheritDoc */ var revert: Boolean = js.native
    /**
      * @type {!OperationSource}
      */
    /* CompleteClass */
    override var source: OperationSource = js.native
    /**
      * @type {!OperationType}
      */
    /* CompleteClass */
    override var `type`: OperationType = js.native
    /**
      * @param {string} childName
      * @return {?Operation}
      */
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
  }
  
}

