package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingGroupResponse extends StObject {
  
  /**
    * The version of the updated thing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateThingGroupResponse {
  
  inline def apply(): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
  
  extension [Self <: UpdateThingGroupResponse](x: Self) {
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
