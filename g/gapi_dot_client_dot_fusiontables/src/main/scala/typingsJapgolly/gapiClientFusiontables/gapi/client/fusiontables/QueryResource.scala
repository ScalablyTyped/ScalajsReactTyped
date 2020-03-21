package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonHdrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResource extends js.Object {
  /**
    * Executes a Fusion Tables SQL statement, which can be any of
    * - SELECT
    * - INSERT
    * - UPDATE
    * - DELETE
    * - SHOW
    * - DESCRIBE
    * - CREATE statement.
    */
  def sql(request: AnonHdrs): Request_[Sqlresponse]
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: AnonHdrs): Request_[Sqlresponse]
}

object QueryResource {
  @scala.inline
  def apply(
    sql: AnonHdrs => CallbackTo[Request_[Sqlresponse]],
    sqlGet: AnonHdrs => CallbackTo[Request_[Sqlresponse]]
  ): QueryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sql")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonHdrs) => sql(t0).runNow()))
    __obj.updateDynamic("sqlGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonHdrs) => sqlGet(t0).runNow()))
    __obj.asInstanceOf[QueryResource]
  }
}

