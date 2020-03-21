package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(dialog: typingsJapgolly.androiduix.android.content.DialogInterface, which: Double): Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: (typingsJapgolly.androiduix.android.content.DialogInterface, Double) => Callback): OnClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.content.DialogInterface, t1: scala.Double) => onClick(t0, t1).runNow()))
    __obj.asInstanceOf[OnClickListener]
  }
}

