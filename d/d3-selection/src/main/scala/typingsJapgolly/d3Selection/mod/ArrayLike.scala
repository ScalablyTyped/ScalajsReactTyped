package typingsJapgolly.d3Selection.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike[T] extends /* index */ NumberDictionary[T] {
  var length: Double
  def item(index: Double): T | Null
}

object ArrayLike {
  @scala.inline
  def apply[T](
    item: Double => CallbackTo[T | Null],
    length: Double,
    NumberDictionary: /* index */ NumberDictionary[T] = null
  ): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

