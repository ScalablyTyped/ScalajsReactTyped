package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.wavesurferJs.typesUtilMod.DrawingContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDrawerDotcanvasentryMod {
  
  @JSImport("wavesurfer.js/src/drawer.canvasentry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CanvasEntry {
    
    /** Set the canvas transforms for wave and progress. */
    /* CompleteClass */
    override def applyCanvasTransforms(vertical: Boolean): Unit = js.native
    
    /** Canvas 2d context attributes. */
    /* CompleteClass */
    override val canvasContextAttributes: DrawingContextAttributes = js.native
    
    /** Clear the wave and progress rendering contexts. */
    /* CompleteClass */
    override def clearWave(): Unit = js.native
    
    /** Destroys this entry. */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Render the actual waveform line on a canvas element. */
    /* CompleteClass */
    override def drawLineToContext(
      ctx: CanvasRenderingContext2D,
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit = js.native
    
    /** Render the actual wave and progress lines. */
    /* CompleteClass */
    override def drawLines(
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit = js.native
    
    /** Draw a rounded rectangle on Canvas. */
    /* CompleteClass */
    override def drawRoundedRect(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** End of the area the canvas should render, between 0 and 1. */
    /* CompleteClass */
    override val end: Double = js.native
    
    /** Draw the actual rectangle on a canvas element. */
    /* CompleteClass */
    override def fillRectToContext(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** Draw a rectangle for wave and progress. */
    /* CompleteClass */
    override def fillRects(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    /** Utility function to handle wave color arguments. */
    /* CompleteClass */
    override def getFillStyle(ctx: CanvasRenderingContext2D, color: String): String | CanvasGradient = js.native
    
    /** Return image data of the wave canvas element. */
    /* CompleteClass */
    override def getImage(format: String, quality: Double, `type`: String): String | js.Promise[String] = js.native
    
    /** Unique identifier for this entry. */
    /* CompleteClass */
    override val id: String = js.native
    
    /** Store the progress wave canvas element and create the 2D rendering context. */
    /* CompleteClass */
    override def initProgress(element: HTMLCanvasElement): String = js.native
    
    /** Store the wave canvas element and create the 2D rendering context. */
    /* CompleteClass */
    override def initWave(element: HTMLCanvasElement): String = js.native
    
    /** The (optional) progress wave node. */
    /* CompleteClass */
    override val progress: HTMLCanvasElement = js.native
    
    /** The (optional) progress wave canvas rendering context. */
    /* CompleteClass */
    override val progressCtx: CanvasRenderingContext2D = js.native
    
    /** Set the fill styles for wave and progress. */
    /* CompleteClass */
    override def setFillStyles(waveColor: String, progressColor: String): Unit = js.native
    
    /** Start of the area the canvas should render, between 0 and 1. */
    /* CompleteClass */
    override val start: Double = js.native
    
    /** Update the dimensions. */
    /* CompleteClass */
    override def updateDimensions(elementWidth: Double, totalWidth: Double, width: Double, height: Double): Unit = js.native
    
    /** The wave node. */
    /* CompleteClass */
    override val wave: HTMLCanvasElement = js.native
    
    /** The wave canvas rendering context. */
    /* CompleteClass */
    override val waveCtx: CanvasRenderingContext2D = js.native
  }
  
  trait CanvasEntry extends StObject {
    
    /** Set the canvas transforms for wave and progress. */
    def applyCanvasTransforms(vertical: Boolean): Unit
    
    /** Canvas 2d context attributes. */
    val canvasContextAttributes: DrawingContextAttributes
    
    /** Clear the wave and progress rendering contexts. */
    def clearWave(): Unit
    
    /** Destroys this entry. */
    def destroy(): Unit
    
    /** Render the actual waveform line on a canvas element. */
    def drawLineToContext(
      ctx: CanvasRenderingContext2D,
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit
    
    /** Render the actual wave and progress lines. */
    def drawLines(
      peaks: js.Array[Double],
      absmax: Double,
      halfH: Double,
      offsetY: Double,
      start: Double,
      end: Double
    ): Unit
    
    /** Draw a rounded rectangle on Canvas. */
    def drawRoundedRect(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** End of the area the canvas should render, between 0 and 1. */
    val end: Double
    
    /** Draw the actual rectangle on a canvas element. */
    def fillRectToContext(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** Draw a rectangle for wave and progress. */
    def fillRects(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit
    
    /** Utility function to handle wave color arguments. */
    def getFillStyle(ctx: CanvasRenderingContext2D, color: String): String | CanvasGradient
    
    /** Return image data of the wave canvas element. */
    def getImage(format: String, quality: Double, `type`: String): String | js.Promise[String]
    
    /** Unique identifier for this entry. */
    val id: String
    
    /** Store the progress wave canvas element and create the 2D rendering context. */
    def initProgress(element: HTMLCanvasElement): String
    
    /** Store the wave canvas element and create the 2D rendering context. */
    def initWave(element: HTMLCanvasElement): String
    
    /** The (optional) progress wave node. */
    val progress: HTMLCanvasElement
    
    /** The (optional) progress wave canvas rendering context. */
    val progressCtx: CanvasRenderingContext2D
    
    /** Set the fill styles for wave and progress. */
    def setFillStyles(waveColor: String, progressColor: String): Unit
    
    /** Start of the area the canvas should render, between 0 and 1. */
    val start: Double
    
    /** Update the dimensions. */
    def updateDimensions(elementWidth: Double, totalWidth: Double, width: Double, height: Double): Unit
    
    /** The wave node. */
    val wave: HTMLCanvasElement
    
    /** The wave canvas rendering context. */
    val waveCtx: CanvasRenderingContext2D
  }
  object CanvasEntry {
    
    inline def apply(
      applyCanvasTransforms: Boolean => Callback,
      canvasContextAttributes: DrawingContextAttributes,
      clearWave: Callback,
      destroy: Callback,
      drawLineToContext: (CanvasRenderingContext2D, js.Array[Double], Double, Double, Double, Double, Double) => Callback,
      drawLines: (js.Array[Double], Double, Double, Double, Double, Double) => Callback,
      drawRoundedRect: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Callback,
      end: Double,
      fillRectToContext: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Callback,
      fillRects: (Double, Double, Double, Double, Double) => Callback,
      getFillStyle: (CanvasRenderingContext2D, String) => String | CanvasGradient,
      getImage: (String, Double, String) => String | js.Promise[String],
      id: String,
      initProgress: HTMLCanvasElement => String,
      initWave: HTMLCanvasElement => String,
      progress: HTMLCanvasElement,
      progressCtx: CanvasRenderingContext2D,
      setFillStyles: (String, String) => Callback,
      start: Double,
      updateDimensions: (Double, Double, Double, Double) => Callback,
      wave: HTMLCanvasElement,
      waveCtx: CanvasRenderingContext2D
    ): CanvasEntry = {
      val __obj = js.Dynamic.literal(applyCanvasTransforms = js.Any.fromFunction1((t0: Boolean) => applyCanvasTransforms(t0).runNow()), canvasContextAttributes = canvasContextAttributes.asInstanceOf[js.Any], clearWave = clearWave.toJsFn, destroy = destroy.toJsFn, drawLineToContext = js.Any.fromFunction7((t0: CanvasRenderingContext2D, t1: js.Array[Double], t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (drawLineToContext(t0, t1, t2, t3, t4, t5, t6)).runNow()), drawLines = js.Any.fromFunction6((t0: js.Array[Double], t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (drawLines(t0, t1, t2, t3, t4, t5)).runNow()), drawRoundedRect = js.Any.fromFunction6((t0: CanvasRenderingContext2D, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (drawRoundedRect(t0, t1, t2, t3, t4, t5)).runNow()), end = end.asInstanceOf[js.Any], fillRectToContext = js.Any.fromFunction6((t0: CanvasRenderingContext2D, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (fillRectToContext(t0, t1, t2, t3, t4, t5)).runNow()), fillRects = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (fillRects(t0, t1, t2, t3, t4)).runNow()), getFillStyle = js.Any.fromFunction2(getFillStyle), getImage = js.Any.fromFunction3(getImage), id = id.asInstanceOf[js.Any], initProgress = js.Any.fromFunction1(initProgress), initWave = js.Any.fromFunction1(initWave), progress = progress.asInstanceOf[js.Any], progressCtx = progressCtx.asInstanceOf[js.Any], setFillStyles = js.Any.fromFunction2((t0: String, t1: String) => (setFillStyles(t0, t1)).runNow()), start = start.asInstanceOf[js.Any], updateDimensions = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (updateDimensions(t0, t1, t2, t3)).runNow()), wave = wave.asInstanceOf[js.Any], waveCtx = waveCtx.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasEntry]
    }
    
    extension [Self <: CanvasEntry](x: Self) {
      
      inline def setApplyCanvasTransforms(value: Boolean => Callback): Self = StObject.set(x, "applyCanvasTransforms", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setCanvasContextAttributes(value: DrawingContextAttributes): Self = StObject.set(x, "canvasContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setClearWave(value: Callback): Self = StObject.set(x, "clearWave", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDrawLineToContext(
        value: (CanvasRenderingContext2D, js.Array[Double], Double, Double, Double, Double, Double) => Callback
      ): Self = StObject.set(x, "drawLineToContext", js.Any.fromFunction7((t0: CanvasRenderingContext2D, t1: js.Array[Double], t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setDrawLines(value: (js.Array[Double], Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawLines", js.Any.fromFunction6((t0: js.Array[Double], t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setDrawRoundedRect(value: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawRoundedRect", js.Any.fromFunction6((t0: CanvasRenderingContext2D, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFillRectToContext(value: (CanvasRenderingContext2D, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "fillRectToContext", js.Any.fromFunction6((t0: CanvasRenderingContext2D, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setFillRects(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "fillRects", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setGetFillStyle(value: (CanvasRenderingContext2D, String) => String | CanvasGradient): Self = StObject.set(x, "getFillStyle", js.Any.fromFunction2(value))
      
      inline def setGetImage(value: (String, Double, String) => String | js.Promise[String]): Self = StObject.set(x, "getImage", js.Any.fromFunction3(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitProgress(value: HTMLCanvasElement => String): Self = StObject.set(x, "initProgress", js.Any.fromFunction1(value))
      
      inline def setInitWave(value: HTMLCanvasElement => String): Self = StObject.set(x, "initWave", js.Any.fromFunction1(value))
      
      inline def setProgress(value: HTMLCanvasElement): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "progressCtx", value.asInstanceOf[js.Any])
      
      inline def setSetFillStyles(value: (String, String) => Callback): Self = StObject.set(x, "setFillStyles", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUpdateDimensions(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "updateDimensions", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setWave(value: HTMLCanvasElement): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
      
      inline def setWaveCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "waveCtx", value.asInstanceOf[js.Any])
    }
  }
}
