package typingsJapgolly.tern

import typingsJapgolly.tern.ternMod.DefinitionQuery
import typingsJapgolly.tern.ternMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryDefinitionQuery extends js.Object {
  var query: DefinitionQuery
  var result: DefinitionQueryResult
}

object AnonQueryDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): AnonQueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryDefinitionQuery]
  }
}

