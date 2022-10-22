package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojcolorMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var color: ^
  
  var label: js.UndefOr[String] = js.undefined
}
object Label {
  
  inline def apply(color: ^): Label = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setColor(value: ^): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
