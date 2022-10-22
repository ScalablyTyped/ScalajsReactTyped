package typingsJapgolly.csvParse

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csvParse.csvParseBooleans.`false`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-parse", "CsvError")
  @js.native
  open class CsvError protected ()
    extends StObject
       with Error
       with /* key */ StringDictionary[Any] {
    def this(code: CsvErrorCode, message: String, options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: String, options: Options, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Options, contexts: Any*) = this()
    
    val code: CsvErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("csv-parse", "Parser")
  @js.native
  open class Parser protected () extends Transform {
    def this(options: Options) = this()
    
    def __push(line: Any): Any = js.native
    
    def __write(chars: Any, end: Any, callback: Any): Any = js.native
    
    val info: Info = js.native
    
    val options: Options = js.native
  }
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(callback: Callback): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: Unit, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: Options, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: Buffer, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: Unit, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: Options, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: Unit, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: Options): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(options: Options, callback: Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  type Callback = js.Function3[/* err */ js.UndefOr[CsvError], /* records */ js.UndefOr[Any], /* info */ Info, Unit]
  
  trait CastingContext extends StObject {
    
    val column: Double | String
    
    val empty_lines: Double
    
    val error: CsvError
    
    val header: Boolean
    
    val index: Double
    
    val invalid_field_length: Double
    
    val lines: Double
    
    val quoting: Boolean
    
    val records: Double
  }
  object CastingContext {
    
    inline def apply(
      column: Double | String,
      empty_lines: Double,
      error: CsvError,
      header: Boolean,
      index: Double,
      invalid_field_length: Double,
      lines: Double,
      quoting: Boolean,
      records: Double
    ): CastingContext = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    extension [Self <: CastingContext](x: Self) {
      
      inline def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
      inline def setError(value: CsvError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInvalid_field_length(value: Double): Self = StObject.set(x, "invalid_field_length", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setQuoting(value: Boolean): Self = StObject.set(x, "quoting", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type CastingDateFunction = js.Function2[/* value */ String, /* context */ CastingContext, js.Date]
  
  type CastingFunction = js.Function2[/* value */ String, /* context */ CastingContext, Any]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Unit
    - scala.Null
    - typingsJapgolly.csvParse.csvParseBooleans.`false`
    - typingsJapgolly.csvParse.anon.Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_GROUP_COLUMNS_BY_NAME
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE
    - typingsJapgolly.csvParse.csvParseStrings.INVALID_OPENING_QUOTE
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT
    - typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION
    - typingsJapgolly.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE
    - typingsJapgolly.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE
    - typingsJapgolly.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED
    - typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_FIELDS_LENGTH
    - typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_COLUMNS
    - typingsJapgolly.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME
  */
  trait CsvErrorCode extends StObject
  object CsvErrorCode {
    
    inline def CSV_INVALID_ARGUMENT: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT = "CSV_INVALID_ARGUMENT".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT]
    
    inline def CSV_INVALID_CLOSING_QUOTE: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE = "CSV_INVALID_CLOSING_QUOTE".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE]
    
    inline def CSV_INVALID_COLUMN_DEFINITION: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION = "CSV_INVALID_COLUMN_DEFINITION".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION]
    
    inline def CSV_INVALID_COLUMN_MAPPING: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING = "CSV_INVALID_COLUMN_MAPPING".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING]
    
    inline def CSV_INVALID_OPTION_BOM: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM = "CSV_INVALID_OPTION_BOM".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM]
    
    inline def CSV_INVALID_OPTION_CAST: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST = "CSV_INVALID_OPTION_CAST".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST]
    
    inline def CSV_INVALID_OPTION_CAST_DATE: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE = "CSV_INVALID_OPTION_CAST_DATE".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE]
    
    inline def CSV_INVALID_OPTION_COLUMNS: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS = "CSV_INVALID_OPTION_COLUMNS".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS]
    
    inline def CSV_INVALID_OPTION_COMMENT: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT = "CSV_INVALID_OPTION_COMMENT".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT]
    
    inline def CSV_INVALID_OPTION_DELIMITER: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER = "CSV_INVALID_OPTION_DELIMITER".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER]
    
    inline def CSV_INVALID_OPTION_GROUP_COLUMNS_BY_NAME: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_GROUP_COLUMNS_BY_NAME = "CSV_INVALID_OPTION_GROUP_COLUMNS_BY_NAME".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_GROUP_COLUMNS_BY_NAME]
    
    inline def CSV_INVALID_OPTION_ON_RECORD: typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD = "CSV_INVALID_OPTION_ON_RECORD".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD]
    
    inline def CSV_MAX_RECORD_SIZE: typingsJapgolly.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE = "CSV_MAX_RECORD_SIZE".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE]
    
    inline def CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE: typingsJapgolly.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE = "CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE]
    
    inline def CSV_OPTION_COLUMNS_MISSING_NAME: typingsJapgolly.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME = "CSV_OPTION_COLUMNS_MISSING_NAME".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME]
    
    inline def CSV_QUOTE_NOT_CLOSED: typingsJapgolly.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED = "CSV_QUOTE_NOT_CLOSED".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED]
    
    inline def CSV_RECORD_INCONSISTENT_COLUMNS: typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_COLUMNS = "CSV_RECORD_INCONSISTENT_COLUMNS".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_COLUMNS]
    
    inline def CSV_RECORD_INCONSISTENT_FIELDS_LENGTH: typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_FIELDS_LENGTH = "CSV_RECORD_INCONSISTENT_FIELDS_LENGTH".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.CSV_RECORD_INCONSISTENT_FIELDS_LENGTH]
    
    inline def INVALID_OPENING_QUOTE: typingsJapgolly.csvParse.csvParseStrings.INVALID_OPENING_QUOTE = "INVALID_OPENING_QUOTE".asInstanceOf[typingsJapgolly.csvParse.csvParseStrings.INVALID_OPENING_QUOTE]
  }
  
  trait Info extends StObject {
    
    /**
      * Count of the number of processed bytes.
      */
    val bytes: Double
    
    /**
      * Count the number of lines being fully commented.
      */
    val comment_lines: Double
    
    /**
      * Count the number of processed empty lines.
      */
    val empty_lines: Double
    
    /**
      * Number of non uniform records when `relax_column_count` is true.
      */
    val invalid_field_length: Double
    
    /**
      * The number of lines encountered in the source dataset, start at 1 for the first line.
      */
    val lines: Double
    
    /**
      * Count the number of processed records.
      */
    val records: Double
  }
  object Info {
    
    inline def apply(
      bytes: Double,
      comment_lines: Double,
      empty_lines: Double,
      invalid_field_length: Double,
      lines: Double,
      records: Double
    ): Info = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], comment_lines = comment_lines.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setComment_lines(value: Double): Self = StObject.set(x, "comment_lines", value.asInstanceOf[js.Any])
      
      inline def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
      inline def setInvalid_field_length(value: Double): Self = StObject.set(x, "invalid_field_length", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var autoParse: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    var autoParseDate: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert read data types to native types.
      * @deprecated Use {@link cast}
      */
    var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
      * @deprecated Use {@link cast_date}
      */
    var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * If true, detect and exclude the byte order mark (BOM) from the CSV input if present.
      */
    var bom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to native types.
      * If a function, receive the value as first argument, a context as second argument and return a new value. More information about the context properties is available below.
      */
    var cast: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    var castDate: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to dates.
      * If a function, receive the value as argument and return a new value. It requires the "auto_parse" option. Be careful, it relies on Date.parse.
      */
    var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * List of fields as an array,
      * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
      * default to null,
      * affect the result data set in the sense that records will be objects instead of arrays.
      */
    var columns: js.UndefOr[
        js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ Any, js.Array[ColumnOption]])
      ] = js.undefined
    
    /**
      * Treat all the characters after this one as a comment, default to '' (disabled).
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Set the field delimiter. One character only, defaults to comma.
      */
    var delimiter: js.UndefOr[String | js.Array[String] | Buffer] = js.undefined
    
    /**
      * Set the source and destination encoding, a value of `null` returns buffer instead of strings.
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * Set the escape character, one character only, defaults to double quotes.
      */
    var escape: js.UndefOr[String | Null | `false` | Buffer] = js.undefined
    
    /**
      * Start handling records from the requested number of records.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    var fromLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Start handling records from the requested line number.
      */
    var from_line: js.UndefOr[Double] = js.undefined
    
    var groupColumnsByName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert values into an array of values when columns are activated and
      * when multiple columns of the same name are found.
      */
    var group_columns_by_name: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't interpret delimiters as such in the last field according to the number of fields calculated from the number of columns, the option require the presence of the `column` option when `true`.
      */
    var ignore_last_delimiters: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Generate two properties `info` and `record` where `info` is a snapshot of the info object at the time the record was created and `record` is the parsed array or object.
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
      * Does not remove whitespace in a quoted field.
      */
    var ltrim: js.UndefOr[Boolean] = js.undefined
    
    var maxRecordSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
      * used to guard against a wrong delimiter or record_delimiter,
      * default to 128000 characters.
      */
    var max_record_size: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of header-record title to name objects by.
      */
    var objname: js.UndefOr[String] = js.undefined
    
    var onRecord: js.UndefOr[js.Function2[/* record */ Any, /* context */ CastingContext, Any]] = js.undefined
    
    /**
      * Alter and filter records by executing a user defined function.
      */
    var on_record: js.UndefOr[js.Function2[/* record */ Any, /* context */ CastingContext, Any]] = js.undefined
    
    /**
      * Optional character surrounding a field, one character only, defaults to double quotes.
      */
    var quote: js.UndefOr[String | Boolean | Buffer | Null] = js.undefined
    
    /**
      * Generate two properties raw and row where raw is the original CSV row content and row is the parsed array or object.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var recordDelimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
      * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
      */
    var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var relaxColumnCount: js.UndefOr[Boolean] = js.undefined
    
    var relaxColumnCountLess: js.UndefOr[Boolean] = js.undefined
    
    var relaxColumnCountMore: js.UndefOr[Boolean] = js.undefined
    
    var relaxQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discard inconsistent columns count, default to false.
      */
    var relax_column_count: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discard inconsistent columns count when the record contains less fields than expected, default to false.
      */
    var relax_column_count_less: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discard inconsistent columns count when the record contains more fields than expected, default to false.
      */
    var relax_column_count_more: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve quotes inside unquoted field.
      */
    var relax_quotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
      * Does not remove whitespace in a quoted field.
      */
    var rtrim: js.UndefOr[Boolean] = js.undefined
    
    var skipEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    var skipRecordsWithEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    var skipRecordsWithError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dont generate empty values for empty lines.
      * Defaults to false
      */
    var skip_empty_lines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't generate records for lines containing empty column values (column matching /\s*\/), defaults to false.
      */
    var skip_records_with_empty_values: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip a line with error found inside and directly go process the next line.
      */
    var skip_records_with_error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stop handling records after the requested number of records.
      */
    var to: js.UndefOr[Double] = js.undefined
    
    var toLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Stop handling records after the requested line number.
      */
    var to_line: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, ignore whitespace immediately around the delimiter, defaults to false.
      * Does not remove whitespace in a quoted field.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoParse(value: Boolean | CastingFunction): Self = StObject.set(x, "autoParse", value.asInstanceOf[js.Any])
      
      inline def setAutoParseDate(value: Boolean | CastingDateFunction): Self = StObject.set(x, "autoParseDate", value.asInstanceOf[js.Any])
      
      inline def setAutoParseDateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "autoParseDate", js.Any.fromFunction2(value))
      
      inline def setAutoParseDateUndefined: Self = StObject.set(x, "autoParseDate", js.undefined)
      
      inline def setAutoParseFunction2(value: (/* value */ String, /* context */ CastingContext) => Any): Self = StObject.set(x, "autoParse", js.Any.fromFunction2(value))
      
      inline def setAutoParseUndefined: Self = StObject.set(x, "autoParse", js.undefined)
      
      inline def setAuto_parse(value: Boolean | CastingFunction): Self = StObject.set(x, "auto_parse", value.asInstanceOf[js.Any])
      
      inline def setAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => Any): Self = StObject.set(x, "auto_parse", js.Any.fromFunction2(value))
      
      inline def setAuto_parseUndefined: Self = StObject.set(x, "auto_parse", js.undefined)
      
      inline def setAuto_parse_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "auto_parse_date", value.asInstanceOf[js.Any])
      
      inline def setAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "auto_parse_date", js.Any.fromFunction2(value))
      
      inline def setAuto_parse_dateUndefined: Self = StObject.set(x, "auto_parse_date", js.undefined)
      
      inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setCast(value: Boolean | CastingFunction): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastDate(value: Boolean | CastingDateFunction): Self = StObject.set(x, "castDate", value.asInstanceOf[js.Any])
      
      inline def setCastDateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "castDate", js.Any.fromFunction2(value))
      
      inline def setCastDateUndefined: Self = StObject.set(x, "castDate", js.undefined)
      
      inline def setCastFunction2(value: (/* value */ String, /* context */ CastingContext) => Any): Self = StObject.set(x, "cast", js.Any.fromFunction2(value))
      
      inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      inline def setCast_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "cast_date", value.asInstanceOf[js.Any])
      
      inline def setCast_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "cast_date", js.Any.fromFunction2(value))
      
      inline def setCast_dateUndefined: Self = StObject.set(x, "cast_date", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ Any, js.Array[ColumnOption]])): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsFunction1(value: /* record */ Any => js.Array[ColumnOption]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnOption*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDelimiter(value: String | js.Array[String] | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEscape(value: String | `false` | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeNull: Self = StObject.set(x, "escape", null)
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromLine(value: Double): Self = StObject.set(x, "fromLine", value.asInstanceOf[js.Any])
      
      inline def setFromLineUndefined: Self = StObject.set(x, "fromLine", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFrom_line(value: Double): Self = StObject.set(x, "from_line", value.asInstanceOf[js.Any])
      
      inline def setFrom_lineUndefined: Self = StObject.set(x, "from_line", js.undefined)
      
      inline def setGroupColumnsByName(value: Boolean): Self = StObject.set(x, "groupColumnsByName", value.asInstanceOf[js.Any])
      
      inline def setGroupColumnsByNameUndefined: Self = StObject.set(x, "groupColumnsByName", js.undefined)
      
      inline def setGroup_columns_by_name(value: Boolean): Self = StObject.set(x, "group_columns_by_name", value.asInstanceOf[js.Any])
      
      inline def setGroup_columns_by_nameUndefined: Self = StObject.set(x, "group_columns_by_name", js.undefined)
      
      inline def setIgnore_last_delimiters(value: Boolean | Double): Self = StObject.set(x, "ignore_last_delimiters", value.asInstanceOf[js.Any])
      
      inline def setIgnore_last_delimitersUndefined: Self = StObject.set(x, "ignore_last_delimiters", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setMaxRecordSize(value: Double): Self = StObject.set(x, "maxRecordSize", value.asInstanceOf[js.Any])
      
      inline def setMaxRecordSizeUndefined: Self = StObject.set(x, "maxRecordSize", js.undefined)
      
      inline def setMax_record_size(value: Double): Self = StObject.set(x, "max_record_size", value.asInstanceOf[js.Any])
      
      inline def setMax_record_sizeUndefined: Self = StObject.set(x, "max_record_size", js.undefined)
      
      inline def setObjname(value: String): Self = StObject.set(x, "objname", value.asInstanceOf[js.Any])
      
      inline def setObjnameUndefined: Self = StObject.set(x, "objname", js.undefined)
      
      inline def setOnRecord(value: (/* record */ Any, /* context */ CastingContext) => Any): Self = StObject.set(x, "onRecord", js.Any.fromFunction2(value))
      
      inline def setOnRecordUndefined: Self = StObject.set(x, "onRecord", js.undefined)
      
      inline def setOn_record(value: (/* record */ Any, /* context */ CastingContext) => Any): Self = StObject.set(x, "on_record", js.Any.fromFunction2(value))
      
      inline def setOn_recordUndefined: Self = StObject.set(x, "on_record", js.undefined)
      
      inline def setQuote(value: String | Boolean | Buffer): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRecordDelimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "recordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "recordDelimiter", js.undefined)
      
      inline def setRecordDelimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "recordDelimiter", js.Array(value*))
      
      inline def setRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
      
      inline def setRecord_delimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "record_delimiter", js.Array(value*))
      
      inline def setRelaxColumnCount(value: Boolean): Self = StObject.set(x, "relaxColumnCount", value.asInstanceOf[js.Any])
      
      inline def setRelaxColumnCountLess(value: Boolean): Self = StObject.set(x, "relaxColumnCountLess", value.asInstanceOf[js.Any])
      
      inline def setRelaxColumnCountLessUndefined: Self = StObject.set(x, "relaxColumnCountLess", js.undefined)
      
      inline def setRelaxColumnCountMore(value: Boolean): Self = StObject.set(x, "relaxColumnCountMore", value.asInstanceOf[js.Any])
      
      inline def setRelaxColumnCountMoreUndefined: Self = StObject.set(x, "relaxColumnCountMore", js.undefined)
      
      inline def setRelaxColumnCountUndefined: Self = StObject.set(x, "relaxColumnCount", js.undefined)
      
      inline def setRelaxQuotes(value: Boolean): Self = StObject.set(x, "relaxQuotes", value.asInstanceOf[js.Any])
      
      inline def setRelaxQuotesUndefined: Self = StObject.set(x, "relaxQuotes", js.undefined)
      
      inline def setRelax_column_count(value: Boolean): Self = StObject.set(x, "relax_column_count", value.asInstanceOf[js.Any])
      
      inline def setRelax_column_countUndefined: Self = StObject.set(x, "relax_column_count", js.undefined)
      
      inline def setRelax_column_count_less(value: Boolean): Self = StObject.set(x, "relax_column_count_less", value.asInstanceOf[js.Any])
      
      inline def setRelax_column_count_lessUndefined: Self = StObject.set(x, "relax_column_count_less", js.undefined)
      
      inline def setRelax_column_count_more(value: Boolean): Self = StObject.set(x, "relax_column_count_more", value.asInstanceOf[js.Any])
      
      inline def setRelax_column_count_moreUndefined: Self = StObject.set(x, "relax_column_count_more", js.undefined)
      
      inline def setRelax_quotes(value: Boolean): Self = StObject.set(x, "relax_quotes", value.asInstanceOf[js.Any])
      
      inline def setRelax_quotesUndefined: Self = StObject.set(x, "relax_quotes", js.undefined)
      
      inline def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setSkipEmptyLines(value: Boolean): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
      
      inline def setSkipRecordsWithEmptyValues(value: Boolean): Self = StObject.set(x, "skipRecordsWithEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setSkipRecordsWithEmptyValuesUndefined: Self = StObject.set(x, "skipRecordsWithEmptyValues", js.undefined)
      
      inline def setSkipRecordsWithError(value: Boolean): Self = StObject.set(x, "skipRecordsWithError", value.asInstanceOf[js.Any])
      
      inline def setSkipRecordsWithErrorUndefined: Self = StObject.set(x, "skipRecordsWithError", js.undefined)
      
      inline def setSkip_empty_lines(value: Boolean): Self = StObject.set(x, "skip_empty_lines", value.asInstanceOf[js.Any])
      
      inline def setSkip_empty_linesUndefined: Self = StObject.set(x, "skip_empty_lines", js.undefined)
      
      inline def setSkip_records_with_empty_values(value: Boolean): Self = StObject.set(x, "skip_records_with_empty_values", value.asInstanceOf[js.Any])
      
      inline def setSkip_records_with_empty_valuesUndefined: Self = StObject.set(x, "skip_records_with_empty_values", js.undefined)
      
      inline def setSkip_records_with_error(value: Boolean): Self = StObject.set(x, "skip_records_with_error", value.asInstanceOf[js.Any])
      
      inline def setSkip_records_with_errorUndefined: Self = StObject.set(x, "skip_records_with_error", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToLine(value: Double): Self = StObject.set(x, "toLine", value.asInstanceOf[js.Any])
      
      inline def setToLineUndefined: Self = StObject.set(x, "toLine", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTo_line(value: Double): Self = StObject.set(x, "to_line", value.asInstanceOf[js.Any])
      
      inline def setTo_lineUndefined: Self = StObject.set(x, "to_line", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait _ColumnOption extends StObject
}
