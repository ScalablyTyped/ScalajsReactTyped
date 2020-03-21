package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVersionSummary extends js.Object {
  /**
    * The ARN of the schema version.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
}

object SchemaVersionSummary {
  @scala.inline
  def apply(SchemaArn: string = null, SchemaName: string = null, SchemaVersion: string = null): SchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVersionSummary]
  }
}

