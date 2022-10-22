package typingsJapgolly.antvGPluginCanvasRenderer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.RenderingService
import typingsJapgolly.antvGLite.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesStylesInterfacesMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "CircleRendererContribution")
  @js.native
  val CircleRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "EllipseRendererContribution")
  @js.native
  val EllipseRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "ImageRendererContribution")
  @js.native
  val ImageRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "LineRendererContribution")
  @js.native
  val LineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PathRendererContribution")
  @js.native
  val PathRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PolygonRendererContribution")
  @js.native
  val PolygonRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PolylineRendererContribution")
  @js.native
  val PolylineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "RectRendererContribution")
  @js.native
  val RectRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "StyleRendererFactory")
  @js.native
  val StyleRendererFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "TextRendererContribution")
  @js.native
  val TextRendererContribution: DefinedToken = js.native
  
  trait StyleRenderer extends StObject {
    
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit
  }
  object StyleRenderer {
    
    inline def apply(
      render: (CanvasRenderingContext2D, ParsedBaseStyleProps, DisplayObject[Any, Any], RenderingService) => Callback
    ): StyleRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction4((t0: CanvasRenderingContext2D, t1: ParsedBaseStyleProps, t2: DisplayObject[Any, Any], t3: RenderingService) => (render(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[StyleRenderer]
    }
    
    extension [Self <: StyleRenderer](x: Self) {
      
      inline def setRender(
        value: (CanvasRenderingContext2D, ParsedBaseStyleProps, DisplayObject[Any, Any], RenderingService) => Callback
      ): Self = StObject.set(x, "render", js.Any.fromFunction4((t0: CanvasRenderingContext2D, t1: ParsedBaseStyleProps, t2: DisplayObject[Any, Any], t3: RenderingService) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
}
