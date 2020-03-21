package typingsJapgolly.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaViewDefinition extends js.Object {
  /**
    * [Required] A query that BigQuery executes when the view is referenced.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL for this view. The
    * default value is true. If set to false, the view will use BigQuery&#39;s
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries
    * and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * Describes user-defined function resources used in the query.
    */
  var userDefinedFunctionResources: js.UndefOr[js.Array[SchemaUserDefinedFunctionResource]] = js.native
}

object SchemaViewDefinition {
  @scala.inline
  def apply(
    query: String = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[SchemaUserDefinedFunctionResource] = null
  ): SchemaViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaViewDefinition]
  }
}

