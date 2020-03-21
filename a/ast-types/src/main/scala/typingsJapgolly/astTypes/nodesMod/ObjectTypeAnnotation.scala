package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypePropertyKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait ObjectTypeAnnotation extends ASTNode {
  var callProperties: js.Array[ObjectTypeCallPropertyKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exact: Boolean
  var indexers: js.Array[ObjectTypeIndexerKind]
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.Array[ObjectTypeInternalSlotKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallPropertyKind],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexerKind],
    internalSlots: js.Array[ObjectTypeInternalSlotKind],
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    inexact: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

