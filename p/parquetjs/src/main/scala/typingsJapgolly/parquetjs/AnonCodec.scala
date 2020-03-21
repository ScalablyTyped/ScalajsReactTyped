package typingsJapgolly.parquetjs

import typingsJapgolly.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodec extends js.Object {
  var codec: Double | Null
  var data_page_offset: ^  | Null
  var dictionary_page_offset: ^  | Null
  var encoding_stats: js.Any
  var encodings: js.Array[Double] | Null
  var index_page_offset: ^  | Null
  var key_value_metadata: js.Array[AnonKey] | Null
  var num_values: ^  | Null
  var path_in_schema: (js.Array[js.Array[String] | String]) | Null
  var statistics: js.Any
  var total_compressed_size: ^  | Null
  var total_uncompressed_size: ^  | Null
  var `type`: Double | Null
}

object AnonCodec {
  @scala.inline
  def apply(
    encoding_stats: js.Any,
    statistics: js.Any,
    codec: Int | Double = null,
    data_page_offset: ^ = null,
    dictionary_page_offset: ^ = null,
    encodings: js.Array[Double] = null,
    index_page_offset: ^ = null,
    key_value_metadata: js.Array[AnonKey] = null,
    num_values: ^ = null,
    path_in_schema: js.Array[js.Array[String] | String] = null,
    total_compressed_size: ^ = null,
    total_uncompressed_size: ^ = null,
    `type`: Int | Double = null
  ): AnonCodec = {
    val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (data_page_offset != null) __obj.updateDynamic("data_page_offset")(data_page_offset.asInstanceOf[js.Any])
    if (dictionary_page_offset != null) __obj.updateDynamic("dictionary_page_offset")(dictionary_page_offset.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings.asInstanceOf[js.Any])
    if (index_page_offset != null) __obj.updateDynamic("index_page_offset")(index_page_offset.asInstanceOf[js.Any])
    if (key_value_metadata != null) __obj.updateDynamic("key_value_metadata")(key_value_metadata.asInstanceOf[js.Any])
    if (num_values != null) __obj.updateDynamic("num_values")(num_values.asInstanceOf[js.Any])
    if (path_in_schema != null) __obj.updateDynamic("path_in_schema")(path_in_schema.asInstanceOf[js.Any])
    if (total_compressed_size != null) __obj.updateDynamic("total_compressed_size")(total_compressed_size.asInstanceOf[js.Any])
    if (total_uncompressed_size != null) __obj.updateDynamic("total_uncompressed_size")(total_uncompressed_size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodec]
  }
}

