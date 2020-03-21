package typingsJapgolly.tslint.exclusionsMod

import typingsJapgolly.std.Map
import typingsJapgolly.tslint.completedDocsRuleMod.DocType
import typingsJapgolly.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusions", "constructExclusionsMap")
@js.native
object constructExclusionsMap extends js.Object {
  def apply(ruleArguments: js.Array[IInputExclusionDescriptors]): Map[DocType, DocTypeExclusions] = js.native
}

