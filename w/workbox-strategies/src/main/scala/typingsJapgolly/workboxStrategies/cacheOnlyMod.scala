package typingsJapgolly.workboxStrategies

import org.scalajs.dom.CacheQueryOptions
import org.scalajs.dom.Response
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerCallback
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerCallbackContext
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerObject
import typingsJapgolly.workboxStrategies.typesMakeRequestCallbackMod.MakeRequestCallback
import typingsJapgolly.workboxStrategies.typesMakeRequestCallbackMod.MakeRequestCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheOnlyMod {
  
  @JSImport("workbox-strategies/CacheOnly", "CacheOnly")
  @js.native
  open class CacheOnly ()
    extends StObject
       with RouteHandlerObject {
    def this(options: CacheOnlyOptions) = this()
    
    /* CompleteClass */
    override def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
    /* CompleteClass */
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  trait CacheOnlyOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object CacheOnlyOptions {
    
    inline def apply(): CacheOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOnlyOptions]
    }
    
    extension [Self <: CacheOnlyOptions](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
