package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter[T] extends js.Object {
  def formatEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T
  def formatUnknownEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T
}

object Formatter {
  @scala.inline
  def apply[T](
    formatEntry: (Double, Double, String, js.Array[String]) => CallbackTo[T],
    formatUnknownEntry: (Double, Double, String, js.Array[String]) => CallbackTo[T]
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatEntry")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: java.lang.String, t3: js.Array[java.lang.String]) => formatEntry(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("formatUnknownEntry")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: java.lang.String, t3: js.Array[java.lang.String]) => formatUnknownEntry(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Formatter[T]]
  }
}

