package typingsJapgolly.tslint.classExclusionMod

import typingsJapgolly.std.Set
import typingsJapgolly.tslint.completedDocsRuleMod.Location
import typingsJapgolly.tslint.completedDocsRuleMod.Privacy
import typingsJapgolly.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
@js.native
class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
  val locations: Set[Location] = js.native
  val privacies: Set[Privacy] = js.native
  var shouldLocationBeDocumented: js.Any = js.native
  var shouldPrivacyBeDocumented: js.Any = js.native
}

