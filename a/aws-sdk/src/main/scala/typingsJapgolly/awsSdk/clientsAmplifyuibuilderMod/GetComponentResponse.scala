package typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentResponse extends StObject {
  
  /**
    * Represents the configuration settings for the component.
    */
  var component: js.UndefOr[Component] = js.undefined
}
object GetComponentResponse {
  
  inline def apply(): GetComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComponentResponse]
  }
  
  extension [Self <: GetComponentResponse](x: Self) {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
