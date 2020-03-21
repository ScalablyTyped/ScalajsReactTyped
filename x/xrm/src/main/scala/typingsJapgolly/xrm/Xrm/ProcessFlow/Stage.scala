package typingsJapgolly.xrm.Xrm.ProcessFlow

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.AnonGetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CRM Business Process Flow stages.
  */
trait Stage extends js.Object {
  /**
    * Returns an object with a getValue method which will return the integer value of the business process flow
    * category.
    * @returns The stage category.
    */
  def getCategory(): AnonGetValue
  /**
    * Returns the logical name of the entity associated with the stage.
    * @returns The entity name.
    */
  def getEntityName(): String
  /**
    * Returns the unique identifier of the stage.
    * @returns The identifier of the Stage, in GUID format.
    * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
    */
  def getId(): String
  /**
    * Returns the name of the stage.
    * @returns The name.
    */
  def getName(): String
  /**
    * Returns the status of the stage.
    * @returns The status, either "active" or "inactive".
    */
  def getStatus(): StageStatus
  /**
    * Returns a collection of steps in the stage.
    * @returns An array of Step.
    */
  def getSteps(): js.Array[Step]
}

object Stage {
  @scala.inline
  def apply(
    getCategory: CallbackTo[AnonGetValue],
    getEntityName: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    getStatus: CallbackTo[StageStatus],
    getSteps: CallbackTo[js.Array[Step]]
  ): Stage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCategory")(getCategory.toJsFn)
    __obj.updateDynamic("getEntityName")(getEntityName.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getSteps")(getSteps.toJsFn)
    __obj.asInstanceOf[Stage]
  }
}

