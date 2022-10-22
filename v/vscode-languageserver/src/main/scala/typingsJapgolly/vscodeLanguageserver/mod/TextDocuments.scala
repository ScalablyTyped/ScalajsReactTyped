package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.anon.Uri
import typingsJapgolly.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocumentsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TextDocuments")
@js.native
open class TextDocuments[T /* <: Uri */] protected ()
  extends typingsJapgolly.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocuments[T] {
  /**
    * Create a new text document manager.
    */
  def this(configuration: TextDocumentsConfiguration[T]) = this()
}
