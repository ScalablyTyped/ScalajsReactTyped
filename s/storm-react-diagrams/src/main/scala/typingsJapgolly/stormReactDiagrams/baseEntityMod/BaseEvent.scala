package typingsJapgolly.stormReactDiagrams.baseEntityMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  def stopPropagation(): js.Any
}

object BaseEvent {
  @scala.inline
  def apply[T /* <: BaseEntity[BaseListener[_]] */](
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    stopPropagation: CallbackTo[js.Any]
  ): BaseEvent[T] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[BaseEvent[T]]
  }
}

