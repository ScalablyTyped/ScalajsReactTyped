package typingsJapgolly.cypress.Cypress

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cypress.cypressStrings.GET
import typingsJapgolly.cypress.cypressStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Visit website options
  *
  * @see https://on.cypress.io/visit
  */
trait VisitOptions
  extends StObject
     with Loggable
     with Timeoutable
     with Failable {
  
  /**
    * Cypress will automatically apply the right authorization headers
    * if you're attempting to visit an application that requires
    * Basic Authentication.
    *
    * @example
    *    cy.visit('https://www.acme.com/', {
    *      auth: {
    *        username: 'wile',
    *        password: 'coyote'
    *      }
    *    })
    */
  var auth: Auth
  
  /**
    * An optional body to send along with a `POST` request. If it is a string, it will be passed along unmodified. If it is an object, it will be URL encoded to a string and sent with a `Content-Type: application/x-www-urlencoded` header.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com/form.html',
    *      method: 'POST',
    *      body: {
    *        "field1": "foo",
    *        "field2": "bar"
    *      }
    *    })
    */
  var body: RequestBody
  
  /**
    * An object that maps HTTP header names to values to be sent along with the request.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com',
    *      headers: {
    *        'Accept-Language': 'en-US'
    *      }
    *    })
    */
  var headers: StringDictionary[String]
  
  /**
    * The HTTP method to use in the visit. Can be `GET` or `POST`.
    *
    * @default "GET"
    */
  var method: GET | POST
  
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {AUTWindow} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: AUTWindow): Unit
  
  /**
    * Called once your page has fired its load event.
    *
    * @param {AUTWindow} contentWindow the remote page's window object
    */
  def onLoad(win: AUTWindow): Unit
  
  /**
    * Query parameters to append to the `url` of the request.
    */
  var qs: js.Object
  
  /**
    * The URL to visit. Behaves the same as the `url` argument.
    */
  var url: String
}
object VisitOptions {
  
  inline def apply(
    auth: Auth,
    body: RequestBody,
    failOnStatusCode: Boolean,
    headers: StringDictionary[String],
    log: Boolean,
    method: GET | POST,
    onBeforeLoad: AUTWindow => Callback,
    onLoad: AUTWindow => Callback,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onBeforeLoad = js.Any.fromFunction1((t0: AUTWindow) => onBeforeLoad(t0).runNow()), onLoad = js.Any.fromFunction1((t0: AUTWindow) => onLoad(t0).runNow()), qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitOptions]
  }
  
  extension [Self <: VisitOptions](x: Self) {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeLoad(value: AUTWindow => Callback): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1((t0: AUTWindow) => value(t0).runNow()))
    
    inline def setOnLoad(value: AUTWindow => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: AUTWindow) => value(t0).runNow()))
    
    inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
