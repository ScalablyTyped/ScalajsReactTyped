package typingsJapgolly.cacheManager

import typingsJapgolly.cacheManager.anon.Max
import typingsJapgolly.cacheManager.distCachingMod.Cache
import typingsJapgolly.cacheManager.distCachingMod.Config
import typingsJapgolly.cacheManager.distCachingMod.Store
import typingsJapgolly.lruCache.mod.Entry
import typingsJapgolly.lruCache.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoresMemoryMod {
  
  @JSImport("cache-manager/dist/stores/memory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
  
  type Lru = typingsJapgolly.lruCache.mod.^[String, Any]
  
  type MemoryCache = Cache[MemoryStore_]
  
  type MemoryConfig = Max & (Options[String, Any]) & Config
  
  @js.native
  trait MemoryStore_
    extends StObject
       with Store {
    
    def dump(): js.Array[js.Tuple2[String, Entry[Any]]] = js.native
    @JSName("dump")
    var dump_Original: js.Function0[js.Array[js.Tuple2[String, Entry[Any]]]] = js.native
    
    def keyCount(): Double = js.native
    
    def load(cacheEntries: js.Array[js.Tuple2[String, Entry[Any]]]): Unit = js.native
    @JSName("load")
    var load_Original: js.Function1[/* cacheEntries */ js.Array[js.Tuple2[String, Entry[Any]]], Unit] = js.native
  }
}
