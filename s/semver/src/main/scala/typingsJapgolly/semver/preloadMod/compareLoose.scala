package typingsJapgolly.semver.preloadMod

import typingsJapgolly.semver.semverMod.^
import typingsJapgolly.semver.semverNumbers.`-1`
import typingsJapgolly.semver.semverNumbers.`0`
import typingsJapgolly.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "compareLoose")
@js.native
object compareLoose extends js.Object {
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
}

