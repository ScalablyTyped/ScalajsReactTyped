package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libModalModalDotnativeMod.IModalNativeProps
import typingsJapgolly.antdMobileRn.libModalModalDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalDotnative {
  
  inline def apply(visible: Boolean): SharedBuilder_IModalNativeProps222862849[default] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new SharedBuilder_IModalNativeProps222862849[default](js.Array(this.component, __props.asInstanceOf[IModalNativeProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/modal/Modal.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IModalNativeProps): SharedBuilder_IModalNativeProps222862849[default] = new SharedBuilder_IModalNativeProps222862849[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
