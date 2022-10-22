package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/FAB/FABGroup.Props, 'style' | 'color' | 'onPress' | 'testID' | 'accessibilityLabel' | 'icon' | 'visible' | 'actions' | 'open' | 'fabStyle' | 'onStateChange' | 'backdropColor'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropsstylecoloronPresAccessibilityLabel extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var actions: js.Array[LabelStyle]
  
  var backdropColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var fabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var icon: IconSource
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onStateChange: js.Function1[/* state */ Open, Unit]
  
  var open: Boolean
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[DeepPartialThemeDark] = js.undefined
  
  var visible: Boolean
}
object PickPropsstylecoloronPresAccessibilityLabel {
  
  inline def apply(
    actions: js.Array[LabelStyle],
    icon: IconSource,
    onStateChange: /* state */ Open => Callback,
    open: Boolean,
    visible: Boolean
  ): PickPropsstylecoloronPresAccessibilityLabel = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onStateChange = js.Any.fromFunction1((t0: /* state */ Open) => onStateChange(t0).runNow()), open = open.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstylecoloronPresAccessibilityLabel]
  }
  
  extension [Self <: PickPropsstylecoloronPresAccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActions(value: js.Array[LabelStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: LabelStyle*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "fabStyle", value.asInstanceOf[js.Any])
    
    inline def setFabStyleNull: Self = StObject.set(x, "fabStyle", null)
    
    inline def setFabStyleUndefined: Self = StObject.set(x, "fabStyle", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnStateChange(value: /* state */ Open => Callback): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1((t0: /* state */ Open) => value(t0).runNow()))
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: DeepPartialThemeDark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
