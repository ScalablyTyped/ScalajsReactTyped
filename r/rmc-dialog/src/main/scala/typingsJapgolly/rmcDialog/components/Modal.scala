package typingsJapgolly.rmcDialog.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.rmcDialog.libModalMod.IModalPropTypes
import typingsJapgolly.rmcDialog.libModalMod.default
import typingsJapgolly.rmcDialog.rmcDialogStrings.`slide-down`
import typingsJapgolly.rmcDialog.rmcDialogStrings.`slide-up`
import typingsJapgolly.rmcDialog.rmcDialogStrings.fade
import typingsJapgolly.rmcDialog.rmcDialogStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  inline def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IModalPropTypes]))
  }
  
  @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animateAppear(value: Boolean): this.type = set("animateAppear", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: ViewStyle): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrapStyle(value: ViewStyle): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IModalPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
