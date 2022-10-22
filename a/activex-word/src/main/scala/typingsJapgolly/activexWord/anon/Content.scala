package typingsJapgolly.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var Content: String
  
  val ContentControl: typingsJapgolly.activexWord.Word.ContentControl
}
object Content {
  
  inline def apply(Content: String, ContentControl: typingsJapgolly.activexWord.Word.ContentControl): Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentControl(value: typingsJapgolly.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
