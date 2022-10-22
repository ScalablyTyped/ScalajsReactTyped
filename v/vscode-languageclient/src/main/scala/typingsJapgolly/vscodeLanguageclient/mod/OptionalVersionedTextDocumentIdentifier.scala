package typingsJapgolly.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionalVersionedTextDocumentIdentifier {
  
  @JSImport("vscode-languageclient", "OptionalVersionedTextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OptionalVersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param version The document's version.
    */
  inline def create(uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri): typingsJapgolly.vscodeLanguageserverTypes.mod.OptionalVersionedTextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.OptionalVersionedTextDocumentIdentifier]
  inline def create(
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    version: typingsJapgolly.vscodeLanguageserverTypes.mod.integer
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.OptionalVersionedTextDocumentIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.OptionalVersionedTextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [OptionalVersionedTextDocumentIdentifier](#OptionalVersionedTextDocumentIdentifier) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.OptionalVersionedTextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.OptionalVersionedTextDocumentIdentifier */ Boolean]
}
