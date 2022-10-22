package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libModalModalDotnativeMod.IModalNativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  inline def apply(visible: Boolean): SharedBuilder_IModalNativeProps222862849[typingsJapgolly.antdMobileRn.mod.Modal] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new SharedBuilder_IModalNativeProps222862849[typingsJapgolly.antdMobileRn.mod.Modal](js.Array(this.component, __props.asInstanceOf[IModalNativeProps]))
  }
  
  @JSImport("antd-mobile-rn", "Modal")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IModalNativeProps): SharedBuilder_IModalNativeProps222862849[typingsJapgolly.antdMobileRn.mod.Modal] = new SharedBuilder_IModalNativeProps222862849[typingsJapgolly.antdMobileRn.mod.Modal](js.Array(this.component, p.asInstanceOf[js.Any]))
}
