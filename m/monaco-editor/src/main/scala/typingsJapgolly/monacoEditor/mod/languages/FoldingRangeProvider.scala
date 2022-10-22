package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.IEvent
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRangeProvider extends StObject {
  
  /**
    * An optional event to signal that the folding ranges from this provider have changed.
    */
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.undefined
  
  /**
    * Provides the folding ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}
object FoldingRangeProvider {
  
  inline def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  extension [Self <: FoldingRangeProvider](x: Self) {
    
    inline def setOnDidChange(
      value: (/* listener */ js.Function1[FoldingRangeProvider, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    inline def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    inline def setProvideFoldingRanges(value: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
