package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateFile {
  
  @JSImport("vscode-languageclient", "CreateFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri): typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri, options: CreateFileOptions): typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    options: CreateFileOptions,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CreateFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean]
}
