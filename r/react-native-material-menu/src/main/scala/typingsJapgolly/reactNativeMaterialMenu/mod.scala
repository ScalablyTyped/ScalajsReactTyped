package typingsJapgolly.reactNativeMaterialMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-menu", JSImport.Default)
  @js.native
  open class default () extends Menu
  
  @JSImport("react-native-material-menu", "MenuDivider")
  @js.native
  open class MenuDivider protected ()
    extends Component[MenuDividerProps, js.Object, Any] {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, Any] {
    def this(props: MenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps, context: Any) = this()
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, js.Object, Any] {
    
    def hide(): Unit = js.native
    def hide(onHidden: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait MenuDividerProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
  }
  object MenuDividerProps {
    
    inline def apply(): MenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerProps]
    }
    
    extension [Self <: MenuDividerProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait MenuItemProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledTextColor: js.UndefOr[String] = js.undefined
    
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
      
      inline def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  trait MenuProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var button: js.UndefOr[Element] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setButton(value: VdomElement): Self = StObject.set(x, "button", value.rawElement.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnHidden(value: Callback): Self = StObject.set(x, "onHidden", value.toJsFn)
      
      inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    }
  }
}
