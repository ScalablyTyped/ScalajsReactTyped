package typingsJapgolly.achingbrainSsdp

import japgolly.scalajs.react.Callback
import typingsJapgolly.achingbrainSsdp.mod.Service
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCacheMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/cache", "cache")
  @js.native
  val cache: Cache_ = js.native
  
  trait Cache_ extends StObject {
    
    def cacheService(service: Service[Record[String, Any]]): Unit
    
    def clear(): Unit
    
    def deleteService(serviceType: String, uniqueServiceName: String): Unit
    
    def getService(serviceType: String, uniqueServiceName: String): js.UndefOr[Service[Record[String, Any]]]
    
    def hasService(serviceType: String, uniqueServiceName: String): Boolean
    
    /* private */ var services: Any
  }
  object Cache_ {
    
    inline def apply(
      cacheService: Service[Record[String, Any]] => Callback,
      clear: Callback,
      deleteService: (String, String) => Callback,
      getService: (String, String) => js.UndefOr[Service[Record[String, Any]]],
      hasService: (String, String) => Boolean,
      services: Any
    ): Cache_ = {
      val __obj = js.Dynamic.literal(cacheService = js.Any.fromFunction1((t0: Service[Record[String, Any]]) => cacheService(t0).runNow()), clear = clear.toJsFn, deleteService = js.Any.fromFunction2((t0: String, t1: String) => (deleteService(t0, t1)).runNow()), getService = js.Any.fromFunction2(getService), hasService = js.Any.fromFunction2(hasService), services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache_]
    }
    
    extension [Self <: Cache_](x: Self) {
      
      inline def setCacheService(value: Service[Record[String, Any]] => Callback): Self = StObject.set(x, "cacheService", js.Any.fromFunction1((t0: Service[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDeleteService(value: (String, String) => Callback): Self = StObject.set(x, "deleteService", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setGetService(value: (String, String) => js.UndefOr[Service[Record[String, Any]]]): Self = StObject.set(x, "getService", js.Any.fromFunction2(value))
      
      inline def setHasService(value: (String, String) => Boolean): Self = StObject.set(x, "hasService", js.Any.fromFunction2(value))
      
      inline def setServices(value: Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    }
  }
}
