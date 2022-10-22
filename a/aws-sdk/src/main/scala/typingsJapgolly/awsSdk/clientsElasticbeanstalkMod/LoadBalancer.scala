package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancer extends StObject {
  
  /**
    * The name of the LoadBalancer.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}
object LoadBalancer {
  
  inline def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  extension [Self <: LoadBalancer](x: Self) {
    
    inline def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
