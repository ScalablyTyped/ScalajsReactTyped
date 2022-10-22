package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameProvider extends StObject {
  
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit & Rejection]
  
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation & Rejection]
    ]
  ] = js.undefined
}
object RenameProvider {
  
  inline def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit & Rejection]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    __obj.asInstanceOf[RenameProvider]
  }
  
  extension [Self <: RenameProvider](x: Self) {
    
    inline def setProvideRenameEdits(
      value: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit & Rejection]
    ): Self = StObject.set(x, "provideRenameEdits", js.Any.fromFunction4(value))
    
    inline def setResolveRenameLocation(
      value: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => ProviderResult[RenameLocation & Rejection]
    ): Self = StObject.set(x, "resolveRenameLocation", js.Any.fromFunction3(value))
    
    inline def setResolveRenameLocationUndefined: Self = StObject.set(x, "resolveRenameLocation", js.undefined)
  }
}
