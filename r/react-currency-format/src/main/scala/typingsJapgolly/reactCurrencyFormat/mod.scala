package typingsJapgolly.reactCurrencyFormat

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.input
import typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-currency-format", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[Props, js.Object, Any]
  
  type CurrencyFormat = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  // The component accepts all the props which can be given to a input or span based on displayType selected.
  trait DisplayTypeInput
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var customInput: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var displayType: js.UndefOr[input] = js.undefined
  }
  object DisplayTypeInput {
    
    inline def apply(): DisplayTypeInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTypeInput]
    }
    
    extension [Self <: DisplayTypeInput](x: Self) {
      
      inline def setCustomInput(value: ComponentType[Any]): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setDisplayType(value: input): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    }
  }
  
  trait DisplayTypeText
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var customInput: js.UndefOr[scala.Nothing] = js.undefined
    
    var displayType: js.UndefOr[text] = js.undefined
  }
  object DisplayTypeText {
    
    inline def apply(): DisplayTypeText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTypeText]
    }
    
    extension [Self <: DisplayTypeText](x: Self) {
      
      inline def setDisplayType(value: text): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    }
  }
  
  /**
    * Available input type attributes which the component supports.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.text
    - typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.tel
  */
  trait InputType extends StObject
  object InputType {
    
    inline def tel: typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.tel = "tel".asInstanceOf[typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.tel]
    
    inline def text: typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.text = "text".asInstanceOf[typingsJapgolly.reactCurrencyFormat.reactCurrencyFormatStrings.text]
  }
  
  /**
    * Props accepted by the component and any other prop of the customInput.
    */
  type Props = StrictProps & StringDictionary[Any]
  
  /**
    * Props accepted by the component.
    * @see {@link https://github.com/mohitgupta8888/react-currency-format#props}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeTextPartialtho
    - typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeInputPartialth
  */
  trait StrictProps extends StObject
  object StrictProps {
    
    inline def DisplayTypeInputPartialth(
      `type`: js.UndefOr[HTMLInputTypeAttribute] & js.UndefOr[InputType],
      value: (js.UndefOr[String | js.Array[String] | Double]) & (js.UndefOr[Double | String | Null])
    ): typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeInputPartialth = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeInputPartialth]
    }
    
    inline def DisplayTypeTextPartialtho(): typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeTextPartialtho = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.reactCurrencyFormat.anon.DisplayTypeTextPartialtho]
    }
  }
  
  /**
    * A value object containing the formatted value, the original value and the float value.
    * @see {@link https://github.com/mohitgupta8888/react-currency-format#values-object}
    */
  trait Values extends StObject {
    
    var floatValue: Double
    
    var formattedValue: String
    
    var value: String
  }
  object Values {
    
    inline def apply(floatValue: Double, formattedValue: String, value: String): Values = {
      val __obj = js.Dynamic.literal(floatValue = floatValue.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values]
    }
    
    extension [Self <: Values](x: Self) {
      
      inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
