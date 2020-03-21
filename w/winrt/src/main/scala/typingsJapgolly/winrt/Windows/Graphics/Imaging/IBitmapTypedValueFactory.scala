package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTypedValueFactory extends js.Object {
  def create(value: js.Any, `type`: PropertyType): BitmapTypedValue
}

object IBitmapTypedValueFactory {
  @scala.inline
  def apply(create: (js.Any, PropertyType) => CallbackTo[BitmapTypedValue]): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.winrt.Windows.Foundation.PropertyType) => create(t0, t1).runNow()))
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
}

