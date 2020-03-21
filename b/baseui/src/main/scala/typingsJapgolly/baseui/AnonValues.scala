package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var event: ReactEventFrom[HTMLInputElement]
  var values: js.Array[String]
}

object AnonValues {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLInputElement], values: js.Array[String]): AnonValues = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues]
  }
}

