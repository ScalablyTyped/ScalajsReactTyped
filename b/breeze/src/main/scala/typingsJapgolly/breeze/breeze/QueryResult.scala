package typingsJapgolly.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.undefined
  /** Raw response from the server */
  var httpResponse: HttpResponse
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[Double] = js.undefined
  /** Query that was executed */
  var query: EntityQuery
  /** Top level entities returned */
  var results: js.Array[Entity]
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(
    httpResponse: HttpResponse,
    query: EntityQuery,
    results: js.Array[Entity],
    entityManager: EntityManager = null,
    inlineCount: Int | Double = null,
    retrievedEntities: js.Array[Entity] = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal(httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    if (entityManager != null) __obj.updateDynamic("entityManager")(entityManager.asInstanceOf[js.Any])
    if (inlineCount != null) __obj.updateDynamic("inlineCount")(inlineCount.asInstanceOf[js.Any])
    if (retrievedEntities != null) __obj.updateDynamic("retrievedEntities")(retrievedEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

