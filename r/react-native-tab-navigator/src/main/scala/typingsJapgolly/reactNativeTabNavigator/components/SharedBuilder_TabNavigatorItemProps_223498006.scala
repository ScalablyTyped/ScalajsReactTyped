package typingsJapgolly.reactNativeTabNavigator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TabNavigatorItemProps_223498006[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
  
  inline def badgeText(value: String | Double): this.type = set("badgeText", value.asInstanceOf[js.Any])
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def renderBadge(value: CallbackTo[Element]): this.type = set("renderBadge", value.toJsFn)
  
  inline def renderIcon(value: CallbackTo[Element]): this.type = set("renderIcon", value.toJsFn)
  
  inline def renderSelectedIcon(value: CallbackTo[Element]): this.type = set("renderSelectedIcon", value.toJsFn)
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def selectedTitleStyle(value: TextStyle): this.type = set("selectedTitleStyle", value.asInstanceOf[js.Any])
  
  inline def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def titleStyle(value: TextStyle): this.type = set("titleStyle", value.asInstanceOf[js.Any])
}
