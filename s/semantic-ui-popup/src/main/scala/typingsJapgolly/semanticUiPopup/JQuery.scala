package typingsJapgolly.semanticUiPopup

import typingsJapgolly.semanticUiPopup.SemanticUI.Popup
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.PopupSettings
import typingsJapgolly.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`change content`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`inline`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.`set position`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.addTouchEvents
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.auto
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.boundary
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.className
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.click
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.closable
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.content
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.context
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.debug
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.delay
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.destroy
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.distanceAway
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.duration
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.error
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.exclusive
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.exists
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.focus
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hide
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hideOnScroll
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hover
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hoverable
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.html
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.jitter
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.lastResort
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.manual
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.maxSearchDepth
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.metadata
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.movePopup
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.name
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.namespace
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.observeChanges
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.offset
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.on
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onCreate
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onHidden
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onHide
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onRemove
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onShow
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onUnplaceable
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.onVisible
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.opposite
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.performance
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.position
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.prefer
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.preserve
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.reposition
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.scrollContext
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.selector
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.setFluidWidth
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.setting
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.show
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.silent
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.target
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.title
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.toggle
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.transition
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.variation
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("popup")
  var popup_Original: Popup = js.native
  def popup(): JQuery = js.native
  def popup(behavior: setting, name: `inline`): Boolean = js.native
  def popup(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: addTouchEvents): Boolean = js.native
  def popup(behavior: setting, name: addTouchEvents, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: boundary): String | JQuery = js.native
  def popup(behavior: setting, name: boundary, value: String): JQuery = js.native
  def popup(behavior: setting, name: boundary, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: className): ClassNameSettings = js.native
  def popup(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def popup(behavior: setting, name: closable): Boolean = js.native
  def popup(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: content): String = js.native
  def popup(behavior: setting, name: content, value: String): JQuery = js.native
  def popup(behavior: setting, name: context): String | JQuery = js.native
  def popup(behavior: setting, name: context, value: String): JQuery = js.native
  def popup(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: debug): Boolean = js.native
  def popup(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: delay): DelaySettings = js.native
  def popup(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def popup(behavior: setting, name: distanceAway): Double = js.native
  def popup(behavior: setting, name: distanceAway, value: Double): JQuery = js.native
  def popup(behavior: setting, name: duration): Double = js.native
  def popup(behavior: setting, name: duration, value: Double): JQuery = js.native
  def popup(behavior: setting, name: error): ErrorSettings = js.native
  def popup(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def popup(behavior: setting, name: exclusive): Boolean = js.native
  def popup(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: hideOnScroll): auto | `false` = js.native
  def popup(behavior: setting, name: hideOnScroll, value: `false`): JQuery = js.native
  def popup(behavior: setting, name: hideOnScroll, value: auto): JQuery = js.native
  def popup(behavior: setting, name: hoverable): Boolean = js.native
  def popup(behavior: setting, name: hoverable, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: html): String | JQuery = js.native
  def popup(behavior: setting, name: html, value: String): JQuery = js.native
  def popup(behavior: setting, name: html, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: jitter): Double = js.native
  def popup(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def popup(behavior: setting, name: lastResort): Boolean | String = js.native
  def popup(behavior: setting, name: lastResort, value: String): JQuery = js.native
  def popup(behavior: setting, name: lastResort, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: maxSearchDepth): Double = js.native
  def popup(behavior: setting, name: maxSearchDepth, value: Double): JQuery = js.native
  def popup(behavior: setting, name: metadata): MetadataSettings = js.native
  def popup(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def popup(behavior: setting, name: movePopup): Boolean = js.native
  def popup(behavior: setting, name: movePopup, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: name): String = js.native
  def popup(behavior: setting, name: namespace): String = js.native
  def popup(behavior: setting, name: namespace, value: String): JQuery = js.native
  def popup(behavior: setting, name: name, value: String): JQuery = js.native
  def popup(behavior: setting, name: observeChanges): Boolean = js.native
  def popup(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: offset): Double = js.native
  def popup(behavior: setting, name: offset, value: Double): JQuery = js.native
  def popup(behavior: setting, name: on): focus | click | hover | manual = js.native
  def popup(behavior: setting, name: onCreate): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onHidden): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onHidden,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onHide): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def popup(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onRemove): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onShow): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def popup(
    behavior: setting,
    name: onShow,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onUnplaceable): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onUnplaceable,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onVisible): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: on, value: click): JQuery = js.native
  def popup(behavior: setting, name: on, value: focus): JQuery = js.native
  def popup(behavior: setting, name: on, value: hover): JQuery = js.native
  def popup(behavior: setting, name: on, value: manual): JQuery = js.native
  def popup(behavior: setting, name: performance): Boolean = js.native
  def popup(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.popup): `false` | String | JQuery = js.native
  def popup(
    behavior: setting,
    name: typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.popup,
    value: String
  ): JQuery = js.native
  def popup(
    behavior: setting,
    name: typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.popup,
    value: JQuery
  ): JQuery = js.native
  def popup(
    behavior: setting,
    name: typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.popup,
    value: `false`
  ): JQuery = js.native
  def popup(behavior: setting, name: position): String = js.native
  def popup(behavior: setting, name: position, value: String): JQuery = js.native
  def popup(behavior: setting, name: prefer): adjacent | opposite = js.native
  def popup(behavior: setting, name: prefer, value: adjacent): JQuery = js.native
  def popup(behavior: setting, name: prefer, value: opposite): JQuery = js.native
  def popup(behavior: setting, name: preserve): Boolean = js.native
  def popup(behavior: setting, name: preserve, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: scrollContext): String | JQuery = js.native
  def popup(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def popup(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: selector): SelectorSettings = js.native
  def popup(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def popup(behavior: setting, name: setFluidWidth): Boolean = js.native
  def popup(behavior: setting, name: setFluidWidth, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: silent): Boolean = js.native
  def popup(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: target): `false` | String | JQuery = js.native
  def popup(behavior: setting, name: target, value: String): JQuery = js.native
  def popup(behavior: setting, name: target, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: target, value: `false`): JQuery = js.native
  def popup(behavior: setting, name: title): String = js.native
  def popup(behavior: setting, name: title, value: String): JQuery = js.native
  def popup(behavior: setting, name: transition): String = js.native
  def popup(behavior: setting, name: transition, value: String): JQuery = js.native
  def popup(behavior: setting, name: variation): String = js.native
  def popup(behavior: setting, name: variation, value: String): JQuery = js.native
  def popup(behavior: setting, name: verbose): Boolean = js.native
  def popup(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def popup(settings: PopupSettings): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindclickaway(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindcloseonscroll(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindtouchclose(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def popup_changecontent(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: exists): Boolean = js.native
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def popup_getpopup(behavior: `get popup`): JQuery = js.native
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def popup_hideall(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def popup_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def popup_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def popup_removepopup(behavior: `remove popup`): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: reposition): JQuery = js.native
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def popup_setposition(behavior: `set position`, position: String): JQuery = js.native
  @JSName("popup")
  def popup_setting(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: toggle): JQuery = js.native
}

