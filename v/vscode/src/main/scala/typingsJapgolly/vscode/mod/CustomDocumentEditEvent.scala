package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by extensions to signal to the editor that an edit has occurred on an {@linkcode CustomDocument}.
  *
  * @see {@linkcode CustomEditorProvider.onDidChangeCustomDocument}.
  */
trait CustomDocumentEditEvent[T /* <: CustomDocument */] extends StObject {
  
  /**
    * The document that the edit is for.
    */
  val document: T
  
  /**
    * Display name describing the edit.
    *
    * This will be shown to users in the UI for undo/redo operations.
    */
  val label: js.UndefOr[String] = js.undefined
  
  /**
    * Redo the edit operation.
    *
    * This is invoked by the editor when the user redoes this edit. To implement `redo`, your
    * extension should restore the document and editor to the state they were in just after this
    * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
    */
  def redo(): Thenable[Unit] | Unit
  
  /**
    * Undo the edit operation.
    *
    * This is invoked by the editor when the user undoes this edit. To implement `undo`, your
    * extension should restore the document and editor to the state they were in just before this
    * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
    */
  def undo(): Thenable[Unit] | Unit
}
object CustomDocumentEditEvent {
  
  inline def apply[T /* <: CustomDocument */](document: T, redo: CallbackTo[Thenable[Unit] | Unit], undo: CallbackTo[Thenable[Unit] | Unit]): CustomDocumentEditEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], redo = redo.toJsFn, undo = undo.toJsFn)
    __obj.asInstanceOf[CustomDocumentEditEvent[T]]
  }
  
  extension [Self <: CustomDocumentEditEvent[?], T /* <: CustomDocument */](x: Self & CustomDocumentEditEvent[T]) {
    
    inline def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRedo(value: CallbackTo[Thenable[Unit] | Unit]): Self = StObject.set(x, "redo", value.toJsFn)
    
    inline def setUndo(value: CallbackTo[Thenable[Unit] | Unit]): Self = StObject.set(x, "undo", value.toJsFn)
  }
}
