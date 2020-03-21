package typingsJapgolly.cypress.JQuery_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpeedSettings[TElement] extends js.Object

object _SpeedSettings {
  @scala.inline
  def AnonDuration[TElement](duration: Duration): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def AnonEasing[TElement](easing: String): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def AnonComplete[TElement](complete: Callback): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
}

