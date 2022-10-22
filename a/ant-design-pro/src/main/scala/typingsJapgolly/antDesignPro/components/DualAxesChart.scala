package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvEventEmitter.mod.EventType
import typingsJapgolly.antvG2plot.anon.Id
import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Adaptor
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.DualAxesOptions
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesStateMod.StateCondition
import typingsJapgolly.antvG2plot.libTypesStateMod.StateName
import typingsJapgolly.antvG2plot.libTypesStateMod.StateObject
import typingsJapgolly.bizcharts.libCreatePlotMod.VisibleText
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.LabelAPIOptions
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.LengendAPIOptions
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DualAxesChart {
  
  inline def apply(
    _events: Any,
    addAnnotations: (js.Array[Annotation], js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ]) => Callback,
    bindEvents: Any,
    bindSizeSensor: Any,
    changeData: Any => Callback,
    changeSize: (Double, Double) => Callback,
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ Any,
    container: HTMLElement,
    createG2: Any,
    destroy: Callback,
    emit: (String, /* repeated */ Any) => Callback,
    execAdaptor: Callback,
    getChartSize: Any,
    getDefaultOptions: CallbackTo[Any],
    getEvents: CallbackTo[Record[String, js.Array[EventType]]],
    getSchemaAdaptor: CallbackTo[Adaptor[DualAxesOptions]],
    getStates: CallbackTo[js.Array[StateObject]],
    off: (js.UndefOr[String | Unit], js.UndefOr[js.Function]) => typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions,
    on: (String, js.Function, js.UndefOr[Boolean]) => typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions,
    once: (String, js.Function) => typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions,
    options: DualAxesOptions,
    removeAnnotations: js.Array[Id & Partial[Annotation]] => Callback,
    render: Callback,
    setState: (StateName, StateCondition, js.UndefOr[Boolean]) => Callback,
    triggerResize: Callback,
    `type`: String,
    unbind: Any,
    unbindSizeSensor: Any,
    update: Partial[DualAxesOptions] => Callback,
    updateOption: Partial[DualAxesOptions] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(_events = _events.asInstanceOf[js.Any], addAnnotations = js.Any.fromFunction2((t0: js.Array[Annotation], t1: js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ]) => (addAnnotations(t0, t1)).runNow()), bindEvents = bindEvents.asInstanceOf[js.Any], bindSizeSensor = bindSizeSensor.asInstanceOf[js.Any], changeData = js.Any.fromFunction1((t0: Any) => changeData(t0).runNow()), changeSize = js.Any.fromFunction2((t0: Double, t1: Double) => (changeSize(t0, t1)).runNow()), chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], createG2 = createG2.asInstanceOf[js.Any], destroy = destroy.toJsFn, emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), execAdaptor = execAdaptor.toJsFn, getChartSize = getChartSize.asInstanceOf[js.Any], getDefaultOptions = getDefaultOptions.toJsFn, getEvents = getEvents.toJsFn, getSchemaAdaptor = getSchemaAdaptor.toJsFn, getStates = getStates.toJsFn, off = js.Any.fromFunction2(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction2(once), options = options.asInstanceOf[js.Any], removeAnnotations = js.Any.fromFunction1((t0: js.Array[Id & Partial[Annotation]]) => removeAnnotations(t0).runNow()), render = render.toJsFn, setState = js.Any.fromFunction3((t0: StateName, t1: StateCondition, t2: js.UndefOr[Boolean]) => (setState(t0, t1, t2)).runNow()), triggerResize = triggerResize.toJsFn, unbind = unbind.asInstanceOf[js.Any], unbindSizeSensor = unbindSizeSensor.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Partial[DualAxesOptions]) => update(t0).runNow()), updateOption = js.Any.fromFunction1((t0: Partial[DualAxesOptions]) => updateOption(t0).runNow()))
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions & RefAttributes[Any]]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "DualAxesChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def description(value: Node | VisibleText): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def errorContent(value: VdomNode): this.type = set("errorContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorContentNull: this.type = set("errorContent", null)
    
    inline def errorContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorContent", js.Array(value*))
    
    inline def errorContentVdomElement(value: VdomElement): this.type = set("errorContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def events(value: Record[String, js.Function]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def forceFit(value: Boolean): this.type = set("forceFit", value.asInstanceOf[js.Any])
    
    inline def isMaterial(value: Boolean): this.type = set("isMaterial", value.asInstanceOf[js.Any])
    
    inline def label(value: LabelAPIOptions): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def legend(value: LengendAPIOptions): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def onGetG2Instance(value: /* chart */ Plot[Any] => Callback): this.type = set("onGetG2Instance", js.Any.fromFunction1((t0: /* chart */ Plot[Any]) => value(t0).runNow()))
    
    inline def title(value: Node | VisibleText): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltip(value: TooltipAPIOptions): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
