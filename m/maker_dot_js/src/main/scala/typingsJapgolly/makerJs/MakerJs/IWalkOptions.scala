package typingsJapgolly.makerJs.MakerJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends js.Object {
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}

object IWalkOptions {
  @scala.inline
  def apply(
    afterChildWalk: /* context */ IWalkModel => Callback = null,
    beforeChildWalk: /* context */ IWalkModel => CallbackTo[Boolean] = null,
    onPath: /* context */ IWalkPath => Callback = null
  ): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    if (afterChildWalk != null) __obj.updateDynamic("afterChildWalk")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.makerJs.MakerJs.IWalkModel) => afterChildWalk(t0).runNow()))
    if (beforeChildWalk != null) __obj.updateDynamic("beforeChildWalk")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.makerJs.MakerJs.IWalkModel) => beforeChildWalk(t0).runNow()))
    if (onPath != null) __obj.updateDynamic("onPath")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.makerJs.MakerJs.IWalkPath) => onPath(t0).runNow()))
    __obj.asInstanceOf[IWalkOptions]
  }
}

