package typingsJapgolly.sqlite

import typingsJapgolly.sqlite.buildInterfacesMod.ISqlite.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite", "Database")
  @js.native
  open class Database[Driver /* <: typingsJapgolly.sqlite.sqlite3Mod.Database */, Stmt /* <: typingsJapgolly.sqlite.sqlite3Mod.Statement */] protected ()
    extends typingsJapgolly.sqlite.buildDatabaseMod.Database[Driver, Stmt] {
    def this(config: Config) = this()
  }
  
  @JSImport("sqlite", "Statement")
  @js.native
  open class Statement[S /* <: typingsJapgolly.sqlite.sqlite3Mod.Statement */] protected ()
    extends typingsJapgolly.sqlite.buildStatementMod.Statement[S] {
    def this(stmt: S) = this()
  }
  
  /**
    * Opens a database for manipulation. Most users will call this to get started.
    */
  inline def open[Driver /* <: typingsJapgolly.sqlite.sqlite3Mod.Database */, Stmt /* <: typingsJapgolly.sqlite.sqlite3Mod.Statement */](config: Config): js.Promise[
    typingsJapgolly.sqlite.buildDatabaseMod.Database[
      typingsJapgolly.sqlite.sqlite3Mod.Database, 
      typingsJapgolly.sqlite.sqlite3Mod.Statement
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typingsJapgolly.sqlite.buildDatabaseMod.Database[
      typingsJapgolly.sqlite.sqlite3Mod.Database, 
      typingsJapgolly.sqlite.sqlite3Mod.Statement
    ]
  ]]
}
