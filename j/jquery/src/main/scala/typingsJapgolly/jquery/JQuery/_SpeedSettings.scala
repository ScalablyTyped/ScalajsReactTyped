package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpeedSettings[TElement] extends js.Object

object _SpeedSettings {
  @scala.inline
  def Anon_Duration[TElement](duration: Duration): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Anon_Easing[TElement](easing: String): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Anon_Complete[TElement](complete: TElement => Callback): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: TElement) => complete(t0).runNow()))
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
}

