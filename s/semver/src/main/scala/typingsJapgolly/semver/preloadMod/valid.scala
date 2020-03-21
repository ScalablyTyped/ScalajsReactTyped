package typingsJapgolly.semver.preloadMod

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "valid")
@js.native
object valid extends js.Object {
  def apply(): String | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String | Null = js.native
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  def apply(version: String): String | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: String, optionsOrLoose: Options): String | Null = js.native
  def apply(version: Null, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: Null, optionsOrLoose: Options): String | Null = js.native
  def apply(version: ^): String | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): String | Null = js.native
}

