package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the settings of a cell shadow. */
trait ShadowFormat extends StObject {
  
  /** contains the color value of the shadow. */
  var Color: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: Boolean
  
  /** contains the location of the shadow. */
  var Location: ShadowLocation
  
  /** contains the size of the shadow. */
  var ShadowWidth: Double
}
object ShadowFormat {
  
  inline def apply(Color: Color, IsTransparent: Boolean, Location: ShadowLocation, ShadowWidth: Double): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], IsTransparent = IsTransparent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ShadowWidth = ShadowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  extension [Self <: ShadowFormat](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setIsTransparent(value: Boolean): Self = StObject.set(x, "IsTransparent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: ShadowLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setShadowWidth(value: Double): Self = StObject.set(x, "ShadowWidth", value.asInstanceOf[js.Any])
  }
}
