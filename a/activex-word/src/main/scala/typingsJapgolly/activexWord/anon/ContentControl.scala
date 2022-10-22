package typingsJapgolly.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentControl extends StObject {
  
  val ContentControl: typingsJapgolly.activexWord.Word.ContentControl
}
object ContentControl {
  
  inline def apply(ContentControl: typingsJapgolly.activexWord.Word.ContentControl): ContentControl = {
    val __obj = js.Dynamic.literal(ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControl]
  }
  
  extension [Self <: ContentControl](x: Self) {
    
    inline def setContentControl(value: typingsJapgolly.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
