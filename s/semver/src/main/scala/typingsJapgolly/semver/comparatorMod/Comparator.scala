package typingsJapgolly.semver.comparatorMod

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverStrings.Equalssign
import typingsJapgolly.semver.semverStrings.Greaterthansign
import typingsJapgolly.semver.semverStrings.GreaterthansignEqualssign
import typingsJapgolly.semver.semverStrings.Lessthansign
import typingsJapgolly.semver.semverStrings.LessthansignEqualssign
import typingsJapgolly.semver.semverStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator extends js.Object {
  var loose: Boolean = js.native
  var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
  var options: Options = js.native
  var semver: typingsJapgolly.semver.semverMod.^ = js.native
  var value: String = js.native
  def intersects(comp: Comparator): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
  def parse(comp: String): Unit = js.native
  def test(version: String): Boolean = js.native
  def test(version: typingsJapgolly.semver.semverMod.^): Boolean = js.native
}

