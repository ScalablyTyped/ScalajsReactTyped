package typingsJapgolly.rest.interceptorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rest.mod.Meta
import typingsJapgolly.rest.mod.Request
import typingsJapgolly.rest.mod.Response
import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[T, U] extends js.Object {
  var error: js.UndefOr[
    js.Function3[
      /* response */ Response, 
      /* config */ U, 
      /* meta */ Meta, 
      Response | Promise_[Response]
    ]
  ] = js.undefined
  var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.undefined
  var request: js.UndefOr[
    js.Function3[/* request */ Request, /* config */ U, /* meta */ Meta, Request | Promise_[Request]]
  ] = js.undefined
  var response: js.UndefOr[
    js.Function3[
      /* response */ Response, 
      /* config */ U, 
      /* meta */ Meta, 
      Response | Promise_[Response]
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* response */ Response, 
      /* config */ U, 
      /* meta */ Meta, 
      Response | Promise_[Response]
    ]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply[T, U](
    error: (/* response */ Response, /* config */ U, /* meta */ Meta) => CallbackTo[Response | Promise_[Response]] = null,
    init: /* config */ T => CallbackTo[U] = null,
    request: (/* request */ Request, /* config */ U, /* meta */ Meta) => CallbackTo[Request | Promise_[Request]] = null,
    response: (/* response */ Response, /* config */ U, /* meta */ Meta) => CallbackTo[Response | Promise_[Response]] = null,
    success: (/* response */ Response, /* config */ U, /* meta */ Meta) => CallbackTo[Response | Promise_[Response]] = null
  ): Config[T, U] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* response */ typingsJapgolly.rest.mod.Response, t1: /* config */ U, t2: /* meta */ typingsJapgolly.rest.mod.Meta) => error(t0, t1, t2).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* config */ T) => init(t0).runNow()))
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3((t0: /* request */ typingsJapgolly.rest.mod.Request, t1: /* config */ U, t2: /* meta */ typingsJapgolly.rest.mod.Meta) => request(t0, t1, t2).runNow()))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction3((t0: /* response */ typingsJapgolly.rest.mod.Response, t1: /* config */ U, t2: /* meta */ typingsJapgolly.rest.mod.Meta) => response(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* response */ typingsJapgolly.rest.mod.Response, t1: /* config */ U, t2: /* meta */ typingsJapgolly.rest.mod.Meta) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Config[T, U]]
  }
}

