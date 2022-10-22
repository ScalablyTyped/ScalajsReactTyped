package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.horizontal
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.radial
import typingsJapgolly.plotlyJs.plotlyJsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colorsrc extends StObject {
  
  var color: typingsJapgolly.plotlyJs.mod.Color
  
  var colorsrc: Any
  
  var `type`: radial | horizontal | vertical | none
  
  var typesrc: Any
}
object Colorsrc {
  
  inline def apply(
    color: typingsJapgolly.plotlyJs.mod.Color,
    colorsrc: Any,
    `type`: radial | horizontal | vertical | none,
    typesrc: Any
  ): Colorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colorsrc]
  }
  
  extension [Self <: Colorsrc](x: Self) {
    
    inline def setColor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setColorsrc(value: Any): Self = StObject.set(x, "colorsrc", value.asInstanceOf[js.Any])
    
    inline def setType(value: radial | horizontal | vertical | none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypesrc(value: Any): Self = StObject.set(x, "typesrc", value.asInstanceOf[js.Any])
  }
}
