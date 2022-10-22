package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationProvider extends StObject {
  
  /**
    * Provide the implementation of the symbol at the given position and document.
    */
  def provideImplementation(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}
object ImplementationProvider {
  
  inline def apply(
    provideImplementation: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): ImplementationProvider = {
    val __obj = js.Dynamic.literal(provideImplementation = js.Any.fromFunction3(provideImplementation))
    __obj.asInstanceOf[ImplementationProvider]
  }
  
  extension [Self <: ImplementationProvider](x: Self) {
    
    inline def setProvideImplementation(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = StObject.set(x, "provideImplementation", js.Any.fromFunction3(value))
  }
}
