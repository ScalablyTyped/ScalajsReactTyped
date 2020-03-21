package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dataset entity linking.
			 */
trait Linking extends js.Object {
  /**
  				 * Add a new linked entity relationship with the existed query primary entity
  				 */
  def addLinkedEntity(expression: LinkEntityExposedExpression): Unit
  /**
  				 * Returns all the linked entities information
  				 */
  def getLinkedEntities(): js.Array[LinkEntityExposedExpression]
}

object Linking {
  @scala.inline
  def apply(
    addLinkedEntity: LinkEntityExposedExpression => Callback,
    getLinkedEntities: CallbackTo[js.Array[LinkEntityExposedExpression]]
  ): Linking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLinkedEntity")(js.Any.fromFunction1((t0: typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.LinkEntityExposedExpression) => addLinkedEntity(t0).runNow()))
    __obj.updateDynamic("getLinkedEntities")(getLinkedEntities.toJsFn)
    __obj.asInstanceOf[Linking]
  }
}

