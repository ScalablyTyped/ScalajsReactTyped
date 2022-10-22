package typingsJapgolly.cacheManager

import typingsJapgolly.cacheManager.cacheManagerStrings.memory
import typingsJapgolly.cacheManager.distCachingMod.Cache
import typingsJapgolly.cacheManager.distCachingMod.FactoryConfig
import typingsJapgolly.cacheManager.distCachingMod.FactoryStore
import typingsJapgolly.cacheManager.distCachingMod.Store
import typingsJapgolly.cacheManager.distMultiCachingMod.MultiCache
import typingsJapgolly.cacheManager.distStoresMemoryMod.MemoryCache
import typingsJapgolly.cacheManager.distStoresMemoryMod.MemoryConfig
import typingsJapgolly.cacheManager.distStoresMemoryMod.MemoryStore_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cache-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caching[S /* <: Store */](store: S): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T]): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T], args: FactoryConfig[T]): js.Promise[Cache[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cache[S]]]
  
  inline def caching_memory(name: memory): js.Promise[MemoryCache] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryCache]]
  inline def caching_memory(name: memory, args: MemoryConfig): js.Promise[MemoryCache] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MemoryCache]]
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
  
  inline def multiCaching[Caches /* <: js.Array[Cache[Store]] */](caches: Caches): MultiCache = ^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(caches.asInstanceOf[js.Any]).asInstanceOf[MultiCache]
}
