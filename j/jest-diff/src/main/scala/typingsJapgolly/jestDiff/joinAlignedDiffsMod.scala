package typingsJapgolly.jestDiff

import typingsJapgolly.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/joinAlignedDiffs", JSImport.Namespace)
@js.native
object joinAlignedDiffsMod extends js.Object {
  def joinAlignedDiffsExpand(diffs: js.Array[Diff]): String = js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff]): String = js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], nContextLines: Double): String = js.native
}

