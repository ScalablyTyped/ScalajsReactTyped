package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnKeyDown extends js.Object {
  def onKeyDown(event: ReactEventFrom[Element]): Unit
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: ReactEventFrom[Element] => Callback): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[AnonOnKeyDown]
  }
}

