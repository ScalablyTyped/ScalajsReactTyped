package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminServicesProvider extends DataProvider {
  def createDatabase(connectionUri: String, database: DatabaseInfo): Thenable[CreateDatabaseResponse]
  def createLogin(connectionUri: String, login: LoginInfo): Thenable[CreateLoginResponse]
  def getDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
  def getDefaultDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
}

object AdminServicesProvider {
  @scala.inline
  def apply(
    createDatabase: (String, DatabaseInfo) => CallbackTo[Thenable[CreateDatabaseResponse]],
    createLogin: (String, LoginInfo) => CallbackTo[Thenable[CreateLoginResponse]],
    getDatabaseInfo: String => CallbackTo[Thenable[DatabaseInfo]],
    getDefaultDatabaseInfo: String => CallbackTo[Thenable[DatabaseInfo]],
    providerId: String,
    handle: Int | Double = null
  ): AdminServicesProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("createDatabase")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.DatabaseInfo) => createDatabase(t0, t1).runNow()))
    __obj.updateDynamic("createLogin")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.LoginInfo) => createLogin(t0, t1).runNow()))
    __obj.updateDynamic("getDatabaseInfo")(js.Any.fromFunction1((t0: java.lang.String) => getDatabaseInfo(t0).runNow()))
    __obj.updateDynamic("getDefaultDatabaseInfo")(js.Any.fromFunction1((t0: java.lang.String) => getDefaultDatabaseInfo(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesProvider]
  }
}

