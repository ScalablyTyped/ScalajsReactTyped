package typingsJapgolly.vexflow.global.Vex.Flow

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends
import typingsJapgolly.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Renderer")
@js.native
open class Renderer protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def resize(width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.Renderer = js.native
}
object Renderer {
  
  @JSGlobal("Vex.Flow.Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Renderer.Backends")
  @js.native
  object Backends extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends & Double] = js.native
    
    /* 1 */ val CANVAS: typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends.CANVAS & Double = js.native
    
    /* 0 */ val RAPHAEL: typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends.RAPHAEL & Double = js.native
    
    /* 1 */ val SVG: typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends.SVG & Double = js.native
    
    /* 2 */ val VML: typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends.VML & Double = js.native
  }
  
  @JSGlobal("Vex.Flow.Renderer.LineEndType")
  @js.native
  object LineEndType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Renderer.LineEndType & Double] = js.native
    
    /* 1 */ val DOWN: typingsJapgolly.vexflow.Vex.Flow.Renderer.LineEndType.DOWN & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.vexflow.Vex.Flow.Renderer.LineEndType.NONE & Double = js.native
    
    /* 0 */ val UP: typingsJapgolly.vexflow.Vex.Flow.Renderer.LineEndType.UP & Double = js.native
  }
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.USE_CANVAS_PROXY")
  @js.native
  def USE_CANVAS_PROXY: Boolean = js.native
  inline def USE_CANVAS_PROXY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USE_CANVAS_PROXY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("bolsterCanvasContext")(ctx.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  
  /* static member */
  inline def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  
  /* static member */
  inline def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawDashedLine")(context.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any], dashPattern.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def getCanvasContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.CanvasContext]
  
  /* static member */
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.RaphaelContext]
  
  /* static member */
  inline def getSVGContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typingsJapgolly.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.SVGContext]
}
