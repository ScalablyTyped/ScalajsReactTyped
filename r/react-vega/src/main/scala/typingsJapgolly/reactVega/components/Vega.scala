package typingsJapgolly.reactVega.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fastJsonPatch.moduleCoreMod.Operation
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVega.libTypesMod.PlainObject
import typingsJapgolly.reactVega.libTypesMod.SignalListeners
import typingsJapgolly.reactVega.libTypesMod.View
import typingsJapgolly.reactVega.libVegaMod.VegaProps
import typingsJapgolly.reactVega.reactVegaStrings.dark
import typingsJapgolly.reactVega.reactVegaStrings.excel
import typingsJapgolly.reactVega.reactVegaStrings.ggplot2
import typingsJapgolly.reactVega.reactVegaStrings.quartz
import typingsJapgolly.reactVega.reactVegaStrings.vox
import typingsJapgolly.std.Record
import typingsJapgolly.vegaEmbed.anon.Bottom
import typingsJapgolly.vegaEmbed.anon.PartialCLICKTOVIEWACTIONS
import typingsJapgolly.vegaEmbed.anon.TypeofexpressionInterpret
import typingsJapgolly.vegaEmbed.mod.Actions
import typingsJapgolly.vegaEmbed.mod.Config
import typingsJapgolly.vegaEmbed.mod.ExpressionFunction
import typingsJapgolly.vegaEmbed.mod.Hover
import typingsJapgolly.vegaEmbed.mod.Mode
import typingsJapgolly.vegaEmbed.mod.PatchFunc
import typingsJapgolly.vegaEmbed.mod.VisualizationSpec
import typingsJapgolly.vegaTooltip.mod.Options
import typingsJapgolly.vegaTypings.typesRuntimeMod.Item
import typingsJapgolly.vegaTypings.typesRuntimeMod.LoaderOptions
import typingsJapgolly.vegaTypings.typesRuntimeMod.Loader_
import typingsJapgolly.vegaTypings.typesRuntimeMod.TooltipHandler
import typingsJapgolly.vegaTypings.typesRuntimeRendererMod.Renderers
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.Runtime
import typingsJapgolly.vegaTypings.typesSpecMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Vega {
  
  inline def apply(spec: VisualizationSpec): Builder = {
    val __props = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VegaProps]))
  }
  
  @JSImport("react-vega", "Vega")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactVega.mod.Vega] {
    
    inline def actions(value: Boolean | Actions): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def ast(value: Boolean): this.type = set("ast", value.asInstanceOf[js.Any])
    
    inline def bind(value: HTMLElement | String): this.type = set("bind", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def config(value: String | Config): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def data(value: PlainObject): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def defaultStyle(value: Boolean | String): this.type = set("defaultStyle", value.asInstanceOf[js.Any])
    
    inline def downloadFileName(value: String): this.type = set("downloadFileName", value.asInstanceOf[js.Any])
    
    inline def editorUrl(value: String): this.type = set("editorUrl", value.asInstanceOf[js.Any])
    
    inline def expr(value: TypeofexpressionInterpret): this.type = set("expr", value.asInstanceOf[js.Any])
    
    inline def expressionFunctions(value: ExpressionFunction): this.type = set("expressionFunctions", value.asInstanceOf[js.Any])
    
    inline def formatLocale(value: Record[String, Any]): this.type = set("formatLocale", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hover(value: Boolean | Hover): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def i18n(value: PartialCLICKTOVIEWACTIONS): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def loader(value: Loader_ | LoaderOptions): this.type = set("loader", value.asInstanceOf[js.Any])
    
    inline def logLevel(value: Double): this.type = set("logLevel", value.asInstanceOf[js.Any])
    
    inline def mode(value: Mode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onError(value: (/* error */ js.Error, /* containerRef */ HTMLDivElement) => Callback): this.type = set("onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* containerRef */ HTMLDivElement) => (value(t0, t1)).runNow()))
    
    inline def onNewView(value: /* view */ View => Callback): this.type = set("onNewView", js.Any.fromFunction1((t0: /* view */ View) => value(t0).runNow()))
    
    inline def padding(value: Double | Bottom): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def patch(value: String | PatchFunc | js.Array[Operation]): this.type = set("patch", value.asInstanceOf[js.Any])
    
    inline def patchFunction1(value: /* spec */ Spec => Spec): this.type = set("patch", js.Any.fromFunction1(value))
    
    inline def patchVarargs(value: Operation*): this.type = set("patch", js.Array(value*))
    
    inline def renderer(value: Renderers): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def scaleFactor(value: Double): this.type = set("scaleFactor", value.asInstanceOf[js.Any])
    
    inline def signalListeners(value: SignalListeners): this.type = set("signalListeners", value.asInstanceOf[js.Any])
    
    inline def sourceFooter(value: String): this.type = set("sourceFooter", value.asInstanceOf[js.Any])
    
    inline def sourceHeader(value: String): this.type = set("sourceHeader", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: excel | ggplot2 | quartz | vox | dark): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def timeFormatLocale(value: Record[String, Any]): this.type = set("timeFormatLocale", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: TooltipHandler | Options | Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipFunction4(
      value: (/* handler */ Any, /* event */ MouseEvent, /* item */ Item[Any], /* value */ Any) => Callback
    ): this.type = set("tooltip", js.Any.fromFunction4((t0: /* handler */ Any, t1: /* event */ MouseEvent, t2: /* item */ Item[Any], t3: /* value */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def viewClass(value: Instantiable1[/* runtime */ Runtime, typingsJapgolly.vega.mod.View]): this.type = set("viewClass", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VegaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
