package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatableExpressionProvider extends StObject {
  
  /**
    * Provide an evaluatable expression for the given document and position.
    * The editor will evaluate this expression in the active debug session and will show the result in the debug hover.
    * The expression can be implicitly specified by the range in the underlying document or by explicitly returning an expression.
    *
    * @param document The document for which the debug hover is about to appear.
    * @param position The line and character position in the document where the debug hover is about to appear.
    * @param token A cancellation token.
    * @return An EvaluatableExpression or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideEvaluatableExpression(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[EvaluatableExpression]
}
object EvaluatableExpressionProvider {
  
  inline def apply(
    provideEvaluatableExpression: (TextDocument, Position, CancellationToken) => ProviderResult[EvaluatableExpression]
  ): EvaluatableExpressionProvider = {
    val __obj = js.Dynamic.literal(provideEvaluatableExpression = js.Any.fromFunction3(provideEvaluatableExpression))
    __obj.asInstanceOf[EvaluatableExpressionProvider]
  }
  
  extension [Self <: EvaluatableExpressionProvider](x: Self) {
    
    inline def setProvideEvaluatableExpression(value: (TextDocument, Position, CancellationToken) => ProviderResult[EvaluatableExpression]): Self = StObject.set(x, "provideEvaluatableExpression", js.Any.fromFunction3(value))
  }
}
