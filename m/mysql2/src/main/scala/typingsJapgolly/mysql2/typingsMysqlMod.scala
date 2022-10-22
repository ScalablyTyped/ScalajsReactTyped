package typingsJapgolly.mysql2

import typingsJapgolly.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions
import typingsJapgolly.mysql2.typingsMysqlLibPoolClusterMod.PoolClusterOptions
import typingsJapgolly.mysql2.typingsMysqlLibPoolMod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlMod {
  
  @JSImport("mysql2/typings/mysql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnection(config: ConnectionOptions): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(config.asInstanceOf[js.Any]).asInstanceOf[Connection]
  inline def createConnection(connectionUri: String): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def createPool(config: PoolOptions): Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[Pool]
  
  inline def createPoolCluster(): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[PoolCluster]
  inline def createPoolCluster(config: PoolClusterOptions): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[PoolCluster]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Connection = typingsJapgolly.mysql2.typingsMysqlLibConnectionMod.^
  
  type Pool = typingsJapgolly.mysql2.typingsMysqlLibPoolMod.^
  
  type PoolCluster = typingsJapgolly.mysql2.typingsMysqlLibPoolClusterMod.^
  
  type PoolConnection = typingsJapgolly.mysql2.typingsMysqlLibPoolConnectionMod.^
  
  type Query = typingsJapgolly.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^
}
