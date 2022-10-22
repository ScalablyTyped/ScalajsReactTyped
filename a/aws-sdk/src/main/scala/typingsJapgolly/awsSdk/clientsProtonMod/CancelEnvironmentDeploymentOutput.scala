package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEnvironmentDeploymentOutput extends StObject {
  
  /**
    * The environment summary data that's returned by Proton.
    */
  var environment: Environment
}
object CancelEnvironmentDeploymentOutput {
  
  inline def apply(environment: Environment): CancelEnvironmentDeploymentOutput = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEnvironmentDeploymentOutput]
  }
  
  extension [Self <: CancelEnvironmentDeploymentOutput](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
