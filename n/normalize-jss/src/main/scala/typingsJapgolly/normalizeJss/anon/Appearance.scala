package typingsJapgolly.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearance extends StObject {
  
  var appearance: String
  
  var font: String
}
object Appearance {
  
  inline def apply(appearance: String, font: String): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
  
  extension [Self <: Appearance](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
