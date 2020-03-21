package typingsJapgolly.mockjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Helper
// see https://github.com/nuysoft/Mock/wiki/Helper
trait MockjsRandomHelper extends js.Object {
  // Random.capitalize
  def capitalize(word: S): S
  // Random.lower
  def lower(str: S): S
  // Random.pick
  def pick(arr: js.Array[_]): js.Any
  // Random.shuffle
  def shuffle(arr: js.Array[_]): js.Array[_]
  // Random.upper
  def upper(str: S): S
}

object MockjsRandomHelper {
  @scala.inline
  def apply(
    capitalize: S => CallbackTo[S],
    lower: S => CallbackTo[S],
    pick: js.Array[js.Any] => CallbackTo[js.Any],
    shuffle: js.Array[js.Any] => CallbackTo[js.Array[js.Any]],
    upper: S => CallbackTo[S]
  ): MockjsRandomHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capitalize")(js.Any.fromFunction1((t0: typingsJapgolly.mockjs.mod.S) => capitalize(t0).runNow()))
    __obj.updateDynamic("lower")(js.Any.fromFunction1((t0: typingsJapgolly.mockjs.mod.S) => lower(t0).runNow()))
    __obj.updateDynamic("pick")(js.Any.fromFunction1((t0: js.Array[js.Any]) => pick(t0).runNow()))
    __obj.updateDynamic("shuffle")(js.Any.fromFunction1((t0: js.Array[js.Any]) => shuffle(t0).runNow()))
    __obj.updateDynamic("upper")(js.Any.fromFunction1((t0: typingsJapgolly.mockjs.mod.S) => upper(t0).runNow()))
    __obj.asInstanceOf[MockjsRandomHelper]
  }
}

