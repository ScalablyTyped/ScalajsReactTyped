package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconImageCacheMod {
  
  @JSImport("ol/style/IconImageCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/IconImageCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IconImageCache {
    
    /* CompleteClass */
    override def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def expire(): Unit = js.native
    
    /* CompleteClass */
    override def get(src: String, crossOrigin: String, color: Color): typingsJapgolly.ol.styleIconImageMod.default = js.native
    
    /* CompleteClass */
    override def set(
      src: String,
      crossOrigin: String,
      color: Color,
      iconImage: typingsJapgolly.ol.styleIconImageMod.default
    ): Unit = js.native
    
    /**
      * Set the cache size of the icon cache. Default is 32. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      */
    /* CompleteClass */
    override def setSize(maxCacheSize: Double): Unit = js.native
  }
  
  inline def shared(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shared")().asInstanceOf[Unit]
  
  trait IconImageCache extends StObject {
    
    def canExpireCache(): Boolean
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit
    
    /**
      * FIXME empty description for jsdoc
      */
    def expire(): Unit
    
    def get(src: String, crossOrigin: String, color: Color): typingsJapgolly.ol.styleIconImageMod.default
    
    def set(
      src: String,
      crossOrigin: String,
      color: Color,
      iconImage: typingsJapgolly.ol.styleIconImageMod.default
    ): Unit
    
    /**
      * Set the cache size of the icon cache. Default is 32. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      */
    def setSize(maxCacheSize: Double): Unit
  }
  object IconImageCache {
    
    inline def apply(
      canExpireCache: CallbackTo[Boolean],
      clear: Callback,
      expire: Callback,
      get: (String, String, Color) => typingsJapgolly.ol.styleIconImageMod.default,
      set: (String, String, Color, typingsJapgolly.ol.styleIconImageMod.default) => Callback,
      setSize: Double => Callback
    ): IconImageCache = {
      val __obj = js.Dynamic.literal(canExpireCache = canExpireCache.toJsFn, clear = clear.toJsFn, expire = expire.toJsFn, get = js.Any.fromFunction3(get), set = js.Any.fromFunction4((t0: String, t1: String, t2: Color, t3: typingsJapgolly.ol.styleIconImageMod.default) => (set(t0, t1, t2, t3)).runNow()), setSize = js.Any.fromFunction1((t0: Double) => setSize(t0).runNow()))
      __obj.asInstanceOf[IconImageCache]
    }
    
    extension [Self <: IconImageCache](x: Self) {
      
      inline def setCanExpireCache(value: CallbackTo[Boolean]): Self = StObject.set(x, "canExpireCache", value.toJsFn)
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setExpire(value: Callback): Self = StObject.set(x, "expire", value.toJsFn)
      
      inline def setGet(value: (String, String, Color) => typingsJapgolly.ol.styleIconImageMod.default): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setSet(value: (String, String, Color, typingsJapgolly.ol.styleIconImageMod.default) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: String, t1: String, t2: Color, t3: typingsJapgolly.ol.styleIconImageMod.default) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setSetSize(value: Double => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
