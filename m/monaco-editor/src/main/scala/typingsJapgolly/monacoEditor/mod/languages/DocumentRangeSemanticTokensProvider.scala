package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRangeSemanticTokensProvider extends StObject {
  
  def getLegend(): SemanticTokensLegend
  
  def provideDocumentRangeSemanticTokens(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[SemanticTokens]
}
object DocumentRangeSemanticTokensProvider {
  
  inline def apply(
    getLegend: CallbackTo[SemanticTokensLegend],
    provideDocumentRangeSemanticTokens: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(getLegend = getLegend.toJsFn, provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
  
  extension [Self <: DocumentRangeSemanticTokensProvider](x: Self) {
    
    inline def setGetLegend(value: CallbackTo[SemanticTokensLegend]): Self = StObject.set(x, "getLegend", value.toJsFn)
    
    inline def setProvideDocumentRangeSemanticTokens(value: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
