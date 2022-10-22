package typingsJapgolly.cacheManager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cacheManager.distCachingMod.Cache
import typingsJapgolly.cacheManager.distCachingMod.Store
import typingsJapgolly.cacheManager.distCachingMod.Ttl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMultiCachingMod {
  
  @JSImport("cache-manager/dist/multi-caching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiCaching[Caches /* <: js.Array[Cache[Store]] */](caches: Caches): MultiCache = ^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(caches.asInstanceOf[js.Any]).asInstanceOf[MultiCache]
  
  /* Inlined std.Omit<cache-manager.cache-manager/dist/caching.Cache<cache-manager.cache-manager/dist/caching.Store>, 'store'> */
  trait MultiCache extends StObject {
    
    def del(key: String): js.Promise[Unit]
    @JSName("del")
    var del_Original: js.Function1[/* key */ String, js.Promise[Unit]]
    
    def get[T](key: String): js.Promise[js.UndefOr[T]]
    @JSName("get")
    var get_Original: js.Function1[/* key */ String, js.Promise[js.UndefOr[Any]]]
    
    def reset(): js.Promise[Unit]
    @JSName("reset")
    var reset_Original: js.Function0[js.Promise[Unit]]
    
    def set(key: String, value: Any): js.Promise[Unit]
    def set(key: String, value: Any, ttl: Ttl): js.Promise[Unit]
    @JSName("set")
    var set_Original: js.Function3[/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl], js.Promise[Unit]]
    
    def wrap[T](key: String, fn: js.Function0[js.Promise[T]]): js.Promise[T]
    @JSName("wrap")
    var wrap_Original: js.Function2[/* key */ String, /* fn */ js.Function0[js.Promise[Any]], js.Promise[Any]]
  }
  object MultiCache {
    
    inline def apply(
      del: /* key */ String => js.Promise[Unit],
      get: /* key */ String => js.Promise[js.UndefOr[Any]],
      reset: CallbackTo[js.Promise[Unit]],
      set: (/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl]) => js.Promise[Unit],
      wrap: (/* key */ String, /* fn */ js.Function0[js.Promise[Any]]) => js.Promise[Any]
    ): MultiCache = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), reset = reset.toJsFn, set = js.Any.fromFunction3(set), wrap = js.Any.fromFunction2(wrap))
      __obj.asInstanceOf[MultiCache]
    }
    
    extension [Self <: MultiCache](x: Self) {
      
      inline def setDel(value: /* key */ String => js.Promise[Unit]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setGet(value: /* key */ String => js.Promise[js.UndefOr[Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setReset(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: (/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl]) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setWrap(value: (/* key */ String, /* fn */ js.Function0[js.Promise[Any]]) => js.Promise[Any]): Self = StObject.set(x, "wrap", js.Any.fromFunction2(value))
    }
  }
}
