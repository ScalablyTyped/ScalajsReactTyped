package typingsJapgolly.sparqljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlGenerator extends js.Object {
  def stringify(query: SparqlQuery): String
}

object SparqlGenerator {
  @scala.inline
  def apply(stringify: SparqlQuery => CallbackTo[String]): SparqlGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.sparqljs.mod.SparqlQuery) => stringify(t0).runNow()))
    __obj.asInstanceOf[SparqlGenerator]
  }
}

