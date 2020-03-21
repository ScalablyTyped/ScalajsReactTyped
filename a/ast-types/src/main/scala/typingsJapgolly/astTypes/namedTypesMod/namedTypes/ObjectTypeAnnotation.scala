package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.FlowKind
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypePropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
trait ObjectTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.undefined
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectTypeAnnotation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeAnnotation")
@js.native
object ObjectTypeAnnotation extends TopLevel[Type[ObjectTypeAnnotation]]

