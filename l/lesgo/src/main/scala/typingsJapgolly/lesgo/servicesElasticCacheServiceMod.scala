package typingsJapgolly.lesgo

import typingsJapgolly.memcached.mod.Location
import typingsJapgolly.memcached.mod.^
import typingsJapgolly.memcached.mod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesElasticCacheServiceMod {
  
  @JSImport("lesgo/services/ElasticCacheService", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ElasticCacheService {
    def this(params: ElasticCacheServiceParams) = this()
    
    /* CompleteClass */
    var driver: ^ = js.native
    
    /* CompleteClass */
    override def setDriver(driver: ^): ElasticCacheService = js.native
  }
  
  trait ElasticCacheService extends StObject {
    
    var driver: ^
    
    def setDriver(driver: ^): ElasticCacheService
  }
  object ElasticCacheService {
    
    inline def apply(driver: ^, setDriver: ^ => ElasticCacheService): ElasticCacheService = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], setDriver = js.Any.fromFunction1(setDriver))
      __obj.asInstanceOf[ElasticCacheService]
    }
    
    extension [Self <: ElasticCacheService](x: Self) {
      
      inline def setDriver(value: ^): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setSetDriver(value: ^ => ElasticCacheService): Self = StObject.set(x, "setDriver", js.Any.fromFunction1(value))
    }
  }
  
  trait ElasticCacheServiceParams extends StObject {
    
    var options: MemcachedElasticCache
    
    var url: Location
  }
  object ElasticCacheServiceParams {
    
    inline def apply(options: MemcachedElasticCache, url: Location): ElasticCacheServiceParams = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElasticCacheServiceParams]
    }
    
    extension [Self <: ElasticCacheServiceParams](x: Self) {
      
      inline def setOptions(value: MemcachedElasticCache): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Location): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    }
  }
  
  trait MemcachedElasticCache
    extends StObject
       with options {
    
    var autoDiscover: js.UndefOr[Boolean] = js.undefined
    
    var autoDiscoverInterval: js.UndefOr[Double] = js.undefined
    
    var autoDiscoverOverridesRemove: js.UndefOr[Boolean] = js.undefined
  }
  object MemcachedElasticCache {
    
    inline def apply(): MemcachedElasticCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemcachedElasticCache]
    }
    
    extension [Self <: MemcachedElasticCache](x: Self) {
      
      inline def setAutoDiscover(value: Boolean): Self = StObject.set(x, "autoDiscover", value.asInstanceOf[js.Any])
      
      inline def setAutoDiscoverInterval(value: Double): Self = StObject.set(x, "autoDiscoverInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoDiscoverIntervalUndefined: Self = StObject.set(x, "autoDiscoverInterval", js.undefined)
      
      inline def setAutoDiscoverOverridesRemove(value: Boolean): Self = StObject.set(x, "autoDiscoverOverridesRemove", value.asInstanceOf[js.Any])
      
      inline def setAutoDiscoverOverridesRemoveUndefined: Self = StObject.set(x, "autoDiscoverOverridesRemove", js.undefined)
      
      inline def setAutoDiscoverUndefined: Self = StObject.set(x, "autoDiscover", js.undefined)
    }
  }
}
