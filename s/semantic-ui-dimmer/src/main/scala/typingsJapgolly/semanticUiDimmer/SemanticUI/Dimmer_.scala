package typingsJapgolly.semanticUiDimmer.SemanticUI

import typingsJapgolly.semanticUiDimmer.JQuery
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.className
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.closable
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.create
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.debug
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.dimmerName
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.duration
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.error
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hide
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hover
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.name
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.namespace
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.on
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.onChange
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.onHide
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.onShow
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.opacity
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.performance
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.selector
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.setting
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.show
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.silent
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.template
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.toggle
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.transition
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.useCSS
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.variation
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimmer_ extends js.Object {
  var settings: DimmerSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  def apply(behavior: `add content`, element: String): JQuery = js.native
  def apply(behavior: `add content`, element: JQuery): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  def apply(behavior: `get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  def apply(behavior: `get duration`): Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  def apply(behavior: `has dimmer`): Boolean = js.native
  /**
    * Whether section's dimmer is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  def apply(behavior: `is dimmable`): Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  def apply(behavior: `is dimmer`): Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  def apply(behavior: `is enabled`): Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  def apply(behavior: `is page dimmer`): Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  def apply(behavior: `is page`): Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  def apply(behavior: `set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  def apply(behavior: `set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  def apply(behavior: `set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  def apply(behavior: `set opacity`, opacity: Double): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  def apply(behavior: `set page dimmer`): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  def apply(behavior: create): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dimmer
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable): auto | Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: closable, value: auto): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimmerName): `false` | String = js.native
  def apply(behavior: setting, name: dimmerName, value: String): JQuery = js.native
  def apply(behavior: setting, name: dimmerName, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: duration): Double | DurationSettings = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: duration, value: DurationSettings): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: on): `false` | hover | click = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: on, value: click): JQuery = js.native
  def apply(behavior: setting, name: on, value: hover): JQuery = js.native
  def apply(behavior: setting, name: opacity): auto | Double = js.native
  def apply(behavior: setting, name: opacity, value: Double): JQuery = js.native
  def apply(behavior: setting, name: opacity, value: auto): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: template): TemplateSettings = js.native
  def apply(behavior: setting, name: template, value: TemplateSettings): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: useCSS): Boolean = js.native
  def apply(behavior: setting, name: useCSS, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: variation): `false` | String = js.native
  def apply(behavior: setting, name: variation, value: String): JQuery = js.native
  def apply(behavior: setting, name: variation, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: DimmerSettings): JQuery = js.native
  /**
    * Shows dimmer
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DimmerSettings): JQuery = js.native
}

