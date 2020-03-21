package typingsJapgolly.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#execution-statistics
trait MangoExecutionStats extends js.Object {
  // Total execution time in milliseconds as measured by the database.
  var execution_time_ms: Double
  // Number of results returned from the query.
  var results_returned: Double
  // Number of documents fetched from the database / index, equivalent to using include_docs = true in a view.
  var total_docs_examined: Double
  // Number of index keys examined. Currently always 0.
  var total_keys_examined: Double
  // Number of documents fetched from the database using an out - of - band document fetch.
  // This is only non - zero when read quorum > 1 is specified in the query parameters.
  var total_quorum_docs_examined: Double
}

object MangoExecutionStats {
  @scala.inline
  def apply(
    execution_time_ms: Double,
    results_returned: Double,
    total_docs_examined: Double,
    total_keys_examined: Double,
    total_quorum_docs_examined: Double
  ): MangoExecutionStats = {
    val __obj = js.Dynamic.literal(execution_time_ms = execution_time_ms.asInstanceOf[js.Any], results_returned = results_returned.asInstanceOf[js.Any], total_docs_examined = total_docs_examined.asInstanceOf[js.Any], total_keys_examined = total_keys_examined.asInstanceOf[js.Any], total_quorum_docs_examined = total_quorum_docs_examined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MangoExecutionStats]
  }
}

