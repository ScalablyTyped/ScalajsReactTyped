package typingsJapgolly.fastCsvFormat

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.Row
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.RowTransformCallback
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.RowTransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFormatterOptionsMod {
  
  @JSImport("@fast-csv/format/build/src/FormatterOptions", "FormatterOptions")
  @js.native
  open class FormatterOptions[I /* <: Row */, O /* <: Row */] () extends StObject {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
    
    val BOM: String = js.native
    
    val alwaysWriteHeaders: Boolean = js.native
    
    val delimiter: String = js.native
    
    val escape: String = js.native
    
    val escapedQuote: String = js.native
    
    val headers: Null | js.Array[String] = js.native
    
    val includeEndRowDelimiter: Boolean = js.native
    
    val objectMode: Boolean = js.native
    
    val quote: String = js.native
    
    val quoteColumns: QuoteColumns = js.native
    
    val quoteHeaders: QuoteColumns = js.native
    
    val rowDelimiter: String = js.native
    
    val shouldWriteHeaders: Boolean = js.native
    
    val transform: js.UndefOr[RowTransformFunction[I, O]] = js.native
    
    val writeBOM: Boolean = js.native
  }
  
  trait FormatterOptionsArgs[I /* <: Row */, O /* <: Row */] extends StObject {
    
    var alwaysWriteHeaders: js.UndefOr[Boolean] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var escape: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.undefined
    
    var includeEndRowDelimiter: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var quote: js.UndefOr[String | Boolean] = js.undefined
    
    var quoteColumns: js.UndefOr[QuoteColumns] = js.undefined
    
    var quoteHeaders: js.UndefOr[QuoteColumns] = js.undefined
    
    var rowDelimiter: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[RowTransformFunction[I, O]] = js.undefined
    
    var writeBOM: js.UndefOr[Boolean] = js.undefined
    
    var writeHeaders: js.UndefOr[Boolean] = js.undefined
  }
  object FormatterOptionsArgs {
    
    inline def apply[I /* <: Row */, O /* <: Row */](): FormatterOptionsArgs[I, O] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterOptionsArgs[I, O]]
    }
    
    extension [Self <: FormatterOptionsArgs[?, ?], I /* <: Row */, O /* <: Row */](x: Self & (FormatterOptionsArgs[I, O])) {
      
      inline def setAlwaysWriteHeaders(value: Boolean): Self = StObject.set(x, "alwaysWriteHeaders", value.asInstanceOf[js.Any])
      
      inline def setAlwaysWriteHeadersUndefined: Self = StObject.set(x, "alwaysWriteHeaders", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIncludeEndRowDelimiter(value: Boolean): Self = StObject.set(x, "includeEndRowDelimiter", value.asInstanceOf[js.Any])
      
      inline def setIncludeEndRowDelimiterUndefined: Self = StObject.set(x, "includeEndRowDelimiter", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setQuote(value: String | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteColumns(value: QuoteColumns): Self = StObject.set(x, "quoteColumns", value.asInstanceOf[js.Any])
      
      inline def setQuoteColumnsUndefined: Self = StObject.set(x, "quoteColumns", js.undefined)
      
      inline def setQuoteColumnsVarargs(value: Boolean*): Self = StObject.set(x, "quoteColumns", js.Array(value*))
      
      inline def setQuoteHeaders(value: QuoteColumns): Self = StObject.set(x, "quoteHeaders", value.asInstanceOf[js.Any])
      
      inline def setQuoteHeadersUndefined: Self = StObject.set(x, "quoteHeaders", js.undefined)
      
      inline def setQuoteHeadersVarargs(value: Boolean*): Self = StObject.set(x, "quoteHeaders", js.Array(value*))
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
      
      inline def setTransform(value: RowTransformFunction[I, O]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformFunction1(value: I => O): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformFunction2(value: (I, /* cb */ RowTransformCallback[O]) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: I, t1: /* cb */ RowTransformCallback[O]) => (value(t0, t1)).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWriteBOM(value: Boolean): Self = StObject.set(x, "writeBOM", value.asInstanceOf[js.Any])
      
      inline def setWriteBOMUndefined: Self = StObject.set(x, "writeBOM", js.undefined)
      
      inline def setWriteHeaders(value: Boolean): Self = StObject.set(x, "writeHeaders", value.asInstanceOf[js.Any])
      
      inline def setWriteHeadersUndefined: Self = StObject.set(x, "writeHeaders", js.undefined)
    }
  }
  
  type QuoteColumnMap = StringDictionary[Boolean]
  
  type QuoteColumns = Boolean | js.Array[Boolean] | QuoteColumnMap
}
