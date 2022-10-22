package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.ngStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgStyle extends StObject {
  
  var ngStyle: typingsJapgolly.angularCommon.angularCommonStrings.ngStyle
}
object NgStyle {
  
  inline def apply(): NgStyle = {
    val __obj = js.Dynamic.literal(ngStyle = "ngStyle")
    __obj.asInstanceOf[NgStyle]
  }
  
  extension [Self <: NgStyle](x: Self) {
    
    inline def setNgStyle(value: ngStyle): Self = StObject.set(x, "ngStyle", value.asInstanceOf[js.Any])
  }
}
