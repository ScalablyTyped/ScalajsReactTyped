package typingsJapgolly.asyncCsv

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param options
    */
  inline def generate(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.Promise[js.Array[Any]]]
  inline def generate(options: CsvGenerateOptions): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  /**
    * Parses a CSV file into an array of rows.
    *
    * @param input
    * @param options
    */
  inline def parse(input: String): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def parse(input: String, options: CsvParseOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  /**
    * Converts an array of rows into a CSV string.
    *
    * @param data
    * @param options
    */
  inline def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]], options: CsvStringifyOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    *
    * @param data
    * @param handler
    * @param options
    */
  inline def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[Any], 
      U
    ]
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  inline def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[Any], 
      U
    ],
    options: TransformOptions
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  
  type Cast[T] = js.Function2[/* value */ T, /* context */ CastingContext, String]
  
  trait CastingContext extends StObject {
    
    val column: js.UndefOr[Double | String] = js.undefined
    
    val empty_lines: Double
    
    val header: Boolean
    
    val index: Double
    
    val invalid_field_length: Double
    
    val lines: Double
    
    val quoting: Boolean
    
    val records: Double
  }
  object CastingContext {
    
    inline def apply(
      empty_lines: Double,
      header: Boolean,
      index: Double,
      invalid_field_length: Double,
      lines: Double,
      quoting: Boolean,
      records: Double
    ): CastingContext = {
      val __obj = js.Dynamic.literal(empty_lines = empty_lines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    extension [Self <: CastingContext](x: Self) {
      
      inline def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
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
    - typingsJapgolly.asyncCsv.asyncCsvBooleans.`false`
    - typingsJapgolly.asyncCsv.anon.Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | String | Null]
  
  trait CsvGenerateOptions extends StObject {
    
    /**
      * Define the number of generated fields and the generation method.
      */
    var columns: js.UndefOr[Double | js.Array[String]] = js.undefined
    
    /**
      * Set the field delimiter.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Period to run in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, then buffers will be decoded to strings using the
      * specified encoding.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * When to stop the generation.
      */
    var end: js.UndefOr[Double | js.Date] = js.undefined
    
    /**
      * One or multiple characters to print at the end of the file; only
      * apply when objectMode is disabled.
      */
    var eof: js.UndefOr[Boolean | String] = js.undefined
    
    var fixedSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate buffers equals length as defined by the
      * `highWaterMark` option.
      */
    var fixed_size: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of bytes to store in the internal buffer before
      * ceasing to read from the underlying resource.
      */
    var high_water_mark: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of lines or records to generate.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    var maxWordLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of characters per word.
      */
    var max_word_length: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this stream should behave as a stream of objects.
      */
    var object_mode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One or multiple characters used to delimit records.
      */
    var row_delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Generate idempotent random characters if a number provided.
      */
    var seed: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The time to wait between the generation of each records
      */
    var sleep: js.UndefOr[Double] = js.undefined
  }
  object CsvGenerateOptions {
    
    inline def apply(): CsvGenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvGenerateOptions]
    }
    
    extension [Self <: CsvGenerateOptions](x: Self) {
      
      inline def setColumns(value: Double | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnd(value: Double | js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEof(value: Boolean | String): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      inline def setFixedSize(value: Boolean): Self = StObject.set(x, "fixedSize", value.asInstanceOf[js.Any])
      
      inline def setFixedSizeUndefined: Self = StObject.set(x, "fixedSize", js.undefined)
      
      inline def setFixed_size(value: Boolean): Self = StObject.set(x, "fixed_size", value.asInstanceOf[js.Any])
      
      inline def setFixed_sizeUndefined: Self = StObject.set(x, "fixed_size", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setHigh_water_mark(value: Double): Self = StObject.set(x, "high_water_mark", value.asInstanceOf[js.Any])
      
      inline def setHigh_water_markUndefined: Self = StObject.set(x, "high_water_mark", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxWordLength(value: Double): Self = StObject.set(x, "maxWordLength", value.asInstanceOf[js.Any])
      
      inline def setMaxWordLengthUndefined: Self = StObject.set(x, "maxWordLength", js.undefined)
      
      inline def setMax_word_length(value: Double): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
      
      inline def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setObject_mode(value: Boolean): Self = StObject.set(x, "object_mode", value.asInstanceOf[js.Any])
      
      inline def setObject_modeUndefined: Self = StObject.set(x, "object_mode", js.undefined)
      
      inline def setRow_delimiter(value: String): Self = StObject.set(x, "row_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRow_delimiterUndefined: Self = StObject.set(x, "row_delimiter", js.undefined)
      
      inline def setSeed(value: Boolean | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSleep(value: Double): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      inline def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
    }
  }
  
  trait CsvParseOptions extends StObject {
    
    /**
      * If true, the parser will attempt to convert read data types to
      * native types.
      *
      * @deprecated Use {@link cast}
      */
    var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert read data types to dates.
      * It requires the "auto_parse" option.
      *
      * @deprecated Use {@link cast_date}
      */
    var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * If true, detect and exclude the byte order mark (BOM) from the CSV
      * input, if present.
      */
    var bom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to native
      * types. If a function, receive the value as first argument, a context
      * as second argument and return a new value. More information about the
      * context properties is available below.
      */
    var cast: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to dates.
      * If a function, receive the value as argument and return a new value.
      * It requires the "auto_parse" option. Be careful, it relies
      * on `Date.parse`.
      */
    var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * List of fields as an array, a user defined callback accepting the
      * first line and returning the column names or true if auto-discovered
      * in the first CSV line. Defaults to null. Affects the result data set
      * in the sense that records will be objects instead of arrays.
      */
    var columns: js.UndefOr[
        js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ Any, js.Array[ColumnOption]])
      ] = js.undefined
    
    /**
      * Treat all the characters after this one as a comment.
      * Default to '' (disabled).
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Set the field delimiter. One character only, defaults to comma.
      */
    var delimiter: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Set the escape character, one character only.
      * Defaults to double quotes.
      */
    var escape: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Start handling records from the requested number of records.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      * Start handling records from the requested line number.
      */
    var from_line: js.UndefOr[Double] = js.undefined
    
    /**
      * Generate two properties `info` and `record` where `info` is a
      * snapshot of the info object at the time the record was created and
      * `record` is the parsed array or object.
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately following the delimiter (i.e.
      * left-trim all fields), defaults to false. Does not remove whitespace
      * in a quoted field.
      */
    var ltrim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of characters to be contained in the field and line
      * buffers before an exception is raised, used to guard against a wrong
      * delimiter or `record_delimiter`, default to 128,000 characters.
      */
    var max_record_size: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of header-record title to name objects by.
      */
    var objname: js.UndefOr[String] = js.undefined
    
    /**
      * Optional character surrounding a field, one character only, defaults
      * to double quotes.
      */
    var quote: js.UndefOr[String | Boolean | Buffer] = js.undefined
    
    /**
      * Generate two properties raw and row where raw is the original CSV row
      * content and row is the parsed array or object.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One or multiple characters used to delimit record rows; defaults to
      * auto discovery if not provided. Supported auto discovery method are
      * Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
      */
    var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * Preserve quotes inside unquoted field.
      */
    var relax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discard inconsistent columns count, default to false.
      */
    var relax_column_count: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately preceding the delimiter (i.e.
      * right-trim all fields), defaults to false. Does not remove whitespace
      * in a quoted field.
      */
    var rtrim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dont generate empty values for empty lines.
      * Defaults to false
      */
    var skip_empty_lines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't generate records for lines containing empty column values
      * (column matching /\s*\/), defaults to false.
      */
    var skip_lines_with_empty_values: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip a line with error found inside and directly go process the
      * next line.
      */
    var skip_lines_with_error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stop handling records after the requested number of records.
      */
    var to: js.UndefOr[Double] = js.undefined
    
    /**
      * Stop handling records after the requested line number.
      */
    var to_line: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, ignore whitespace immediately around the delimiter,
      * defaults to `false`. Does not remove whitespace in a quoted field.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object CsvParseOptions {
    
    inline def apply(): CsvParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvParseOptions]
    }
    
    extension [Self <: CsvParseOptions](x: Self) {
      
      inline def setAuto_parse(value: Boolean | CastingFunction): Self = StObject.set(x, "auto_parse", value.asInstanceOf[js.Any])
      
      inline def setAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => Any): Self = StObject.set(x, "auto_parse", js.Any.fromFunction2(value))
      
      inline def setAuto_parseUndefined: Self = StObject.set(x, "auto_parse", js.undefined)
      
      inline def setAuto_parse_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "auto_parse_date", value.asInstanceOf[js.Any])
      
      inline def setAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "auto_parse_date", js.Any.fromFunction2(value))
      
      inline def setAuto_parse_dateUndefined: Self = StObject.set(x, "auto_parse_date", js.undefined)
      
      inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setCast(value: Boolean | CastingFunction): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
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
      
      inline def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFrom_line(value: Double): Self = StObject.set(x, "from_line", value.asInstanceOf[js.Any])
      
      inline def setFrom_lineUndefined: Self = StObject.set(x, "from_line", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setMax_record_size(value: Double): Self = StObject.set(x, "max_record_size", value.asInstanceOf[js.Any])
      
      inline def setMax_record_sizeUndefined: Self = StObject.set(x, "max_record_size", js.undefined)
      
      inline def setObjname(value: String): Self = StObject.set(x, "objname", value.asInstanceOf[js.Any])
      
      inline def setObjnameUndefined: Self = StObject.set(x, "objname", js.undefined)
      
      inline def setQuote(value: String | Boolean | Buffer): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
      
      inline def setRecord_delimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "record_delimiter", js.Array(value*))
      
      inline def setRelax(value: Boolean): Self = StObject.set(x, "relax", value.asInstanceOf[js.Any])
      
      inline def setRelaxUndefined: Self = StObject.set(x, "relax", js.undefined)
      
      inline def setRelax_column_count(value: Boolean): Self = StObject.set(x, "relax_column_count", value.asInstanceOf[js.Any])
      
      inline def setRelax_column_countUndefined: Self = StObject.set(x, "relax_column_count", js.undefined)
      
      inline def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setSkip_empty_lines(value: Boolean): Self = StObject.set(x, "skip_empty_lines", value.asInstanceOf[js.Any])
      
      inline def setSkip_empty_linesUndefined: Self = StObject.set(x, "skip_empty_lines", js.undefined)
      
      inline def setSkip_lines_with_empty_values(value: Boolean): Self = StObject.set(x, "skip_lines_with_empty_values", value.asInstanceOf[js.Any])
      
      inline def setSkip_lines_with_empty_valuesUndefined: Self = StObject.set(x, "skip_lines_with_empty_values", js.undefined)
      
      inline def setSkip_lines_with_error(value: Boolean): Self = StObject.set(x, "skip_lines_with_error", value.asInstanceOf[js.Any])
      
      inline def setSkip_lines_with_errorUndefined: Self = StObject.set(x, "skip_lines_with_error", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTo_line(value: Double): Self = StObject.set(x, "to_line", value.asInstanceOf[js.Any])
      
      inline def setTo_lineUndefined: Self = StObject.set(x, "to_line", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait CsvStringifyOptions extends StObject {
    
    /**
      * Key-value object which defines custom cast for certain data types
      */
    var cast: js.UndefOr[typingsJapgolly.asyncCsv.anon.Boolean] = js.undefined
    
    /**
      * List of fields, applied when `transform` returns an object, the order
      * matters. Read the transformer documentation for additional
      * information. Columns are auto-discovered in the first record when the
      * user write objects can refer to nested properties of the input JSON
      * see the "header" option on how to print columns names on the
      * first line.
      */
    var columns: js.UndefOr[(js.Array[ParseColumnOption | String]) | PlainObject[String]] = js.undefined
    
    /**
      * Set the field delimiter, one character only, defaults to a comma.
      */
    var delimiter: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Add the value of "options.RecordDelimiter" on the last line, default
      * to true.
      */
    var eof: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to the escape read option.
      */
    var escape: js.UndefOr[String | Buffer] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The quote characters, defaults to the ", an empty quote value will
      * preserve the original field.
      */
    var quote: js.UndefOr[String | Buffer | Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all the non-empty fields even if
      * not required.
      */
    var quoted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, no default, quote empty fields and overrides `quoted_string`
      * on empty strings when defined.
      */
    var quoted_empty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all fields matching a
      * regular expression.
      */
    var quoted_match: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all fields of type string even if
      * not required.
      */
    var quoted_string: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String used to delimit record rows or a special value. Special values
      * are 'auto', 'unix', 'mac', 'windows', 'ascii', 'unicode'. Defaults
      * to 'auto' (discovered in source or 'unix' if no source is specified).
      */
    var record_delimiter: js.UndefOr[RecordDelimiter] = js.undefined
  }
  object CsvStringifyOptions {
    
    inline def apply(): CsvStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvStringifyOptions]
    }
    
    extension [Self <: CsvStringifyOptions](x: Self) {
      
      inline def setCast(value: typingsJapgolly.asyncCsv.anon.Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      inline def setColumns(value: (js.Array[ParseColumnOption | String]) | PlainObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ParseColumnOption | String)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      inline def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setQuote(value: String | Buffer | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      inline def setQuoted_empty(value: Boolean): Self = StObject.set(x, "quoted_empty", value.asInstanceOf[js.Any])
      
      inline def setQuoted_emptyUndefined: Self = StObject.set(x, "quoted_empty", js.undefined)
      
      inline def setQuoted_match(value: Boolean): Self = StObject.set(x, "quoted_match", value.asInstanceOf[js.Any])
      
      inline def setQuoted_matchUndefined: Self = StObject.set(x, "quoted_match", js.undefined)
      
      inline def setQuoted_string(value: Boolean): Self = StObject.set(x, "quoted_string", value.asInstanceOf[js.Any])
      
      inline def setQuoted_stringUndefined: Self = StObject.set(x, "quoted_string", js.undefined)
      
      inline def setRecord_delimiter(value: RecordDelimiter): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
    }
  }
  
  type ParseColumnOption = js.UndefOr[String | Null]
  
  type PlainObject[T] = Record[String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.bufferMod.global.Buffer
    - typingsJapgolly.asyncCsv.asyncCsvStrings.auto
    - typingsJapgolly.asyncCsv.asyncCsvStrings.unix
    - typingsJapgolly.asyncCsv.asyncCsvStrings.mac
    - typingsJapgolly.asyncCsv.asyncCsvStrings.windows
    - typingsJapgolly.asyncCsv.asyncCsvStrings.ascii
    - typingsJapgolly.asyncCsv.asyncCsvStrings.unicode
  */
  type RecordDelimiter = _RecordDelimiter | String | Buffer
  
  trait TransformOptions extends StObject {
    
    /**
      * In the absence of a consumer, like a `stream.Readable`, trigger the
      * consumption of the stream.
      */
    var consume: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of transformation callbacks to run in parallel; only apply
      * with asynchronous handlers; default to "100".
      */
    var parallel: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass user defined parameters to the user handler as last argument.
      */
    var params: js.UndefOr[Any] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    extension [Self <: TransformOptions](x: Self) {
      
      inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait _ColumnOption extends StObject
  
  trait _RecordDelimiter extends StObject
}
