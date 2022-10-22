package typingsJapgolly.cacheManagerIoredis

import typingsJapgolly.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterOptions
import typingsJapgolly.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClusterConfig extends StObject {
    
    var clusterConfig: ClusterOptions
    
    var max: js.UndefOr[Double] = js.undefined
    
    var store: RedisStoreConstructor
  }
  object ClusterConfig {
    
    inline def apply(clusterConfig: ClusterOptions, store: RedisStoreConstructor): ClusterConfig = {
      val __obj = js.Dynamic.literal(clusterConfig = clusterConfig.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterConfig]
    }
    
    extension [Self <: ClusterConfig](x: Self) {
      
      inline def setClusterConfig(value: ClusterOptions): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var store: RedisStoreConstructor
  }
  object Max {
    
    inline def apply(store: RedisStoreConstructor): Max = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
