package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/prerelease", JSImport.Namespace)
@js.native
object prereleaseMod extends js.Object {
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def apply(version: String): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  def apply(version: ^): js.Array[String] | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): js.Array[String] | Null = js.native
}

