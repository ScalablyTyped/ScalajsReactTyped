package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaResponse extends js.Object {
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.schemasMod.Tags] = js.native
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[string] = js.native
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[js.Date] = js.native
}

object CreateSchemaResponse {
  @scala.inline
  def apply(
    Description: string = null,
    LastModified: js.Date = null,
    SchemaArn: string = null,
    SchemaName: string = null,
    SchemaVersion: string = null,
    Tags: Tags = null,
    Type: string = null,
    VersionCreatedDate: js.Date = null
  ): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VersionCreatedDate != null) __obj.updateDynamic("VersionCreatedDate")(VersionCreatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaResponse]
  }
}

