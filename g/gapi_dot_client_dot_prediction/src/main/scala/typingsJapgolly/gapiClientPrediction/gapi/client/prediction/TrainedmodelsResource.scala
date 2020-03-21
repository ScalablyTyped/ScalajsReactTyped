package typingsJapgolly.gapiClientPrediction.gapi.client.prediction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPrediction.AnonFields
import typingsJapgolly.gapiClientPrediction.AnonKey
import typingsJapgolly.gapiClientPrediction.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: AnonFields): Request_[Analyze]
  /** Delete a trained model. */
  def delete(request: AnonFields): Request_[Unit]
  /** Check training status of your model. */
  def get(request: AnonFields): Request_[Insert2]
  /** Train a Prediction API model. */
  def insert(request: AnonKey): Request_[Insert2]
  /** List available models. */
  def list(request: AnonMaxResults): Request_[List]
  /** Submit model id and request a prediction. */
  def predict(request: AnonFields): Request_[Output]
  /** Add new data to a trained model. */
  def update(request: AnonFields): Request_[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: AnonFields => CallbackTo[Request_[Analyze]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Insert2]],
    insert: AnonKey => CallbackTo[Request_[Insert2]],
    list: AnonMaxResults => CallbackTo[Request_[List]],
    predict: AnonFields => CallbackTo[Request_[Output]],
    update: AnonFields => CallbackTo[Request_[Insert2]]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyze")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonFields) => analyze(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("predict")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonFields) => predict(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

