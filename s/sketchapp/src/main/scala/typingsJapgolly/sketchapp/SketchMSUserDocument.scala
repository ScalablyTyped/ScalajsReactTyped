package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.anon.PageListCollapsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSUserDocument extends StObject {
  
  var document: PageListCollapsed
}
object SketchMSUserDocument {
  
  inline def apply(document: PageListCollapsed): SketchMSUserDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSUserDocument]
  }
  
  extension [Self <: SketchMSUserDocument](x: Self) {
    
    inline def setDocument(value: PageListCollapsed): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
