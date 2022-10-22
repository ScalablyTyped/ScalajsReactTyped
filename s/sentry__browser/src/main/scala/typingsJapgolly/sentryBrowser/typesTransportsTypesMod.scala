package typingsJapgolly.sentryBrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.RequestInit
import typingsJapgolly.sentryTypes.typesClientreportMod.EventDropReason
import typingsJapgolly.sentryTypes.typesDatacategoryMod.DataCategory
import typingsJapgolly.sentryTypes.typesTransportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsTypesMod {
  
  trait BrowserTransportOptions
    extends StObject
       with BaseTransportOptions {
    
    /** Fetch API init parameters. Used by the FetchTransport */
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    /** Custom headers for the transport. Used by the XHRTransport and FetchTransport */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object BrowserTransportOptions {
    
    inline def apply(recordDroppedEvent: (EventDropReason, DataCategory) => Callback, url: String): BrowserTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction2((t0: EventDropReason, t1: DataCategory) => (recordDroppedEvent(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserTransportOptions]
    }
    
    extension [Self <: BrowserTransportOptions](x: Self) {
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
}
