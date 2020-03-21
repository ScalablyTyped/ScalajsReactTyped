package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
import typingsJapgolly.xrm.Xrm.ProcessFlow.StageChangeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage change event arguments.
  */
trait StageChangeEventArguments extends js.Object {
  /**
    * Gets the direction of the stage change.
    * @returns The direction: "next" or "previous"
    */
  def getDirection(): StageChangeDirection
  /**
    * Gets the destination stage object
    * @returns The stage object. For switching between entities, returns the previous stage object
    */
  def getStage(): Stage
  /**
    * Prevents the stage or status change operation from being submitted to the server.
    */
  def preventDefault(): Unit
}

object StageChangeEventArguments {
  @scala.inline
  def apply(
    getDirection: CallbackTo[StageChangeDirection],
    getStage: CallbackTo[Stage],
    preventDefault: Callback
  ): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDirection")(getDirection.toJsFn)
    __obj.updateDynamic("getStage")(getStage.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[StageChangeEventArguments]
  }
}

