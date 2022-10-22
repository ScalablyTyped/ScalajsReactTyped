package typingsJapgolly.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedTextColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var selectedTextColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object SelectedTextColor {
  
  inline def apply(): SelectedTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedTextColor]
  }
  
  extension [Self <: SelectedTextColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setSelectedTextColor(value: String): Self = StObject.set(x, "selectedTextColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextColorUndefined: Self = StObject.set(x, "selectedTextColor", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
