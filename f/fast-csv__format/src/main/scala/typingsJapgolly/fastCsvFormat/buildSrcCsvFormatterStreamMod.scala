package typingsJapgolly.fastCsvFormat

import typingsJapgolly.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.Row
import typingsJapgolly.fastCsvFormat.buildSrcTypesMod.RowTransformFunction
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCsvFormatterStreamMod {
  
  @JSImport("@fast-csv/format/build/src/CsvFormatterStream", "CsvFormatterStream")
  @js.native
  open class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected () extends Transform {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    
    def _transform(row: I, encoding: String, cb: TransformCallback): Unit = js.native
    
    /* private */ var formatterOptions: Any = js.native
    
    /* private */ var hasWrittenBOM: Any = js.native
    
    /* private */ var rowFormatter: Any = js.native
    
    def transform(transformFunction: RowTransformFunction[I, O]): CsvFormatterStream[I, O] = js.native
  }
}
