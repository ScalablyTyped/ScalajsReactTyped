package typingsJapgolly.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCsvOptions extends js.Object {
  /**
    * [Optional] Indicates if BigQuery should accept rows that are missing
    * trailing optional columns. If true, BigQuery treats missing trailing
    * columns as null values. If false, records with missing trailing columns
    * are treated as bad records, and if there are too many bad records, an
    * invalid error is returned in the job result. The default value is false.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow quoted data sections that
    * contain newline characters in a CSV file. The default value is false.
    */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The character encoding of the data. The supported values are
    * UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the
    * data after the raw, binary data has been split using the values of the
    * quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * [Optional] The separator for fields in a CSV file. BigQuery converts the
    * string to ISO-8859-1 encoding, and then uses the first byte of the
    * encoded string to split the data in its raw, binary state. BigQuery also
    * supports the escape sequence &quot;\t&quot; to specify a tab separator.
    * The default value is a comma (&#39;,&#39;).
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  /**
    * [Optional] The value that is used to quote data sections in a CSV file.
    * BigQuery converts the string to ISO-8859-1 encoding, and then uses the
    * first byte of the encoded string to split the data in its raw, binary
    * state. The default value is a double-quote (&#39;&quot;&#39;). If your
    * data does not contain quoted sections, set the property value to an empty
    * string. If your data contains quoted newline characters, you must also
    * set the allowQuotedNewlines property to true.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will
    * skip when reading the data. The default value is 0. This property is
    * useful if you have header rows in the file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[String] = js.native
}

object SchemaCsvOptions {
  @scala.inline
  def apply(
    allowJaggedRows: js.UndefOr[Boolean] = js.undefined,
    allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    fieldDelimiter: String = null,
    quote: String = null,
    skipLeadingRows: String = null
  ): SchemaCsvOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowJaggedRows)) __obj.updateDynamic("allowJaggedRows")(allowJaggedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowQuotedNewlines)) __obj.updateDynamic("allowQuotedNewlines")(allowQuotedNewlines.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCsvOptions]
  }
}

