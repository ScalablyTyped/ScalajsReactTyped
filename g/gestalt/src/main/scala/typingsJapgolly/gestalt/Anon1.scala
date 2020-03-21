package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var event: ReactEventFrom[
    (ReactKeyboardEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement]) with Element
  ]
}

object Anon1 {
  @scala.inline
  def apply(
    event: ReactEventFrom[
      (ReactKeyboardEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement]) with Element
    ]
  ): Anon1 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

