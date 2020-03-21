package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMultiChoiceClickListener extends js.Object {
  def onClick(
    dialog: typingsJapgolly.androiduix.android.content.DialogInterface,
    which: Double,
    isChecked: Boolean
  ): Unit
}

object OnMultiChoiceClickListener {
  @scala.inline
  def apply(onClick: (typingsJapgolly.androiduix.android.content.DialogInterface, Double, Boolean) => Callback): OnMultiChoiceClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.content.DialogInterface, t1: scala.Double, t2: scala.Boolean) => onClick(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnMultiChoiceClickListener]
  }
}

