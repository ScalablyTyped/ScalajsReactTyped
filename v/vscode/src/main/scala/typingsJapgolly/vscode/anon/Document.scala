package typingsJapgolly.vscode.anon

import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  val document: TextDocument
  
  val range: Range
}
object Document {
  
  inline def apply(document: TextDocument, range: Range): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
