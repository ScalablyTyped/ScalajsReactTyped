package typingsJapgolly.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List queries response.
  */
@js.native
trait SchemaListQueriesResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listQueriesResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Retrieved queries.
    */
  var queries: js.UndefOr[js.Array[SchemaQuery]] = js.native
}

object SchemaListQueriesResponse {
  @scala.inline
  def apply(kind: String = null, queries: js.Array[SchemaQuery] = null): SchemaListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListQueriesResponse]
  }
}

