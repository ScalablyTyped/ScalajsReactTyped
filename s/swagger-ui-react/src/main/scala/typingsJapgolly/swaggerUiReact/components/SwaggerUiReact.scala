package typingsJapgolly.swaggerUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.swaggerUiReact.mod.Plugin
import typingsJapgolly.swaggerUiReact.mod.Request
import typingsJapgolly.swaggerUiReact.mod.Response
import typingsJapgolly.swaggerUiReact.mod.SwaggerUIProps
import typingsJapgolly.swaggerUiReact.mod.System
import typingsJapgolly.swaggerUiReact.mod.default
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.full
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.list
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwaggerUiReact {
  def apply(
    defaultModelExpandDepth: Int | Double = null,
    docExpansion: list | full | none = null,
    onComplete: /* system */ System => Callback = null,
    plugins: js.Array[Plugin] = null,
    requestInterceptor: /* req */ Request => CallbackTo[Request | js.Promise[Request]] = null,
    responseInterceptor: /* res */ Response => CallbackTo[Response | js.Promise[Response]] = null,
    spec: js.Object = null,
    url: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwaggerUIProps, default, Unit, SwaggerUIProps] = {
    val __obj = js.Dynamic.literal()
  
      if (defaultModelExpandDepth != null) __obj.updateDynamic("defaultModelExpandDepth")(defaultModelExpandDepth.asInstanceOf[js.Any])
    if (docExpansion != null) __obj.updateDynamic("docExpansion")(docExpansion.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* system */ typingsJapgolly.swaggerUiReact.mod.System) => onComplete(t0).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (requestInterceptor != null) __obj.updateDynamic("requestInterceptor")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.swaggerUiReact.mod.Request) => requestInterceptor(t0).runNow()))
    if (responseInterceptor != null) __obj.updateDynamic("responseInterceptor")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.swaggerUiReact.mod.Response) => responseInterceptor(t0).runNow()))
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.swaggerUiReact.mod.SwaggerUIProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.swaggerUiReact.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.swaggerUiReact.mod.SwaggerUIProps])(children: _*)
  }
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

