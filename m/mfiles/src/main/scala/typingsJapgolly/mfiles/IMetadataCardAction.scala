package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardAction extends js.Object {
  val Events: IEvents
  def Activate(): Unit
  def GetExplanation(): String
  def GetName(): String
  def IsEnabled(): Boolean
  def IsVisible(): Boolean
}

object IMetadataCardAction {
  @scala.inline
  def apply(
    Activate: Callback,
    Events: IEvents,
    GetExplanation: CallbackTo[String],
    GetName: CallbackTo[String],
    IsEnabled: CallbackTo[Boolean],
    IsVisible: CallbackTo[Boolean]
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any])
    __obj.updateDynamic("Activate")(Activate.toJsFn)
    __obj.updateDynamic("GetExplanation")(GetExplanation.toJsFn)
    __obj.updateDynamic("GetName")(GetName.toJsFn)
    __obj.updateDynamic("IsEnabled")(IsEnabled.toJsFn)
    __obj.updateDynamic("IsVisible")(IsVisible.toJsFn)
    __obj.asInstanceOf[IMetadataCardAction]
  }
}

