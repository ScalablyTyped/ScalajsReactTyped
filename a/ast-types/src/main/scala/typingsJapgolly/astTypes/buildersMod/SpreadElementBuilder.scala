package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgumentComments
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElementBuilder extends js.Object {
  def apply(argument: ExpressionKind): SpreadElement = js.native
  def from(params: AnonArgumentComments): SpreadElement = js.native
}

