package typingsJapgolly.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondaryValue extends StObject {
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var secondaryValue: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object SecondaryValue {
  
  inline def apply(): SecondaryValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryValue]
  }
  
  extension [Self <: SecondaryValue](x: Self) {
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setSecondaryValue(value: Boolean): Self = StObject.set(x, "secondaryValue", value.asInstanceOf[js.Any])
    
    inline def setSecondaryValueUndefined: Self = StObject.set(x, "secondaryValue", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
