package typingsJapgolly.semver.mod

import typingsJapgolly.semver.semverMod.^
import typingsJapgolly.semver.semverNumbers.`-1`
import typingsJapgolly.semver.semverNumbers.`0`
import typingsJapgolly.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "rcompare")
@js.native
object rcompare extends js.Object {
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}

