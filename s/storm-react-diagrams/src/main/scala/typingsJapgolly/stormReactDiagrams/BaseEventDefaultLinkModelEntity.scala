package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.stormReactDiagramsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel.DefaultLinkModel> & {  width  :0 | number} */
trait BaseEventDefaultLinkModelEntity extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var width: `0` | Double
  def stopPropagation(): js.Any
}

object BaseEventDefaultLinkModelEntity {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    stopPropagation: CallbackTo[js.Any],
    width: `0` | Double
  ): BaseEventDefaultLinkModelEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[BaseEventDefaultLinkModelEntity]
  }
}

