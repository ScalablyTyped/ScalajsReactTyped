package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`slide-down`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`slide-up`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.fade
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.none
import typingsJapgolly.antDesignReactNative.libModalModalViewMod.IModalPropTypes
import typingsJapgolly.antDesignReactNative.libModalModalViewMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalView {
  
  inline def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IModalPropTypes]))
  }
  
  @JSImport("@ant-design/react-native/lib/modal/ModalView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animateAppear(value: Boolean): this.type = set("animateAppear", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: StyleProp[ViewStyle]): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def maskStyleNull: this.type = set("maskStyle", null)
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onRequestClose(value: CallbackTo[Boolean]): this.type = set("onRequestClose", value.toJsFn)
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrapStyle(value: StyleProp[ViewStyle]): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
    
    inline def wrapStyleNull: this.type = set("wrapStyle", null)
  }
  
  def withProps(p: IModalPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
