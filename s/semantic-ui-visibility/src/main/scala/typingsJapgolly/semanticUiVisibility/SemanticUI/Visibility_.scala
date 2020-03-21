package typingsJapgolly.semanticUiVisibility.SemanticUI

import typingsJapgolly.semanticUiVisibility.JQuery
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typingsJapgolly.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
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
trait Visibility_ extends js.Object {
  var settings: VisibilitySettings = js.native
  def apply(): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  def apply(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  def apply(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  def apply(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  def apply(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  def apply(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  def apply(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  def apply(behavior: `is on screen`): Boolean = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: `type`): `false` | image | fixed = js.native
  def apply(behavior: setting, name: `type`, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: fixed): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: image): JQuery = js.native
  def apply(behavior: setting, name: checkOnRefresh): Boolean = js.native
  def apply(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: continuous): Boolean = js.native
  def apply(behavior: setting, name: continuous, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: includeMargin): Boolean = js.native
  def apply(behavior: setting, name: includeMargin, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: initialCheck): Boolean = js.native
  def apply(behavior: setting, name: initialCheck, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onAllLoaded): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassedReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onFixed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLoad): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOffScreen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOnScreen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassing): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassingReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onRefresh): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassedReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisibleReverse): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUnfixed): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUpdate): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = js.native
  def apply(
    behavior: setting,
    name: onUpdate,
    value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: once): Boolean = js.native
  def apply(behavior: setting, name: once, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnLoad): Boolean = js.native
  def apply(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnResize): Boolean = js.native
  def apply(behavior: setting, name: refreshOnResize, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: throttle): `false` | Double = js.native
  def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: transition): `false` | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: zIndex): Double = js.native
  def apply(behavior: setting, name: zIndex, value: Double): JQuery = js.native
  def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
  def apply(settings: VisibilitySettings): JQuery = js.native
}

