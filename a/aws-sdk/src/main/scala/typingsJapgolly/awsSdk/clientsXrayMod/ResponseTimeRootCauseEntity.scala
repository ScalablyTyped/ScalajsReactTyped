package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseTimeRootCauseEntity extends StObject {
  
  /**
    * The type and messages of the exceptions.
    */
  var Coverage: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.undefined
}
object ResponseTimeRootCauseEntity {
  
  inline def apply(): ResponseTimeRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseTimeRootCauseEntity]
  }
  
  extension [Self <: ResponseTimeRootCauseEntity](x: Self) {
    
    inline def setCoverage(value: NullableDouble): Self = StObject.set(x, "Coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "Coverage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRemote(value: NullableBoolean): Self = StObject.set(x, "Remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "Remote", js.undefined)
  }
}
