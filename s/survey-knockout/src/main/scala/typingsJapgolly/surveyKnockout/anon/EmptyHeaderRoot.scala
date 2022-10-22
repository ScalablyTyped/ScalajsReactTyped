package typingsJapgolly.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyHeaderRoot extends StObject {
  
  var description: String
  
  var emptyHeaderRoot: String
  
  var root: String
  
  var title: String
}
object EmptyHeaderRoot {
  
  inline def apply(description: String, emptyHeaderRoot: String, root: String, title: String): EmptyHeaderRoot = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], emptyHeaderRoot = emptyHeaderRoot.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyHeaderRoot]
  }
  
  extension [Self <: EmptyHeaderRoot](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmptyHeaderRoot(value: String): Self = StObject.set(x, "emptyHeaderRoot", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
