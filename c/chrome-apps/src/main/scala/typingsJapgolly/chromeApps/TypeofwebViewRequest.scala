package typingsJapgolly.chromeApps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddRequestCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseHeader
import typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.CancelRequest
import typingsJapgolly.chromeApps.chrome.webViewRequest.EditCookieParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.EditRequestCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.EditResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.IgnoreRules
import typingsJapgolly.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectByRegEx
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectRequest
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument
import typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToTransparentImage
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestHeader
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseHeader
import typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.RequestCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcher
import typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typingsJapgolly.chromeApps.chrome.webViewRequest.ResponseCookie
import typingsJapgolly.chromeApps.chrome.webViewRequest.SendMessageParams
import typingsJapgolly.chromeApps.chrome.webViewRequest.SendMessageToExtension
import typingsJapgolly.chromeApps.chrome.webViewRequest.SetRequestHeader
import typingsJapgolly.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebViewRequest extends js.Object {
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddRequestCookie: Instantiable1[
    /* parameters */ AddCookie[RequestCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.AddRequestCookie
  ]
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddResponseCookie: Instantiable1[
    /* parameters */ AddCookie[ResponseCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseCookie
  ]
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  var AddResponseHeader: Instantiable1[
    /* parameters */ AddResponseHeaderParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.AddResponseHeader
  ]
  /** Declarative event action that cancels a network request. */
  var CancelRequest: Instantiable0[typingsJapgolly.chromeApps.chrome.webViewRequest.CancelRequest]
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditRequestCookie: Instantiable1[
    /* parameters */ EditCookieParams[RequestCookie, RequestCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.EditRequestCookie
  ]
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditResponseCookie: Instantiable1[
    /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.EditResponseCookie
  ]
  /**
    * Masks all rules that match the specified criteria.
    */
  var IgnoreRules: Instantiable1[
    /* parameters */ IgnoreRulesParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.IgnoreRules
  ]
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var RedirectByRegEx: Instantiable1[
    /* parameters */ RedirectByRegExParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectByRegEx
  ]
  /** Declarative event action that redirects a network request.  */
  var RedirectRequest: Instantiable1[
    /* parameters */ RedirectRequestParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectRequest
  ]
  /** Declarative event action that redirects a network request to an empty document. */
  var RedirectToEmptyDocument: Instantiable0[typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument]
  /** Declarative event action that redirects a network request to a transparent image. */
  var RedirectToTransparentImage: Instantiable0[typingsJapgolly.chromeApps.chrome.webViewRequest.RedirectToTransparentImage]
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveRequestCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[RequestCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestCookie
  ]
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  var RemoveRequestHeader: Instantiable1[
    /* parameters */ RemoveRequestHeaderParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveRequestHeader
  ]
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveResponseCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[FilterResponseCookie], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseCookie
  ]
  /**
    * Removes all response headers of the specified names and values.
    */
  var RemoveResponseHeader: Instantiable1[
    /* parameters */ RemoveResponseHeaderParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RemoveResponseHeader
  ]
  /**
    * @description Matches network events by various criteria.
    */
  var RequestMatcher: Instantiable1[
    js.UndefOr[/* parameters */ RequestMatcherFields], 
    typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcher
  ]
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  var SendMessageToExtension: Instantiable1[
    /* parameters */ SendMessageParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.SendMessageToExtension
  ]
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  var SetRequestHeader: Instantiable1[
    /* parameters */ SetRequestHeaderParams, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.SetRequestHeader
  ]
}

object TypeofwebViewRequest {
  @scala.inline
  def apply(
    AddRequestCookie: Instantiable1[/* parameters */ AddCookie[RequestCookie], AddRequestCookie],
    AddResponseCookie: Instantiable1[/* parameters */ AddCookie[ResponseCookie], AddResponseCookie],
    AddResponseHeader: Instantiable1[/* parameters */ AddResponseHeaderParams, AddResponseHeader],
    CancelRequest: Instantiable0[CancelRequest],
    EditRequestCookie: Instantiable1[/* parameters */ EditCookieParams[RequestCookie, RequestCookie], EditRequestCookie],
    EditResponseCookie: Instantiable1[
      /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
      EditResponseCookie
    ],
    IgnoreRules: Instantiable1[/* parameters */ IgnoreRulesParams, IgnoreRules],
    RedirectByRegEx: Instantiable1[/* parameters */ RedirectByRegExParams, RedirectByRegEx],
    RedirectRequest: Instantiable1[/* parameters */ RedirectRequestParams, RedirectRequest],
    RedirectToEmptyDocument: Instantiable0[RedirectToEmptyDocument],
    RedirectToTransparentImage: Instantiable0[RedirectToTransparentImage],
    RemoveRequestCookie: Instantiable1[/* parameters */ RemoveCookieParams[RequestCookie], RemoveRequestCookie],
    RemoveRequestHeader: Instantiable1[/* parameters */ RemoveRequestHeaderParams, RemoveRequestHeader],
    RemoveResponseCookie: Instantiable1[/* parameters */ RemoveCookieParams[FilterResponseCookie], RemoveResponseCookie],
    RemoveResponseHeader: Instantiable1[/* parameters */ RemoveResponseHeaderParams, RemoveResponseHeader],
    RequestMatcher: Instantiable1[js.UndefOr[/* parameters */ RequestMatcherFields], RequestMatcher],
    SendMessageToExtension: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension],
    SetRequestHeader: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]
  ): TypeofwebViewRequest = {
    val __obj = js.Dynamic.literal(AddRequestCookie = AddRequestCookie.asInstanceOf[js.Any], AddResponseCookie = AddResponseCookie.asInstanceOf[js.Any], AddResponseHeader = AddResponseHeader.asInstanceOf[js.Any], CancelRequest = CancelRequest.asInstanceOf[js.Any], EditRequestCookie = EditRequestCookie.asInstanceOf[js.Any], EditResponseCookie = EditResponseCookie.asInstanceOf[js.Any], IgnoreRules = IgnoreRules.asInstanceOf[js.Any], RedirectByRegEx = RedirectByRegEx.asInstanceOf[js.Any], RedirectRequest = RedirectRequest.asInstanceOf[js.Any], RedirectToEmptyDocument = RedirectToEmptyDocument.asInstanceOf[js.Any], RedirectToTransparentImage = RedirectToTransparentImage.asInstanceOf[js.Any], RemoveRequestCookie = RemoveRequestCookie.asInstanceOf[js.Any], RemoveRequestHeader = RemoveRequestHeader.asInstanceOf[js.Any], RemoveResponseCookie = RemoveResponseCookie.asInstanceOf[js.Any], RemoveResponseHeader = RemoveResponseHeader.asInstanceOf[js.Any], RequestMatcher = RequestMatcher.asInstanceOf[js.Any], SendMessageToExtension = SendMessageToExtension.asInstanceOf[js.Any], SetRequestHeader = SetRequestHeader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofwebViewRequest]
  }
}

