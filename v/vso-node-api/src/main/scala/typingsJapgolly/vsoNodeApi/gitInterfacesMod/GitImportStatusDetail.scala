package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportStatusDetail extends js.Object {
  /**
    * All valid steps for the import process
    */
  var allSteps: js.Array[String]
  /**
    * Index into AllSteps for the current step
    */
  var currentStep: Double
  /**
    * Error message if the operation failed.
    */
  var errorMessage: String
}

object GitImportStatusDetail {
  @scala.inline
  def apply(allSteps: js.Array[String], currentStep: Double, errorMessage: String): GitImportStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitImportStatusDetail]
  }
}

