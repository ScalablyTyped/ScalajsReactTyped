package typingsJapgolly.sparqljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlParser extends js.Object {
  def parse(query: String): SparqlQuery
}

object SparqlParser {
  @scala.inline
  def apply(parse: String => CallbackTo[SparqlQuery]): SparqlParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[SparqlParser]
  }
}

