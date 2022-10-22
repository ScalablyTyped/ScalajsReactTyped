package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentOutput extends StObject {
  
  /**
    * The environment detail data that's returned by Proton.
    */
  var environment: Environment
}
object CreateEnvironmentOutput {
  
  inline def apply(environment: Environment): CreateEnvironmentOutput = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentOutput]
  }
  
  extension [Self <: CreateEnvironmentOutput](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
