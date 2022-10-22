package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libFormFormItemInputMod.FormItemInputMiscProps
import typingsJapgolly.antd.libFormFormItemInputMod.FormItemInputProps
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import typingsJapgolly.antd.libGridColMod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItemInput {
  
  inline def apply(
    errors: js.Array[japgolly.scalajs.react.facade.React.Node],
    prefixCls: String,
    warnings: js.Array[japgolly.scalajs.react.facade.React.Node]
  ): Builder = {
    val __props = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemInputProps & FormItemInputMiscProps]))
  }
  
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def fieldId(value: String): this.type = set("fieldId", value.asInstanceOf[js.Any])
    
    inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
    
    inline def helpNull: this.type = set("help", null)
    
    inline def helpVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("help", js.Array(value*))
    
    inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
    
    inline def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginBottomNull: this.type = set("marginBottom", null)
    
    inline def onErrorVisibleChanged(value: /* visible */ Boolean => Callback): this.type = set("onErrorVisibleChanged", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def status(value: ValidateStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemInputProps & FormItemInputMiscProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
