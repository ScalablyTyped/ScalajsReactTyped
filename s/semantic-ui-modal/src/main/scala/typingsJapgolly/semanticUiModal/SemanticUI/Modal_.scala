package typingsJapgolly.semanticUiModal.SemanticUI

import typingsJapgolly.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsJapgolly.semanticUiModal.JQuery
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typingsJapgolly.semanticUiModal.semanticUiModalBooleans.`false`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`attach events`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`can fit`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide all`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide others`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`is active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`set active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.allowMultiple
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.autofocus
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.className
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.closable
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.context
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.debug
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.destroy
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.detachable
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.dimmerSettings
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.duration
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.error
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.hide
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.keyboardShortcuts
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.name
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.namespace
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.observeChanges
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.offset
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onApprove
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onDeny
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onHidden
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onHide
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onShow
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.onVisible
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.performance
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.queue
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.refresh
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.selector
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.setting
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.show
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.silent
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.toggle
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.transition
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal_ extends js.Object {
  var settings: ModalSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Caches current modal size
    */
  def apply(behavior: `cache sizes`): JQuery = js.native
  /**
    * Returns whether the modal can fit on the page
    */
  def apply(behavior: `can fit`): Boolean = js.native
  /**
    * Hides all visible modals in the same dimmer
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Hides associated page dimmer
    */
  def apply(behavior: `hide dimmer`): JQuery = js.native
  /**
    * Hides all modals not selected modal in a dimmer
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether the modal is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Sets modal to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Shows associated page dimmer
    */
  def apply(behavior: `show dimmer`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides the modal
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes centering of modal on page
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: allowMultiple): Boolean = js.native
  def apply(behavior: setting, name: allowMultiple, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: autofocus): Boolean = js.native
  def apply(behavior: setting, name: autofocus, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable): Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: context): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: detachable): Boolean = js.native
  def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimmerSettings): DimmerSettings = js.native
  def apply(behavior: setting, name: dimmerSettings, value: DimmerSettings): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: keyboardShortcuts): Boolean = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onApprove): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onApprove,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onDeny): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onDeny,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHidden): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: queue): Boolean = js.native
  def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: ModalSettings): JQuery = js.native
  /**
    * Shows the modal
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles the modal
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: ModalSettings): JQuery = js.native
}

