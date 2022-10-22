package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.antvG2.libInterfaceMod.ViewPadding
import typingsJapgolly.bizcharts.anon.End
import typingsJapgolly.bizcharts.libInterfaceMod.IChartProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chart {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Chart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ErrorBoundaryProps(value: typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryProps): this.type = set("ErrorBoundaryProps", value.asInstanceOf[js.Any])
    
    inline def autoFit(value: Boolean): this.type = set("autoFit", value.asInstanceOf[js.Any])
    
    inline def container(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def defaultInteractions(value: js.Array[String]): this.type = set("defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def defaultInteractionsVarargs(value: String*): this.type = set("defaultInteractions", js.Array(value*))
    
    inline def errorContent(value: VdomElement): this.type = set("errorContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def filter(
      value: (js.Array[
          js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
        ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
    ): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterVarargs(value: (js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])])*): this.type = set("filter", js.Array(value*))
    
    inline def forceUpdate(value: Boolean): this.type = set("forceUpdate", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def limitInPlot(value: Boolean): this.type = set("limitInPlot", value.asInstanceOf[js.Any])
    
    inline def localRefresh(value: Boolean): this.type = set("localRefresh", value.asInstanceOf[js.Any])
    
    inline def notCompareData(value: Boolean): this.type = set("notCompareData", value.asInstanceOf[js.Any])
    
    inline def onAfterchangedata(value: /* IEvent */ Any => Any): this.type = set("onAfterchangedata", js.Any.fromFunction1(value))
    
    inline def onAfterclear(value: /* IEvent */ Any => Any): this.type = set("onAfterclear", js.Any.fromFunction1(value))
    
    inline def onAfterpaint(value: /* IEvent */ Any => Any): this.type = set("onAfterpaint", js.Any.fromFunction1(value))
    
    inline def onAfterrender(value: /* IEvent */ Any => Any): this.type = set("onAfterrender", js.Any.fromFunction1(value))
    
    inline def onBeforechangedata(value: /* IEvent */ Any => Any): this.type = set("onBeforechangedata", js.Any.fromFunction1(value))
    
    inline def onBeforeclear(value: /* IEvent */ Any => Any): this.type = set("onBeforeclear", js.Any.fromFunction1(value))
    
    inline def onBeforedestroy(value: /* IEvent */ Any => Any): this.type = set("onBeforedestroy", js.Any.fromFunction1(value))
    
    inline def onBeforepaint(value: /* IEvent */ Any => Any): this.type = set("onBeforepaint", js.Any.fromFunction1(value))
    
    inline def onBeforerender(value: /* IEvent */ Any => Any): this.type = set("onBeforerender", js.Any.fromFunction1(value))
    
    inline def onClick(value: /* IEvent */ Any => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onContextmenu(value: /* IEvent */ Any => Any): this.type = set("onContextmenu", js.Any.fromFunction1(value))
    
    inline def onDblclick(value: /* IEvent */ Any => Any): this.type = set("onDblclick", js.Any.fromFunction1(value))
    
    inline def onDrag(value: /* IEvent */ Any => Any): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    inline def onDragend(value: /* IEvent */ Any => Any): this.type = set("onDragend", js.Any.fromFunction1(value))
    
    inline def onDragenter(value: /* IEvent */ Any => Any): this.type = set("onDragenter", js.Any.fromFunction1(value))
    
    inline def onDragleave(value: /* IEvent */ Any => Any): this.type = set("onDragleave", js.Any.fromFunction1(value))
    
    inline def onDragover(value: /* IEvent */ Any => Any): this.type = set("onDragover", js.Any.fromFunction1(value))
    
    inline def onDragstart(value: /* IEvent */ Any => Any): this.type = set("onDragstart", js.Any.fromFunction1(value))
    
    inline def onDrop(value: /* IEvent */ Any => Any): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    inline def onMousedown(value: /* IEvent */ Any => Any): this.type = set("onMousedown", js.Any.fromFunction1(value))
    
    inline def onMouseenter(value: /* IEvent */ Any => Any): this.type = set("onMouseenter", js.Any.fromFunction1(value))
    
    inline def onMouseleave(value: /* IEvent */ Any => Any): this.type = set("onMouseleave", js.Any.fromFunction1(value))
    
    inline def onMousemove(value: /* IEvent */ Any => Any): this.type = set("onMousemove", js.Any.fromFunction1(value))
    
    inline def onMouseout(value: /* IEvent */ Any => Any): this.type = set("onMouseout", js.Any.fromFunction1(value))
    
    inline def onMouseover(value: /* IEvent */ Any => Any): this.type = set("onMouseover", js.Any.fromFunction1(value))
    
    inline def onMouseup(value: /* IEvent */ Any => Any): this.type = set("onMouseup", js.Any.fromFunction1(value))
    
    inline def onTouchend(value: /* IEvent */ Any => Any): this.type = set("onTouchend", js.Any.fromFunction1(value))
    
    inline def onTouchmove(value: /* IEvent */ Any => Any): this.type = set("onTouchmove", js.Any.fromFunction1(value))
    
    inline def onTouchstart(value: /* IEvent */ Any => Any): this.type = set("onTouchstart", js.Any.fromFunction1(value))
    
    inline def padding(value: ViewPadding): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def pure(value: Boolean): this.type = set("pure", value.asInstanceOf[js.Any])
    
    inline def region(value: End): this.type = set("region", value.asInstanceOf[js.Any])
    
    inline def theme(value: js.Object | String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Chart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (Pick[IChartProps, String | Double]) & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
