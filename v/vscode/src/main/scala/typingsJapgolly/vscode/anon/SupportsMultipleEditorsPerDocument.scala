package typingsJapgolly.vscode.anon

import typingsJapgolly.vscode.mod.WebviewPanelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportsMultipleEditorsPerDocument extends StObject {
  
  /**
    * Only applies to `CustomReadonlyEditorProvider | CustomEditorProvider`.
    *
    * Indicates that the provider allows multiple editor instances to be open at the same time for
    * the same resource.
    *
    * By default, the editor only allows one editor instance to be open at a time for each resource. If the
    * user tries to open a second editor instance for the resource, the first one is instead moved to where
    * the second one was to be opened.
    *
    * When `supportsMultipleEditorsPerDocument` is enabled, users can split and create copies of the custom
    * editor. In this case, the custom editor must make sure it can properly synchronize the states of all
    * editor instances for a resource so that they are consistent.
    */
  val supportsMultipleEditorsPerDocument: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content settings for the webview panels created for this custom editor.
    */
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.undefined
}
object SupportsMultipleEditorsPerDocument {
  
  inline def apply(): SupportsMultipleEditorsPerDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportsMultipleEditorsPerDocument]
  }
  
  extension [Self <: SupportsMultipleEditorsPerDocument](x: Self) {
    
    inline def setSupportsMultipleEditorsPerDocument(value: Boolean): Self = StObject.set(x, "supportsMultipleEditorsPerDocument", value.asInstanceOf[js.Any])
    
    inline def setSupportsMultipleEditorsPerDocumentUndefined: Self = StObject.set(x, "supportsMultipleEditorsPerDocument", js.undefined)
    
    inline def setWebviewOptions(value: WebviewPanelOptions): Self = StObject.set(x, "webviewOptions", value.asInstanceOf[js.Any])
    
    inline def setWebviewOptionsUndefined: Self = StObject.set(x, "webviewOptions", js.undefined)
  }
}
