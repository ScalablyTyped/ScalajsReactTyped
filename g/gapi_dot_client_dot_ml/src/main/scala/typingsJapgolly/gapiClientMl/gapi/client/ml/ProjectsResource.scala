package typingsJapgolly.gapiClientMl.gapi.client.ml

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMl.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var models: ModelsResource
  var operations: OperationsResource
  /**
    * Get the service account information associated with your project. You need
    * this information in order to grant the service account persmissions for
    * the Google Cloud Storage location where you put your model training code
    * for training the model with Google Cloud Machine Learning.
    */
  def getConfig(request: AnonAccesstoken): Request_[GoogleCloudMlV1GetConfigResponse]
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: AnonAccesstoken): Request_[GoogleApiHttpBody]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: AnonAccesstoken => CallbackTo[Request_[GoogleCloudMlV1GetConfigResponse]],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: AnonAccesstoken => CallbackTo[Request_[GoogleApiHttpBody]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("getConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => getConfig(t0).runNow()))
    __obj.updateDynamic("predict")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => predict(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

