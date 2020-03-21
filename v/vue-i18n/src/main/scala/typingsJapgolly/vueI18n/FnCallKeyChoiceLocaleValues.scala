package typingsJapgolly.vueI18n

import typingsJapgolly.vueI18n.mod.VueI18n.Choice
import typingsJapgolly.vueI18n.mod.VueI18n.Locale
import typingsJapgolly.vueI18n.mod.VueI18n.Path
import typingsJapgolly.vueI18n.mod.VueI18n.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallKeyChoiceLocaleValues extends js.Object {
  def apply(key: Path): String = js.native
  def apply(key: Path, choice: Choice): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale, values: Values): String = js.native
  def apply(key: Path, choice: Choice, values: Values): String = js.native
}

