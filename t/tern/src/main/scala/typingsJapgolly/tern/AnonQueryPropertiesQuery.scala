package typingsJapgolly.tern

import typingsJapgolly.tern.ternMod.PropertiesQuery
import typingsJapgolly.tern.ternMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryPropertiesQuery extends js.Object {
  var query: PropertiesQuery
  var result: PropertiesQueryResult
}

object AnonQueryPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): AnonQueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryPropertiesQuery]
  }
}

