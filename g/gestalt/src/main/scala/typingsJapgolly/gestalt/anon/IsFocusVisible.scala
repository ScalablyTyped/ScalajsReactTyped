package typingsJapgolly.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisible extends StObject {
  
  var isFocusVisible: Boolean
}
object IsFocusVisible {
  
  inline def apply(isFocusVisible: Boolean): IsFocusVisible = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocusVisible]
  }
  
  extension [Self <: IsFocusVisible](x: Self) {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
