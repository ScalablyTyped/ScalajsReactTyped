package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libModalAlertContainerMod.AlertContainerProps
import typingsJapgolly.antDesignReactNative.libModalAlertContainerMod.default
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.Action
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlertContainer {
  
  inline def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertContainerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/modal/AlertContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onBackHandler(value: CallbackTo[Boolean]): this.type = set("onBackHandler", value.toJsFn)
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
