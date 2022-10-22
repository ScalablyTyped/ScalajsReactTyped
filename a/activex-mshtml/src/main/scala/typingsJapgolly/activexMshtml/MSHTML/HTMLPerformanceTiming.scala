package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPerformanceTiming extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLPerformanceTiming_typekey")
  var MSHTMLDotHTMLPerformanceTiming_typekey: HTMLPerformanceTiming
  
  val connectEnd: Double
  
  val connectStart: Double
  
  val domComplete: Double
  
  val domContentLoadedEventEnd: Double
  
  val domContentLoadedEventStart: Double
  
  val domInteractive: Double
  
  val domLoading: Double
  
  val domainLookupEnd: Double
  
  val domainLookupStart: Double
  
  val fetchStart: Double
  
  val loadEventEnd: Double
  
  val loadEventStart: Double
  
  val msFirstPaint: Double
  
  val navigationStart: Double
  
  val redirectEnd: Double
  
  val redirectStart: Double
  
  val requestStart: Double
  
  val responseEnd: Double
  
  val responseStart: Double
  
  def toJSON(): Any
  
  val unloadEventEnd: Double
  
  val unloadEventStart: Double
}
object HTMLPerformanceTiming {
  
  inline def apply(
    MSHTMLDotHTMLPerformanceTiming_typekey: HTMLPerformanceTiming,
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    msFirstPaint: Double,
    navigationStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    toJSON: CallbackTo[Any],
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): HTMLPerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], msFirstPaint = msFirstPaint.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPerformanceTiming_typekey")(MSHTMLDotHTMLPerformanceTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceTiming]
  }
  
  extension [Self <: HTMLPerformanceTiming](x: Self) {
    
    inline def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
    
    inline def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    inline def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    inline def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
    
    inline def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    inline def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
    
    inline def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLPerformanceTiming_typekey(value: HTMLPerformanceTiming): Self = StObject.set(x, "MSHTML.HTMLPerformanceTiming_typekey", value.asInstanceOf[js.Any])
    
    inline def setMsFirstPaint(value: Double): Self = StObject.set(x, "msFirstPaint", value.asInstanceOf[js.Any])
    
    inline def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
    
    inline def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    inline def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
    
    inline def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
  }
}
