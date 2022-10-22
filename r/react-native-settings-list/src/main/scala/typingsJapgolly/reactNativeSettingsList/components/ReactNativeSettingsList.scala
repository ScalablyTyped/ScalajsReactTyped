package typingsJapgolly.reactNativeSettingsList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSettingsList.mod.HeaderProps
import typingsJapgolly.reactNativeSettingsList.mod.ItemProps
import typingsJapgolly.reactNativeSettingsList.mod.SettingsListProps
import typingsJapgolly.reactNativeSettingsList.mod.default
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSettingsList {
  
  object Header {
    
    @JSImport("react-native-settings-list", "default.Header")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeSettingsList.mod.default.Header] {
      
      inline def headerNumberOfLines(value: Double): this.type = set("headerNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def headerRef(value: Callback): this.type = set("headerRef", value.toJsFn)
      
      inline def headerStyle(value: StyleProp[TextStyle]): this.type = set("headerStyle", value.asInstanceOf[js.Any])
      
      inline def headerStyleNull: this.type = set("headerStyle", null)
      
      inline def headerText(value: String): this.type = set("headerText", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Header.type): typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder = new typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HeaderProps): typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder = new typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("react-native-settings-list", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeSettingsList.mod.default.Item] {
      
      inline def arrowIcon(value: VdomNode): this.type = set("arrowIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def arrowIconNull: this.type = set("arrowIcon", null)
      
      inline def arrowIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("arrowIcon", js.Array(value*))
      
      inline def arrowIconVdomElement(value: VdomElement): this.type = set("arrowIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def arrowStyle(value: StyleProp[ImageStyle]): this.type = set("arrowStyle", value.asInstanceOf[js.Any])
      
      inline def arrowStyleNull: this.type = set("arrowStyle", null)
      
      inline def authPropsPW(value: js.Object): this.type = set("authPropsPW", value.asInstanceOf[js.Any])
      
      inline def authPropsUser(value: js.Object): this.type = set("authPropsUser", value.asInstanceOf[js.Any])
      
      inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      inline def borderHide(value: Top | Bottom | Both): this.type = set("borderHide", value.asInstanceOf[js.Any])
      
      inline def editableTextStyle(value: StyleProp[TextStyle]): this.type = set("editableTextStyle", value.asInstanceOf[js.Any])
      
      inline def editableTextStyleNull: this.type = set("editableTextStyle", null)
      
      inline def hasNavArrow(value: Boolean): this.type = set("hasNavArrow", value.asInstanceOf[js.Any])
      
      inline def hasSwitch(value: Boolean): this.type = set("hasSwitch", value.asInstanceOf[js.Any])
      
      inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def iconNull: this.type = set("icon", null)
      
      inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def isAuth(value: Boolean): this.type = set("isAuth", value.asInstanceOf[js.Any])
      
      inline def itemBoxStyle(value: StyleProp[ViewStyle]): this.type = set("itemBoxStyle", value.asInstanceOf[js.Any])
      
      inline def itemBoxStyleNull: this.type = set("itemBoxStyle", null)
      
      inline def itemRef(value: Callback): this.type = set("itemRef", value.toJsFn)
      
      inline def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
      
      inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
      
      inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
      
      inline def rightSideContent(value: VdomNode): this.type = set("rightSideContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def rightSideContentNull: this.type = set("rightSideContent", null)
      
      inline def rightSideContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightSideContent", js.Array(value*))
      
      inline def rightSideContentVdomElement(value: VdomElement): this.type = set("rightSideContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def rightSideStyle(value: StyleProp[ViewStyle]): this.type = set("rightSideStyle", value.asInstanceOf[js.Any])
      
      inline def rightSideStyleNull: this.type = set("rightSideStyle", null)
      
      inline def switchOnValueChange(value: Callback): this.type = set("switchOnValueChange", value.toJsFn)
      
      inline def switchProps(value: js.Object): this.type = set("switchProps", value.asInstanceOf[js.Any])
      
      inline def switchState(value: Boolean): this.type = set("switchState", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def titleBoxStyle(value: StyleProp[ViewStyle]): this.type = set("titleBoxStyle", value.asInstanceOf[js.Any])
      
      inline def titleBoxStyleNull: this.type = set("titleBoxStyle", null)
      
      inline def titleInfo(value: String): this.type = set("titleInfo", value.asInstanceOf[js.Any])
      
      inline def titleInfoPosition(value: String): this.type = set("titleInfoPosition", value.asInstanceOf[js.Any])
      
      inline def titleInfoStyle(value: StyleProp[TextStyle]): this.type = set("titleInfoStyle", value.asInstanceOf[js.Any])
      
      inline def titleInfoStyleNull: this.type = set("titleInfoStyle", null)
      
      inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
      
      inline def titleStyleNull: this.type = set("titleStyle", null)
      
      inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Item.type): typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder = new typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemProps): typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder = new typingsJapgolly.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def defaultItemSize(value: Double): this.type = set("defaultItemSize", value.asInstanceOf[js.Any])
    
    inline def defaultTitleInfoPosition(value: String): this.type = set("defaultTitleInfoPosition", value.asInstanceOf[js.Any])
    
    inline def defaultTitleStyle(value: StyleProp[TextStyle]): this.type = set("defaultTitleStyle", value.asInstanceOf[js.Any])
    
    inline def defaultTitleStyleNull: this.type = set("defaultTitleStyle", null)
    
    inline def scrollViewProps(value: js.Object): this.type = set("scrollViewProps", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSettingsList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SettingsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
