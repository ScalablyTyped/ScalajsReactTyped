package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionProvider extends DataProvider {
  var buildConnectionInfo: js.UndefOr[js.Function1[/* connectionString */ String, Thenable[ConnectionInfo]]] = js.undefined
  def cancelConnect(connectionUri: String): Thenable[Boolean]
  def changeDatabase(connectionUri: String, newDatabase: String): Thenable[Boolean]
  def connect(connectionUri: String, connectionInfo: ConnectionInfo): Thenable[Boolean]
  def disconnect(connectionUri: String): Thenable[Boolean]
  def getConnectionString(connectionUri: String, includePassword: Boolean): Thenable[String]
  def listDatabases(connectionUri: String): Thenable[ListDatabasesResult]
  def rebuildIntelliSenseCache(connectionUri: String): Thenable[Unit]
  def registerOnConnectionChanged(handler: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _]): Unit
  def registerOnConnectionComplete(handler: js.Function1[/* connSummary */ ConnectionInfoSummary, _]): Unit
  def registerOnIntelliSenseCacheComplete(handler: js.Function1[/* connectionUri */ String, _]): Unit
}

object ConnectionProvider {
  @scala.inline
  def apply(
    cancelConnect: String => CallbackTo[Thenable[Boolean]],
    changeDatabase: (String, String) => CallbackTo[Thenable[Boolean]],
    connect: (String, ConnectionInfo) => CallbackTo[Thenable[Boolean]],
    disconnect: String => CallbackTo[Thenable[Boolean]],
    getConnectionString: (String, Boolean) => CallbackTo[Thenable[String]],
    listDatabases: String => CallbackTo[Thenable[ListDatabasesResult]],
    providerId: String,
    rebuildIntelliSenseCache: String => CallbackTo[Thenable[Unit]],
    registerOnConnectionChanged: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, js.Any] => Callback,
    registerOnConnectionComplete: js.Function1[/* connSummary */ ConnectionInfoSummary, js.Any] => Callback,
    registerOnIntelliSenseCacheComplete: js.Function1[/* connectionUri */ String, js.Any] => Callback,
    buildConnectionInfo: /* connectionString */ String => CallbackTo[Thenable[ConnectionInfo]] = null,
    handle: Int | Double = null
  ): ConnectionProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelConnect")(js.Any.fromFunction1((t0: java.lang.String) => cancelConnect(t0).runNow()))
    __obj.updateDynamic("changeDatabase")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => changeDatabase(t0, t1).runNow()))
    __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.ConnectionInfo) => connect(t0, t1).runNow()))
    __obj.updateDynamic("disconnect")(js.Any.fromFunction1((t0: java.lang.String) => disconnect(t0).runNow()))
    __obj.updateDynamic("getConnectionString")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => getConnectionString(t0, t1).runNow()))
    __obj.updateDynamic("listDatabases")(js.Any.fromFunction1((t0: java.lang.String) => listDatabases(t0).runNow()))
    __obj.updateDynamic("rebuildIntelliSenseCache")(js.Any.fromFunction1((t0: java.lang.String) => rebuildIntelliSenseCache(t0).runNow()))
    __obj.updateDynamic("registerOnConnectionChanged")(js.Any.fromFunction1((t0: js.Function1[/* changedConnInfo */ typingsJapgolly.azdata.mod.ChangedConnectionInfo, js.Any]) => registerOnConnectionChanged(t0).runNow()))
    __obj.updateDynamic("registerOnConnectionComplete")(js.Any.fromFunction1((t0: js.Function1[/* connSummary */ typingsJapgolly.azdata.mod.ConnectionInfoSummary, js.Any]) => registerOnConnectionComplete(t0).runNow()))
    __obj.updateDynamic("registerOnIntelliSenseCacheComplete")(js.Any.fromFunction1((t0: js.Function1[/* connectionUri */ java.lang.String, js.Any]) => registerOnIntelliSenseCacheComplete(t0).runNow()))
    if (buildConnectionInfo != null) __obj.updateDynamic("buildConnectionInfo")(js.Any.fromFunction1((t0: /* connectionString */ java.lang.String) => buildConnectionInfo(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProvider]
  }
}

