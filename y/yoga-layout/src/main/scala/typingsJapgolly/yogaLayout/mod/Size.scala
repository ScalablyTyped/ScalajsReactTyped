package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  val height: Double
  val width: Double
  def fromJS(expose: js.Function2[/* width */ Double, /* height */ Double, _]): Unit
}

object Size {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* width */ Double, /* height */ Double, js.Any] => Callback,
    height: Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJS")(js.Any.fromFunction1((t0: js.Function2[/* width */ scala.Double, /* height */ scala.Double, js.Any]) => fromJS(t0).runNow()))
    __obj.asInstanceOf[Size]
  }
}

