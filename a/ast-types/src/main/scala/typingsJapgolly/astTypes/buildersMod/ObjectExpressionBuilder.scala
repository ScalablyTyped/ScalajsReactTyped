package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonProperties
import typingsJapgolly.astTypes.kindsMod.ObjectMethodKind
import typingsJapgolly.astTypes.kindsMod.ObjectPropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExpressionBuilder extends js.Object {
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  def from(params: AnonProperties): ObjectExpression = js.native
}

