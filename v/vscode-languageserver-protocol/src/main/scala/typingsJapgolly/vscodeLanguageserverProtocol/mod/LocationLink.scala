package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationLink {
  
  @JSImport("vscode-languageserver-protocol", "LocationLink")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  inline def create(
    targetUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    targetRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(targetUri.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any], targetSelectionRange.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink]
  inline def create(
    targetUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    targetRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    originSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(targetUri.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any], targetSelectionRange.asInstanceOf[js.Any], originSelectionRange.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink]
  
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean]
}
