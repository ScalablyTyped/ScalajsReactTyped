package typingsJapgolly.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociations mixin of the belongsToMany association.
  * @see BelongsToManyAddAssociationsMixin
  */
trait BelongsToManyAddAssociationsMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object BelongsToManyAddAssociationsMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): BelongsToManyAddAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BelongsToManyAddAssociationsMixinOptions]
  }
}

