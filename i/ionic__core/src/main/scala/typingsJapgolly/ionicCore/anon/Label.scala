package typingsJapgolly.ionicCore.anon

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: Element | Null
  
  var labelId: String
  
  var labelText: js.UndefOr[String | Null] = js.undefined
}
object Label {
  
  inline def apply(labelId: String): Label = {
    val __obj = js.Dynamic.literal(labelId = labelId.asInstanceOf[js.Any], label = null)
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLabel(value: Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
    
    inline def setLabelTextNull: Self = StObject.set(x, "labelText", null)
    
    inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
  }
}
