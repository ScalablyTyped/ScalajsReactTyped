package typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The response includes records prior to the end date. If no end date is
    * provided, all records subsequent to the start date are in scope.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * Name of the patient for which the information is required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The response includes records subsequent to the start date. If no start
    * date is provided, all records prior to the end date are in scope.
    */
  var start: js.UndefOr[String] = js.native
}

