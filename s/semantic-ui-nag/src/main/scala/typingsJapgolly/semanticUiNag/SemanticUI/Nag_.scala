package typingsJapgolly.semanticUiNag.SemanticUI

import typingsJapgolly.semanticUiNag.JQuery
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typingsJapgolly.semanticUiNag.semanticUiNagBooleans.`false`
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.animation
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.className
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.clear
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.context
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.cookie
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.debug
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.destroy
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.detachable
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.displayTime
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.domain
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.easing
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.error
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.expires
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.hide
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.key
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.localstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.name
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.namespace
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.onHide
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.path
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.performance
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.persist
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.selector
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.sessionstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.setting
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.show
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.silent
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.speed
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.storageMethod
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.value
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nag_ extends js.Object {
  var settings: NagSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, name: animation): AnimationSettings = js.native
  def apply(behavior: setting, name: animation, value: AnimationSettings): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: detachable): Boolean = js.native
  def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: displayTime): Double = js.native
  def apply(behavior: setting, name: displayTime, value: Double): JQuery = js.native
  def apply(behavior: setting, name: domain): `false` | String = js.native
  def apply(behavior: setting, name: domain, value: String): JQuery = js.native
  def apply(behavior: setting, name: domain, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: easing): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: expires): Double = js.native
  def apply(behavior: setting, name: expires, value: Double): JQuery = js.native
  def apply(behavior: setting, name: key): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: key,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: path): String = js.native
  def apply(behavior: setting, name: path, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: persist): Boolean = js.native
  def apply(behavior: setting, name: persist, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: speed): Double = js.native
  def apply(behavior: setting, name: speed, value: Double): JQuery = js.native
  def apply(behavior: setting, name: storageMethod): cookie | localstorage | sessionstorage = js.native
  def apply(behavior: setting, name: storageMethod, value: cookie): JQuery = js.native
  def apply(behavior: setting, name: storageMethod, value: localstorage): JQuery = js.native
  def apply(behavior: setting, name: storageMethod, value: sessionstorage): JQuery = js.native
  def apply(behavior: setting, name: value): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: value,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: NagSettings): JQuery = js.native
  def apply(behavior: show): JQuery = js.native
  def apply(settings: NagSettings): JQuery = js.native
}

