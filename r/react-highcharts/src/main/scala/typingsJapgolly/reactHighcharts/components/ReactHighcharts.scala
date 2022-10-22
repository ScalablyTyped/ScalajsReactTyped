package typingsJapgolly.reactHighcharts.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.reactHighcharts.mod.ReactHighchartsProps
import typingsJapgolly.reactHighcharts.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighcharts {
  
  inline def apply(config: Options): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactHighchartsProps]))
  }
  
  @JSImport("react-highcharts", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def callback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ Any => Callback
    ): this.type = set("callback", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ Any) => value(t0).runNow()))
    
    inline def isPureConfig(value: Boolean): this.type = set("isPureConfig", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactHighchartsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
