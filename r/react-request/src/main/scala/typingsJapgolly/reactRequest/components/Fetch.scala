package typingsJapgolly.reactRequest.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import typingsJapgolly.reactRequest.mod.FetchProps
import typingsJapgolly.reactRequest.mod.FetchResponse
import typingsJapgolly.reactRequest.mod.RenderProps
import typingsJapgolly.reactRequest.mod.ResponseType
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fetch {
  def apply[T](
    url: String,
    afterFetch: /* args */ FetchResponse[T] => Callback = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    responseType: ResponseType = null,
    signal: AbortSignal = null,
    transformData: /* data */ js.Any => CallbackTo[T] = null,
    window: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* renderProps */ RenderProps[T] => CallbackTo[Node] = null
  ): UnmountedWithRoot[FetchProps[T], typingsJapgolly.reactRequest.mod.Fetch[T], Unit, FetchProps[T]] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* renderProps */ typingsJapgolly.reactRequest.mod.RenderProps[T]) => children(t0).runNow()))
    if (afterFetch != null) __obj.updateDynamic("afterFetch")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactRequest.mod.FetchResponse[T]) => afterFetch(t0).runNow()))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (transformData != null) __obj.updateDynamic("transformData")(js.Any.fromFunction1((t0: /* data */ js.Any) => transformData(t0).runNow()))
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRequest.mod.FetchProps[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactRequest.mod.Fetch[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRequest.mod.FetchProps[T]])
  }
  @JSImport("react-request", "Fetch")
  @js.native
  object componentImport extends js.Object
  
}

