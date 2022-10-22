package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libModalPropsTypeMod.Action
import typingsJapgolly.antdMobileRn.libModalStyleIndexDotnativeMod.IModalStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IModalNativeProps222862849[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animateAppear(value: Boolean): this.type = set("animateAppear", value.asInstanceOf[js.Any])
  
  inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
  
  inline def animationType(value: Any): this.type = set("animationType", value.asInstanceOf[js.Any])
  
  inline def bodyStyle(value: StyleProp[ViewStyle]): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  
  inline def bodyStyleNull: this.type = set("bodyStyle", null)
  
  inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  inline def footer(value: js.Array[Action[TextStyle]]): this.type = set("footer", value.asInstanceOf[js.Any])
  
  inline def footerVarargs(value: Action[TextStyle]*): this.type = set("footer", js.Array(value*))
  
  inline def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def operation(value: Boolean): this.type = set("operation", value.asInstanceOf[js.Any])
  
  inline def popup(value: Boolean): this.type = set("popup", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: IModalStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
}
