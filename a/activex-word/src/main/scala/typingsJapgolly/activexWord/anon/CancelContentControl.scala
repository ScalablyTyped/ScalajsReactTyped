package typingsJapgolly.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelContentControl extends StObject {
  
  var Cancel: Boolean
  
  val ContentControl: typingsJapgolly.activexWord.Word.ContentControl
}
object CancelContentControl {
  
  inline def apply(Cancel: Boolean, ContentControl: typingsJapgolly.activexWord.Word.ContentControl): CancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContentControl]
  }
  
  extension [Self <: CancelContentControl](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setContentControl(value: typingsJapgolly.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
