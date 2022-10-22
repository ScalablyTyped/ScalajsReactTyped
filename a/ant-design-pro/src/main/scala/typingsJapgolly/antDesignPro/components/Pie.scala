package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.X
import typingsJapgolly.antDesignPro.libChartsPieMod.IPieProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pie {
  
  inline def apply(height: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPieProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "Pie")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsMod.Pie] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def data(value: js.Array[X]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: X*): this.type = set("data", js.Array(value*))
    
    inline def hasLegend(value: Boolean): this.type = set("hasLegend", value.asInstanceOf[js.Any])
    
    inline def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def subTitle(value: VdomNode): this.type = set("subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def total(value: Node | Double | (js.Function0[Node | Double])): this.type = set("total", value.asInstanceOf[js.Any])
    
    inline def totalCallbackTo(value: CallbackTo[Node | Double]): this.type = set("total", value.toJsFn)
    
    inline def totalNull: this.type = set("total", null)
    
    inline def totalVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("total", js.Array(value*))
    
    inline def totalVdomElement(value: VdomElement): this.type = set("total", value.rawElement.asInstanceOf[js.Any])
    
    inline def valueFormat(value: /* value */ String => String | Node): this.type = set("valueFormat", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IPieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
