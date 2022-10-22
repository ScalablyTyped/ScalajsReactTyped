package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ColorHCL
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ColorHSL
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ColorLAB
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ColorRGB
import typingsJapgolly.vegaTypings.typesSpecEncodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with _ColorValueRef {
  
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}
object Color {
  
  inline def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
