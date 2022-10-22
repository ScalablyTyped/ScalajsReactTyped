package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrDirectContext
  extends StObject
     with EmbindObject[GrDirectContext] {
  
  def getResourceCacheLimitBytes(): Double
  
  def getResourceCacheUsageBytes(): Double
  
  def releaseResourcesAndAbandonContext(): Unit
  
  def setResourceCacheLimitBytes(bytes: Double): Unit
}
object GrDirectContext {
  
  inline def apply(
    delete: Callback,
    deleteLater: Callback,
    getResourceCacheLimitBytes: CallbackTo[Double],
    getResourceCacheUsageBytes: CallbackTo[Double],
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    releaseResourcesAndAbandonContext: Callback,
    setResourceCacheLimitBytes: Double => Callback
  ): GrDirectContext = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, getResourceCacheLimitBytes = getResourceCacheLimitBytes.toJsFn, getResourceCacheUsageBytes = getResourceCacheUsageBytes.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, releaseResourcesAndAbandonContext = releaseResourcesAndAbandonContext.toJsFn, setResourceCacheLimitBytes = js.Any.fromFunction1((t0: Double) => setResourceCacheLimitBytes(t0).runNow()))
    __obj.asInstanceOf[GrDirectContext]
  }
  
  extension [Self <: GrDirectContext](x: Self) {
    
    inline def setGetResourceCacheLimitBytes(value: CallbackTo[Double]): Self = StObject.set(x, "getResourceCacheLimitBytes", value.toJsFn)
    
    inline def setGetResourceCacheUsageBytes(value: CallbackTo[Double]): Self = StObject.set(x, "getResourceCacheUsageBytes", value.toJsFn)
    
    inline def setReleaseResourcesAndAbandonContext(value: Callback): Self = StObject.set(x, "releaseResourcesAndAbandonContext", value.toJsFn)
    
    inline def setSetResourceCacheLimitBytes(value: Double => Callback): Self = StObject.set(x, "setResourceCacheLimitBytes", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
