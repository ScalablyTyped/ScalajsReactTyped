package typingsJapgolly.jestDiff

import typingsJapgolly.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/diffStrings", JSImport.Namespace)
@js.native
object diffStringsMod extends js.Object {
  def default(a: String, b: String): js.Array[Diff] = js.native
}

