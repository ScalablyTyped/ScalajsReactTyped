package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.indexMod.Index
import typingsJapgolly.firebaseDatabase.nodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.nodeMod.Node
import typingsJapgolly.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/PathIndex", JSImport.Namespace)
@js.native
object pathIndexMod extends js.Object {
  @js.native
  class PathIndex protected () extends Index {
    def this(indexPath_ : Path) = this()
    var indexPath_ : js.Any = js.native
    /**
      * @param {!Node} snap
      * @return {!Node}
      * @protected
      */
    /* protected */ def extractChild(snap: Node): Node = js.native
    /**
      * @inheritDoc
      */
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
  
}

