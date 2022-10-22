package typingsJapgolly.marvPgDriver

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.marvPgDriver.marvPgDriverStrings.binary
import typingsJapgolly.marvPgDriver.marvPgDriverStrings.text
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pg.anon.TypeofPg
import typingsJapgolly.pg.mod.Client
import typingsJapgolly.pg.mod.ClientBase
import typingsJapgolly.pg.mod.ClientConfig
import typingsJapgolly.pg.mod.DatabaseError
import typingsJapgolly.pg.mod.Defaults_
import typingsJapgolly.pg.mod.Events
import typingsJapgolly.pg.mod.Pool
import typingsJapgolly.pg.mod.Query
import typingsJapgolly.pg.mod.QueryResultRow
import typingsJapgolly.pgProtocol.distMessagesMod.MessageName
import typingsJapgolly.pgTypes.mod.TypeId
import typingsJapgolly.pgTypes.mod.TypeParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connection extends StObject {
    
    var connection: ClientConfig
    
    var logger: js.UndefOr[Warn] = js.undefined
    
    var pg: js.UndefOr[Typeofpg] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object Connection {
    
    inline def apply(connection: ClientConfig): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: ClientConfig): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Warn): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPg(value: Typeofpg): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      inline def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  trait Typeofpg extends StObject {
    
    var Client: Instantiable0[typingsJapgolly.pg.mod.Client]
    
    var ClientBase: Instantiable0[typingsJapgolly.pg.mod.ClientBase]
    
    var Connection: Instantiable0[typingsJapgolly.pg.mod.Connection]
    
    var DatabaseError: Instantiable3[
        /* message */ String, 
        /* length */ Double, 
        /* name */ MessageName, 
        typingsJapgolly.pg.mod.DatabaseError
      ]
    
    var Events: Instantiable0[typingsJapgolly.pg.mod.Events]
    
    var Pool: Instantiable0[typingsJapgolly.pg.mod.Pool]
    
    var Query: Instantiable0[typingsJapgolly.pg.mod.Query[QueryResultRow, js.Array[Any]]]
    
    val defaults: Defaults_ & ClientConfig
    
    val native: TypeofPg | Null
    
    val types: Typeoftypes
  }
  object Typeofpg {
    
    inline def apply(
      Client: Instantiable0[Client],
      ClientBase: Instantiable0[ClientBase],
      Connection: Instantiable0[typingsJapgolly.pg.mod.Connection],
      DatabaseError: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError],
      Events: Instantiable0[Events],
      Pool: Instantiable0[Pool],
      Query: Instantiable0[Query[QueryResultRow, js.Array[Any]]],
      defaults: Defaults_ & ClientConfig,
      types: Typeoftypes
    ): Typeofpg = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], DatabaseError = DatabaseError.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], native = null)
      __obj.asInstanceOf[Typeofpg]
    }
    
    extension [Self <: Typeofpg](x: Self) {
      
      inline def setClient(value: Instantiable0[Client]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setClientBase(value: Instantiable0[ClientBase]): Self = StObject.set(x, "ClientBase", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Instantiable0[typingsJapgolly.pg.mod.Connection]): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setDatabaseError(
        value: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError]
      ): Self = StObject.set(x, "DatabaseError", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: Defaults_ & ClientConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Instantiable0[Events]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setNative(value: TypeofPg): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeNull: Self = StObject.set(x, "native", null)
      
      inline def setPool(value: Instantiable0[Pool]): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Instantiable0[Query[QueryResultRow, js.Array[Any]]]): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Typeoftypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoftypes extends StObject {
    
    def getTypeParser[T](oid: Double): TypeParser[String, T | String] = js.native
    def getTypeParser[T](oid: TypeId): TypeParser[String, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String] = js.native
    
    def setTypeParser[T](oid: Double, parseFn: TypeParser[String, T]): Unit = js.native
    def setTypeParser[T](oid: TypeId, parseFn: TypeParser[String, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_binary[T](oid: Double, format: binary, parseFn: TypeParser[Buffer, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_binary[T](oid: TypeId, format: binary, parseFn: TypeParser[Buffer, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_text[T](oid: Double, format: text, parseFn: TypeParser[String, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_text[T](oid: TypeId, format: text, parseFn: TypeParser[String, T]): Unit = js.native
  }
  
  trait Warn extends StObject {
    
    def warn(args: Any*): Unit
  }
  object Warn {
    
    inline def apply(warn: /* repeated */ Any => Callback): Warn = {
      val __obj = js.Dynamic.literal(warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[Warn]
    }
    
    extension [Self <: Warn](x: Self) {
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
