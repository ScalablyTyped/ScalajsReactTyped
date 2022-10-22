package typingsJapgolly.resourceLoader

import typingsJapgolly.resourceLoader.anon.TypeofLoader
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategyCtor
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.ILoadConfig
import typingsJapgolly.resourceLoader.distLoadStrategiesImageLoadStrategyMod.IImageLoadConfig
import typingsJapgolly.resourceLoader.distLoadStrategiesMediaElementLoadStrategyMod.IMediaElementLoadConfig
import typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.IXhrLoadConfig
import typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType
import typingsJapgolly.resourceLoader.distLoaderMod.Loader.MiddlewareFn
import typingsJapgolly.resourceLoader.distResourceMod.IResourceOptions
import typingsJapgolly.resourceLoader.resourceLoaderStrings.audio
import typingsJapgolly.resourceLoader.resourceLoaderStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("resource-loader", "AbstractLoadStrategy")
  @js.native
  open class AbstractLoadStrategy[C /* <: ILoadConfig */] protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy[C] {
    def this(config: C) = this()
  }
  
  @JSImport("resource-loader", "AudioLoadStrategy")
  @js.native
  open class AudioLoadStrategy protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesAudioLoadStrategyMod.AudioLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "ImageLoadStrategy")
  @js.native
  open class ImageLoadStrategy protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesImageLoadStrategyMod.ImageLoadStrategy {
    def this(config: IImageLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "Loader")
  @js.native
  open class Loader ()
    extends typingsJapgolly.resourceLoader.distLoaderMod.Loader {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, concurrency: Double) = this()
    def this(baseUrl: Unit, concurrency: Double) = this()
  }
  /* static members */
  object Loader {
    
    @JSImport("resource-loader", "Loader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "Loader.DefaultMiddlewarePriority")
    @js.native
    val DefaultMiddlewarePriority: /* 50 */ Double = js.native
    
    @JSImport("resource-loader", "Loader._defaultMiddleware")
    @js.native
    def _defaultMiddleware: Any = js.native
    inline def _defaultMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMiddleware")(x.asInstanceOf[js.Any])
    
    inline def use(fn: MiddlewareFn): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
    inline def use(fn: MiddlewareFn, priority: Double): TypeofLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[TypeofLoader]
  }
  
  /* note: abstract class */ @JSImport("resource-loader", "MediaElementLoadStrategy")
  @js.native
  open class MediaElementLoadStrategy protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesMediaElementLoadStrategyMod.MediaElementLoadStrategy {
    def this(config: IMediaElementLoadConfig, elementType: audio | video) = this()
  }
  
  @JSImport("resource-loader", "Resource")
  @js.native
  open class Resource protected ()
    extends typingsJapgolly.resourceLoader.distResourceMod.Resource {
    def this(name: String, options: IResourceOptions) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("resource-loader", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "Resource._defaultLoadStrategy")
    @js.native
    def _defaultLoadStrategy: Any = js.native
    inline def _defaultLoadStrategy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultLoadStrategy")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader", "Resource._loadStrategyMap")
    @js.native
    def _loadStrategyMap: Any = js.native
    inline def _loadStrategyMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_loadStrategyMap")(x.asInstanceOf[js.Any])
    
    @JSImport("resource-loader", "Resource._tempAnchor")
    @js.native
    def _tempAnchor: Any = js.native
    inline def _tempAnchor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tempAnchor")(x.asInstanceOf[js.Any])
    
    inline def setDefaultLoadStrategy(strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLoadStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLoadStrategy(extname: String, strategy: AbstractLoadStrategyCtor[ILoadConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLoadStrategy")(extname.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("resource-loader", "ResourceState")
  @js.native
  object ResourceState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState & Double] = js.native
    
    /* 2 */ val Complete: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.Complete & Double = js.native
    
    /* 1 */ val Loading: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.Loading & Double = js.native
    
    /* 0 */ val NotStarted: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.NotStarted & Double = js.native
  }
  
  @JSImport("resource-loader", "ResourceType")
  @js.native
  object ResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType & Double] = js.native
    
    /* 6 */ val Audio: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Audio & Double = js.native
    
    /* 2 */ val Blob: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Blob & Double = js.native
    
    /* 1 */ val Buffer: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Buffer & Double = js.native
    
    /* 5 */ val Image: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Image & Double = js.native
    
    /* 3 */ val Json: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Json & Double = js.native
    
    /* 8 */ val Text: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Text & Double = js.native
    
    /* 0 */ val Unknown: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Unknown & Double = js.native
    
    /* 7 */ val Video: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Video & Double = js.native
    
    /* 4 */ val Xml: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Xml & Double = js.native
  }
  
  @JSImport("resource-loader", "VideoLoadStrategy")
  @js.native
  open class VideoLoadStrategy protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesVideoLoadStrategyMod.VideoLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
  
  @JSImport("resource-loader", "XhrLoadStrategy")
  @js.native
  open class XhrLoadStrategy protected ()
    extends typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrLoadStrategy {
    def this(config: IXhrLoadConfig) = this()
  }
  /* static members */
  object XhrLoadStrategy {
    
    @JSImport("resource-loader", "XhrLoadStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader", "XhrLoadStrategy.ResponseType")
    @js.native
    val ResponseType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof XhrResponseType */ Any = js.native
    
    @JSImport("resource-loader", "XhrLoadStrategy._xhrTypeMap")
    @js.native
    def _xhrTypeMap: Any = js.native
    inline def _xhrTypeMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_xhrTypeMap")(x.asInstanceOf[js.Any])
    
    inline def setExtensionXhrType(extname: String, xhrType: XhrResponseType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("resource-loader", "XhrResponseType")
  @js.native
  object XhrResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType & String
      ] = js.native
    
    /* "blob" */ val Blob: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Blob & String = js.native
    
    /* "arraybuffer" */ val Buffer: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Buffer & String = js.native
    
    /* "text" */ val Default: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Default & String = js.native
    
    /* "document" */ val Document: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Document & String = js.native
    
    /* "json" */ val Json: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Json & String = js.native
    
    /* "text" */ val Text: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Text & String = js.native
  }
}
