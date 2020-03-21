package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.tslint.ruleMod.IDisabledInterval
import typingsJapgolly.tslint.ruleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "doesIntersect")
@js.native
object doesIntersect extends js.Object {
  def apply(failure: RuleFailure, disabledIntervals: js.Array[IDisabledInterval]): Boolean = js.native
}

