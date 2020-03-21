package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableColumn extends js.Object {
  /**
    * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text
    * strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level.
    * However, the setting at this level takes precedence if 'encoding' is set at both levels.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]&#42;, a valid identifier must be provided as
    * the column field name and is used as field name in queries.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /**
    * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level.
    * However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  /**
    * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid
    * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field
    * name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]&#42;,
    * a valid identifier must be provided as field_name.
    */
  var qualifierEncoded: js.UndefOr[String] = js.undefined
  var qualifierString: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using
    * the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can
    * also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BigtableColumn {
  @scala.inline
  def apply(
    encoding: String = null,
    fieldName: String = null,
    onlyReadLatest: js.UndefOr[Boolean] = js.undefined,
    qualifierEncoded: String = null,
    qualifierString: String = null,
    `type`: String = null
  ): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyReadLatest)) __obj.updateDynamic("onlyReadLatest")(onlyReadLatest.asInstanceOf[js.Any])
    if (qualifierEncoded != null) __obj.updateDynamic("qualifierEncoded")(qualifierEncoded.asInstanceOf[js.Any])
    if (qualifierString != null) __obj.updateDynamic("qualifierString")(qualifierString.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigtableColumn]
  }
}

