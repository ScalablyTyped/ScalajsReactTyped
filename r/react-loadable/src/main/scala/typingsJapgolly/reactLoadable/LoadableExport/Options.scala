package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLoadable.AnonDefault
import typingsJapgolly.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typingsJapgolly.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object

object Options {
  @scala.inline
  def OptionsWithoutRender[Props, Exports /* <: js.Object */](
    loader: CallbackTo[js.Promise[ComponentType[Props] | AnonDefault[Props]]],
    loading: ComponentType[LoadingComponentProps],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("loader")(loader.toJsFn)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
  @scala.inline
  def OptionsWithRender[Props, Exports /* <: js.Object */](
    loader: CallbackTo[js.Promise[Exports]],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => CallbackTo[Node],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("loader")(loader.toJsFn)
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: Exports, t1: Props) => render(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
}

