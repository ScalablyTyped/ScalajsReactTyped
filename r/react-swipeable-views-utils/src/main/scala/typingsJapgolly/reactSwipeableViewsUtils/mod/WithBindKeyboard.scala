package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithBindKeyboard extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
}

object WithBindKeyboard {
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback): WithBindKeyboard = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    __obj.asInstanceOf[WithBindKeyboard]
  }
}

