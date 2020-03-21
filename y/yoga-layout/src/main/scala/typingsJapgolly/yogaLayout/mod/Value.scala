package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  val unit: YogaUnit | Double
  val value: Double
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _]): Unit
}

object Value {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, js.Any] => Callback,
    unit: YogaUnit | Double,
    value: Double
  ): Value = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJS")(js.Any.fromFunction1((t0: js.Function2[
  /* unit */ typingsJapgolly.yogaLayout.mod.YogaUnit | scala.Double, 
  /* value */ scala.Double, 
  js.Any]) => fromJS(t0).runNow()))
    __obj.asInstanceOf[Value]
  }
}

