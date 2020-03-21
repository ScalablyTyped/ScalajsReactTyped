package typingsJapgolly.promisePg.mod

import typingsJapgolly.pg.TypeofPg
import typingsJapgolly.pg.TypeofarrayParser
import typingsJapgolly.pg.mod.ConnectionConfig
import typingsJapgolly.pg.mod.Defaults_
import typingsJapgolly.pg.mod.PoolConfig
import typingsJapgolly.pg.mod.QueryResultRow
import typingsJapgolly.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "raw")
@js.native
object raw extends js.Object {
  @js.native
  class Client ()
    extends typingsJapgolly.pg.mod.Client {
    def this(config: String) = this()
    def this(config: typingsJapgolly.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class ClientBase ()
    extends typingsJapgolly.pg.mod.ClientBase {
    def this(config: String) = this()
    def this(config: typingsJapgolly.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class Connection ()
    extends typingsJapgolly.pg.mod.Connection {
    def this(config: ConnectionConfig) = this()
  }
  
  @js.native
  class Events ()
    extends typingsJapgolly.pg.mod.Events
  
  @js.native
  /**
    * Every field of the config object is entirely optional.
    * The config passed to the pool is also passed to every client
    * instance within the pool when the pool creates that client.
    */
  class Pool ()
    extends typingsJapgolly.pg.mod.Pool {
    def this(config: PoolConfig) = this()
  }
  
  @js.native
  class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
    extends typingsJapgolly.pg.mod.Query[R, I] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[I]) = this()
    def this(queryTextOrConfig: String, values: I) = this()
    def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[I], values: I) = this()
  }
  
  val defaults: Defaults_ with typingsJapgolly.pg.mod.ClientConfig = js.native
  val native: TypeofPg | Null = js.native
  @js.native
  object types extends js.Object {
    val arrayParser: TypeofarrayParser = js.native
    def getTypeParser(oid: Double, format: String): TypeParser = js.native
    def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
    def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
  }
  
}

