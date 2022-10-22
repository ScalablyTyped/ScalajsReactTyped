package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomReadonlyEditorProvider[T /* <: CustomDocument */] extends StObject {
  
  /**
    * Create a new document for a given resource.
    *
    * `openCustomDocument` is called when the first time an editor for a given resource is opened. The opened
    * document is then passed to `resolveCustomEditor` so that the editor can be shown to the user.
    *
    * Already opened `CustomDocument` are re-used if the user opened additional editors. When all editors for a
    * given resource are closed, the `CustomDocument` is disposed of. Opening an editor at this point will
    * trigger another call to `openCustomDocument`.
    *
    * @param uri Uri of the document to open.
    * @param openContext Additional information about the opening custom document.
    * @param token A cancellation token that indicates the result is no longer needed.
    *
    * @return The custom document.
    */
  def openCustomDocument(uri: Uri, openContext: CustomDocumentOpenContext, token: CancellationToken): Thenable[T] | T
  
  /**
    * Resolve a custom editor for a given resource.
    *
    * This is called whenever the user opens a new editor for this `CustomEditorProvider`.
    *
    * @param document Document for the resource being resolved.
    *
    * @param webviewPanel The webview panel used to display the editor UI for this resource.
    *
    * During resolve, the provider must fill in the initial html for the content webview panel and hook up all
    * the event listeners on it that it is interested in. The provider can also hold onto the `WebviewPanel` to
    * use later for example in a command. See {@linkcode WebviewPanel} for additional details.
    *
    * @param token A cancellation token that indicates the result is no longer needed.
    *
    * @return Optional thenable indicating that the custom editor has been resolved.
    */
  def resolveCustomEditor(document: T, webviewPanel: WebviewPanel, token: CancellationToken): Thenable[Unit] | Unit
}
object CustomReadonlyEditorProvider {
  
  inline def apply[T /* <: CustomDocument */](
    openCustomDocument: (Uri, CustomDocumentOpenContext, CancellationToken) => Thenable[T] | T,
    resolveCustomEditor: (T, WebviewPanel, CancellationToken) => Thenable[Unit] | Unit
  ): CustomReadonlyEditorProvider[T] = {
    val __obj = js.Dynamic.literal(openCustomDocument = js.Any.fromFunction3(openCustomDocument), resolveCustomEditor = js.Any.fromFunction3(resolveCustomEditor))
    __obj.asInstanceOf[CustomReadonlyEditorProvider[T]]
  }
  
  extension [Self <: CustomReadonlyEditorProvider[?], T /* <: CustomDocument */](x: Self & CustomReadonlyEditorProvider[T]) {
    
    inline def setOpenCustomDocument(value: (Uri, CustomDocumentOpenContext, CancellationToken) => Thenable[T] | T): Self = StObject.set(x, "openCustomDocument", js.Any.fromFunction3(value))
    
    inline def setResolveCustomEditor(value: (T, WebviewPanel, CancellationToken) => Thenable[Unit] | Unit): Self = StObject.set(x, "resolveCustomEditor", js.Any.fromFunction3(value))
  }
}
