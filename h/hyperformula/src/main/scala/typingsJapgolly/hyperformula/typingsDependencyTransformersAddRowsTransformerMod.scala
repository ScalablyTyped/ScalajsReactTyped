package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsDependencyTransformersTransformerMod.Transformer
import typingsJapgolly.hyperformula.typingsSpanMod.RowsSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersAddRowsTransformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/AddRowsTransformer", "AddRowsTransformer")
  @js.native
  open class AddRowsTransformer protected () extends Transformer {
    def this(rowsSpan: RowsSpan) = this()
    
    val rowsSpan: RowsSpan = js.native
    
    @JSName("sheet")
    def sheet_MAddRowsTransformer: Double = js.native
    
    /* private */ var transformRange: Any = js.native
  }
}
