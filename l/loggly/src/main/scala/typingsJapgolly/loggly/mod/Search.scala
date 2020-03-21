package typingsJapgolly.loggly.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  def run(callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): this.type
}

object Search {
  @scala.inline
  def apply(run: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => CallbackTo[Search]): Search = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Any, /* results */ typingsJapgolly.loggly.mod.SearchResults, scala.Unit]) => run(t0).runNow()))
    __obj.asInstanceOf[Search]
  }
}

