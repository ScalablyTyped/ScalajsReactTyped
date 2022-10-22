package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteFile {
  
  @JSImport("vscode-languageserver", "DeleteFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri): typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri, options: DeleteFileOptions): typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: DeleteFileOptions,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DeleteFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean]
}
