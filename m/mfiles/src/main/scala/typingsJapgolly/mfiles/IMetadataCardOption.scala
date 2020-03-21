package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardOption extends js.Object {
  val Events: IEvents
  def GetExplanation(): String
  def GetName(): String
  def GetOptionValue(): js.Any
  def IsEnabled(): Boolean
  def IsVisible(): Boolean
  def SetOptionValue(value: js.Any): Unit
}

object IMetadataCardOption {
  @scala.inline
  def apply(
    Events: IEvents,
    GetExplanation: CallbackTo[String],
    GetName: CallbackTo[String],
    GetOptionValue: CallbackTo[js.Any],
    IsEnabled: CallbackTo[Boolean],
    IsVisible: CallbackTo[Boolean],
    SetOptionValue: js.Any => Callback
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any])
    __obj.updateDynamic("GetExplanation")(GetExplanation.toJsFn)
    __obj.updateDynamic("GetName")(GetName.toJsFn)
    __obj.updateDynamic("GetOptionValue")(GetOptionValue.toJsFn)
    __obj.updateDynamic("IsEnabled")(IsEnabled.toJsFn)
    __obj.updateDynamic("IsVisible")(IsVisible.toJsFn)
    __obj.updateDynamic("SetOptionValue")(js.Any.fromFunction1((t0: js.Any) => SetOptionValue(t0).runNow()))
    __obj.asInstanceOf[IMetadataCardOption]
  }
}

