package typingsJapgolly.androiduix.android.graphics.drawable.Drawable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantState extends js.Object {
  def newDrawable(): typingsJapgolly.androiduix.android.graphics.drawable.Drawable
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: CallbackTo[typingsJapgolly.androiduix.android.graphics.drawable.Drawable]): ConstantState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newDrawable")(newDrawable.toJsFn)
    __obj.asInstanceOf[ConstantState]
  }
}

