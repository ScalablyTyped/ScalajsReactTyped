package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueSuggestion extends StObject {
  
  def Clone(): IPropertyValueSuggestion
  
  val IsFact: Boolean
  
  val Quality: Double
  
  val TypedValue: ITypedValue
}
object IPropertyValueSuggestion {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValueSuggestion],
    IsFact: Boolean,
    Quality: Double,
    TypedValue: ITypedValue
  ): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
  
  extension [Self <: IPropertyValueSuggestion](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValueSuggestion]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setIsFact(value: Boolean): Self = StObject.set(x, "IsFact", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
  }
}
