package typingsJapgolly.tern

import typingsJapgolly.tern.ternMod.CompletionsQuery
import typingsJapgolly.tern.ternMod.CompletionsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryCompletionsQuery extends js.Object {
  var query: CompletionsQuery
  var result: CompletionsQueryResult
}

object AnonQueryCompletionsQuery {
  @scala.inline
  def apply(query: CompletionsQuery, result: CompletionsQueryResult): AnonQueryCompletionsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryCompletionsQuery]
  }
}

