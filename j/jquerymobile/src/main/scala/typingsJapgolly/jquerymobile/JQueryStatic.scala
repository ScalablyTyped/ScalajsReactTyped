package typingsJapgolly.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var mobile: JQueryMobile
}
object JQueryStatic {
  
  inline def apply(mobile: JQueryMobile): JQueryStatic = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setMobile(value: JQueryMobile): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
