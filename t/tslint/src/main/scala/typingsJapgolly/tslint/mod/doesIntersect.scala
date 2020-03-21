package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.IDisabledInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "doesIntersect")
@js.native
object doesIntersect extends js.Object {
  def apply(
    failure: typingsJapgolly.tslint.ruleMod.RuleFailure,
    disabledIntervals: js.Array[IDisabledInterval]
  ): Boolean = js.native
}

