package typingsJapgolly.reduxApiMiddleware.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.reduxApiMiddleware.FnCall
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.DELETE
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.GET
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.HEAD
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.OPTIONS
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.PATCH
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.POST
import typingsJapgolly.reduxApiMiddleware.reduxApiMiddlewareStrings.PUT
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAACall[State, Payload, Meta] extends js.Object {
  var bailout: js.UndefOr[TypeOrResolver[State, Boolean]] = js.undefined
  var body: js.UndefOr[TypeOrResolver[State, BodyInit | Null]] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var endpoint: TypeOrResolver[State, String]
  var fetch: js.UndefOr[FnCall] = js.undefined
  var headers: js.UndefOr[TypeOrResolver[State, HeadersInit]] = js.undefined
  // `redux-api-middleware` strictly allows only this methods
  var method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
  var options: js.UndefOr[TypeOrResolver[State, RequestInit]] = js.undefined
  var types: js.Tuple3[
    RSAARequestType[State, Payload, Meta], 
    RSAASuccessType[State, Payload, Meta], 
    RSAAFailureType[State, Payload, Meta]
  ]
}

object RSAACall {
  @scala.inline
  def apply[State, Payload, Meta](
    endpoint: TypeOrResolver[State, String],
    method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS,
    types: js.Tuple3[
      RSAARequestType[State, Payload, Meta], 
      RSAASuccessType[State, Payload, Meta], 
      RSAAFailureType[State, Payload, Meta]
    ],
    bailout: TypeOrResolver[State, Boolean] = null,
    body: TypeOrResolver[State, BodyInit | Null] = null,
    credentials: RequestCredentials = null,
    fetch: FnCall = null,
    headers: TypeOrResolver[State, HeadersInit] = null,
    ok: /* res */ Response => CallbackTo[Boolean] = null,
    options: TypeOrResolver[State, RequestInit] = null
  ): RSAACall[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (bailout != null) __obj.updateDynamic("bailout")(bailout.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: /* res */ org.scalajs.dom.experimental.Response) => ok(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAACall[State, Payload, Meta]]
  }
}

