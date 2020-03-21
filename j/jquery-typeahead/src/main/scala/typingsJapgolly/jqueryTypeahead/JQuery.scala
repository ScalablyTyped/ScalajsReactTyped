package typingsJapgolly.jqueryTypeahead

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryTypeahead.RunningCoder.Typeahead.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def typeahead(options: Options): JQuery
}

object JQuery {
  @scala.inline
  def apply(typeahead: Options => CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeahead")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryTypeahead.RunningCoder.Typeahead.Options) => typeahead(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

