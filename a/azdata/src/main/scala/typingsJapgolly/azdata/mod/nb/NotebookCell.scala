package typingsJapgolly.azdata.mod.nb

import typingsJapgolly.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCell extends StObject {
  
  var contents: ICellContents
  
  var uri: js.UndefOr[Uri] = js.undefined
}
object NotebookCell {
  
  inline def apply(contents: ICellContents): NotebookCell = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCell]
  }
  
  extension [Self <: NotebookCell](x: Self) {
    
    inline def setContents(value: ICellContents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
