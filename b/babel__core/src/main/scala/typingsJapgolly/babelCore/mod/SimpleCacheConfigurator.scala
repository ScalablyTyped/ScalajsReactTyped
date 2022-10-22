package typingsJapgolly.babelCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleCacheConfigurator extends StObject {
  
  // there is an undocumented call signature that is a shorthand for forever()/never()/using().
  // (ever: boolean): void
  // <T extends SimpleCacheKey>(callback: CacheCallback<T>): T
  /**
    * Permacache the computed config and never call the function again.
    */
  def forever(): Unit
  
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and all entries in the cache will
    * be replaced with the result.
    *
    * @example
    * api.cache.invalidate(() => process.env.NODE_ENV)
    */
  def invalidate[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T
  
  /**
    * Do not cache this config, and re-execute the function every time.
    */
  def never(): Unit
  
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and a new entry will be added to the cache.
    *
    * @example
    * api.cache.using(() => process.env.NODE_ENV)
    */
  def `using`[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T
}
object SimpleCacheConfigurator {
  
  inline def apply(
    forever: Callback,
    invalidate: SimpleCacheCallback[Any] => Any,
    never: Callback,
    `using`: SimpleCacheCallback[Any] => Any
  ): SimpleCacheConfigurator = {
    val __obj = js.Dynamic.literal(forever = forever.toJsFn, invalidate = js.Any.fromFunction1(invalidate), never = never.toJsFn)
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[SimpleCacheConfigurator]
  }
  
  extension [Self <: SimpleCacheConfigurator](x: Self) {
    
    inline def setForever(value: Callback): Self = StObject.set(x, "forever", value.toJsFn)
    
    inline def setInvalidate(value: SimpleCacheCallback[Any] => Any): Self = StObject.set(x, "invalidate", js.Any.fromFunction1(value))
    
    inline def setNever(value: Callback): Self = StObject.set(x, "never", value.toJsFn)
    
    inline def setUsing(value: SimpleCacheCallback[Any] => Any): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
  }
}
