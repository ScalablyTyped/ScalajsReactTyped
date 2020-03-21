package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<any> & {  link  :storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModel<storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModelListener>,   isCreated  :boolean} */
trait BaseEventanylinkLinkModel extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var isCreated: Boolean
  var link: LinkModel[LinkModelListener]
  def stopPropagation(): js.Any
}

object BaseEventanylinkLinkModel {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    isCreated: Boolean,
    link: LinkModel[LinkModelListener],
    stopPropagation: CallbackTo[js.Any]
  ): BaseEventanylinkLinkModel = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCreated = isCreated.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[BaseEventanylinkLinkModel]
  }
}

