package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Icon
import typingsJapgolly.antDesignProLayout.esComponentsSettingDrawerBlockCheckboxMod.BlockCheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockCheckbox {
  
  inline def apply(configType: String, hashId: String, onChange: String => Callback, prefixCls: String, value: String): Builder = {
    val __props = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BlockCheckboxProps]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/BlockCheckbox", "BlockCheckbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def list(value: js.Array[Icon]): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def listVarargs(value: Icon*): this.type = set("list", js.Array(value*))
  }
  
  def withProps(p: BlockCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
