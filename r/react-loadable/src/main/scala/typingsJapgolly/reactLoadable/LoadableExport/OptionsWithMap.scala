package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithMap[Props, Exports /* <: StringDictionary[js.Any] */] extends CommonOptions {
  /**
    * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
    */
  var loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typingsJapgolly.reactLoadable.reactLoadableStrings.OptionsWithMap with Exports
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

object OptionsWithMap {
  @scala.inline
  def apply[Props, Exports /* <: StringDictionary[js.Any] */](
    loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typingsJapgolly.reactLoadable.reactLoadableStrings.OptionsWithMap with Exports,
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => CallbackTo[Node],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: js.UndefOr[CallbackTo[js.Array[String | Double]]] = js.undefined
  ): OptionsWithMap[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: Exports, t1: Props) => render(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
  }
}

