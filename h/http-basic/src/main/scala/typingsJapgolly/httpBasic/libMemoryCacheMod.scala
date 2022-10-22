package typingsJapgolly.httpBasic

import japgolly.scalajs.react.Callback
import typingsJapgolly.httpBasic.anon.PickCachedResponseheaders
import typingsJapgolly.httpBasic.libCachedResponseMod.CachedResponse
import typingsJapgolly.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMemoryCacheMod {
  
  @JSImport("http-basic/lib/MemoryCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MemoryCache {
    
    /* private */ /* CompleteClass */
    override val _cache: Any = js.native
    
    /* CompleteClass */
    override def getResponse(
      url: String,
      callback: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def invalidateResponse(url: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def setResponse(url: String, response: CachedResponse): Unit = js.native
    
    /* CompleteClass */
    override def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
  
  trait MemoryCache extends StObject {
    
    /* private */ val _cache: Any
    
    def getResponse(
      url: String,
      callback: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]
    ): Unit
    
    def invalidateResponse(url: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit
    
    def setResponse(url: String, response: CachedResponse): Unit
    
    def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit
  }
  object MemoryCache {
    
    inline def apply(
      _cache: Any,
      getResponse: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Callback,
      invalidateResponse: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Callback,
      setResponse: (String, CachedResponse) => Callback,
      updateResponseHeaders: (String, PickCachedResponseheaders) => Callback
    ): MemoryCache = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], getResponse = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => (getResponse(t0, t1)).runNow()), invalidateResponse = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ErrnoException | Null, Unit]) => (invalidateResponse(t0, t1)).runNow()), setResponse = js.Any.fromFunction2((t0: String, t1: CachedResponse) => (setResponse(t0, t1)).runNow()), updateResponseHeaders = js.Any.fromFunction2((t0: String, t1: PickCachedResponseheaders) => (updateResponseHeaders(t0, t1)).runNow()))
      __obj.asInstanceOf[MemoryCache]
    }
    
    extension [Self <: MemoryCache](x: Self) {
      
      inline def setGetResponse(
        value: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Callback
      ): Self = StObject.set(x, "getResponse", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setInvalidateResponse(value: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Callback): Self = StObject.set(x, "invalidateResponse", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ErrnoException | Null, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetResponse(value: (String, CachedResponse) => Callback): Self = StObject.set(x, "setResponse", js.Any.fromFunction2((t0: String, t1: CachedResponse) => (value(t0, t1)).runNow()))
      
      inline def setUpdateResponseHeaders(value: (String, PickCachedResponseheaders) => Callback): Self = StObject.set(x, "updateResponseHeaders", js.Any.fromFunction2((t0: String, t1: PickCachedResponseheaders) => (value(t0, t1)).runNow()))
      
      inline def set_cache(value: Any): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
    }
  }
}
