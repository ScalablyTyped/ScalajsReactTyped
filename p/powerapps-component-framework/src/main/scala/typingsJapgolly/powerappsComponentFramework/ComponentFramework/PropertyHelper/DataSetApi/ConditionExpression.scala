package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An expression used to represent a filter condition.
			 */
trait ConditionExpression extends js.Object {
  /**
  				 * The name of the data-set column to apply the filter on.
  				 */
  var attributeName: String
  /**
  				 * The value evaluated by the condition
  				 */
  var conditionOperator: ConditionOperator
  /**
  				 * Entity alias name so filtering can be used on linked entities.
  				 */
  var entityAliasName: js.UndefOr[String] = js.undefined
  /**
  				 * The value evaluated by the condition.
  				 */
  var value: String | js.Array[String]
}

object ConditionExpression {
  @scala.inline
  def apply(
    attributeName: String,
    conditionOperator: ConditionOperator,
    value: String | js.Array[String],
    entityAliasName: String = null
  ): ConditionExpression = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (entityAliasName != null) __obj.updateDynamic("entityAliasName")(entityAliasName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionExpression]
  }
}

