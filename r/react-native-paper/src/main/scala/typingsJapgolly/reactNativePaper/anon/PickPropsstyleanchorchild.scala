package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/Menu/Menu.Props, 'style' | 'anchor' | 'children' | 'visible' | 'contentStyle' | 'statusBarHeight' | 'onDismiss' | 'overlayAccessibilityLabel'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropsstyleanchorchild extends StObject {
  
  var anchor: Node | X
  
  var children: Node
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onDismiss: js.Function0[Unit]
  
  var overlayAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var statusBarHeight: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var visible: Boolean
}
object PickPropsstyleanchorchild {
  
  inline def apply(onDismiss: Callback, visible: Boolean): PickPropsstyleanchorchild = {
    val __obj = js.Dynamic.literal(onDismiss = onDismiss.toJsFn, visible = visible.asInstanceOf[js.Any], anchor = null, children = null)
    __obj.asInstanceOf[PickPropsstyleanchorchild]
  }
  
  extension [Self <: PickPropsstyleanchorchild](x: Self) {
    
    inline def setAnchor(value: Node | X): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setAnchorVdomElement(value: VdomElement): Self = StObject.set(x, "anchor", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOverlayAccessibilityLabel(value: String): Self = StObject.set(x, "overlayAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setOverlayAccessibilityLabelUndefined: Self = StObject.set(x, "overlayAccessibilityLabel", js.undefined)
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeightUndefined: Self = StObject.set(x, "statusBarHeight", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
