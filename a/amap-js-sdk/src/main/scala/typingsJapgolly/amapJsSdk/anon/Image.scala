package typingsJapgolly.amapJsSdk.anon

import typingsJapgolly.amapJsSdk.AMap.Pixel
import typingsJapgolly.amapJsSdk.AMap.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: js.UndefOr[String] = js.undefined
  
  var imageOffset: js.UndefOr[Pixel] = js.undefined
  
  var imageSize: js.UndefOr[Size] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageOffset(value: Pixel): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    inline def setImageOffsetUndefined: Self = StObject.set(x, "imageOffset", js.undefined)
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
