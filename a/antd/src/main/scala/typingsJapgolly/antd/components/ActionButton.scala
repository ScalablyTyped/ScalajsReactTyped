package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libButtonButtonMod.ButtonProps
import typingsJapgolly.antd.libButtonButtonMod.LegacyButtonType
import typingsJapgolly.antd.libUtilActionButtonMod.ActionButtonProps
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionButton {
  
  inline def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionButtonProps]))
  }
  
  @JSImport("antd/lib/_util/ActionButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actionFn(value: /* repeated */ Any => Any | PromiseLike[Any]): this.type = set("actionFn", js.Any.fromFunction1(value))
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def buttonProps(value: ButtonProps): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def close(value: js.Function): this.type = set("close", value.asInstanceOf[js.Any])
    
    inline def emitEvent(value: Boolean): this.type = set("emitEvent", value.asInstanceOf[js.Any])
    
    inline def quitOnNullishReturnValue(value: Boolean): this.type = set("quitOnNullishReturnValue", value.asInstanceOf[js.Any])
    
    inline def `type`(value: LegacyButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
