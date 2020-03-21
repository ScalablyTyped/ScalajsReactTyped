package typingsJapgolly.semver

import typingsJapgolly.semver.mod.CoerceOptions
import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/coerce", JSImport.Namespace)
@js.native
object coerceMod extends js.Object {
  def apply(): ^  | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], options: CoerceOptions): ^  | Null = js.native
  /**
    * Coerces a string to SemVer if possible
    */
  def apply(version: String): ^  | Null = js.native
  def apply(version: String, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Double): ^  | Null = js.native
  def apply(version: Double, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Null, options: CoerceOptions): ^  | Null = js.native
  def apply(version: ^): ^  | Null = js.native
  def apply(version: ^, options: CoerceOptions): ^  | Null = js.native
}

