package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonAccessComments
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PrivateNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrivatePropertyBuilder extends js.Object {
  def apply(key: PrivateNameKind): ClassPrivateProperty = js.native
  def apply(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  def from(params: AnonAccessComments): ClassPrivateProperty = js.native
}

