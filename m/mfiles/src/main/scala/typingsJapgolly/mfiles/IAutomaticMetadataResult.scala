package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomaticMetadataResult extends StObject {
  
  def Clone(): IAutomaticMetadataResult
  
  val PropertyValueSuggestions: IPropertyValueSuggestions
}
object IAutomaticMetadataResult {
  
  inline def apply(Clone: CallbackTo[IAutomaticMetadataResult], PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
  
  extension [Self <: IAutomaticMetadataResult](x: Self) {
    
    inline def setClone(value: CallbackTo[IAutomaticMetadataResult]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setPropertyValueSuggestions(value: IPropertyValueSuggestions): Self = StObject.set(x, "PropertyValueSuggestions", value.asInstanceOf[js.Any])
  }
}
