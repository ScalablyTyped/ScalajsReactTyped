package typingsJapgolly.gifJs

import org.scalajs.dom.Blob
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.ImageData
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.gifJs.gifJsStrings.abort
import typingsJapgolly.gifJs.gifJsStrings.background
import typingsJapgolly.gifJs.gifJsStrings.debug
import typingsJapgolly.gifJs.gifJsStrings.dither
import typingsJapgolly.gifJs.gifJsStrings.finished
import typingsJapgolly.gifJs.gifJsStrings.height
import typingsJapgolly.gifJs.gifJsStrings.progress
import typingsJapgolly.gifJs.gifJsStrings.quality
import typingsJapgolly.gifJs.gifJsStrings.repeat
import typingsJapgolly.gifJs.gifJsStrings.start
import typingsJapgolly.gifJs.gifJsStrings.transparent
import typingsJapgolly.gifJs.gifJsStrings.width
import typingsJapgolly.gifJs.gifJsStrings.workerScript
import typingsJapgolly.gifJs.gifJsStrings.workers
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gif.js", JSImport.Namespace)
  @js.native
  open class ^ () extends GIF {
    def this(options: Options) = this()
  }
  
  trait AddFrameOptions extends StObject {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var dispose: js.UndefOr[Double] = js.undefined
  }
  object AddFrameOptions {
    
    inline def apply(): AddFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddFrameOptions]
    }
    
    extension [Self <: AddFrameOptions](x: Self) {
      
      inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDispose(value: Double): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gifJs.gifJsStrings.FloydSteinberg
    - typingsJapgolly.gifJs.gifJsStrings.`FloydSteinberg-serpentine`
    - typingsJapgolly.gifJs.gifJsStrings.FalseFloydSteinberg
    - typingsJapgolly.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine`
    - typingsJapgolly.gifJs.gifJsStrings.Stucki
    - typingsJapgolly.gifJs.gifJsStrings.`Stucki-serpentine`
    - typingsJapgolly.gifJs.gifJsStrings.Atkinson
    - typingsJapgolly.gifJs.gifJsStrings.`Atkinson-serpentine`
  */
  trait DitherMethod extends StObject
  object DitherMethod {
    
    inline def Atkinson: typingsJapgolly.gifJs.gifJsStrings.Atkinson = "Atkinson".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.Atkinson]
    
    inline def `Atkinson-serpentine`: typingsJapgolly.gifJs.gifJsStrings.`Atkinson-serpentine` = "Atkinson-serpentine".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.`Atkinson-serpentine`]
    
    inline def FalseFloydSteinberg: typingsJapgolly.gifJs.gifJsStrings.FalseFloydSteinberg = "FalseFloydSteinberg".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.FalseFloydSteinberg]
    
    inline def `FalseFloydSteinberg-serpentine`: typingsJapgolly.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine` = "FalseFloydSteinberg-serpentine".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine`]
    
    inline def FloydSteinberg: typingsJapgolly.gifJs.gifJsStrings.FloydSteinberg = "FloydSteinberg".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.FloydSteinberg]
    
    inline def `FloydSteinberg-serpentine`: typingsJapgolly.gifJs.gifJsStrings.`FloydSteinberg-serpentine` = "FloydSteinberg-serpentine".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.`FloydSteinberg-serpentine`]
    
    inline def Stucki: typingsJapgolly.gifJs.gifJsStrings.Stucki = "Stucki".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.Stucki]
    
    inline def `Stucki-serpentine`: typingsJapgolly.gifJs.gifJsStrings.`Stucki-serpentine` = "Stucki-serpentine".asInstanceOf[typingsJapgolly.gifJs.gifJsStrings.`Stucki-serpentine`]
  }
  
  @js.native
  trait GIF extends EventEmitter {
    
    def abort(): Unit = js.native
    
    def addFrame(image: CanvasRenderingContext2D): Unit = js.native
    def addFrame(image: CanvasRenderingContext2D, options: AddFrameOptions): Unit = js.native
    def addFrame(image: ImageData): Unit = js.native
    def addFrame(image: ImageData, options: AddFrameOptions): Unit = js.native
    def addFrame(image: WebGLRenderingContext): Unit = js.native
    def addFrame(image: WebGLRenderingContext, options: AddFrameOptions): Unit = js.native
    def addFrame(image: CanvasImageSource): Unit = js.native
    def addFrame(image: CanvasImageSource, options: AddFrameOptions): Unit = js.native
    
    def on(event: abort | start, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_finished(
      event: finished,
      listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    
    def once(event: abort | start, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_finished(
      event: finished,
      listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    
    def render(): Unit = js.native
    
    val running: Boolean = js.native
    
    @JSName("setOption")
    def setOption_background(key: background): Unit = js.native
    @JSName("setOption")
    def setOption_background(key: background, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_debug(key: debug): Unit = js.native
    @JSName("setOption")
    def setOption_debug(key: debug, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither, value: DitherMethod): Unit = js.native
    @JSName("setOption")
    def setOption_height(key: height): Unit = js.native
    @JSName("setOption")
    def setOption_height(key: height, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_quality(key: quality): Unit = js.native
    @JSName("setOption")
    def setOption_quality(key: quality, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_repeat(key: repeat): Unit = js.native
    @JSName("setOption")
    def setOption_repeat(key: repeat, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_transparent(key: transparent): Unit = js.native
    @JSName("setOption")
    def setOption_transparent(key: transparent, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_width(key: width): Unit = js.native
    @JSName("setOption")
    def setOption_width(key: width, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_workerScript(key: workerScript): Unit = js.native
    @JSName("setOption")
    def setOption_workerScript(key: workerScript, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_workers(key: workers): Unit = js.native
    @JSName("setOption")
    def setOption_workers(key: workers, value: Double): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dither: js.UndefOr[DitherMethod | Boolean] = js.undefined
    
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var repeat: js.UndefOr[Double] = js.undefined
    
    var transparent: js.UndefOr[String | Null] = js.undefined
    
    var width: js.UndefOr[Double | Null] = js.undefined
    
    var workerScript: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDither(value: DitherMethod | Boolean): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
      
      inline def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setTransparent(value: String): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentNull: Self = StObject.set(x, "transparent", null)
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      inline def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
}
