package typingsJapgolly.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for a association table in n:m associations.
  *
  * @see AssociationOptionsBelongsToMany
  */
trait ThroughOptions extends js.Object {
  /**
    * The model used to join both sides of the N:M association.
    */
  var model: Model[_, _, _]
  /**
    * A key/value set that will be used for association create and find defaults on the through model.
    * (Remember to add the attributes to the through model)
    */
  var scope: js.UndefOr[AssociationScope] = js.undefined
  /**
    * If true a unique key will be generated from the foreign keys used (might want to turn this off and create
    * specific unique keys when using scopes)
    *
    * Defaults to true
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ThroughOptions {
  @scala.inline
  def apply(model: Model[_, _, _], scope: AssociationScope = null, unique: js.UndefOr[Boolean] = js.undefined): ThroughOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThroughOptions]
  }
}

