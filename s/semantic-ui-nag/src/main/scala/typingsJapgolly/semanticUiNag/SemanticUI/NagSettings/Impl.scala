package typingsJapgolly.semanticUiNag.SemanticUI.NagSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiNag.JQuery
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typingsJapgolly.semanticUiNag.semanticUiNagBooleans.`false`
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.cookie
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.localstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  var animation: AnimationSettings
  // endregion
  // region DOM Settings
  var className: ClassNameSettings
  /**
    * @default false
    */
  var context: `false` | String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * @default false
    */
  var detachable: Boolean
  /**
    * set to zero to require manually dismissal, otherwise hides on its own
    *
    * @default 0
    */
  var displayTime: Double
  /**
    * @default false
    */
  var domain: `false` | String
  /**
    * @default 'easeOutQuad'
    */
  var easing: String
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * @default 30
    */
  var expires: Double
  /**
    * @default 'nag'
    */
  var key: js.Any
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * @default '/'
    */
  var path: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // region Behavior
  /**
    * allows cookie to be overridden
    *
    * @default false
    */
  var persist: Boolean
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * @default 500
    */
  var speed: Double
  /**
    * type of storage to use
    *
    * @default 'cookie'
    */
  var storageMethod: cookie | localstorage | sessionstorage
  /**
    * @default 'dismiss'
    */
  var value: js.Any
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  def onHide(): Unit
}

object Impl {
  @scala.inline
  def apply(
    animation: AnimationSettings,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    displayTime: Double,
    domain: `false` | String,
    easing: String,
    error: ErrorSettings,
    expires: Double,
    key: js.Any,
    name: String,
    namespace: String,
    onHide: Callback,
    path: String,
    performance: Boolean,
    persist: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    speed: Double,
    storageMethod: cookie | localstorage | sessionstorage,
    value: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], displayTime = displayTime.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], storageMethod = storageMethod.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onHide")(onHide.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

