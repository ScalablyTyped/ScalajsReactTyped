package typingsJapgolly.webxr

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitTestOptionsInit extends StObject {
  
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.undefined
  
  var offsetRay: js.UndefOr[XRRay] = js.undefined
  
  var space: EventTarget
}
object XRHitTestOptionsInit {
  
  inline def apply(space: EventTarget): XRHitTestOptionsInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRHitTestOptionsInit]
  }
  
  extension [Self <: XRHitTestOptionsInit](x: Self) {
    
    inline def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setOffsetRay(value: XRRay): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    inline def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    inline def setSpace(value: EventTarget): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
