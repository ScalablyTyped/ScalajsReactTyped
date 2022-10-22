package typingsJapgolly.cesium.anon

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.cesium.mod.Cartesian2
import typingsJapgolly.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var color: js.UndefOr[Property | typingsJapgolly.cesium.mod.Color] = js.undefined
  
  var image: js.UndefOr[Property | String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement] = js.undefined
  
  var repeat: js.UndefOr[Property | Cartesian2] = js.undefined
  
  var transparent: js.UndefOr[Property | Boolean] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setColor(value: Property | typingsJapgolly.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setImage(value: Property | String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setRepeat(value: Property | Cartesian2): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setTransparent(value: Property | Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
