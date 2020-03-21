package typingsJapgolly.tslint.blockExclusionMod

import typingsJapgolly.std.Set
import typingsJapgolly.tslint.completedDocsRuleMod.Visibility
import typingsJapgolly.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
@js.native
class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
  val visibilities: Set[Visibility] = js.native
}

