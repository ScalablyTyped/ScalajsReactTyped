package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Defaults to 200, in milliseconds.
    *
    * Only show the loading component if the loader() has taken this long to succeed or error.
    */
  var delay: js.UndefOr[Double | `false` | Null] = js.undefined
  /**
    * React component displayed after delay until loader() succeeds. Also responsible for displaying errors.
    *
    * If you don't want to render anything you can pass a function that returns null
    * (this is considered a valid React component).
    */
  var loading: ComponentType[LoadingComponentProps]
  /**
    * Optional array of module paths that `Loadable.Capture`'s `report` function will be applied on during
    * server-side rendering. This helps the server know which modules were imported/used during SSR.
    * ```ts
    * Loadable({
    *   loader: () => import('./my-component'),
    *   modules: ['./my-component'],
    * });
    * ```
    */
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Disabled by default.
    *
    * After the specified time in milliseconds passes, the component's `timedOut` prop will be set to true.
    */
  var timeout: js.UndefOr[Double | `false` | Null] = js.undefined
  /**
    * An optional function which returns an array of Webpack module ids which you can get
    * with require.resolveWeak. This is used by the client (inside `Loadable.preloadReady`) to
    * guarantee each webpack module is preloaded before the first client render.
    * ```ts
    * Loadable({
    *  loader: () => import('./Foo'),
    *  webpack: () => [require.resolveWeak('./Foo')],
    * });
    * ```
    */
  var webpack: js.UndefOr[js.Function0[js.Array[String | Double]]] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    loading: ComponentType[LoadingComponentProps],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[CommonOptions]
  }
}

