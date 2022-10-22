package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/buttons/ButtonGroup.ButtonGroupProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/buttons/ButtonGroup.ButtonGroupProps>>, 'button' | 'disabled' | 'onPress' | 'activeOpacity' | 'onHideUnderlay' | 'onShowUnderlay' | 'underlayColor' | 'Component' | 'containerStyle' | 'disabledStyle' | 'textStyle' | 'buttonStyle' | 'buttons' | 'selectedTextStyle' | 'selectedButtonStyle' | 'selectedIndex' | 'selectedIndexes' | 'setOpacityTo' | 'innerBorderStyle' | 'buttonContainerStyle' | 'selectMultiple' | 'disabledTextStyle' | 'disabledSelectedStyle' | 'disabledSelectedTextStyle' | 'vertical'> */
trait PickButtonGroupPropsParti extends StObject {
  
  var Component: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      japgolly.scalajs.react.facade.React.Component[
        typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component & js.Object, 
        js.Object
      ]
    ])
  ] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var button: js.UndefOr[js.Object] = js.undefined
  
  var buttonContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var buttons: js.UndefOr[js.Array[String | Element]] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var disabled: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  
  var disabledSelectedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var disabledSelectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var disabledTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var innerBorderStyle: js.UndefOr[Color] = js.undefined
  
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var selectMultiple: js.UndefOr[Boolean] = js.undefined
  
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double | Null] = js.undefined
  
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var underlayColor: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object PickButtonGroupPropsParti {
  
  inline def apply(): PickButtonGroupPropsParti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickButtonGroupPropsParti]
  }
  
  extension [Self <: PickButtonGroupPropsParti](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setButton(value: js.Object): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonContainerStyleNull: Self = StObject.set(x, "buttonContainerStyle", null)
    
    inline def setButtonContainerStyleUndefined: Self = StObject.set(x, "buttonContainerStyle", js.undefined)
    
    inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setButtons(value: js.Array[String | Element]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (String | Element)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[Component & js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDisabled(value: Boolean | js.Array[Double]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledSelectedStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedStyleNull: Self = StObject.set(x, "disabledSelectedStyle", null)
    
    inline def setDisabledSelectedStyleUndefined: Self = StObject.set(x, "disabledSelectedStyle", js.undefined)
    
    inline def setDisabledSelectedTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledSelectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedTextStyleNull: Self = StObject.set(x, "disabledSelectedTextStyle", null)
    
    inline def setDisabledSelectedTextStyleUndefined: Self = StObject.set(x, "disabledSelectedTextStyle", js.undefined)
    
    inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setDisabledTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTextStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledTextStyleNull: Self = StObject.set(x, "disabledTextStyle", null)
    
    inline def setDisabledTextStyleUndefined: Self = StObject.set(x, "disabledTextStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisabledVarargs(value: Double*): Self = StObject.set(x, "disabled", js.Array(value*))
    
    inline def setInnerBorderStyle(value: Color): Self = StObject.set(x, "innerBorderStyle", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderStyleUndefined: Self = StObject.set(x, "innerBorderStyle", js.undefined)
    
    inline def setOnHideUnderlay(value: Callback): Self = StObject.set(x, "onHideUnderlay", value.toJsFn)
    
    inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    inline def setOnPress(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnShowUnderlay(value: Callback): Self = StObject.set(x, "onShowUnderlay", value.toJsFn)
    
    inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    inline def setSelectMultiple(value: Boolean): Self = StObject.set(x, "selectMultiple", value.asInstanceOf[js.Any])
    
    inline def setSelectMultipleUndefined: Self = StObject.set(x, "selectMultiple", js.undefined)
    
    inline def setSelectedButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    inline def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexNull: Self = StObject.set(x, "selectedIndex", null)
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedIndexes(value: js.Array[Double]): Self = StObject.set(x, "selectedIndexes", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexesUndefined: Self = StObject.set(x, "selectedIndexes", js.undefined)
    
    inline def setSelectedIndexesVarargs(value: Double*): Self = StObject.set(x, "selectedIndexes", js.Array(value*))
    
    inline def setSelectedTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "selectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextStyleNull: Self = StObject.set(x, "selectedTextStyle", null)
    
    inline def setSelectedTextStyleUndefined: Self = StObject.set(x, "selectedTextStyle", js.undefined)
    
    inline def setSetOpacityTo(value: /* value */ Double => Callback): Self = StObject.set(x, "setOpacityTo", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setSetOpacityToUndefined: Self = StObject.set(x, "setOpacityTo", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
