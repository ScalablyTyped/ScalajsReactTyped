package typingsJapgolly.semanticUiSticky

import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky
import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsJapgolly.semanticUiSticky.SemanticUI.StickySettings
import typingsJapgolly.semanticUiSticky.semanticUiStickyBooleans.`false`
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.bottomOffset
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.className
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.context
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.debug
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.destroy
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.error
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.jitter
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.name
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.namespace
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.observeChanges
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.offset
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onBottom
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onReposition
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onScroll
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onStick
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onTop
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.onUnstick
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.performance
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.pushing
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.refresh
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.scrollContext
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.setSize
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.setting
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.silent
import typingsJapgolly.semanticUiSticky.semanticUiStickyStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sticky")
  var sticky_Original: Sticky = js.native
  def sticky(): JQuery = js.native
  def sticky(behavior: setting, name: bottomOffset): Double = js.native
  def sticky(behavior: setting, name: bottomOffset, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: className): ClassNameSettings = js.native
  def sticky(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def sticky(behavior: setting, name: context): `false` | String | JQuery = js.native
  def sticky(behavior: setting, name: context, value: String): JQuery = js.native
  def sticky(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def sticky(behavior: setting, name: context, value: `false`): JQuery = js.native
  def sticky(behavior: setting, name: debug): Boolean = js.native
  def sticky(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: error): ErrorSettings = js.native
  def sticky(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def sticky(behavior: setting, name: jitter): Double = js.native
  def sticky(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: name): String = js.native
  def sticky(behavior: setting, name: namespace): String = js.native
  def sticky(behavior: setting, name: namespace, value: String): JQuery = js.native
  def sticky(behavior: setting, name: name, value: String): JQuery = js.native
  def sticky(behavior: setting, name: observeChanges): Boolean = js.native
  def sticky(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: offset): Double = js.native
  def sticky(behavior: setting, name: offset, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: onBottom): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onBottom, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onReposition): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onReposition, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onScroll): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onScroll, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onStick): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onStick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onTop): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onTop, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onUnstick): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onUnstick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: performance): Boolean = js.native
  def sticky(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: pushing): Boolean = js.native
  def sticky(behavior: setting, name: pushing, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: scrollContext): String | JQuery = js.native
  def sticky(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def sticky(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def sticky(behavior: setting, name: setSize): Boolean = js.native
  def sticky(behavior: setting, name: setSize, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: silent): Boolean = js.native
  def sticky(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: verbose): Boolean = js.native
  def sticky(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def sticky(settings: StickySettings): JQuery = js.native
  @JSName("sticky")
  def sticky_destroy(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: refresh): JQuery = js.native
  @JSName("sticky")
  def sticky_setting(behavior: setting, value: StickySettings): JQuery = js.native
}

