package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelector extends js.Object {
  val ClassSelector: IMetadataCardControl
  val Events: IEvents
  def GetObjectTypeIconURL(): String
  def GetObjectTypeId(): Double
  def GetObjectTypeName(): String
  def GetTemplateItems(): js.Any
  def SelectItem(itemID: String): Unit
}

object IObjectTemplateSelector {
  @scala.inline
  def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: CallbackTo[String],
    GetObjectTypeId: CallbackTo[Double],
    GetObjectTypeName: CallbackTo[String],
    GetTemplateItems: CallbackTo[js.Any],
    SelectItem: String => Callback
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any])
    __obj.updateDynamic("GetObjectTypeIconURL")(GetObjectTypeIconURL.toJsFn)
    __obj.updateDynamic("GetObjectTypeId")(GetObjectTypeId.toJsFn)
    __obj.updateDynamic("GetObjectTypeName")(GetObjectTypeName.toJsFn)
    __obj.updateDynamic("GetTemplateItems")(GetTemplateItems.toJsFn)
    __obj.updateDynamic("SelectItem")(js.Any.fromFunction1((t0: java.lang.String) => SelectItem(t0).runNow()))
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
}

