package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithRender[Props, Exports /* <: js.Object */]
  extends CommonOptions
     with Options[Props, Exports] {
  /**
    * Function returning a promise which returns an object to be passed to `render` on success.
    */
  def loader(): js.Promise[Exports]
  /**
    * If you want to customize what gets rendered from your loader you can also pass `render`.
    *
    * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
    *
    * ```ts
    * Loadable({
    *     // ...
    *     render(loaded, props) {
    *         const Component = loaded.default;
    *         return <Component {...props} />
    *     }
    * });
    * ```
    */
  def render(loaded: Exports, props: Props): Node
}

object OptionsWithRender {
  @scala.inline
  def apply[Props, Exports /* <: js.Object */](
    loader: CallbackTo[js.Promise[Exports]],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => CallbackTo[Node],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): OptionsWithRender[Props, Exports] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("loader")(loader.toJsFn)
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: Exports, t1: Props) => render(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
  }
}

