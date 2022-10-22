package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.webViewRequest.AddCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.EditCookieParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RequestCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typingsJapgolly.chromeApps.chrome.webViewRequest.ResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.SendMessageParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.webViewRequest
/////////////////////
// WebView Request //
/////////////////////
/**
  * @requires Permissions: 'webview'
  * @description
  * Use the *chrome.webViewRequest* API to intercept, block, or modify requests in-flight.
  */
object webViewRequest {
  
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.AddRequestCookie")
  @js.native
  open class AddRequestCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.AddRequestCookie {
    def this(parameters: AddCookie[RequestCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.AddRequestCookie = js.native
  }
  
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.AddResponseCookie")
  @js.native
  open class AddResponseCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseCookie {
    def this(parameters: AddCookie[ResponseCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.AddResponseCookie = js.native
  }
  
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  @JSGlobal("chrome.webViewRequest.AddResponseHeader")
  @js.native
  open class AddResponseHeader protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseHeader {
    def this(parameters: AddResponseHeaderParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.AddResponseHeader = js.native
  }
  
  /** Declarative event action that cancels a network request. */
  @JSGlobal("chrome.webViewRequest.CancelRequest")
  @js.native
  open class CancelRequest ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.CancelRequest {
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.CancelRequest = js.native
  }
  
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.EditRequestCookie")
  @js.native
  open class EditRequestCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.EditRequestCookie {
    /**
      * @param filter
      * @param modification Attributes that shall be overridden in cookies that machted the filter.
      *                     Attributes that are set to an empty string are removed.
      */
    def this(parameters: EditCookieParams[RequestCookie, RequestCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.EditRequestCookie = js.native
  }
  
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.EditResponseCookie")
  @js.native
  open class EditResponseCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.EditResponseCookie {
    /**
      * @param filter Filter for cookies that will be modified.All empty entries are ignored.
      * @param modification
      */
    def this(parameter: EditCookieParams[FilterResponseCookie, ResponseCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.EditResponseCookie = js.native
  }
  
  /**
    * Masks all rules that match the specified criteria.
    */
  @JSGlobal("chrome.webViewRequest.IgnoreRules")
  @js.native
  open class IgnoreRules protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.IgnoreRules {
    def this(parameters: IgnoreRulesParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.IgnoreRules = js.native
  }
  
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  @JSGlobal("chrome.webViewRequest.RedirectByRegEx")
  @js.native
  open class RedirectByRegEx protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectByRegEx {
    def this(parameters: RedirectByRegExParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RedirectByRegEx = js.native
  }
  
  /** Declarative event action that redirects a network request.  */
  @JSGlobal("chrome.webViewRequest.RedirectRequest")
  @js.native
  open class RedirectRequest protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectRequest {
    def this(parameters: RedirectRequestParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RedirectRequest = js.native
  }
  
  /** Declarative event action that redirects a network request to an empty document. */
  @JSGlobal("chrome.webViewRequest.RedirectToEmptyDocument")
  @js.native
  open class RedirectToEmptyDocument ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument {
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RedirectToEmptyDocument = js.native
  }
  
  /** Declarative event action that redirects a network request to a transparent image. */
  @JSGlobal("chrome.webViewRequest.RedirectToTransparentImage")
  @js.native
  open class RedirectToTransparentImage ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToTransparentImage {
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RedirectToTransparentImage = js.native
  }
  
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.RemoveRequestCookie")
  @js.native
  open class RemoveRequestCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestCookie {
    def this(parameters: RemoveCookieParams[RequestCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveRequestCookie = js.native
  }
  
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  @JSGlobal("chrome.webViewRequest.RemoveRequestHeader")
  @js.native
  open class RemoveRequestHeader protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestHeader {
    def this(parameters: RemoveRequestHeaderParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveRequestHeader = js.native
  }
  
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.RemoveResponseCookie")
  @js.native
  open class RemoveResponseCookie protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseCookie {
    def this(parameters: RemoveCookieParams[FilterResponseCookie]) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveResponseCookie = js.native
  }
  
  /**
    * Removes all response headers of the specified names and values.
    */
  @JSGlobal("chrome.webViewRequest.RemoveResponseHeader")
  @js.native
  open class RemoveResponseHeader protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseHeader {
    def this(parameters: RemoveResponseHeaderParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveResponseHeader = js.native
  }
  
  /**
    * @description Matches network events by various criteria.
    */
  @JSGlobal("chrome.webViewRequest.RequestMatcher")
  @js.native
  open class RequestMatcher ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcher {
    def this(parameters: RequestMatcherFields) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RequestMatcher = js.native
  }
  
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  @JSGlobal("chrome.webViewRequest.SendMessageToExtension")
  @js.native
  open class SendMessageToExtension protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.SendMessageToExtension {
    def this(parameters: SendMessageParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.SendMessageToExtension = js.native
  }
  
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  @JSGlobal("chrome.webViewRequest.SetRequestHeader")
  @js.native
  open class SetRequestHeader protected ()
    extends StObject
       with typingsJapgolly.chromeApps.chrome.webViewRequest.SetRequestHeader {
    def this(parameters: SetRequestHeaderParams) = this()
    
    /* CompleteClass */
    override val instanceType: String = js.native
    
    /* protected */ /* CompleteClass */
    override val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.SetRequestHeader = js.native
  }
}
