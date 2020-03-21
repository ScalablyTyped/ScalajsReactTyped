package typingsJapgolly.firebaseDatabase.completeChildSourceMod

import typingsJapgolly.firebaseDatabase.indexMod.Index
import typingsJapgolly.firebaseDatabase.nodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.nodeMod.Node
import typingsJapgolly.firebaseDatabase.viewCacheMod.ViewCache
import typingsJapgolly.firebaseDatabase.writeTreeMod.WriteTreeRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "WriteTreeCompleteChildSource")
@js.native
class WriteTreeCompleteChildSource protected () extends CompleteChildSource {
  /**
    * @param {!WriteTreeRef} writes_
    * @param {!ViewCache} viewCache_
    * @param {?Node} optCompleteServerCache_
    */
  def this(writes_ : WriteTreeRef, viewCache_ : ViewCache) = this()
  def this(writes_ : WriteTreeRef, viewCache_ : ViewCache, optCompleteServerCache_ : Node) = this()
  var optCompleteServerCache_ : js.Any = js.native
  var viewCache_ : js.Any = js.native
  var writes_ : js.Any = js.native
  /**
    * @param {!Index} index
    * @param {!NamedNode} child
    * @param {boolean} reverse
    * @return {?NamedNode}
    */
  /* CompleteClass */
  override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  /* CompleteClass */
  override def getCompleteChild(childKey: String): Node | Null = js.native
}

