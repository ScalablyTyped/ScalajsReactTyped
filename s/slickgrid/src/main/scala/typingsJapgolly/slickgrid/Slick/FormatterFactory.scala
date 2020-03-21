package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_]
}

object FormatterFactory {
  @scala.inline
  def apply[T /* <: SlickData */](getFormatter: Column[T] => CallbackTo[Formatter[js.Any]]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFormatter")(js.Any.fromFunction1((t0: typingsJapgolly.slickgrid.Slick.Column[T]) => getFormatter(t0).runNow()))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
}

