package typingsJapgolly.winjs.WinJS.UI.Animation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IAnimationMethodResponse extends js.Object {
  def execute(): Promise[_]
}

object IAnimationMethodResponse {
  @scala.inline
  def apply(execute: CallbackTo[Promise[js.Any]]): IAnimationMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.asInstanceOf[IAnimationMethodResponse]
  }
}

