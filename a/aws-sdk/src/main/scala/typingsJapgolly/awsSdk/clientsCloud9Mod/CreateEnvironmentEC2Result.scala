package typingsJapgolly.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentEC2Result extends StObject {
  
  /**
    * The ID of the environment that was created.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.undefined
}
object CreateEnvironmentEC2Result {
  
  inline def apply(): CreateEnvironmentEC2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentEC2Result]
  }
  
  extension [Self <: CreateEnvironmentEC2Result](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
  }
}
