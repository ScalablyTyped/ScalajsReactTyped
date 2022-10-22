package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.antvG2.libInterfaceMod.ViewPadding
import typingsJapgolly.bizcharts.anon.End
import typingsJapgolly.bizcharts.libInterfaceMod.IViewProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "View")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsBizchartsMod.View] {
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def filter(
      value: (js.Array[
          js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
        ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
    ): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterVarargs(value: (js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])])*): this.type = set("filter", js.Array(value*))
    
    inline def padding(value: ViewPadding): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def region(value: End): this.type = set("region", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: View.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
