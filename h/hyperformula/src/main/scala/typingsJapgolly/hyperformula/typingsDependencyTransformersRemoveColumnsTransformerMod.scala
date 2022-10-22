package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsDependencyTransformersTransformerMod.Transformer
import typingsJapgolly.hyperformula.typingsSpanMod.ColumnsSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersRemoveColumnsTransformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/RemoveColumnsTransformer", "RemoveColumnsTransformer")
  @js.native
  open class RemoveColumnsTransformer protected () extends Transformer {
    def this(columnsSpan: ColumnsSpan) = this()
    
    val columnsSpan: ColumnsSpan = js.native
    
    @JSName("sheet")
    def sheet_MRemoveColumnsTransformer: Double = js.native
    
    /* private */ var transformRange: Any = js.native
  }
}
