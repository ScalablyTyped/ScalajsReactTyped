package typingsJapgolly.nwmatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Document extends StObject {
    
    var document: org.scalajs.dom.Document
  }
  object Document {
    
    inline def apply(document: org.scalajs.dom.Document): Document = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setDocument(value: org.scalajs.dom.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
}
