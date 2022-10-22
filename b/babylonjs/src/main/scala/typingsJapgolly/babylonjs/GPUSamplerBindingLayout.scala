package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSamplerBindingLayout extends StObject {
  
  var `type`: js.UndefOr[GPUSamplerBindingType] = js.undefined
}
object GPUSamplerBindingLayout {
  
  inline def apply(): GPUSamplerBindingLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUSamplerBindingLayout]
  }
  
  extension [Self <: GPUSamplerBindingLayout](x: Self) {
    
    inline def setType(value: GPUSamplerBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
