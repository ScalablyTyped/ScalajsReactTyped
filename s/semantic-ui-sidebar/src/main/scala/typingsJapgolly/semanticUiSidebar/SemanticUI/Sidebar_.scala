package typingsJapgolly.semanticUiSidebar.SemanticUI

import typingsJapgolly.semanticUiSidebar.JQuery
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.auto
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.className
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.closable
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.context
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.debug
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.defaultTransition
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.delaySetup
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.dimPage
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.duration
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.easing
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.error
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.exclusive
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.hide
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.mobileTransition
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.name
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.namespace
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.onChange
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.onHidden
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.onHide
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.onShow
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.onVisible
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.performance
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.regExp
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.returnScroll
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.scrollLock
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.selector
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.setting
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.show
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.silent
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.toggle
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.transition
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.useLegacy
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sidebar_ extends js.Object {
  var settings: SidebarSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  def apply(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  def apply(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  def apply(behavior: `get transition event`): String = js.native
  /**
    * Returns whether sidebar is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  def apply(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  def apply(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  def apply(behavior: `remove body CSS`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides sidebar
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable): Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: context): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: defaultTransition): DefaultTransitionSettings = js.native
  def apply(behavior: setting, name: defaultTransition, value: DefaultTransitionSettings): JQuery = js.native
  def apply(behavior: setting, name: delaySetup): Boolean = js.native
  def apply(behavior: setting, name: delaySetup, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimPage): Boolean = js.native
  def apply(behavior: setting, name: dimPage, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: easing): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: exclusive): Boolean = js.native
  def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: mobileTransition): String = js.native
  def apply(behavior: setting, name: mobileTransition, value: String): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHidden): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: returnScroll): Boolean = js.native
  def apply(behavior: setting, name: returnScroll, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: scrollLock): Boolean = js.native
  def apply(behavior: setting, name: scrollLock, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: useLegacy): auto | Boolean = js.native
  def apply(behavior: setting, name: useLegacy, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: useLegacy, value: auto): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: SidebarSettings): JQuery = js.native
}

