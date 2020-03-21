package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete[TElement] extends _SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit
}

object AnonComplete {
  @scala.inline
  def apply[TElement](complete: Callback): AnonComplete[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[AnonComplete[TElement]]
  }
}

