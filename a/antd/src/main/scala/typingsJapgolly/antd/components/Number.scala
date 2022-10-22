package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libStatisticNumberMod.NumberProps
import typingsJapgolly.antd.libStatisticUtilsMod.FormatConfig
import typingsJapgolly.antd.libStatisticUtilsMod.Formatter
import typingsJapgolly.antd.libStatisticUtilsMod.valueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  inline def apply(value: valueType): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NumberProps]))
  }
  
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    inline def formatterFunction2(
      value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("formatter", js.Any.fromFunction2(value))
    
    inline def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
    
    inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
