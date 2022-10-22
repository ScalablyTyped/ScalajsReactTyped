package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameFile {
  
  @JSImport("vscode-languageserver-protocol", "RenameFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    oldUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: RenameFileOptions
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: RenameFileOptions,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean]
}
