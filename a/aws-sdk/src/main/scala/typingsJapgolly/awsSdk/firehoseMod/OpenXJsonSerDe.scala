package typingsJapgolly.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenXJsonSerDe extends js.Object {
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var CaseInsensitive: js.UndefOr[BooleanObject] = js.native
  /**
    * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to {"ts": "timestamp"} to map this key to a column named ts.
    */
  var ColumnToJsonKeyMappings: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.ColumnToJsonKeyMappings] = js.native
  /**
    * When set to true, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. The default is false.
    */
  var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.native
}

object OpenXJsonSerDe {
  @scala.inline
  def apply(
    CaseInsensitive: js.UndefOr[Boolean] = js.undefined,
    ColumnToJsonKeyMappings: ColumnToJsonKeyMappings = null,
    ConvertDotsInJsonKeysToUnderscores: js.UndefOr[Boolean] = js.undefined
  ): OpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CaseInsensitive)) __obj.updateDynamic("CaseInsensitive")(CaseInsensitive.asInstanceOf[js.Any])
    if (ColumnToJsonKeyMappings != null) __obj.updateDynamic("ColumnToJsonKeyMappings")(ColumnToJsonKeyMappings.asInstanceOf[js.Any])
    if (!js.isUndefined(ConvertDotsInJsonKeysToUnderscores)) __obj.updateDynamic("ConvertDotsInJsonKeysToUnderscores")(ConvertDotsInJsonKeysToUnderscores.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenXJsonSerDe]
  }
}

