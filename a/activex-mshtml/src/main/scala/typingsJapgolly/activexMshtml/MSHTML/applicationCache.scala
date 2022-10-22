package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait applicationCache extends StObject {
  
  /* private */ @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache
  
  def abort(): Unit
  
  var oncached: Any
  
  var onchecking: Any
  
  var ondownloading: Any
  
  var onerror: Any
  
  var onnoupdate: Any
  
  var onobsolete: Any
  
  var onprogress: Any
  
  var onupdateready: Any
  
  val status: Double
  
  def swapCache(): Unit
  
  def update(): Unit
}
object applicationCache {
  
  inline def apply(
    MSHTMLDotapplicationCache_typekey: applicationCache,
    abort: Callback,
    oncached: Any,
    onchecking: Any,
    ondownloading: Any,
    onerror: Any,
    onnoupdate: Any,
    onobsolete: Any,
    onprogress: Any,
    onupdateready: Any,
    status: Double,
    swapCache: Callback,
    update: Callback
  ): applicationCache = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, oncached = oncached.asInstanceOf[js.Any], onchecking = onchecking.asInstanceOf[js.Any], ondownloading = ondownloading.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onnoupdate = onnoupdate.asInstanceOf[js.Any], onobsolete = onobsolete.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onupdateready = onupdateready.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], swapCache = swapCache.toJsFn, update = update.toJsFn)
    __obj.updateDynamic("MSHTML.applicationCache_typekey")(MSHTMLDotapplicationCache_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[applicationCache]
  }
  
  extension [Self <: applicationCache](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setMSHTMLDotapplicationCache_typekey(value: applicationCache): Self = StObject.set(x, "MSHTML.applicationCache_typekey", value.asInstanceOf[js.Any])
    
    inline def setOncached(value: Any): Self = StObject.set(x, "oncached", value.asInstanceOf[js.Any])
    
    inline def setOnchecking(value: Any): Self = StObject.set(x, "onchecking", value.asInstanceOf[js.Any])
    
    inline def setOndownloading(value: Any): Self = StObject.set(x, "ondownloading", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnnoupdate(value: Any): Self = StObject.set(x, "onnoupdate", value.asInstanceOf[js.Any])
    
    inline def setOnobsolete(value: Any): Self = StObject.set(x, "onobsolete", value.asInstanceOf[js.Any])
    
    inline def setOnprogress(value: Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setOnupdateready(value: Any): Self = StObject.set(x, "onupdateready", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSwapCache(value: Callback): Self = StObject.set(x, "swapCache", value.toJsFn)
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
