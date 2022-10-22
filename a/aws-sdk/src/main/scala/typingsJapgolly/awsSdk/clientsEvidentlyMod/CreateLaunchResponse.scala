package typingsJapgolly.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchResponse extends StObject {
  
  /**
    * A structure that contains the configuration of the launch that was created.
    */
  var launch: Launch
}
object CreateLaunchResponse {
  
  inline def apply(launch: Launch): CreateLaunchResponse = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchResponse]
  }
  
  extension [Self <: CreateLaunchResponse](x: Self) {
    
    inline def setLaunch(value: Launch): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
  }
}
