package typingsJapgolly.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of queries to run on a cluster.
  */
@js.native
trait SchemaQueryList extends js.Object {
  /**
    * Required. The queries to execute. You do not need to terminate a query
    * with a semicolon. Multiple queries can be specified in one string by
    * separating each with a semicolon. Here is an example of an Cloud Dataproc
    * API snippet that uses a QueryList to specify a HiveJob:
    * &quot;hiveJob&quot;: {   &quot;queryList&quot;: { &quot;queries&quot;: [
    * &quot;query1&quot;,       &quot;query2&quot;, &quot;query3;query4&quot;,
    * ]   } }
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
}

object SchemaQueryList {
  @scala.inline
  def apply(queries: js.Array[String] = null): SchemaQueryList = {
    val __obj = js.Dynamic.literal()
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryList]
  }
}

