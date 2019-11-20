package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[TElement] extends _SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(`this`: TElement): Unit
}

object Anon_Complete {
  @scala.inline
  def apply[TElement](complete: TElement => Callback): Anon_Complete[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: TElement) => complete(t0).runNow()))
    __obj.asInstanceOf[Anon_Complete[TElement]]
  }
}

