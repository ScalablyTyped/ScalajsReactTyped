package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationInfo extends StObject {
  
  /**
    * The ID of the resource created at the destination.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The destination service of the record.
    */
  var service: js.UndefOr[NonEmptyString] = js.undefined
}
object DestinationInfo {
  
  inline def apply(): DestinationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationInfo]
  }
  
  extension [Self <: DestinationInfo](x: Self) {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setService(value: NonEmptyString): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
