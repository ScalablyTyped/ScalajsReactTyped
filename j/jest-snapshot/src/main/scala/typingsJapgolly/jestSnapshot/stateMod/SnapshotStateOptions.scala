package typingsJapgolly.jestSnapshot.stateMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotStateOptions extends js.Object {
  var expand: js.UndefOr[Boolean] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  def getBabelTraverse(): js.Function
  def getPrettier(): Null | js.Any
}

object SnapshotStateOptions {
  @scala.inline
  def apply(
    getBabelTraverse: CallbackTo[js.Function],
    getPrettier: CallbackTo[Null | js.Any],
    updateSnapshot: SnapshotUpdateState,
    expand: js.UndefOr[Boolean] = js.undefined
  ): SnapshotStateOptions = {
    val __obj = js.Dynamic.literal(updateSnapshot = updateSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("getBabelTraverse")(getBabelTraverse.toJsFn)
    __obj.updateDynamic("getPrettier")(getPrettier.toJsFn)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotStateOptions]
  }
}

