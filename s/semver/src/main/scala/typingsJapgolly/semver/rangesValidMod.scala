package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/ranges/valid", JSImport.Namespace)
@js.native
object rangesValidMod extends js.Object {
  def apply(): String = js.native
  def apply(range: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String = js.native
  def apply(range: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String = js.native
  /**
    * Return the valid range or null if it's not valid
    */
  def apply(range: String): String = js.native
  def apply(range: String, optionsOrLoose: Boolean): String = js.native
  def apply(range: String, optionsOrLoose: Options): String = js.native
  def apply(range: Null, optionsOrLoose: Boolean): String = js.native
  def apply(range: Null, optionsOrLoose: Options): String = js.native
  def apply(range: ^): String = js.native
  def apply(range: ^, optionsOrLoose: Boolean): String = js.native
  def apply(range: ^, optionsOrLoose: Options): String = js.native
}

