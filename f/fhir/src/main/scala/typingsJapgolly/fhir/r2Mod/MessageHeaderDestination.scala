package typingsJapgolly.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeaderDestination
  extends StObject
     with BackboneElement {
  
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies where to route the message.
    */
  var endpoint: String
  
  /**
    * May be used for routing of response and/or to support audit.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Supports multi-hop routing.
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object MessageHeaderDestination {
  
  inline def apply(endpoint: String): MessageHeaderDestination = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderDestination]
  }
  
  extension [Self <: MessageHeaderDestination](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
