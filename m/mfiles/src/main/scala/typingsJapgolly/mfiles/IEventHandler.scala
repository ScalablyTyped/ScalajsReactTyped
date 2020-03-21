package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFEventHandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandler extends js.Object {
  var Active: Boolean
  var Description: String
  var EventType: MFEventHandlerType
  val GUID: String
  var VBScript: String
  def Clone(): IEventHandler
  def GetID(): Double
}

object IEventHandler {
  @scala.inline
  def apply(
    Active: Boolean,
    Clone: CallbackTo[IEventHandler],
    Description: String,
    EventType: MFEventHandlerType,
    GUID: String,
    GetID: CallbackTo[Double],
    VBScript: String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetID")(GetID.toJsFn)
    __obj.asInstanceOf[IEventHandler]
  }
}

