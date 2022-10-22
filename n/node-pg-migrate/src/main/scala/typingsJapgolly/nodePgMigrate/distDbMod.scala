package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distTypesMod.DB
import typingsJapgolly.nodePgMigrate.distTypesMod.Logger
import typingsJapgolly.pg.mod.ClientBase
import typingsJapgolly.pg.mod.ClientConfig
import typingsJapgolly.pg.mod.QueryArrayConfig
import typingsJapgolly.pg.mod.QueryConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDbMod {
  
  @JSImport("node-pg-migrate/dist/db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(connection: String): DBConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any]).asInstanceOf[DBConnection]
  inline def default(connection: String, logger: Logger): DBConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[DBConnection]
  inline def default(connection: ClientBase): DBConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any]).asInstanceOf[DBConnection]
  inline def default(connection: ClientBase, logger: Logger): DBConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[DBConnection]
  inline def default(connection: ClientConfig): DBConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any]).asInstanceOf[DBConnection]
  inline def default(connection: ClientConfig, logger: Logger): DBConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(connection.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[DBConnection]
  
  @js.native
  trait DBConnection
    extends StObject
       with DB {
    
    def addBeforeCloseListener(listener: Any): Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[Any]]): js.Promise[js.Array[Any]] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    def column(columnName: String, queryConfig: QueryConfig[js.Array[Any]]): js.Promise[js.Array[Any]] = js.native
    def column(columnName: String, queryTextOrConfig: String): js.Promise[js.Array[Any]] = js.native
    def column(columnName: String, queryTextOrConfig: String, values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    def column(columnName: String, queryTextOrConfig: QueryConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    
    def connected(): Boolean = js.native
    
    def createConnection(): js.Promise[Unit] = js.native
  }
}
