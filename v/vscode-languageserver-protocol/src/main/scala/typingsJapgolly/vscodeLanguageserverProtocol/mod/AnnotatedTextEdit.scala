package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnnotatedTextEdit {
  
  @JSImport("vscode-languageserver-protocol", "AnnotatedTextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an annotated delete text edit.
    *
    * @param range The range of text to be deleted.
    * @param annotation The annotation.
    */
  inline def del(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(range.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit]
  
  /**
    * Creates an annotated insert text edit.
    *
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    * @param annotation The annotation.
    */
  inline def insert(
    position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position,
    newText: String,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.AnnotatedTextEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.AnnotatedTextEdit */ Boolean]
  
  /**
    * Creates an annotated replace text edit.
    *
    * @param range The range of text to be replaced.
    * @param newText The new text.
    * @param annotation The annotation.
    */
  inline def replace(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    newText: String,
    annotation: typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.AnnotatedTextEdit]
}
