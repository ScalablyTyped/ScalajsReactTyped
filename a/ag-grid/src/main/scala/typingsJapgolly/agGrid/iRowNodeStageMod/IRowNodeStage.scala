package typingsJapgolly.agGrid.iRowNodeStageMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowNodeStage extends js.Object {
  def execute(params: StageExecuteParams): js.Any
}

object IRowNodeStage {
  @scala.inline
  def apply(execute: StageExecuteParams => CallbackTo[js.Any]): IRowNodeStage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iRowNodeStageMod.StageExecuteParams) => execute(t0).runNow()))
    __obj.asInstanceOf[IRowNodeStage]
  }
}

