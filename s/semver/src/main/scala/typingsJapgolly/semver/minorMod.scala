package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/minor", JSImport.Namespace)
@js.native
object minorMod extends js.Object {
  /**
    * Return the minor version number.
    */
  def apply(version: String): Double = js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  def apply(version: ^): Double = js.native
  def apply(version: ^, optionsOrLoose: Boolean): Double = js.native
  def apply(version: ^, optionsOrLoose: Options): Double = js.native
}

