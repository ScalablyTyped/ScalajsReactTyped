package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEditingRangeProvider extends StObject {
  
  /**
    * Provide a list of ranges that can be edited together.
    */
  def provideLinkedEditingRanges(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[LinkedEditingRanges]
}
object LinkedEditingRangeProvider {
  
  inline def apply(
    provideLinkedEditingRanges: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]
  ): LinkedEditingRangeProvider = {
    val __obj = js.Dynamic.literal(provideLinkedEditingRanges = js.Any.fromFunction3(provideLinkedEditingRanges))
    __obj.asInstanceOf[LinkedEditingRangeProvider]
  }
  
  extension [Self <: LinkedEditingRangeProvider](x: Self) {
    
    inline def setProvideLinkedEditingRanges(value: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]): Self = StObject.set(x, "provideLinkedEditingRanges", js.Any.fromFunction3(value))
  }
}
