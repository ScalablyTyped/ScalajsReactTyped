package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadonly extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.undefined
  var typeParameter: TSTypeParameterKind
}

object AnonReadonly {
  @scala.inline
  def apply(
    typeParameter: TSTypeParameterKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    optional: Boolean | Plussign | `-_` = null,
    readonly: Boolean | Plussign | `-_` = null,
    typeAnnotation: TSTypeKind = null
  ): AnonReadonly = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadonly]
  }
}

