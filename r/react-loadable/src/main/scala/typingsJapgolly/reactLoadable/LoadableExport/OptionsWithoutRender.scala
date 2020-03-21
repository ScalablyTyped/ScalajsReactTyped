package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLoadable.AnonDefault
import typingsJapgolly.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithoutRender[Props]
  extends CommonOptions
     with Options[Props, js.Any] {
  /**
    * Function returning a promise which returns a React component displayed on success.
    *
    * Resulting React component receives all the props passed to the generated component.
    */
  def loader(): js.Promise[ComponentType[Props] | AnonDefault[Props]]
}

object OptionsWithoutRender {
  @scala.inline
  def apply[Props](
    loader: CallbackTo[js.Promise[ComponentType[Props] | AnonDefault[Props]]],
    loading: ComponentType[LoadingComponentProps],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): OptionsWithoutRender[Props] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("loader")(loader.toJsFn)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[OptionsWithoutRender[Props]]
  }
}

