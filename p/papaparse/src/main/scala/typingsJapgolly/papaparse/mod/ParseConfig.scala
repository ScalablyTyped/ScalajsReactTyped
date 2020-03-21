package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import typingsJapgolly.papaparse.papaparseStrings.greedy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.undefined
   // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
   // default: false
  var comments: js.UndefOr[Boolean | String] = js.undefined
   // default: undefined
  var complete: js.UndefOr[js.Function2[/* results */ ParseResult, /* file */ js.UndefOr[File], Unit]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
   // default: undefined
  var delimitersToGuess: js.UndefOr[js.Array[GuessableDelimiters]] = js.undefined
   // default: false
  var download: js.UndefOr[Boolean] = js.undefined
   // default: false
  var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
   // default: false
  var dynamicTyping: js.UndefOr[
    Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
  ] = js.undefined
   // default: 0
  var encoding: js.UndefOr[String] = js.undefined
   // default: undefined
  var error: js.UndefOr[js.Function2[/* error */ ParseError, /* file */ js.UndefOr[File], Unit]] = js.undefined
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.undefined
   // default: false
  var fastMode: js.UndefOr[Boolean] = js.undefined
   // default: '"'
  var header: js.UndefOr[Boolean] = js.undefined
   // default: ","
  var newline: js.UndefOr[String] = js.undefined
   // default: false
  var preview: js.UndefOr[Double] = js.undefined
   // default: "\r\n"
  var quoteChar: js.UndefOr[String] = js.undefined
   // default: undefined
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
   // default: [',', '\t', '|', ';', Papa.RECORD_SEP, Papa.UNIT_SEP]
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
   // default: undefined
  var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, _]] = js.undefined
   // default: undefined
  var transformHeader: js.UndefOr[js.Function1[/* header */ String, String]] = js.undefined
   // default: false
  var trimHeaders: js.UndefOr[Boolean] = js.undefined
   // default: undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
   // default: ""
  var worker: js.UndefOr[Boolean] = js.undefined
}

object ParseConfig {
  @scala.inline
  def apply(
    beforeFirstChunk: /* chunk */ String => CallbackTo[String | Unit] = null,
    chunk: (/* results */ ParseResult, /* parser */ Parser) => Callback = null,
    comments: Boolean | String = null,
    complete: (/* results */ ParseResult, /* file */ js.UndefOr[File]) => Callback = null,
    delimiter: String = null,
    delimitersToGuess: js.Array[GuessableDelimiters] = null,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadRequestHeaders: StringDictionary[String] = null,
    dynamicTyping: Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean]) = null,
    encoding: String = null,
    error: (/* error */ ParseError, /* file */ js.UndefOr[File]) => Callback = null,
    escapeChar: String = null,
    fastMode: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    newline: String = null,
    preview: Int | Double = null,
    quoteChar: String = null,
    skipEmptyLines: Boolean | greedy = null,
    step: (/* results */ ParseResult, /* parser */ Parser) => Callback = null,
    transform: (/* value */ String, /* field */ String | Double) => CallbackTo[js.Any] = null,
    transformHeader: /* header */ String => CallbackTo[String] = null,
    trimHeaders: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    worker: js.UndefOr[Boolean] = js.undefined
  ): ParseConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeFirstChunk != null) __obj.updateDynamic("beforeFirstChunk")(js.Any.fromFunction1((t0: /* chunk */ java.lang.String) => beforeFirstChunk(t0).runNow()))
    if (chunk != null) __obj.updateDynamic("chunk")(js.Any.fromFunction2((t0: /* results */ typingsJapgolly.papaparse.mod.ParseResult, t1: /* parser */ typingsJapgolly.papaparse.mod.Parser) => chunk(t0, t1).runNow()))
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2((t0: /* results */ typingsJapgolly.papaparse.mod.ParseResult, t1: /* file */ js.UndefOr[org.scalajs.dom.raw.File]) => complete(t0, t1).runNow()))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (delimitersToGuess != null) __obj.updateDynamic("delimitersToGuess")(delimitersToGuess.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (downloadRequestHeaders != null) __obj.updateDynamic("downloadRequestHeaders")(downloadRequestHeaders.asInstanceOf[js.Any])
    if (dynamicTyping != null) __obj.updateDynamic("dynamicTyping")(dynamicTyping.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.papaparse.mod.ParseError, t1: /* file */ js.UndefOr[org.scalajs.dom.raw.File]) => error(t0, t1).runNow()))
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar.asInstanceOf[js.Any])
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (quoteChar != null) __obj.updateDynamic("quoteChar")(quoteChar.asInstanceOf[js.Any])
    if (skipEmptyLines != null) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2((t0: /* results */ typingsJapgolly.papaparse.mod.ParseResult, t1: /* parser */ typingsJapgolly.papaparse.mod.Parser) => step(t0, t1).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* field */ java.lang.String | scala.Double) => transform(t0, t1).runNow()))
    if (transformHeader != null) __obj.updateDynamic("transformHeader")(js.Any.fromFunction1((t0: /* header */ java.lang.String) => transformHeader(t0).runNow()))
    if (!js.isUndefined(trimHeaders)) __obj.updateDynamic("trimHeaders")(trimHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseConfig]
  }
}

