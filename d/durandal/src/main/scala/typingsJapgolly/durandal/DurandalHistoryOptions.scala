package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalHistoryOptions extends js.Object {
  /**
    * Use hash change when present.
    * @default true
    */
  var hashChange: js.UndefOr[Boolean] = js.undefined
  /**
    * Use push state when present.
    * @default false
    */
  var pushState: js.UndefOr[Boolean] = js.undefined
  /**
    * The url root used to extract the fragment when using push state.
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * The function that will be called back when the fragment changes.
    */
  var routeHandler: js.UndefOr[js.Function1[/* fragment */ String, Unit]] = js.undefined
  /**
    * Prevents loading of the current url when activating history.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Override default history init behavior by navigating directly to this route.
    */
  var startRoute: js.UndefOr[String] = js.undefined
}

object DurandalHistoryOptions {
  @scala.inline
  def apply(
    hashChange: js.UndefOr[Boolean] = js.undefined,
    pushState: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    routeHandler: /* fragment */ String => Callback = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    startRoute: String = null
  ): DurandalHistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hashChange)) __obj.updateDynamic("hashChange")(hashChange.asInstanceOf[js.Any])
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (routeHandler != null) __obj.updateDynamic("routeHandler")(js.Any.fromFunction1((t0: /* fragment */ java.lang.String) => routeHandler(t0).runNow()))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (startRoute != null) __obj.updateDynamic("startRoute")(startRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalHistoryOptions]
  }
}

