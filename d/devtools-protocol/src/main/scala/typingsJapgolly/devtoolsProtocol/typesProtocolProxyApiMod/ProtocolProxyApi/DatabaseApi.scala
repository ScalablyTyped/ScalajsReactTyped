package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.addDatabase
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Database.AddDatabaseEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseApi extends StObject {
  
  /**
    * Disables database tracking, prevents database events from being sent to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables database tracking, database events will now be delivered to the client.
    */
  def enable(): js.Promise[Unit]
  
  def executeSQL(params: ExecuteSQLRequest): js.Promise[ExecuteSQLResponse]
  
  def getDatabaseTableNames(params: GetDatabaseTableNamesRequest): js.Promise[GetDatabaseTableNamesResponse]
  
  @JSName("on")
  def on_addDatabase(event: addDatabase, listener: js.Function1[/* params */ AddDatabaseEvent, Unit]): Unit
}
object DatabaseApi {
  
  inline def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    executeSQL: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse],
    getDatabaseTableNames: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse],
    on: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Callback
  ): DatabaseApi = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, executeSQL = js.Any.fromFunction1(executeSQL), getDatabaseTableNames = js.Any.fromFunction1(getDatabaseTableNames), on = js.Any.fromFunction2((t0: addDatabase, t1: js.Function1[/* params */ AddDatabaseEvent, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[DatabaseApi]
  }
  
  extension [Self <: DatabaseApi](x: Self) {
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setExecuteSQL(value: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse]): Self = StObject.set(x, "executeSQL", js.Any.fromFunction1(value))
    
    inline def setGetDatabaseTableNames(value: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse]): Self = StObject.set(x, "getDatabaseTableNames", js.Any.fromFunction1(value))
    
    inline def setOn(value: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: addDatabase, t1: js.Function1[/* params */ AddDatabaseEvent, Unit]) => (value(t0, t1)).runNow()))
  }
}
