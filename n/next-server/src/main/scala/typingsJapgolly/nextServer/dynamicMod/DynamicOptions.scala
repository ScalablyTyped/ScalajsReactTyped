package typingsJapgolly.nextServer.dynamicMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nextServer.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render ? :(props : P, loaded : any): react.react._Global_.JSX.Element} */
trait DynamicOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ AnonError, Element | Null]] = js.undefined
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
  /**
    * @deprecated the modules option has been planned for removal
    */
  var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
  var webpack: js.UndefOr[js.Function0[_]] = js.undefined
}

object DynamicOptions {
  @scala.inline
  def apply[P](
    loadableGenerated: LoadableGeneratedOptions = null,
    loader: Loader[P] | LoaderMap = null,
    loading: /* hasErrorIsLoadingPastDelay */ AnonError => CallbackTo[Element | Null] = null,
    modules: js.UndefOr[CallbackTo[LoaderMap]] = js.undefined,
    render: (/* props */ P, /* loaded */ js.Any) => CallbackTo[Element] = null,
    ssr: js.UndefOr[Boolean] = js.undefined,
    webpack: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): DynamicOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1((t0: /* hasErrorIsLoadingPastDelay */ typingsJapgolly.nextServer.AnonError) => loading(t0).runNow()))
    modules.foreach(p => __obj.updateDynamic("modules")(p.toJsFn))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* props */ P, t1: /* loaded */ js.Any) => render(t0, t1).runNow()))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.asInstanceOf[js.Any])
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[DynamicOptions[P]]
  }
}

