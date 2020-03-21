package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt
import typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: AnonAlt): Request_[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: AnonFields): Request_[Unit]
  /** Retrieves a stored query. */
  def getquery(request: AnonFields): Request_[Query]
  /** Retrieves stored queries. */
  def listqueries(request: AnonAlt): Request_[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: AnonFields): Request_[Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: AnonAlt => CallbackTo[Request_[Query]],
    deletequery: AnonFields => CallbackTo[Request_[Unit]],
    getquery: AnonFields => CallbackTo[Request_[Query]],
    listqueries: AnonAlt => CallbackTo[Request_[ListQueriesResponse]],
    runquery: AnonFields => CallbackTo[Request_[Unit]]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createquery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt) => createquery(t0).runNow()))
    __obj.updateDynamic("deletequery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields) => deletequery(t0).runNow()))
    __obj.updateDynamic("getquery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields) => getquery(t0).runNow()))
    __obj.updateDynamic("listqueries")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt) => listqueries(t0).runNow()))
    __obj.updateDynamic("runquery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonFields) => runquery(t0).runNow()))
    __obj.asInstanceOf[QueriesResource]
  }
}

