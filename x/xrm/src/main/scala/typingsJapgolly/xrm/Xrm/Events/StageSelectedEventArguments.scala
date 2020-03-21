package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage selected event arguments.
  */
trait StageSelectedEventArguments extends js.Object {
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
}

object StageSelectedEventArguments {
  @scala.inline
  def apply(getStage: CallbackTo[Stage]): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStage")(getStage.toJsFn)
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
}

