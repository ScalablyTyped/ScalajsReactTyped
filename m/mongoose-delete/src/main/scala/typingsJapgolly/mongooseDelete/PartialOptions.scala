package typingsJapgolly.mongooseDelete

import typingsJapgolly.mongooseDelete.mod.overridableMethods
import typingsJapgolly.mongooseDelete.mongooseDeleteStrings.all
import typingsJapgolly.mongooseDelete.mongooseDeleteStrings.deleteAt
import typingsJapgolly.mongooseDelete.mongooseDeleteStrings.deleted
import typingsJapgolly.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mongoose-delete.mongoose-delete.Options> */
trait PartialOptions extends js.Object {
  var deletedAt: js.UndefOr[Boolean] = js.undefined
  var deletedBy: js.UndefOr[Boolean] = js.undefined
  var deletedByType: js.UndefOr[js.Any] = js.undefined
  var indexFields: js.UndefOr[Boolean | all | deleted | deleteAt | deletedBy] = js.undefined
  var overrideMethods: js.UndefOr[Boolean | all | js.Array[overridableMethods]] = js.undefined
  var validateBeforeDelete: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    deletedAt: js.UndefOr[Boolean] = js.undefined,
    deletedBy: js.UndefOr[Boolean] = js.undefined,
    deletedByType: js.Any = null,
    indexFields: Boolean | all | deleted | deleteAt | deletedBy = null,
    overrideMethods: Boolean | all | js.Array[overridableMethods] = null,
    validateBeforeDelete: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deletedAt)) __obj.updateDynamic("deletedAt")(deletedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(deletedBy)) __obj.updateDynamic("deletedBy")(deletedBy.asInstanceOf[js.Any])
    if (deletedByType != null) __obj.updateDynamic("deletedByType")(deletedByType.asInstanceOf[js.Any])
    if (indexFields != null) __obj.updateDynamic("indexFields")(indexFields.asInstanceOf[js.Any])
    if (overrideMethods != null) __obj.updateDynamic("overrideMethods")(overrideMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(validateBeforeDelete)) __obj.updateDynamic("validateBeforeDelete")(validateBeforeDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

