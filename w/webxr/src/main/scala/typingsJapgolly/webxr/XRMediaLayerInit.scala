package typingsJapgolly.webxr

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRMediaLayerInit extends StObject {
  
  var invertStereo: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[XRLayerLayout] = js.undefined
  
  var space: EventTarget
}
object XRMediaLayerInit {
  
  inline def apply(space: EventTarget): XRMediaLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRMediaLayerInit]
  }
  
  extension [Self <: XRMediaLayerInit](x: Self) {
    
    inline def setInvertStereo(value: Boolean): Self = StObject.set(x, "invertStereo", value.asInstanceOf[js.Any])
    
    inline def setInvertStereoUndefined: Self = StObject.set(x, "invertStereo", js.undefined)
    
    inline def setLayout(value: XRLayerLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSpace(value: EventTarget): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
