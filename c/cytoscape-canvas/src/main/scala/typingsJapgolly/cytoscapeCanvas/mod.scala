package typingsJapgolly.cytoscapeCanvas

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.cytoscape.mod.Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-canvas", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait CanvasInstance extends StObject {
    
    /**
      * Clear the entire canvas.
      * @param ctx The canvas context.
      */
    def clear(ctx: CanvasRenderingContext2D): Unit
    
    /**
      * Return the generated canvas.
      */
    def getCanvas(): HTMLCanvasElement
    
    /**
      * Reset the context transform.
      * Further drawing will be on rendered position.
      * @param ctx The canvas context.
      */
    def resetTransform(ctx: CanvasRenderingContext2D): Unit
    
    /**
      * Set the context transform to match Cytoscape's zoom & pan.
      * Further drawing will be on model position.
      * @param ctx The canvas context.
      */
    def setTransform(ctx: CanvasRenderingContext2D): Unit
  }
  object CanvasInstance {
    
    inline def apply(
      clear: CanvasRenderingContext2D => Callback,
      getCanvas: CallbackTo[HTMLCanvasElement],
      resetTransform: CanvasRenderingContext2D => Callback,
      setTransform: CanvasRenderingContext2D => Callback
    ): CanvasInstance = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => clear(t0).runNow()), getCanvas = getCanvas.toJsFn, resetTransform = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => resetTransform(t0).runNow()), setTransform = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => setTransform(t0).runNow()))
      __obj.asInstanceOf[CanvasInstance]
    }
    
    extension [Self <: CanvasInstance](x: Self) {
      
      inline def setClear(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
      
      inline def setGetCanvas(value: CallbackTo[HTMLCanvasElement]): Self = StObject.set(x, "getCanvas", value.toJsFn)
      
      inline def setResetTransform(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "resetTransform", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
      
      inline def setSetTransform(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "setTransform", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The pixel ratio of the canvas.
      */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * The z-index of the canvas.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  object global {
    
    object cytoscape {
      
      @js.native
      trait Core extends StObject {
        
        /*
          * Initialize the canvas according to the given options.
          */
        def cyCanvas(): CanvasInstance = js.native
        def cyCanvas(options: Options): CanvasInstance = js.native
      }
    }
  }
}
