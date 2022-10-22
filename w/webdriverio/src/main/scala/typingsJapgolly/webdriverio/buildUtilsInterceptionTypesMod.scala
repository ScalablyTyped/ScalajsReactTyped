package typingsJapgolly.webdriverio

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.std.Record
import typingsJapgolly.wdioTypes.mod.JsonCompatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsInterceptionTypesMod {
  
  trait CustomThrottle
    extends StObject
       with ThrottleOptions {
    
    var downloadThroughput: Double
    
    var latency: Double
    
    var offline: Boolean
    
    var uploadThroughput: Double
  }
  object CustomThrottle {
    
    inline def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): CustomThrottle = {
      val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomThrottle]
    }
    
    extension [Self <: CustomThrottle](x: Self) {
      
      inline def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.webdriverioStrings.Failed
    - typingsJapgolly.webdriverio.webdriverioStrings.Aborted
    - typingsJapgolly.webdriverio.webdriverioStrings.TimedOut
    - typingsJapgolly.webdriverio.webdriverioStrings.AccessDenied
    - typingsJapgolly.webdriverio.webdriverioStrings.ConnectionClosed
    - typingsJapgolly.webdriverio.webdriverioStrings.ConnectionReset
    - typingsJapgolly.webdriverio.webdriverioStrings.ConnectionRefused
    - typingsJapgolly.webdriverio.webdriverioStrings.ConnectionAborted
    - typingsJapgolly.webdriverio.webdriverioStrings.ConnectionFailed
    - typingsJapgolly.webdriverio.webdriverioStrings.NameNotResolved
    - typingsJapgolly.webdriverio.webdriverioStrings.InternetDisconnected
    - typingsJapgolly.webdriverio.webdriverioStrings.AddressUnreachable
    - typingsJapgolly.webdriverio.webdriverioStrings.BlockedByClient
    - typingsJapgolly.webdriverio.webdriverioStrings.BlockedByResponse
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def Aborted: typingsJapgolly.webdriverio.webdriverioStrings.Aborted = "Aborted".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Aborted]
    
    inline def AccessDenied: typingsJapgolly.webdriverio.webdriverioStrings.AccessDenied = "AccessDenied".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.AccessDenied]
    
    inline def AddressUnreachable: typingsJapgolly.webdriverio.webdriverioStrings.AddressUnreachable = "AddressUnreachable".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.AddressUnreachable]
    
    inline def BlockedByClient: typingsJapgolly.webdriverio.webdriverioStrings.BlockedByClient = "BlockedByClient".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.BlockedByClient]
    
    inline def BlockedByResponse: typingsJapgolly.webdriverio.webdriverioStrings.BlockedByResponse = "BlockedByResponse".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.BlockedByResponse]
    
    inline def ConnectionAborted: typingsJapgolly.webdriverio.webdriverioStrings.ConnectionAborted = "ConnectionAborted".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.ConnectionAborted]
    
    inline def ConnectionClosed: typingsJapgolly.webdriverio.webdriverioStrings.ConnectionClosed = "ConnectionClosed".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.ConnectionClosed]
    
    inline def ConnectionFailed: typingsJapgolly.webdriverio.webdriverioStrings.ConnectionFailed = "ConnectionFailed".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.ConnectionFailed]
    
    inline def ConnectionRefused: typingsJapgolly.webdriverio.webdriverioStrings.ConnectionRefused = "ConnectionRefused".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.ConnectionRefused]
    
    inline def ConnectionReset: typingsJapgolly.webdriverio.webdriverioStrings.ConnectionReset = "ConnectionReset".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.ConnectionReset]
    
    inline def Failed: typingsJapgolly.webdriverio.webdriverioStrings.Failed = "Failed".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Failed]
    
    inline def InternetDisconnected: typingsJapgolly.webdriverio.webdriverioStrings.InternetDisconnected = "InternetDisconnected".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.InternetDisconnected]
    
    inline def NameNotResolved: typingsJapgolly.webdriverio.webdriverioStrings.NameNotResolved = "NameNotResolved".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.NameNotResolved]
    
    inline def TimedOut: typingsJapgolly.webdriverio.webdriverioStrings.TimedOut = "TimedOut".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.TimedOut]
  }
  
  trait Matches
    extends StObject
       with Request {
    
    /**
      * body response of actual resource
      */
    var body: String | Buffer | JsonCompatible
    
    /**
      * HTTP response headers.
      */
    var responseHeaders: Record[String, String]
    
    /**
      * HTTP response status code.
      */
    var statusCode: Double
  }
  object Matches {
    
    inline def apply(
      body: String | Buffer | JsonCompatible,
      headers: Record[String, String],
      initialPriority: ResourcePriority,
      method: String,
      referrerPolicy: ReferrerPolicy,
      responseHeaders: Record[String, String],
      statusCode: Double,
      url: String
    ): Matches = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matches]
    }
    
    extension [Self <: Matches](x: Self) {
      
      inline def setBody(value: String | Buffer | JsonCompatible): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: Record[String, String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.webdriverioStrings.blockable
    - typingsJapgolly.webdriverio.webdriverioStrings.`optionally-blockable`
    - typingsJapgolly.webdriverio.webdriverioStrings.none
  */
  trait MixedContentType extends StObject
  object MixedContentType {
    
    inline def blockable: typingsJapgolly.webdriverio.webdriverioStrings.blockable = "blockable".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.blockable]
    
    inline def none: typingsJapgolly.webdriverio.webdriverioStrings.none = "none".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.none]
    
    inline def `optionally-blockable`: typingsJapgolly.webdriverio.webdriverioStrings.`optionally-blockable` = "optionally-blockable".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`optionally-blockable`]
  }
  
  trait MockFilterOptions extends StObject {
    
    var headers: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var method: js.UndefOr[String | (js.Function1[/* method */ String, Boolean])] = js.undefined
    
    var postData: js.UndefOr[String | (js.Function1[/* payload */ js.UndefOr[String], Boolean])] = js.undefined
    
    var requestHeaders: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var responseHeaders: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var statusCode: js.UndefOr[Double | (js.Function1[/* statusCode */ Double, Boolean])] = js.undefined
  }
  object MockFilterOptions {
    
    inline def apply(): MockFilterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockFilterOptions]
    }
    
    extension [Self <: MockFilterOptions](x: Self) {
      
      inline def setHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String | (js.Function1[/* method */ String, Boolean])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: /* method */ String => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPostData(value: String | (js.Function1[/* payload */ js.UndefOr[String], Boolean])): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataFunction1(value: /* payload */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "postData", js.Any.fromFunction1(value))
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setRequestHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "requestHeaders", js.Any.fromFunction1(value))
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setResponseHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "responseHeaders", js.Any.fromFunction1(value))
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setStatusCode(value: Double | (js.Function1[/* statusCode */ Double, Boolean])): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeFunction1(value: /* statusCode */ Double => Boolean): Self = StObject.set(x, "statusCode", js.Any.fromFunction1(value))
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type MockOverwrite = String | (Record[String, Any]) | MockOverwriteFunction
  
  type MockOverwriteFunction = js.Function2[
    /* request */ Matches, 
    /* client */ CDPSession, 
    js.Promise[String | (Record[String, Any])]
  ]
  
  trait MockResponseParams extends StObject {
    
    /**
      * fetch real response before responding with mocked data. Default: true
      */
    var fetchResponse: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* request */ Matches, Record[String, String]])
      ] = js.undefined
    
    var statusCode: js.UndefOr[Double | (js.Function1[/* request */ Matches, Double])] = js.undefined
  }
  object MockResponseParams {
    
    inline def apply(): MockResponseParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResponseParams]
    }
    
    extension [Self <: MockResponseParams](x: Self) {
      
      inline def setFetchResponse(value: Boolean): Self = StObject.set(x, "fetchResponse", value.asInstanceOf[js.Any])
      
      inline def setFetchResponseUndefined: Self = StObject.set(x, "fetchResponse", js.undefined)
      
      inline def setHeaders(value: (Record[String, String]) | (js.Function1[/* request */ Matches, Record[String, String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: /* request */ Matches => Record[String, String]): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double | (js.Function1[/* request */ Matches, Double])): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeFunction1(value: /* request */ Matches => Double): Self = StObject.set(x, "statusCode", js.Any.fromFunction1(value))
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.webdriverioStrings.`unsafe-url`
    - typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer-when-downgrade`
    - typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer`
    - typingsJapgolly.webdriverio.webdriverioStrings.origin
    - typingsJapgolly.webdriverio.webdriverioStrings.`origin-when-cross-origin`
    - typingsJapgolly.webdriverio.webdriverioStrings.`same-origin`
    - typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin`
    - typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def `no-referrer`: typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typingsJapgolly.webdriverio.webdriverioStrings.origin = "origin".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.origin]
    
    inline def `origin-when-cross-origin`: typingsJapgolly.webdriverio.webdriverioStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typingsJapgolly.webdriverio.webdriverioStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`same-origin`]
    
    inline def `strict-origin`: typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typingsJapgolly.webdriverio.webdriverioStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.`unsafe-url`]
  }
  
  trait Request extends StObject {
    
    /**
      * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
      */
    var hasPostData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTTP request headers.
      */
    var headers: Record[String, String]
    
    /**
      * Priority of the resource request at the time request is sent.
      */
    var initialPriority: ResourcePriority
    
    /**
      * Whether is loaded via link preload.
      */
    var isLinkPreload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTTP request method.
      */
    var method: String
    
    /**
      * The mixed content export type of the request.
      */
    var mixedContentType: js.UndefOr[MixedContentType] = js.undefined
    
    /**
      * HTTP POST request data.
      */
    var postData: js.UndefOr[String] = js.undefined
    
    /**
      * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
      */
    var referrerPolicy: ReferrerPolicy
    
    /**
      * Request URL (without fragment).
      */
    var url: String
    
    /**
      * Fragment of the requested URL starting with hash, if present.
      */
    var urlFragment: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(
      headers: Record[String, String],
      initialPriority: ResourcePriority,
      method: String,
      referrerPolicy: ReferrerPolicy,
      url: String
    ): Request = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
      
      inline def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
      
      inline def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
      
      inline def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
      
      inline def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
      
      inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
      
      inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.webdriverioStrings.VeryLow
    - typingsJapgolly.webdriverio.webdriverioStrings.Low
    - typingsJapgolly.webdriverio.webdriverioStrings.Medium
    - typingsJapgolly.webdriverio.webdriverioStrings.High
    - typingsJapgolly.webdriverio.webdriverioStrings.VeryHigh
  */
  trait ResourcePriority extends StObject
  object ResourcePriority {
    
    inline def High: typingsJapgolly.webdriverio.webdriverioStrings.High = "High".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.High]
    
    inline def Low: typingsJapgolly.webdriverio.webdriverioStrings.Low = "Low".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Low]
    
    inline def Medium: typingsJapgolly.webdriverio.webdriverioStrings.Medium = "Medium".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Medium]
    
    inline def VeryHigh: typingsJapgolly.webdriverio.webdriverioStrings.VeryHigh = "VeryHigh".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.VeryHigh]
    
    inline def VeryLow: typingsJapgolly.webdriverio.webdriverioStrings.VeryLow = "VeryLow".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.VeryLow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.ThrottlePreset
    - typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.CustomThrottle
  */
  trait ThrottleOptions extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webdriverio.webdriverioStrings.offline
    - typingsJapgolly.webdriverio.webdriverioStrings.GPRS
    - typingsJapgolly.webdriverio.webdriverioStrings.Regular2G
    - typingsJapgolly.webdriverio.webdriverioStrings.Good2G
    - typingsJapgolly.webdriverio.webdriverioStrings.Regular3G
    - typingsJapgolly.webdriverio.webdriverioStrings.Good3G
    - typingsJapgolly.webdriverio.webdriverioStrings.Regular4G
    - typingsJapgolly.webdriverio.webdriverioStrings.DSL
    - typingsJapgolly.webdriverio.webdriverioStrings.WiFi
    - typingsJapgolly.webdriverio.webdriverioStrings.online
  */
  trait ThrottlePreset
    extends StObject
       with ThrottleOptions
  object ThrottlePreset {
    
    inline def DSL: typingsJapgolly.webdriverio.webdriverioStrings.DSL = "DSL".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.DSL]
    
    inline def GPRS: typingsJapgolly.webdriverio.webdriverioStrings.GPRS = "GPRS".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.GPRS]
    
    inline def Good2G: typingsJapgolly.webdriverio.webdriverioStrings.Good2G = "Good2G".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Good2G]
    
    inline def Good3G: typingsJapgolly.webdriverio.webdriverioStrings.Good3G = "Good3G".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Good3G]
    
    inline def Regular2G: typingsJapgolly.webdriverio.webdriverioStrings.Regular2G = "Regular2G".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Regular2G]
    
    inline def Regular3G: typingsJapgolly.webdriverio.webdriverioStrings.Regular3G = "Regular3G".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Regular3G]
    
    inline def Regular4G: typingsJapgolly.webdriverio.webdriverioStrings.Regular4G = "Regular4G".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.Regular4G]
    
    inline def WiFi: typingsJapgolly.webdriverio.webdriverioStrings.WiFi = "WiFi".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.WiFi]
    
    inline def offline: typingsJapgolly.webdriverio.webdriverioStrings.offline = "offline".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.offline]
    
    inline def online: typingsJapgolly.webdriverio.webdriverioStrings.online = "online".asInstanceOf[typingsJapgolly.webdriverio.webdriverioStrings.online]
  }
}
