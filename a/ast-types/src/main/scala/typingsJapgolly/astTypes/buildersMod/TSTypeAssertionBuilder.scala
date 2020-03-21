package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpressionExtra
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAssertionBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  def from(params: AnonExpressionExtra): TSTypeAssertion = js.native
}

