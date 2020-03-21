package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyntheticEvent extends js.Object {
  var syntheticEvent: ReactEventFrom[HTMLInputElement]
  var value: String
}

object AnonSyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: ReactEventFrom[HTMLInputElement], value: String): AnonSyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSyntheticEvent]
  }
}

