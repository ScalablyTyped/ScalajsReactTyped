package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignPro.libLoginLoginItemMod.LoginItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginItem {
  
  inline def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
    `type`: String,
    updateActive: Any => Callback
  ): SharedBuilder_LoginItemProps916194528 = {
    val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1((t0: Any) => updateActive(t0).runNow()))
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_LoginItemProps916194528(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
  }
  
  @JSImport("ant-design-pro/lib/Login/LoginItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps916194528 = new SharedBuilder_LoginItemProps916194528(js.Array(this.component, p.asInstanceOf[js.Any]))
}
