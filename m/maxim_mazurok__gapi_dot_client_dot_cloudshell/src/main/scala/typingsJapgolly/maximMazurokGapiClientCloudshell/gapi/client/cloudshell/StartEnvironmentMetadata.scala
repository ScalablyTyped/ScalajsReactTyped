package typingsJapgolly.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEnvironmentMetadata extends StObject {
  
  /** Current state of the environment being started. */
  var state: js.UndefOr[String] = js.undefined
}
object StartEnvironmentMetadata {
  
  inline def apply(): StartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEnvironmentMetadata]
  }
  
  extension [Self <: StartEnvironmentMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
