package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/ranges/ltr", JSImport.Namespace)
@js.native
object ltrMod extends js.Object {
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: String): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: ^): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typingsJapgolly.semver.semverMod.^, range: ^, optionsOrLoose: Options): Boolean = js.native
}

