package typingsJapgolly.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var focus: Focus
  var iState: IState
}

object State {
  @scala.inline
  def apply(focus: Focus, iState: IState): State = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], iState = iState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

