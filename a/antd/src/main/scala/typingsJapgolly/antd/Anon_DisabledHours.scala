package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledHours extends js.Object {
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
}

object Anon_DisabledHours {
  @scala.inline
  def apply(
    disabledHours: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledMinutes: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledSeconds: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined
  ): Anon_DisabledHours = {
    val __obj = js.Dynamic.literal()
    disabledHours.foreach(p => __obj.updateDynamic("disabledHours")(p.toJsFn))
    disabledMinutes.foreach(p => __obj.updateDynamic("disabledMinutes")(p.toJsFn))
    disabledSeconds.foreach(p => __obj.updateDynamic("disabledSeconds")(p.toJsFn))
    __obj.asInstanceOf[Anon_DisabledHours]
  }
}

