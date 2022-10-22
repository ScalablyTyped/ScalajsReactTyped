package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRLightProbeInit extends StObject {
  
  var reflectionFormat: XRReflectionFormat
}
object XRLightProbeInit {
  
  inline def apply(reflectionFormat: XRReflectionFormat): XRLightProbeInit = {
    val __obj = js.Dynamic.literal(reflectionFormat = reflectionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRLightProbeInit]
  }
  
  extension [Self <: XRLightProbeInit](x: Self) {
    
    inline def setReflectionFormat(value: XRReflectionFormat): Self = StObject.set(x, "reflectionFormat", value.asInstanceOf[js.Any])
  }
}
