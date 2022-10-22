package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.EllipsizeProp
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.flat
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  /**
    * Accessibility label for the chip. This is read by the screen reader when the user taps the chip.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Avatar to display for the `Chip`. Both icon and avatar cannot be specified.
    */
  var avatar: js.UndefOr[Node] = js.undefined
  
  /**
    * Text content of the `Chip`.
    */
  var children: Node
  
  /**
    * Icon to display as the close button for the `Chip`. The icon appears only when the onClose prop is specified.
    */
  var closeIcon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * Accessibility label for the close icon. This is read by the screen reader when the user taps the close icon.
    */
  var closeIconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the chip is disabled. A disabled chip is greyed out and `onPress` is not called on touch.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ellipsize Mode for the children text
    */
  var ellipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
  /**
    * Icon to display for the `Chip`. Both icon and avatar cannot be specified.
    */
  var icon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * Mode of the chip.
    * - `flat` - flat chip without outline.
    * - `outlined` - chip with an outline.
    */
  var mode: js.UndefOr[flat | outlined] = js.undefined
  
  /**
    * Function to execute on close button press. The close button appears only when this prop is specified.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function to execute on long press.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Whether chip is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to style the chip color as selected.
    */
  var selectedColor: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Pass down testID from chip props to touchable for Detox tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * Style of chip's text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object Avatar {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Avatar = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[Avatar]
  }
  
  extension [Self <: Avatar](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
    
    inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseIcon(value: IconSource): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconAccessibilityLabel(value: String): Self = StObject.set(x, "closeIconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setCloseIconAccessibilityLabelUndefined: Self = StObject.set(x, "closeIconAccessibilityLabel", js.undefined)
    
    inline def setCloseIconFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "closeIcon", js.Any.fromFunction1(value))
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setCloseIconVarargs(value: ImageURISource*): Self = StObject.set(x, "closeIcon", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setMode(value: flat | outlined): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
