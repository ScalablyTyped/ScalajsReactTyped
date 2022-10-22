package typingsJapgolly.reactNativeNavigation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.TouchableHighlight
import typingsJapgolly.reactNative.mod.TouchableNativeFeedback
import typingsJapgolly.reactNative.mod.TouchableOpacity
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNativeNavigation.anon.ReactTag
import typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersTouchablePreviewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TouchablePreview {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactNativeNavigation.libDistSrcAdaptersTouchablePreviewMod.TouchablePreview
        ] {
    
    inline def onPeekIn(value: Callback): this.type = set("onPeekIn", value.toJsFn)
    
    inline def onPeekOut(value: Callback): this.type = set("onPeekOut", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def onPressIn(value: /* payload */ ReactTag => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* payload */ ReactTag) => value(t0).runNow()))
    
    inline def touchableComponent(
      value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node
    ): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    
    inline def touchableComponentNull: this.type = set("touchableComponent", null)
    
    inline def touchableComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("touchableComponent", js.Array(value*))
    
    inline def touchableComponentVdomElement(value: VdomElement): this.type = set("touchableComponent", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TouchablePreview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
