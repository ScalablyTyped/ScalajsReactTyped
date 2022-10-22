package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.FacetTitle
import typingsJapgolly.antvG2.libInterfaceMod.ViewPadding
import typingsJapgolly.bizcharts.bizchartsStrings.circle
import typingsJapgolly.bizcharts.bizchartsStrings.list
import typingsJapgolly.bizcharts.bizchartsStrings.matrix
import typingsJapgolly.bizcharts.bizchartsStrings.mirror
import typingsJapgolly.bizcharts.bizchartsStrings.rect
import typingsJapgolly.bizcharts.bizchartsStrings.tree
import typingsJapgolly.bizcharts.libComponentsFacetMod.IFacetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Facet {
  
  inline def apply(
    eachView: (Any, Any) => Callback,
    fields: js.Array[String],
    `type`: circle | rect | mirror | list | matrix | tree
  ): Builder = {
    val __props = js.Dynamic.literal(eachView = js.Any.fromFunction2((t0: Any, t1: Any) => (eachView(t0, t1)).runNow()), fields = fields.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IFacetProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Facet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def columnTitle(value: FacetTitle): this.type = set("columnTitle", value.asInstanceOf[js.Any])
    
    inline def line(value: typingsJapgolly.antvG2.libInterfaceMod.Line): this.type = set("line", value.asInstanceOf[js.Any])
    
    inline def padding(value: ViewPadding): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def rowTitle(value: FacetTitle): this.type = set("rowTitle", value.asInstanceOf[js.Any])
    
    inline def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    inline def spacing(value: js.Tuple2[Double | String, Double | String]): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    inline def title(value: FacetTitle): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def transpose(value: Boolean): this.type = set("transpose", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IFacetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
