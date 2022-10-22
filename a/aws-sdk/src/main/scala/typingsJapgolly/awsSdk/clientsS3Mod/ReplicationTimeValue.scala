package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTimeValue extends StObject {
  
  /**
    *  Contains an integer specifying time in minutes.   Valid value: 15
    */
  var Minutes: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Minutes] = js.undefined
}
object ReplicationTimeValue {
  
  inline def apply(): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTimeValue]
  }
  
  extension [Self <: ReplicationTimeValue](x: Self) {
    
    inline def setMinutes(value: Minutes): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "Minutes", js.undefined)
  }
}
