package typingsJapgolly.mobx.coreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDepTreeNode extends js.Object {
  var name: String
  var observing: js.UndefOr[js.Array[IObservable]] = js.undefined
}

object IDepTreeNode {
  @scala.inline
  def apply(name: String, observing: js.Array[IObservable] = null): IDepTreeNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (observing != null) __obj.updateDynamic("observing")(observing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDepTreeNode]
  }
}

