package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.ngIf
import typingsJapgolly.angularCommon.angularCommonStrings.ngIfElse
import typingsJapgolly.angularCommon.angularCommonStrings.ngIfThen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgIf extends StObject {
  
  var ngIf: typingsJapgolly.angularCommon.angularCommonStrings.ngIf
  
  var ngIfElse: typingsJapgolly.angularCommon.angularCommonStrings.ngIfElse
  
  var ngIfThen: typingsJapgolly.angularCommon.angularCommonStrings.ngIfThen
}
object NgIf {
  
  inline def apply(): NgIf = {
    val __obj = js.Dynamic.literal(ngIf = "ngIf", ngIfElse = "ngIfElse", ngIfThen = "ngIfThen")
    __obj.asInstanceOf[NgIf]
  }
  
  extension [Self <: NgIf](x: Self) {
    
    inline def setNgIf(value: ngIf): Self = StObject.set(x, "ngIf", value.asInstanceOf[js.Any])
    
    inline def setNgIfElse(value: ngIfElse): Self = StObject.set(x, "ngIfElse", value.asInstanceOf[js.Any])
    
    inline def setNgIfThen(value: ngIfThen): Self = StObject.set(x, "ngIfThen", value.asInstanceOf[js.Any])
  }
}
