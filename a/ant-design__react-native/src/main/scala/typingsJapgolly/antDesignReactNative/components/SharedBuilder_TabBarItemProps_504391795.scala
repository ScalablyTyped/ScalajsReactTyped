package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.antDesignReactNative.libTabBarPropsTypeMod.TabBarIcon
import typingsJapgolly.antDesignReactNative.libTabBarStyleMod.TabBarStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TabBarItemProps_504391795[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def badge(value: String | Double): this.type = set("badge", value.asInstanceOf[js.Any])
  
  inline def icon(value: TabBarIcon): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def iconNull: this.type = set("icon", null)
  
  inline def iconStyle(value: StyleProp[ImageStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
  
  inline def iconStyleNull: this.type = set("iconStyle", null)
  
  inline def iconVarargs(value: (Element | Empty | ImageURISource | JsNumber | String)*): this.type = set("icon", js.Array(value*))
  
  inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def renderAsOriginal(value: Boolean): this.type = set("renderAsOriginal", value.asInstanceOf[js.Any])
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def selectedIcon(value: TabBarIcon): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
  
  inline def selectedIconNull: this.type = set("selectedIcon", null)
  
  inline def selectedIconVarargs(value: (Element | Empty | ImageURISource | JsNumber | String)*): this.type = set("selectedIcon", js.Array(value*))
  
  inline def selectedIconVdomElement(value: VdomElement): this.type = set("selectedIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def styles(value: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  
  inline def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
}
