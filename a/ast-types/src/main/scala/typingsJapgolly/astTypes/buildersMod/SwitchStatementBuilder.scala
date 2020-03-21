package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCases
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SwitchCaseKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatementBuilder extends js.Object {
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  def from(params: AnonCases): SwitchStatement = js.native
}

