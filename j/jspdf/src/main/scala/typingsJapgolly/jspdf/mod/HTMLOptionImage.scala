package typingsJapgolly.jspdf.mod

import typingsJapgolly.jspdf.jspdfStrings.jpeg_
import typingsJapgolly.jspdf.jspdfStrings.png_
import typingsJapgolly.jspdf.jspdfStrings.webp_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLOptionImage extends StObject {
  
  var quality: Double
  
  var `type`: jpeg_ | png_ | webp_
}
object HTMLOptionImage {
  
  inline def apply(quality: Double, `type`: jpeg_ | png_ | webp_): HTMLOptionImage = {
    val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOptionImage]
  }
  
  extension [Self <: HTMLOptionImage](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setType(value: jpeg_ | png_ | webp_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
