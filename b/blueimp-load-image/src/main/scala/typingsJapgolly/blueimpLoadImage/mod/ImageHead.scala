package typingsJapgolly.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHead extends StObject {
  
  var imageHead: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array] = js.undefined
}
object ImageHead {
  
  inline def apply(): ImageHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHead]
  }
  
  extension [Self <: ImageHead](x: Self) {
    
    inline def setImageHead(value: js.typedarray.ArrayBuffer | js.typedarray.Uint8Array): Self = StObject.set(x, "imageHead", value.asInstanceOf[js.Any])
    
    inline def setImageHeadUndefined: Self = StObject.set(x, "imageHead", js.undefined)
  }
}
