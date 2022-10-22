package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distButtonsButtonMod.ButtonProps
import typingsJapgolly.reactNativeElements.distPricingPricingCardMod.ButtonInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/pricing/PricingCard.PricingCardProps> */
trait PartialPricingCardProps extends StObject {
  
  var button: js.UndefOr[ButtonProps | ButtonInformation] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var info: js.UndefOr[js.Array[String]] = js.undefined
  
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var price: js.UndefOr[String | Double] = js.undefined
  
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PartialPricingCardProps {
  
  inline def apply(): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPricingCardProps]
  }
  
  extension [Self <: PartialPricingCardProps](x: Self) {
    
    inline def setButton(value: ButtonProps | ButtonInformation): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setInfo(value: js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "infoStyle", value.asInstanceOf[js.Any])
    
    inline def setInfoStyleNull: Self = StObject.set(x, "infoStyle", null)
    
    inline def setInfoStyleUndefined: Self = StObject.set(x, "infoStyle", js.undefined)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setOnButtonPress(value: Callback): Self = StObject.set(x, "onButtonPress", value.toJsFn)
    
    inline def setOnButtonPressUndefined: Self = StObject.set(x, "onButtonPress", js.undefined)
    
    inline def setPrice(value: String | Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPricingStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "pricingStyle", value.asInstanceOf[js.Any])
    
    inline def setPricingStyleNull: Self = StObject.set(x, "pricingStyle", null)
    
    inline def setPricingStyleUndefined: Self = StObject.set(x, "pricingStyle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
