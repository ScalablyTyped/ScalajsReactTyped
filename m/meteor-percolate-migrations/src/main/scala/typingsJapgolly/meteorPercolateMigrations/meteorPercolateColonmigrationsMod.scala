package typingsJapgolly.meteorPercolateMigrations

import japgolly.scalajs.react.Callback
import typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.debug
import typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.error
import typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.info
import typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorPercolateColonmigrationsMod {
  
  @JSImport("meteor/percolate:migrations", "Migrations")
  @js.native
  val Migrations: MigrationsPublicApi = js.native
  
  trait Config extends StObject {
    
    var collectionName: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var logIfLatest: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[(js.Function1[/* options */ LoggerOptions, Unit]) | Null] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogIfLatest(value: Boolean): Self = StObject.set(x, "logIfLatest", value.asInstanceOf[js.Any])
      
      inline def setLogIfLatestUndefined: Self = StObject.set(x, "logIfLatest", js.undefined)
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogger(value: /* options */ LoggerOptions => Callback): Self = StObject.set(x, "logger", js.Any.fromFunction1((t0: /* options */ LoggerOptions) => value(t0).runNow()))
      
      inline def setLoggerNull: Self = StObject.set(x, "logger", null)
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait LoggerOptions extends StObject {
    
    var level: info | warn | error | debug
    
    var message: String
    
    var tag: typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.Migrations
  }
  object LoggerOptions {
    
    inline def apply(level: info | warn | error | debug, message: String): LoggerOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tag = "Migrations")
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setLevel(value: info | warn | error | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTag(value: typingsJapgolly.meteorPercolateMigrations.meteorPercolateMigrationsStrings.Migrations): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait MigrationSpec extends StObject {
    
    var down: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def up(): Unit
    
    var version: Double
  }
  object MigrationSpec {
    
    inline def apply(up: Callback, version: Double): MigrationSpec = {
      val __obj = js.Dynamic.literal(up = up.toJsFn, version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationSpec]
    }
    
    extension [Self <: MigrationSpec](x: Self) {
      
      inline def setDown(value: Callback): Self = StObject.set(x, "down", value.toJsFn)
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUp(value: Callback): Self = StObject.set(x, "up", value.toJsFn)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MigrationsPublicApi extends StObject {
    
    def add(spec: MigrationSpec): Unit = js.native
    
    def config(c: Config): Unit = js.native
    
    def getVersion(): Double = js.native
    
    def migrateTo(version: String): Unit = js.native
    def migrateTo(version: Double): Unit = js.native
    
    def start(): Unit = js.native
    
    def unlock(): Unit = js.native
  }
}
