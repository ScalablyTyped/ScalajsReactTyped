package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  def equals(other: IState): Boolean
}

object IState {
  @scala.inline
  def apply(equals: IState => CallbackTo[Boolean]): IState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.monacoEditor.mod.languages.IState) => equals(t0).runNow()))
    __obj.asInstanceOf[IState]
  }
}

