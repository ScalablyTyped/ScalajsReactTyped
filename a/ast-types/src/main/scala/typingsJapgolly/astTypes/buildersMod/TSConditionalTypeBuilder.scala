package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCheckType
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConditionalTypeBuilder extends js.Object {
  def apply(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType = js.native
  def from(params: AnonCheckType): TSConditionalType = js.native
}

