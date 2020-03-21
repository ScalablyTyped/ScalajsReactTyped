package typingsJapgolly.reactAce.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommand extends js.Object {
  var bindKey: ICommandBindKey
  var name: String
  def exec(): js.Any
}

object ICommand {
  @scala.inline
  def apply(bindKey: ICommandBindKey, exec: CallbackTo[js.Any], name: String): ICommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.asInstanceOf[ICommand]
  }
}

