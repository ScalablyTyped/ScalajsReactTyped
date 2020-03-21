package typingsJapgolly.semanticUiSticky

import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsJapgolly.semanticUiSticky.semanticUiStickyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, keyof semantic-ui-sticky.SemanticUI.StickySettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var bottomOffset: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var context: js.UndefOr[`false` | String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onBottom: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onReposition: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onScroll: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onStick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onTop: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onUnstick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var pushing: js.UndefOr[Boolean] = js.undefined
  var scrollContext: js.UndefOr[String | JQuery] = js.undefined
  var setSize: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    bottomOffset: Int | Double = null,
    className: ClassNameSettings = null,
    context: `false` | String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    jitter: Int | Double = null,
    name: String = null,
    namespace: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onBottom: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onReposition: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onScroll: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onStick: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onTop: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onUnstick: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    pushing: js.UndefOr[Boolean] = js.undefined,
    scrollContext: String | JQuery = null,
    setSize: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(onBottom.asInstanceOf[js.Any])
    if (onReposition != null) __obj.updateDynamic("onReposition")(onReposition.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onStick != null) __obj.updateDynamic("onStick")(onStick.asInstanceOf[js.Any])
    if (onTop != null) __obj.updateDynamic("onTop")(onTop.asInstanceOf[js.Any])
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(onUnstick.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.asInstanceOf[js.Any])
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (!js.isUndefined(setSize)) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

