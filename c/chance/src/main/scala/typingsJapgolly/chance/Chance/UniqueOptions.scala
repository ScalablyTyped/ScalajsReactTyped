package typingsJapgolly.chance.Chance

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {comparator ? (array : std.Array<T>, value : T): boolean} & chance.Chance.Options */
trait UniqueOptions[T]
  extends /* id */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.undefined
}

object UniqueOptions {
  @scala.inline
  def apply[T](
    StringDictionary: /* id */ StringDictionary[js.Any] = null,
    comparator: (/* array */ js.Array[T], /* value */ T) => CallbackTo[Boolean] = null
  ): UniqueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2((t0: /* array */ js.Array[T], t1: /* value */ T) => comparator(t0, t1).runNow()))
    __obj.asInstanceOf[UniqueOptions[T]]
  }
}

