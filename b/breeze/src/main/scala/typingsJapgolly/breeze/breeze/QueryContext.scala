package typingsJapgolly.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var dataService: DataService
  var entityManager: EntityManager
  var query: EntityQuery | String
  var queryOptions: QueryOptions
  var url: String
}

object QueryContext {
  @scala.inline
  def apply(
    dataService: DataService,
    entityManager: EntityManager,
    query: EntityQuery | String,
    queryOptions: QueryOptions,
    url: String
  ): QueryContext = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], entityManager = entityManager.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryContext]
  }
}

