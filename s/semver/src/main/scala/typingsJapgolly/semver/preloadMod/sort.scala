package typingsJapgolly.semver.preloadMod

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "sort")
@js.native
object sort extends js.Object {
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  def apply[T /* <: String | ^  */](list: js.Array[T]): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}

