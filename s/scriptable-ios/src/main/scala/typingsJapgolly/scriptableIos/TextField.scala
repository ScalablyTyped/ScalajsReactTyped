package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Text field in an alert._
  * @see https://docs.scriptable.app/textfield
  */
trait TextField extends StObject {
  
  /**
    * _Center aligns the text._
    * @see https://docs.scriptable.app/textfield/#-centeraligntext
    */
  def centerAlignText(): Unit
  
  /**
    * _Font of the text._
    * @see https://docs.scriptable.app/textfield/#font
    */
  var font: Font
  
  /**
    * _Hides the text that is entered when set to true._
    *
    * The default value is false.
    * @see https://docs.scriptable.app/textfield/#issecure
    */
  var isSecure: Boolean
  
  /**
    * _Left aligns the text._
    *
    * This is the default text alignment.
    * @see https://docs.scriptable.app/textfield/#-leftaligntext
    */
  def leftAlignText(): Unit
  
  /**
    * _Placeholder shown in the text field while it is empty._
    * @see https://docs.scriptable.app/textfield/#placeholder
    */
  var placeholder: String
  
  /**
    * _Right aligns the text._
    * @see https://docs.scriptable.app/textfield/#-rightaligntext
    */
  def rightAlignText(): Unit
  
  /**
    * _Use a numeric keyboard with a decimal point for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdecimalpadkeyboard
    */
  def setDecimalPadKeyboard(): Unit
  
  /**
    * _Use the default keyboard for entering text._
    * @see https://docs.scriptable.app/textfield/#-setdefaultkeyboard
    */
  def setDefaultKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the @, period and space characters._
    * @see https://docs.scriptable.app/textfield/#-setemailaddresskeyboard
    */
  def setEmailAddressKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9._
    * @see https://docs.scriptable.app/textfield/#-setnumberpadkeyboard
    */
  def setNumberPadKeyboard(): Unit
  
  /**
    * _Use a numeric keyboard with punctuation for entering text._
    * @see https://docs.scriptable.app/textfield/#-setnumbersandpunctuationkeyboard
    */
  def setNumbersAndPunctuationKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the numbers 0 through 9 and the * and # characters._
    * @see https://docs.scriptable.app/textfield/#-setphonepadkeyboard
    */
  def setPhonePadKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the @ and # characters._
    * @see https://docs.scriptable.app/textfield/#-settwitterkeyboard
    */
  def setTwitterKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the period and slash characters and the ".com" string._
    * @see https://docs.scriptable.app/textfield/#-seturlkeyboard
    */
  def setURLKeyboard(): Unit
  
  /**
    * _Use a keyboard that prominently features the space and period characters._
    * @see https://docs.scriptable.app/textfield/#-setwebsearchkeyboard
    */
  def setWebSearchKeyboard(): Unit
  
  /**
    * _Text in the text field._
    * @see https://docs.scriptable.app/textfield/#text
    */
  var text: String
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/textfield/#textcolor
    */
  var textColor: Color
}
object TextField {
  
  inline def apply(
    centerAlignText: Callback,
    font: Font,
    isSecure: Boolean,
    leftAlignText: Callback,
    placeholder: String,
    rightAlignText: Callback,
    setDecimalPadKeyboard: Callback,
    setDefaultKeyboard: Callback,
    setEmailAddressKeyboard: Callback,
    setNumberPadKeyboard: Callback,
    setNumbersAndPunctuationKeyboard: Callback,
    setPhonePadKeyboard: Callback,
    setTwitterKeyboard: Callback,
    setURLKeyboard: Callback,
    setWebSearchKeyboard: Callback,
    text: String,
    textColor: Color
  ): TextField = {
    val __obj = js.Dynamic.literal(centerAlignText = centerAlignText.toJsFn, font = font.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], leftAlignText = leftAlignText.toJsFn, placeholder = placeholder.asInstanceOf[js.Any], rightAlignText = rightAlignText.toJsFn, setDecimalPadKeyboard = setDecimalPadKeyboard.toJsFn, setDefaultKeyboard = setDefaultKeyboard.toJsFn, setEmailAddressKeyboard = setEmailAddressKeyboard.toJsFn, setNumberPadKeyboard = setNumberPadKeyboard.toJsFn, setNumbersAndPunctuationKeyboard = setNumbersAndPunctuationKeyboard.toJsFn, setPhonePadKeyboard = setPhonePadKeyboard.toJsFn, setTwitterKeyboard = setTwitterKeyboard.toJsFn, setURLKeyboard = setURLKeyboard.toJsFn, setWebSearchKeyboard = setWebSearchKeyboard.toJsFn, text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextField]
  }
  
  extension [Self <: TextField](x: Self) {
    
    inline def setCenterAlignText(value: Callback): Self = StObject.set(x, "centerAlignText", value.toJsFn)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setLeftAlignText(value: Callback): Self = StObject.set(x, "leftAlignText", value.toJsFn)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRightAlignText(value: Callback): Self = StObject.set(x, "rightAlignText", value.toJsFn)
    
    inline def setSetDecimalPadKeyboard(value: Callback): Self = StObject.set(x, "setDecimalPadKeyboard", value.toJsFn)
    
    inline def setSetDefaultKeyboard(value: Callback): Self = StObject.set(x, "setDefaultKeyboard", value.toJsFn)
    
    inline def setSetEmailAddressKeyboard(value: Callback): Self = StObject.set(x, "setEmailAddressKeyboard", value.toJsFn)
    
    inline def setSetNumberPadKeyboard(value: Callback): Self = StObject.set(x, "setNumberPadKeyboard", value.toJsFn)
    
    inline def setSetNumbersAndPunctuationKeyboard(value: Callback): Self = StObject.set(x, "setNumbersAndPunctuationKeyboard", value.toJsFn)
    
    inline def setSetPhonePadKeyboard(value: Callback): Self = StObject.set(x, "setPhonePadKeyboard", value.toJsFn)
    
    inline def setSetTwitterKeyboard(value: Callback): Self = StObject.set(x, "setTwitterKeyboard", value.toJsFn)
    
    inline def setSetURLKeyboard(value: Callback): Self = StObject.set(x, "setURLKeyboard", value.toJsFn)
    
    inline def setSetWebSearchKeyboard(value: Callback): Self = StObject.set(x, "setWebSearchKeyboard", value.toJsFn)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
