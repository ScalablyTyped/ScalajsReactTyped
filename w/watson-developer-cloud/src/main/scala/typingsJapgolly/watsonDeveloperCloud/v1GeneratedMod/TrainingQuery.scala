package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingQuery. */
trait TrainingQuery extends js.Object {
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.undefined
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.undefined
  /** The natural text query for the training query. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  /** The query ID associated with the training query. */
  var query_id: js.UndefOr[String] = js.undefined
}

object TrainingQuery {
  @scala.inline
  def apply(
    examples: js.Array[TrainingExample] = null,
    filter: String = null,
    natural_language_query: String = null,
    query_id: String = null
  ): TrainingQuery = {
    val __obj = js.Dynamic.literal()
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (natural_language_query != null) __obj.updateDynamic("natural_language_query")(natural_language_query.asInstanceOf[js.Any])
    if (query_id != null) __obj.updateDynamic("query_id")(query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingQuery]
  }
}

