package typingsJapgolly.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioSessionMappingOutput extends StObject {
  
  /**
    * The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN and creation time.
    */
  var SessionMapping: js.UndefOr[SessionMappingDetail] = js.undefined
}
object GetStudioSessionMappingOutput {
  
  inline def apply(): GetStudioSessionMappingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStudioSessionMappingOutput]
  }
  
  extension [Self <: GetStudioSessionMappingOutput](x: Self) {
    
    inline def setSessionMapping(value: SessionMappingDetail): Self = StObject.set(x, "SessionMapping", value.asInstanceOf[js.Any])
    
    inline def setSessionMappingUndefined: Self = StObject.set(x, "SessionMapping", js.undefined)
  }
}
