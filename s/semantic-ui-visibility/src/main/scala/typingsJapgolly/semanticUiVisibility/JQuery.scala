package typingsJapgolly.semanticUiVisibility

import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typingsJapgolly.semanticUiVisibility.SemanticUI.VisibilitySettings
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.`type`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.checkOnRefresh
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.className
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.context
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.continuous
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.debug
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.duration
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.error
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.image
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.includeMargin
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.initialCheck
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.name
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.namespace
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.observeChanges
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.offset
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onAllLoaded
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassedReverse
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisible
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisibleReverse
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onFixed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onLoad
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onOffScreen
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onOnScreen
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onPassing
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onPassingReverse
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onRefresh
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassedReverse
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisible
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisibleReverse
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onUnfixed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.onUpdate
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.once
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.performance
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnLoad
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnResize
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.setting
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.silent
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.throttle
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.transition
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.verbose
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.zIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("visibility")
  var visibility_Original: Visibility = js.native
  def visibility(): JQuery = js.native
  def visibility(behavior: setting, name: `type`): `false` | image | fixed = js.native
  def visibility(behavior: setting, name: `type`, value: `false`): JQuery = js.native
  def visibility(behavior: setting, name: `type`, value: fixed): JQuery = js.native
  def visibility(behavior: setting, name: `type`, value: image): JQuery = js.native
  def visibility(behavior: setting, name: checkOnRefresh): Boolean = js.native
  def visibility(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: className): ClassNameSettings = js.native
  def visibility(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def visibility(behavior: setting, name: context): String | JQuery = js.native
  def visibility(behavior: setting, name: context, value: String): JQuery = js.native
  def visibility(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def visibility(behavior: setting, name: continuous): Boolean = js.native
  def visibility(behavior: setting, name: continuous, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: debug): Boolean = js.native
  def visibility(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: duration): Double = js.native
  def visibility(behavior: setting, name: duration, value: Double): JQuery = js.native
  def visibility(behavior: setting, name: error): ErrorSettings = js.native
  def visibility(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def visibility(behavior: setting, name: includeMargin): Boolean = js.native
  def visibility(behavior: setting, name: includeMargin, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: initialCheck): Boolean = js.native
  def visibility(behavior: setting, name: initialCheck, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: name): String = js.native
  def visibility(behavior: setting, name: namespace): String = js.native
  def visibility(behavior: setting, name: namespace, value: String): JQuery = js.native
  def visibility(behavior: setting, name: name, value: String): JQuery = js.native
  def visibility(behavior: setting, name: observeChanges): Boolean = js.native
  def visibility(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: offset): Double = js.native
  def visibility(behavior: setting, name: offset, value: Double): JQuery = js.native
  def visibility(behavior: setting, name: onAllLoaded): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onBottomPassed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onBottomPassedReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onBottomVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onBottomVisibleReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onFixed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onLoad): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onOffScreen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onOnScreen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onPassing): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onPassingReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onRefresh): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onTopPassed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onTopPassedReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onTopVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onTopVisibleReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onUnfixed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def visibility(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def visibility(behavior: setting, name: onUpdate): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = js.native
  def visibility(
    behavior: setting,
    name: onUpdate,
    value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ): JQuery = js.native
  def visibility(behavior: setting, name: once): Boolean = js.native
  def visibility(behavior: setting, name: once, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: performance): Boolean = js.native
  def visibility(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: refreshOnLoad): Boolean = js.native
  def visibility(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: refreshOnResize): Boolean = js.native
  def visibility(behavior: setting, name: refreshOnResize, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: silent): Boolean = js.native
  def visibility(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: throttle): `false` | Double = js.native
  def visibility(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def visibility(behavior: setting, name: throttle, value: `false`): JQuery = js.native
  def visibility(behavior: setting, name: transition): `false` | String = js.native
  def visibility(behavior: setting, name: transition, value: String): JQuery = js.native
  def visibility(behavior: setting, name: transition, value: `false`): JQuery = js.native
  def visibility(behavior: setting, name: verbose): Boolean = js.native
  def visibility(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def visibility(behavior: setting, name: zIndex): Double = js.native
  def visibility(behavior: setting, name: zIndex, value: Double): JQuery = js.native
  def visibility(settings: VisibilitySettings): JQuery = js.native
  @JSName("visibility")
  def visibility_destroy(behavior: destroy): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  @JSName("visibility")
  def visibility_disablecallbacks(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  @JSName("visibility")
  def visibility_enablecallbacks(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  @JSName("visibility")
  def visibility_getelementcalculations(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  @JSName("visibility")
  def visibility_getpixelspassed(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  @JSName("visibility")
  def visibility_getscreencalculations(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  @JSName("visibility")
  def visibility_getscreensize(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  @JSName("visibility")
  def visibility_isoffscreen(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  @JSName("visibility")
  def visibility_isonscreen(behavior: `is on screen`): Boolean = js.native
  @JSName("visibility")
  def visibility_setting(behavior: setting, value: VisibilitySettings): JQuery = js.native
}

