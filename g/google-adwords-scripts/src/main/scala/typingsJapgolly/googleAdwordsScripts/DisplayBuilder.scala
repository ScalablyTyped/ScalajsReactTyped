package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Display
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  def exclude(): AdWordsOperation[T]
  def withCpc(cpc: Double): T
  def withCpm(cpm: Double): T
}

object DisplayBuilder {
  @scala.inline
  def apply[T](
    build: CallbackTo[AdWordsOperation[T]],
    exclude: CallbackTo[AdWordsOperation[T]],
    withCpc: Double => CallbackTo[T],
    withCpm: Double => CallbackTo[T]
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withCpc")(js.Any.fromFunction1((t0: scala.Double) => withCpc(t0).runNow()))
    __obj.updateDynamic("withCpm")(js.Any.fromFunction1((t0: scala.Double) => withCpm(t0).runNow()))
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
}

