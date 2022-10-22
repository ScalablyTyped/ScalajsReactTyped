package typingsJapgolly.resourceLoader

import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.AbstractLoadStrategy
import typingsJapgolly.resourceLoader.distLoadStrategiesAbstractLoadStrategyMod.ILoadConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadStrategiesXhrLoadStrategyMod {
  
  @JSImport("resource-loader/dist/load_strategies/XhrLoadStrategy", "XhrLoadStrategy")
  @js.native
  open class XhrLoadStrategy protected () extends AbstractLoadStrategy[IXhrLoadConfig] {
    def this(config: IXhrLoadConfig) = this()
    
    /* private */ var _boundOnAbort: Any = js.native
    
    /* private */ var _boundOnError: Any = js.native
    
    /* private */ var _boundOnLoad: Any = js.native
    
    /* private */ var _boundOnProgress: Any = js.native
    
    /* private */ var _boundOnTimeout: Any = js.native
    
    /* private */ var _clearEvents: Any = js.native
    
    /* private */ var _complete: Any = js.native
    
    /* private */ var _createRequest: Any = js.native
    
    /* private */ var _determineXhrType: Any = js.native
    
    /* private */ var _error: Any = js.native
    
    /* private */ var _onAbort: Any = js.native
    
    /* private */ var _onError: Any = js.native
    
    /* private */ var _onLoad: Any = js.native
    
    /* private */ var _onProgress: Any = js.native
    
    /* private */ var _onTimeout: Any = js.native
    
    /* private */ var _parseDocument: Any = js.native
    
    /* private */ var _parseJson: Any = js.native
    
    /* private */ var _xhr: Any = js.native
    
    /* private */ var _xhrType: Any = js.native
  }
  /* static members */
  object XhrLoadStrategy {
    
    @JSImport("resource-loader/dist/load_strategies/XhrLoadStrategy", "XhrLoadStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader/dist/load_strategies/XhrLoadStrategy", "XhrLoadStrategy.ResponseType")
    @js.native
    val ResponseType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof XhrResponseType */ Any = js.native
    
    @JSImport("resource-loader/dist/load_strategies/XhrLoadStrategy", "XhrLoadStrategy._xhrTypeMap")
    @js.native
    def _xhrTypeMap: Any = js.native
    inline def _xhrTypeMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_xhrTypeMap")(x.asInstanceOf[js.Any])
    
    inline def setExtensionXhrType(extname: String, xhrType: XhrResponseType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait XhrResponseType extends StObject
  @JSImport("resource-loader/dist/load_strategies/XhrLoadStrategy", "XhrResponseType")
  @js.native
  object XhrResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[XhrResponseType & String] = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with XhrResponseType
    /* "blob" */ val Blob: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Blob & String = js.native
    
    @js.native
    sealed trait Buffer
      extends StObject
         with XhrResponseType
    /* "arraybuffer" */ val Buffer: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Buffer & String = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with XhrResponseType
    /* "text" */ val Default: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Default & String = js.native
    
    @js.native
    sealed trait Document
      extends StObject
         with XhrResponseType
    /* "document" */ val Document: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Document & String = js.native
    
    @js.native
    sealed trait Json
      extends StObject
         with XhrResponseType
    /* "json" */ val Json: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Json & String = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with XhrResponseType
    /* "text" */ val Text: typingsJapgolly.resourceLoader.distLoadStrategiesXhrLoadStrategyMod.XhrResponseType.Text & String = js.native
  }
  
  trait IXhrLoadConfig
    extends StObject
       with ILoadConfig {
    
    var xhrType: js.UndefOr[XhrResponseType] = js.undefined
  }
  object IXhrLoadConfig {
    
    inline def apply(url: String): IXhrLoadConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXhrLoadConfig]
    }
    
    extension [Self <: IXhrLoadConfig](x: Self) {
      
      inline def setXhrType(value: XhrResponseType): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
      
      inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
    }
  }
}
