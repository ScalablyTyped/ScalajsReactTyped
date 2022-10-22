package typingsJapgolly.fastCsvFormat

import typingsJapgolly.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.Row
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.RowArray
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.RowTransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFormatterRowFormatterMod {
  
  @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter")
  @js.native
  open class RowFormatter[I /* <: Row */, O /* <: Row */] protected () extends StObject {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    
    /* private */ var _rowTransform: Any = js.native
    
    /* private */ var callTransformer: Any = js.native
    
    /* private */ var checkHeaders: Any = js.native
    
    /* private */ val fieldFormatter: Any = js.native
    
    def finish(cb: RowFormatterCallback): Unit = js.native
    
    def format(row: I, cb: RowFormatterCallback): Unit = js.native
    
    /* private */ var formatColumns: Any = js.native
    
    /* private */ val formatterOptions: Any = js.native
    
    /* private */ var gatherColumns: Any = js.native
    
    /* private */ var hasWrittenHeaders: Any = js.native
    
    /* private */ var headers: Any = js.native
    
    /* private */ var rowCount: Any = js.native
    
    def rowTransform_=(transformFunction: RowTransformFunction[I, O]): Unit = js.native
    
    /* private */ val shouldWriteHeaders: Any = js.native
  }
  /* static members */
  object RowFormatter {
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.createTransform")
    @js.native
    def createTransform: Any = js.native
    inline def createTransform_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.gatherHeaders")
    @js.native
    def gatherHeaders: Any = js.native
    inline def gatherHeaders_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatherHeaders")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.isRowArray")
    @js.native
    def isRowArray: Any = js.native
    inline def isRowArray_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.isRowHashArray")
    @js.native
    def isRowHashArray: Any = js.native
    inline def isRowHashArray_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHashArray")(x.asInstanceOf[js.Any])
  }
  
  type RowFormatterCallback = js.Function2[/* error */ js.Error | Null, /* data */ js.UndefOr[RowArray], Unit]
}
