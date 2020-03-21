package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cypress.cypressStrings.GET
import typingsJapgolly.cypress.cypressStrings.POST
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Visit website options
  *
  * @see https://on.cypress.io/visit
  */
trait VisitOptions
  extends Loggable
     with Timeoutable
     with Failable {
  /**
    * Cypress will automatically apply the right authorization headers
    * if you’re attempting to visit an application that requires
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
    * Query parameters to append to the `url` of the request.
    */
  var qs: js.Object
  /**
    * The URL to visit. Behaves the same as the `url` argument.
    */
  var url: String
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: Window_): Unit
  /**
    * Called once your page has fired its load event.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onLoad(win: Window_): Unit
}

object VisitOptions {
  @scala.inline
  def apply(
    auth: Auth,
    body: RequestBody,
    failOnStatusCode: Boolean,
    headers: StringDictionary[String],
    log: Boolean,
    method: GET | POST,
    onBeforeLoad: Window_ => Callback,
    onLoad: Window_ => Callback,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("onBeforeLoad")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => onBeforeLoad(t0).runNow()))
    __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => onLoad(t0).runNow()))
    __obj.asInstanceOf[VisitOptions]
  }
}

