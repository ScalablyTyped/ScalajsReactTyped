package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.False
import typingsJapgolly.exceljs.exceljsStrings.True
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentProtection extends StObject {
  
  var lockText: True | False
  
  var locked: True | False
}
object CommentProtection {
  
  inline def apply(lockText: True | False, locked: True | False): CommentProtection = {
    val __obj = js.Dynamic.literal(lockText = lockText.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProtection]
  }
  
  extension [Self <: CommentProtection](x: Self) {
    
    inline def setLockText(value: True | False): Self = StObject.set(x, "lockText", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: True | False): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
