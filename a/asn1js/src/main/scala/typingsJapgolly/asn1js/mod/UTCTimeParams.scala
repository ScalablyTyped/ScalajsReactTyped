package typingsJapgolly.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UTCTimeParams
  extends StObject
     with LocalSimpleStringBlockParams {
  
  var valueDate: js.UndefOr[js.Date] = js.undefined
}
object UTCTimeParams {
  
  inline def apply(): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UTCTimeParams]
  }
  
  extension [Self <: UTCTimeParams](x: Self) {
    
    inline def setValueDate(value: js.Date): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
  }
}
