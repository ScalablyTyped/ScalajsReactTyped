package typingsJapgolly.reactInstantsearchCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateURL extends js.Object {
  def createURL(args: js.Any*): String
  def refine(args: js.Any*): js.Any
  def searchForItems(args: js.Any*): js.Any
}

object AnonCreateURL {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => CallbackTo[String],
    refine: /* repeated */ js.Any => CallbackTo[js.Any],
    searchForItems: /* repeated */ js.Any => CallbackTo[js.Any]
  ): AnonCreateURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refine(t0).runNow()))
    __obj.updateDynamic("searchForItems")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => searchForItems(t0).runNow()))
    __obj.asInstanceOf[AnonCreateURL]
  }
}

