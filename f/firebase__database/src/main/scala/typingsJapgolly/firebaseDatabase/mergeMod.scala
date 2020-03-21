package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.immutableTreeMod.ImmutableTree
import typingsJapgolly.firebaseDatabase.nodeMod.Node
import typingsJapgolly.firebaseDatabase.operationMod.Operation
import typingsJapgolly.firebaseDatabase.operationMod.OperationSource
import typingsJapgolly.firebaseDatabase.operationMod.OperationType
import typingsJapgolly.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/Merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  @js.native
  class Merge protected () extends Operation {
    def this(
      /** @inheritDoc */ source: OperationSource,
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ children: ImmutableTree[Node]
    ) = this()
    /** @inheritDoc */ var children: ImmutableTree[Node] = js.native
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    override var path: Path = js.native
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

