package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocValue
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclaredPredicateBuilder extends js.Object {
  def apply(value: ExpressionKind): DeclaredPredicate = js.native
  def from(params: AnonLocValue): DeclaredPredicate = js.native
}

