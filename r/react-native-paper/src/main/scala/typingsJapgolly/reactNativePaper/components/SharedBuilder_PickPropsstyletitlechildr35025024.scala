package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.ColorString
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.IsExpanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PickPropsstyletitlechildr35025024 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
  
  inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
  
  inline def descriptionNull: this.type = set("description", null)
  
  inline def descriptionNumberOfLines(value: Double): this.type = set("descriptionNumberOfLines", value.asInstanceOf[js.Any])
  
  inline def descriptionStyle(value: StyleProp[TextStyle]): this.type = set("descriptionStyle", value.asInstanceOf[js.Any])
  
  inline def descriptionStyleNull: this.type = set("descriptionStyle", null)
  
  inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
  
  inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
  
  inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
  
  inline def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def left(value: /* props */ ColorString => Node): this.type = set("left", js.Any.fromFunction1(value))
  
  inline def onLongPress(value: /* e */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* e */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def right(value: /* props */ IsExpanded => Node): this.type = set("right", js.Any.fromFunction1(value))
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleNumberOfLines(value: Double): this.type = set("titleNumberOfLines", value.asInstanceOf[js.Any])
  
  inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  
  inline def titleStyleNull: this.type = set("titleStyle", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
}
