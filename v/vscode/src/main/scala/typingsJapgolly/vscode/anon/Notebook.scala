package typingsJapgolly.vscode.anon

import typingsJapgolly.vscode.mod.NotebookDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notebook extends StObject {
  
  val notebook: NotebookDocument
  
  val selected: Boolean
}
object Notebook {
  
  inline def apply(notebook: NotebookDocument, selected: Boolean): Notebook = {
    val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notebook]
  }
  
  extension [Self <: Notebook](x: Self) {
    
    inline def setNotebook(value: NotebookDocument): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
