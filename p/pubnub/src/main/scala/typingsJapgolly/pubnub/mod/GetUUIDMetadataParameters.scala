package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUUIDMetadataParameters extends StObject {
  
  var include: js.UndefOr[`0`] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object GetUUIDMetadataParameters {
  
  inline def apply(): GetUUIDMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUUIDMetadataParameters]
  }
  
  extension [Self <: GetUUIDMetadataParameters](x: Self) {
    
    inline def setInclude(value: `0`): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
