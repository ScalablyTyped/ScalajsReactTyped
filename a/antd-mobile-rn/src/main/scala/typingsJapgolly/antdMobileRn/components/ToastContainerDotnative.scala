package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libToastStyleIndexDotnativeMod.IToastStyle
import typingsJapgolly.antdMobileRn.libToastToastContainerDotnativeMod.ToastProps
import typingsJapgolly.antdMobileRn.libToastToastContainerDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainerDotnative {
  
  inline def apply(content: String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: Callback): this.type = set("onAnimationEnd", value.toJsFn)
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def styles(value: IToastStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
