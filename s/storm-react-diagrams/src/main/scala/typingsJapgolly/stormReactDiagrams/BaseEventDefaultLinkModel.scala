package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel.DefaultLinkModel> & {  color  :null | string} */
trait BaseEventDefaultLinkModel extends js.Object {
  var color: Null | String
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  def stopPropagation(): js.Any
}

object BaseEventDefaultLinkModel {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    stopPropagation: CallbackTo[js.Any],
    color: String = null
  ): BaseEventDefaultLinkModel = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventDefaultLinkModel]
  }
}

