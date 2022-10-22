package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsedRoboIgnoreDirective extends StObject {
  
  /** The name of the resource that was ignored. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object UsedRoboIgnoreDirective {
  
  inline def apply(): UsedRoboIgnoreDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedRoboIgnoreDirective]
  }
  
  extension [Self <: UsedRoboIgnoreDirective](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
