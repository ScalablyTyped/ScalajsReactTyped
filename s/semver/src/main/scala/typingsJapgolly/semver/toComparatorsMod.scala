package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/ranges/to-comparators", JSImport.Namespace)
@js.native
object toComparatorsMod extends js.Object {
  /**
    * Mostly just for testing and legacy API reasons
    */
  def apply(range: String): String = js.native
  def apply(range: String, optionsOrLoose: Boolean): String = js.native
  def apply(range: String, optionsOrLoose: Options): String = js.native
  def apply(range: ^): String = js.native
  def apply(range: ^, optionsOrLoose: Boolean): String = js.native
  def apply(range: ^, optionsOrLoose: Options): String = js.native
}

