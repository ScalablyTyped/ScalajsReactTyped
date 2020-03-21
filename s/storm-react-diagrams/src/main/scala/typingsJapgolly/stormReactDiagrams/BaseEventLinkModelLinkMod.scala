package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModel<storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModelListener>> & {  port  :null | storm-react-diagrams.storm-react-diagrams/dist/src/models/PortModel.PortModel} */
trait BaseEventLinkModelLinkMod extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var port: Null | PortModel
  def stopPropagation(): js.Any
}

object BaseEventLinkModelLinkMod {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    stopPropagation: CallbackTo[js.Any],
    port: PortModel = null
  ): BaseEventLinkModelLinkMod = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventLinkModelLinkMod]
  }
}

