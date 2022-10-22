package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsJapgolly.antDesignReactNative.libModalPromptContainerMod.PropmptContainerProps
import typingsJapgolly.antDesignReactNative.libModalPromptContainerMod.default
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antDesignReactNative.libModalStylePromptMod.PromptStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PromptContainer {
  
  inline def apply(actions: CallbackOrActions[TextStyle]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropmptContainerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def message(value: VdomNode): this.type = set("message", value.rawNode.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onBackHandler(value: CallbackTo[Boolean]): this.type = set("onBackHandler", value.toJsFn)
    
    inline def placeholders(value: js.Array[String]): this.type = set("placeholders", value.asInstanceOf[js.Any])
    
    inline def placeholdersVarargs(value: String*): this.type = set("placeholders", js.Array(value*))
    
    inline def styles(value: Partial[PromptStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(
      value: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropmptContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
