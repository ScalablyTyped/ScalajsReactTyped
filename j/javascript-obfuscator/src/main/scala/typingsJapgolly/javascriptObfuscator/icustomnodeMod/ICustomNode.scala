package typingsJapgolly.javascriptObfuscator.icustomnodeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.iinitializableMod.IInitializable
import typingsJapgolly.javascriptObfuscator.tstatementMod.TStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNode
  extends IInitializable[js.Array[js.Any]] {
  /**
    * @returns ESTree.Node[]
    */
  def getNode(): js.Array[TStatement]
}

object ICustomNode {
  @scala.inline
  def apply(getNode: CallbackTo[js.Array[TStatement]], initialize: js.Array[js.Any] => Callback): ICustomNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNode")(getNode.toJsFn)
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Array[js.Any]) => initialize(t0).runNow()))
    __obj.asInstanceOf[ICustomNode]
  }
}

