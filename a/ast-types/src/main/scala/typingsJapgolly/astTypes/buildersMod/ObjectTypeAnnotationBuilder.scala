package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCallProperties
import typingsJapgolly.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypePropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotationBuilder extends js.Object {
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  def from(params: AnonCallProperties): ObjectTypeAnnotation = js.native
}

