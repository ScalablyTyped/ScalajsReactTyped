package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDecorators
import typingsJapgolly.astTypes.kindsMod.ObjectPropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyPatternKind
import typingsJapgolly.astTypes.kindsMod.RestPropertyKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyPatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPatternBuilder extends js.Object {
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern = js.native
  def from(params: AnonDecorators): ObjectPattern = js.native
}

