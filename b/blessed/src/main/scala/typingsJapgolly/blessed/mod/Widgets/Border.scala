package typingsJapgolly.blessed.mod.Widgets

import typingsJapgolly.blessed.blessedStrings.bg
import typingsJapgolly.blessed.blessedStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  /**
    * Border foreground and background, must be numbers (-1 for default).
    */
  var bg: js.UndefOr[Double] = js.undefined
  
  /**
    * Border attributes.
    */
  var bold: js.UndefOr[String] = js.undefined
  
  /**
    * Character to use if bg type, default is space.
    */
  var ch: js.UndefOr[String] = js.undefined
  
  var fg: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of border (line or bg). bg by default.
    */
  var `type`: js.UndefOr[line | bg] = js.undefined
  
  var underline: js.UndefOr[String] = js.undefined
}
object Border {
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBg(value: Double): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    inline def setFg(value: Double): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    inline def setType(value: line | bg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
