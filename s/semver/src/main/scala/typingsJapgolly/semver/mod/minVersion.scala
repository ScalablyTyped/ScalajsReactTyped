package typingsJapgolly.semver.mod

import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "minVersion")
@js.native
object minVersion extends js.Object {
  /**
    * Return the lowest version that can possibly match the given range.
    */
  def apply(range: String): ^  | Null = js.native
  def apply(range: String, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(range: String, optionsOrLoose: Options): ^  | Null = js.native
  def apply(range: typingsJapgolly.semver.rangeMod.^): ^  | Null = js.native
  def apply(range: typingsJapgolly.semver.rangeMod.^, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(range: typingsJapgolly.semver.rangeMod.^, optionsOrLoose: Options): ^  | Null = js.native
}

