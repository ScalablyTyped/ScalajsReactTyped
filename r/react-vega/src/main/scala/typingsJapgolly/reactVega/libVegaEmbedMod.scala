package typingsJapgolly.reactVega

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactVega.libTypesMod.SignalListeners
import typingsJapgolly.reactVega.libTypesMod.View
import typingsJapgolly.reactVega.libTypesMod.ViewListener
import typingsJapgolly.vegaEmbed.mod.EmbedOptions
import typingsJapgolly.vegaEmbed.mod.Result
import typingsJapgolly.vegaEmbed.mod.VisualizationSpec
import typingsJapgolly.vegaTypings.typesRuntimeRendererMod.Renderers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVegaEmbedMod {
  
  @JSImport("react-vega/lib/VegaEmbed", JSImport.Default)
  @js.native
  open class default () extends VegaEmbed
  
  @js.native
  trait VegaEmbed
    extends PureComponent[VegaEmbedProps, js.Object, Any] {
    
    def clearView(): this.type = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MVegaEmbed(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVegaEmbed(prevProps: VegaEmbedProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVegaEmbed(): Unit = js.native
    
    var containerRef: RefHandle[HTMLDivElement] = js.native
    
    def createView(): Unit = js.native
    
    def handleError(error: js.Error): Unit = js.native
    
    def modifyView(action: ViewListener): Unit = js.native
    
    var resultPromise: js.UndefOr[js.Promise[js.UndefOr[Result]]] = js.native
  }
  
  trait VegaEmbedProps
    extends StObject
       with EmbedOptions[String, Renderers] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* containerRef */ HTMLDivElement, Unit]] = js.undefined
    
    var onNewView: js.UndefOr[ViewListener] = js.undefined
    
    var signalListeners: js.UndefOr[SignalListeners] = js.undefined
    
    var spec: VisualizationSpec
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object VegaEmbedProps {
    
    inline def apply(spec: VisualizationSpec): VegaEmbedProps = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VegaEmbedProps]
    }
    
    extension [Self <: VegaEmbedProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* containerRef */ HTMLDivElement) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* containerRef */ HTMLDivElement) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNewView(value: /* view */ View => Callback): Self = StObject.set(x, "onNewView", js.Any.fromFunction1((t0: /* view */ View) => value(t0).runNow()))
      
      inline def setOnNewViewUndefined: Self = StObject.set(x, "onNewView", js.undefined)
      
      inline def setSignalListeners(value: SignalListeners): Self = StObject.set(x, "signalListeners", value.asInstanceOf[js.Any])
      
      inline def setSignalListenersUndefined: Self = StObject.set(x, "signalListeners", js.undefined)
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
