package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Color
import typingsJapgolly.antDesignProLayout.anon.DefaultMessage
import typingsJapgolly.antDesignProLayout.esComponentsSettingDrawerThemeColorMod.ThemeColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeColor {
  
  inline def apply(
    formatMessage: DefaultMessage => String,
    hashId: String,
    onChange: String => Callback,
    prefixCls: String,
    value: String
  ): Builder = {
    val __props = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), hashId = hashId.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThemeColorProps]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/ThemeColor", "ThemeColor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def colorList(value: js.Array[Color]): this.type = set("colorList", value.asInstanceOf[js.Any])
    
    inline def colorListVarargs(value: Color*): this.type = set("colorList", js.Array(value*))
  }
  
  def withProps(p: ThemeColorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
