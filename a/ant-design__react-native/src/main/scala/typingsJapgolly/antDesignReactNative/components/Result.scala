package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.antDesignReactNative.libResultMod.ResultNativeProps
import typingsJapgolly.antDesignReactNative.libResultStyleMod.ResultStyle
import typingsJapgolly.reactNative.mod.ImagePropertiesSourceOptions
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Result {
  
  @JSImport("@ant-design/react-native", "Result")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Result] {
    
    inline def buttonText(value: String): this.type = set("buttonText", value.asInstanceOf[js.Any])
    
    inline def buttonType(value: primary | ghost): this.type = set("buttonType", value.asInstanceOf[js.Any])
    
    inline def img(value: VdomNode): this.type = set("img", value.rawNode.asInstanceOf[js.Any])
    
    inline def imgNull: this.type = set("img", null)
    
    inline def imgUrl(value: ImagePropertiesSourceOptions): this.type = set("imgUrl", value.asInstanceOf[js.Any])
    
    inline def imgUrlVarargs(value: ImageURISource*): this.type = set("imgUrl", js.Array(value*))
    
    inline def imgVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("img", js.Array(value*))
    
    inline def imgVdomElement(value: VdomElement): this.type = set("img", value.rawElement.asInstanceOf[js.Any])
    
    inline def message(value: VdomNode): this.type = set("message", value.rawNode.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onButtonClick(value: /* e */ Any => Callback): this.type = set("onButtonClick", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[ResultStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Result.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResultNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
