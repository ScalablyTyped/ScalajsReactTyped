package typingsJapgolly.vegaTypings

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLElement
import typingsJapgolly.vegaTypings.typesRuntimeMod.Loader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeRendererMod {
  
  @JSImport("vega-typings/types/runtime/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime/renderer", "CanvasHandler")
  @js.native
  open class CanvasHandler () extends Handler
  
  @JSImport("vega-typings/types/runtime/renderer", "Handler")
  @js.native
  open class Handler () extends StObject
  
  @JSImport("vega-typings/types/runtime/renderer", "Renderer")
  @js.native
  open class Renderer protected () extends StObject {
    def this(loader: Loader_) = this()
    
    def initialize(el: HTMLElement, width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
    
    def resize(width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
  }
  
  inline def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleName.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[RenderModule_]
  
  trait RenderModule_ extends StObject {
    
    var handler: Handler
    
    var headless: js.UndefOr[Renderer] = js.undefined
    
    var renderer: Instantiable1[/* loader */ Loader_, Renderer]
  }
  object RenderModule_ {
    
    inline def apply(handler: Handler, renderer: Instantiable1[/* loader */ Loader_, Renderer]): RenderModule_ = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderModule_]
    }
    
    extension [Self <: RenderModule_](x: Self) {
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHeadless(value: Renderer): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setRenderer(value: Instantiable1[/* loader */ Loader_, Renderer]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.canvas
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.svg
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.none
  */
  trait Renderers extends StObject
  object Renderers {
    
    inline def canvas: typingsJapgolly.vegaTypings.vegaTypingsStrings.canvas = "canvas".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.canvas]
    
    inline def none: typingsJapgolly.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.none]
    
    inline def svg: typingsJapgolly.vegaTypings.vegaTypingsStrings.svg = "svg".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.svg]
  }
}
