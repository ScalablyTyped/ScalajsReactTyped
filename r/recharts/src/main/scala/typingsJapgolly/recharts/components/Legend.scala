package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.Height
import typingsJapgolly.recharts.anon.PartialMargin
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.IconType
import typingsJapgolly.recharts.mod.LayoutType
import typingsJapgolly.recharts.mod.LegendPayload
import typingsJapgolly.recharts.mod.LegendProps
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.rechartsStrings.bottom
import typingsJapgolly.recharts.rechartsStrings.center
import typingsJapgolly.recharts.rechartsStrings.left
import typingsJapgolly.recharts.rechartsStrings.middle
import typingsJapgolly.recharts.rechartsStrings.right
import typingsJapgolly.recharts.rechartsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  @JSImport("recharts", "Legend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.Legend] {
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def chartHeight(value: Double): this.type = set("chartHeight", value.asInstanceOf[js.Any])
    
    inline def chartWidth(value: Double): this.type = set("chartWidth", value.asInstanceOf[js.Any])
    
    inline def content(value: Element | ContentRenderer[LegendProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentFunction1(value: LegendProps => Node): this.type = set("content", js.Any.fromFunction1(value))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def formatter(
      value: (/* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
        ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => Any
    ): this.type = set("formatter", js.Any.fromFunction3(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def iconType(value: IconType): this.type = set("iconType", value.asInstanceOf[js.Any])
    
    inline def layout(value: LayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def margin(value: PartialMargin): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onBBoxUpdate(value: /* box */ Height => Callback): this.type = set("onBBoxUpdate", js.Any.fromFunction1((t0: /* box */ Height) => value(t0).runNow()))
    
    inline def onClick(value: RechartsFunction): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: RechartsFunction): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: RechartsFunction): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def payload(value: js.Array[LegendPayload]): this.type = set("payload", value.asInstanceOf[js.Any])
    
    inline def payloadVarargs(value: LegendPayload*): this.type = set("payload", js.Array(value*))
    
    inline def verticalAlign(value: top | middle | bottom): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: js.Object): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Legend.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
