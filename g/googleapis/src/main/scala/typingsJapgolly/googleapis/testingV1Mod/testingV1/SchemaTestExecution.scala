package typingsJapgolly.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a single test to be executed in a single environment.
  */
@js.native
trait SchemaTestExecution extends js.Object {
  /**
    * Output only. How the host machine(s) are configured.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
  /**
    * Output only. Unique id set by the backend.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Id of the containing TestMatrix.
    */
  var matrixId: js.UndefOr[String] = js.native
  /**
    * Output only. The cloud project that owns the test execution.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Output only. Indicates the current progress of the test execution (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Additional details about the running test.
    */
  var testDetails: js.UndefOr[SchemaTestDetails] = js.native
  /**
    * Output only. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.native
  /**
    * Output only. The time this test execution was initially created.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Output only. Where the results for this execution are written.
    */
  var toolResultsStep: js.UndefOr[SchemaToolResultsStep] = js.native
}

object SchemaTestExecution {
  @scala.inline
  def apply(
    environment: SchemaEnvironment = null,
    id: String = null,
    matrixId: String = null,
    projectId: String = null,
    state: String = null,
    testDetails: SchemaTestDetails = null,
    testSpecification: SchemaTestSpecification = null,
    timestamp: String = null,
    toolResultsStep: SchemaToolResultsStep = null
  ): SchemaTestExecution = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (matrixId != null) __obj.updateDynamic("matrixId")(matrixId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (testDetails != null) __obj.updateDynamic("testDetails")(testDetails.asInstanceOf[js.Any])
    if (testSpecification != null) __obj.updateDynamic("testSpecification")(testSpecification.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (toolResultsStep != null) __obj.updateDynamic("toolResultsStep")(toolResultsStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestExecution]
  }
}

