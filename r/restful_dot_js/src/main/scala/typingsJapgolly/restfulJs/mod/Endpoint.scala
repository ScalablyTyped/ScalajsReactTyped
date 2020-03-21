package typingsJapgolly.restfulJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint[Self] extends js.Object {
  /**
    * Add a full request interceptor. You can alter params, headers, data, method and url.
    */
  def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self
  /**
    * Add a full response interceptor. You can alter data and headers.
    */
  def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self
  /**
    * Add a request interceptor.
    */
  def addRequestInterceptor(interceptor: RequestInterceptor): Self
  /**
    * Add a response interceptor. You can only alter data and headers.
    */
  def addResponseInterceptor(interceptor: ResponseInterceptor): Self
  def fullRequestInterceptors(): js.Array[FullRequestInterceptor]
  def fullResponseInterceptors(): js.Array[ResponseInterceptor]
  /**
    * Add a header.
    * @param name
    * @param value
    */
  def header(name: String, value: js.Any): Self
  def headers(): Headers
  def requestInterceptors(): js.Array[RequestInterceptor]
  def responseInterceptors(): js.Array[ResponseInterceptor]
  /**
    * Get the url.
    */
  def url(): String
}

object Endpoint {
  @scala.inline
  def apply[Self](
    addFullRequestInterceptor: FullRequestInterceptor => CallbackTo[Self],
    addFullResponseInterceptor: ResponseInterceptor => CallbackTo[Self],
    addRequestInterceptor: RequestInterceptor => CallbackTo[Self],
    addResponseInterceptor: ResponseInterceptor => CallbackTo[Self],
    fullRequestInterceptors: CallbackTo[js.Array[FullRequestInterceptor]],
    fullResponseInterceptors: CallbackTo[js.Array[ResponseInterceptor]],
    header: (String, js.Any) => CallbackTo[Self],
    headers: CallbackTo[Headers],
    requestInterceptors: CallbackTo[js.Array[RequestInterceptor]],
    responseInterceptors: CallbackTo[js.Array[ResponseInterceptor]],
    url: CallbackTo[String]
  ): Endpoint[Self] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFullRequestInterceptor")(js.Any.fromFunction1((t0: typingsJapgolly.restfulJs.mod.FullRequestInterceptor) => addFullRequestInterceptor(t0).runNow()))
    __obj.updateDynamic("addFullResponseInterceptor")(js.Any.fromFunction1((t0: typingsJapgolly.restfulJs.mod.ResponseInterceptor) => addFullResponseInterceptor(t0).runNow()))
    __obj.updateDynamic("addRequestInterceptor")(js.Any.fromFunction1((t0: typingsJapgolly.restfulJs.mod.RequestInterceptor) => addRequestInterceptor(t0).runNow()))
    __obj.updateDynamic("addResponseInterceptor")(js.Any.fromFunction1((t0: typingsJapgolly.restfulJs.mod.ResponseInterceptor) => addResponseInterceptor(t0).runNow()))
    __obj.updateDynamic("fullRequestInterceptors")(fullRequestInterceptors.toJsFn)
    __obj.updateDynamic("fullResponseInterceptors")(fullResponseInterceptors.toJsFn)
    __obj.updateDynamic("header")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => header(t0, t1).runNow()))
    __obj.updateDynamic("headers")(headers.toJsFn)
    __obj.updateDynamic("requestInterceptors")(requestInterceptors.toJsFn)
    __obj.updateDynamic("responseInterceptors")(responseInterceptors.toJsFn)
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.asInstanceOf[Endpoint[Self]]
  }
}

