package typingsJapgolly.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the list of print color mode options. */
trait PrintColorModeOptionDetails extends StObject {
  
  /** Gets or sets the string for an error condition. */
  var errorText: String
  
  /** Gets the list of items for the print color mode option. */
  var items: IVectorView[Any]
  
  /** Gets the ID for the print color mode option. */
  var optionId: String
  
  /** Gets the option type for the print color mode option. */
  var optionType: PrintOptionType
  
  /** Gets or sets the state of the print color mode option. */
  var state: PrintOptionStates
  
  /**
    * Sets the value for the print color mode option.
    * @param value Value for the print color mode option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: Any): Boolean
  
  /** Gets or sets the enumerated value of the print color mode option. */
  var value: Any
}
object PrintColorModeOptionDetails {
  
  inline def apply(
    errorText: String,
    items: IVectorView[Any],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: Any => Boolean,
    value: Any
  ): PrintColorModeOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintColorModeOptionDetails]
  }
  
  extension [Self <: PrintColorModeOptionDetails](x: Self) {
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IVectorView[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    inline def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    inline def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTrySetValue(value: Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
