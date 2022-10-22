package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentColorProvider extends StObject {
  
  /**
    * Provide the string representations for a color.
    */
  def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]]
  
  /**
    * Provides the color ranges for a specific model.
    */
  def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]]
}
object DocumentColorProvider {
  
  inline def apply(
    provideColorPresentations: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]],
    provideDocumentColors: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
    __obj.asInstanceOf[DocumentColorProvider]
  }
  
  extension [Self <: DocumentColorProvider](x: Self) {
    
    inline def setProvideColorPresentations(
      value: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]]
    ): Self = StObject.set(x, "provideColorPresentations", js.Any.fromFunction3(value))
    
    inline def setProvideDocumentColors(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]): Self = StObject.set(x, "provideDocumentColors", js.Any.fromFunction2(value))
  }
}
