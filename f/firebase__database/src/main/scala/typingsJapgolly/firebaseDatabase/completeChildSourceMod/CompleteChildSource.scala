package typingsJapgolly.firebaseDatabase.completeChildSourceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabase.indexMod.Index
import typingsJapgolly.firebaseDatabase.nodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteChildSource extends js.Object {
  /**
    * @param {!Index} index
    * @param {!NamedNode} child
    * @param {boolean} reverse
    * @return {?NamedNode}
    */
  def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  def getCompleteChild(childKey: String): Node | Null
}

object CompleteChildSource {
  @scala.inline
  def apply(
    getChildAfterChild: (Index, NamedNode, Boolean) => CallbackTo[NamedNode | Null],
    getCompleteChild: String => CallbackTo[Node | Null]
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildAfterChild")(js.Any.fromFunction3((t0: typingsJapgolly.firebaseDatabase.indexMod.Index, t1: typingsJapgolly.firebaseDatabase.nodeMod.NamedNode, t2: scala.Boolean) => getChildAfterChild(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCompleteChild")(js.Any.fromFunction1((t0: java.lang.String) => getCompleteChild(t0).runNow()))
    __obj.asInstanceOf[CompleteChildSource]
  }
}

