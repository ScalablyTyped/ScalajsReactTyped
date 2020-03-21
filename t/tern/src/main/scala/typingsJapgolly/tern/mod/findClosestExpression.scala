package typingsJapgolly.tern.mod

import typingsJapgolly.estree.mod.Program
import typingsJapgolly.tern.AnonNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findClosestExpression")
@js.native
object findClosestExpression extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): AnonNode | Null = js.native
  def apply(
    ast: Program,
    start: js.UndefOr[scala.Nothing],
    end: Double,
    scope: typingsJapgolly.tern.inferMod.Scope
  ): AnonNode | Null = js.native
  def apply(ast: Program, start: Double, end: Double): AnonNode | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: typingsJapgolly.tern.inferMod.Scope): AnonNode | Null = js.native
}

