package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelInstance extends js.Object {
  var createdAt: js.UndefOr[js.Date] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  def save(): WaterlinePromise[this.type]
  def toJSON(): js.Any
}

object ModelInstance {
  @scala.inline
  def apply(
    save: CallbackTo[WaterlinePromise[ModelInstance]],
    toJSON: CallbackTo[js.Any],
    createdAt: js.Date = null,
    id: Double | String = null,
    updatedAt: js.Date = null
  ): ModelInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInstance]
  }
}

