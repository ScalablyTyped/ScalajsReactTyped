package typingsJapgolly.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var complete: String
  
  var edit: String
  
  var next: String
  
  var prev: String
  
  var preview: String
  
  var start: String
}
object Complete {
  
  inline def apply(complete: String, edit: String, next: String, prev: String, preview: String, start: String): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
