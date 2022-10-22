package typingsJapgolly.reactToastify.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToastify.anon.DefaultClassName
import typingsJapgolly.reactToastify.distComponentsProgressBarMod.ProgressBarProps
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.ToastClassName
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  inline def apply(closeToast: Callback, delay: Double, isRunning: Boolean, theme: Theme, `type`: TypeOptions): Builder = {
    val __props = js.Dynamic.literal(closeToast = closeToast.toJsFn, delay = delay.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProgressBarProps]))
  }
  
  @JSImport("react-toastify/dist/components", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: ToastClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("className", js.Any.fromFunction1(value))
    
    inline def controlledProgress(value: Boolean): this.type = set("controlledProgress", value.asInstanceOf[js.Any])
    
    inline def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    inline def isIn(value: Boolean): this.type = set("isIn", value.asInstanceOf[js.Any])
    
    inline def progress(value: Double | String): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
