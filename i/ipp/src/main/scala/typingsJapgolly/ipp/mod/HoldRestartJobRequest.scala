package typingsJapgolly.ipp.mod

import typingsJapgolly.ipp.anon.Jobholduntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldRestartJobRequest extends StObject {
  
  var `operation-attributes-tag`: Jobholduntil
}
object HoldRestartJobRequest {
  
  inline def apply(`operation-attributes-tag`: Jobholduntil): HoldRestartJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldRestartJobRequest]
  }
  
  extension [Self <: HoldRestartJobRequest](x: Self) {
    
    inline def `setOperation-attributes-tag`(value: Jobholduntil): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
