package typingsJapgolly.yadda.fileSearchMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSearch extends js.Object {
  def each(fn: js.Function1[/* file */ String, Unit]): Unit
  def list(): js.Array[String]
}

object FileSearch {
  @scala.inline
  def apply(each: js.Function1[/* file */ String, Unit] => Callback, list: CallbackTo[js.Array[String]]): FileSearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[/* file */ java.lang.String, scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[FileSearch]
  }
}

