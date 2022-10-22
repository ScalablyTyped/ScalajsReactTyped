package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.anon.Uri
import typingsJapgolly.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocumentsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "NotebookDocuments")
@js.native
open class NotebookDocuments[T /* <: Uri */] protected ()
  extends typingsJapgolly.vscodeLanguageserver.libCommonNotebookMod.NotebookDocuments[T] {
  def this(configurationOrTextDocuments: typingsJapgolly.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocuments[T]) = this()
  def this(configurationOrTextDocuments: TextDocumentsConfiguration[T]) = this()
}
