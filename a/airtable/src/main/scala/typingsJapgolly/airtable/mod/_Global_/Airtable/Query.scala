package typingsJapgolly.airtable.mod._Global_.Airtable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TFields /* <: js.Object */] extends js.Object {
  def all(): js.Promise[Records[TFields]]
  def eachPage(pageCallback: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit]
  def firstPage(): js.Promise[Records[TFields]]
}

object Query {
  @scala.inline
  def apply[TFields /* <: js.Object */](
    all: CallbackTo[js.Promise[Records[TFields]]],
    eachPage: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => CallbackTo[js.Promise[Unit]],
    firstPage: CallbackTo[js.Promise[Records[TFields]]]
  ): Query[TFields] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("eachPage")(js.Any.fromFunction1((t0: js.Function2[
  /* records */ typingsJapgolly.airtable.mod._Global_.Airtable.Records[TFields], 
  /* next */ js.Function0[scala.Unit], 
  scala.Unit]) => eachPage(t0).runNow()))
    __obj.updateDynamic("firstPage")(firstPage.toJsFn)
    __obj.asInstanceOf[Query[TFields]]
  }
}

