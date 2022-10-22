package typingsJapgolly.workboxStrategies

import org.scalajs.dom.RequestInit
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

object networkOnlyMod {
  
  @JSImport("workbox-strategies/NetworkOnly", "NetworkOnly")
  @js.native
  open class NetworkOnly ()
    extends StObject
       with RouteHandlerObject {
    def this(options: NetworkOnlyOptions) = this()
    
    /* CompleteClass */
    override def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
    /* CompleteClass */
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  trait NetworkOnlyOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object NetworkOnlyOptions {
    
    inline def apply(): NetworkOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkOnlyOptions]
    }
    
    extension [Self <: NetworkOnlyOptions](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
