package typingsJapgolly.atom.anon

import typingsJapgolly.atom.srcOtherTypesMod.FileEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueFileEncoding extends StObject {
  
  var newValue: FileEncoding
  
  var oldValue: js.UndefOr[FileEncoding] = js.undefined
}
object NewValueFileEncoding {
  
  inline def apply(newValue: FileEncoding): NewValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueFileEncoding]
  }
  
  extension [Self <: NewValueFileEncoding](x: Self) {
    
    inline def setNewValue(value: FileEncoding): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: FileEncoding): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
