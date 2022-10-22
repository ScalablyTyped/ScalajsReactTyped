package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedIdx extends StObject {
  
  var checkedIdx: String
  
  var isOnFocusByKeyboardCalled: Boolean
}
object CheckedIdx {
  
  inline def apply(checkedIdx: String, isOnFocusByKeyboardCalled: Boolean): CheckedIdx = {
    val __obj = js.Dynamic.literal(checkedIdx = checkedIdx.asInstanceOf[js.Any], isOnFocusByKeyboardCalled = isOnFocusByKeyboardCalled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedIdx]
  }
  
  extension [Self <: CheckedIdx](x: Self) {
    
    inline def setCheckedIdx(value: String): Self = StObject.set(x, "checkedIdx", value.asInstanceOf[js.Any])
    
    inline def setIsOnFocusByKeyboardCalled(value: Boolean): Self = StObject.set(x, "isOnFocusByKeyboardCalled", value.asInstanceOf[js.Any])
  }
}
