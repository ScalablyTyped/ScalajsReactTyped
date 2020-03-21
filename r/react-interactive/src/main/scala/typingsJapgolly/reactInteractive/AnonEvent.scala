package typingsJapgolly.reactInteractive

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: ReactEventFrom[Element]
  var nextState: State
  var prevState: State
}

object AnonEvent {
  @scala.inline
  def apply(event: ReactEventFrom[Element], nextState: State, prevState: State): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

