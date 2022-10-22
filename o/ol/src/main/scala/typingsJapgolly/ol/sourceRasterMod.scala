package typingsJapgolly.ol

import org.scalajs.dom.ImageData
import org.scalajs.dom.MessageEvent
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olStrings.afteroperations
import typingsJapgolly.ol.olStrings.beforeoperations
import typingsJapgolly.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceRasterMod {
  
  @JSImport("ol/source/Raster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/source/Raster", JSImport.Default)
  @js.native
  open class default protected () extends RasterSource {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Raster", "Processor")
  @js.native
  open class Processor protected ()
    extends typingsJapgolly.ol.disposableMod.default {
    def this(config: ProcessorOptions) = this()
    
    /**
      * Dispatch a job.
      */
    def _dispatch(): Unit = js.native
    
    /**
      * Add a job to the queue.
      */
    def _enqueue(job: Any): Unit = js.native
    
    /**
      * Handle messages from the worker.
      */
    def _onWorkerMessage(index: Double, event: MessageEvent): Unit = js.native
    
    /**
      * Resolve a job.  If there are no more worker threads, the processor callback
      * will be called.
      */
    def _resolveJob(): Unit = js.native
    
    /**
      * Run operation on input data.
      */
    def process(
      inputs: js.Array[js.Array[Any] | ImageData],
      meta: Any,
      callback: js.Function3[/* p0 */ js.Error, /* p1 */ ImageData, /* p2 */ js.Object, Unit]
    ): Unit = js.native
  }
  
  @js.native
  sealed trait RasterOperationType extends StObject
  /**
    * Raster operation type. Supported values are 'pixel' and 'image'.
    */
  @JSImport("ol/source/Raster", "RasterOperationType")
  @js.native
  object RasterOperationType extends StObject {
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with RasterOperationType
    
    @js.native
    sealed trait PIXEL
      extends StObject
         with RasterOperationType
  }
  
  @JSImport("ol/source/Raster", "RasterSourceEvent")
  @js.native
  open class RasterSourceEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(`type`: String, frameState: FrameState, data: Any) = this()
    
    /**
      * An object made available to all operations.  This can be used by operations
      * as a storage object (e.g. for calculating statistics).
      */
    var data: Any = js.native
    
    /**
      * The raster extent.
      */
    var extent: Extent = js.native
    
    /**
      * The pixel resolution (map units per pixel).
      */
    var resolution: Double = js.native
  }
  
  inline def newImageData(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("newImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  trait FauxMessageEvent extends StObject {
    
    var data: Any
  }
  object FauxMessageEvent {
    
    inline def apply(data: Any): FauxMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FauxMessageEvent]
    }
    
    extension [Self <: FauxMessageEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type Operation = js.Function2[
    /* p0 */ js.Array[js.Array[Double] | ImageData], 
    /* p1 */ js.Object, 
    js.Array[Double] | ImageData
  ]
  
  trait Options extends StObject {
    
    var lib: js.UndefOr[Any] = js.undefined
    
    var operation: js.UndefOr[Operation] = js.undefined
    
    var operationType: js.UndefOr[RasterOperationType] = js.undefined
    
    var sources: js.Array[
        typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
      ]
    
    var threads: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(
      sources: js.Array[
          typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ]
    ): Options = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLib(value: Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setOperation(
        value: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => js.Array[Double] | ImageData
      ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setOperationType(value: RasterOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setSources(
        value: js.Array[
              typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
            ]
      ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(
        value: (typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default])*
      ): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  trait ProcessorOptions extends StObject {
    
    var imageOps: js.UndefOr[Boolean] = js.undefined
    
    var lib: js.UndefOr[Any] = js.undefined
    
    def operation(p0: js.Array[Any], p1: js.Object): Any
    
    var queue: Double
    
    var threads: Double
  }
  object ProcessorOptions {
    
    inline def apply(operation: (js.Array[Any], js.Object) => Any, queue: Double, threads: Double): ProcessorOptions = {
      val __obj = js.Dynamic.literal(operation = js.Any.fromFunction2(operation), queue = queue.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorOptions]
    }
    
    extension [Self <: ProcessorOptions](x: Self) {
      
      inline def setImageOps(value: Boolean): Self = StObject.set(x, "imageOps", value.asInstanceOf[js.Any])
      
      inline def setImageOpsUndefined: Self = StObject.set(x, "imageOps", js.undefined)
      
      inline def setLib(value: Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setOperation(value: (js.Array[Any], js.Object) => Any): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RasterSource
    extends typingsJapgolly.ol.sourceImageMod.default {
    
    @JSName("on")
    def on_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the operation.
      */
    def setOperation(operation: Operation): Unit = js.native
    def setOperation(operation: Operation, opt_lib: Any): Unit = js.native
    
    @JSName("un")
    def un_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
  }
}
