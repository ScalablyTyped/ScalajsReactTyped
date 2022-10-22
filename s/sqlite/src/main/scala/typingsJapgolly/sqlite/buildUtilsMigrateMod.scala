package typingsJapgolly.sqlite

import typingsJapgolly.sqlite.buildInterfacesMod.IMigrate.MigrationData
import typingsJapgolly.sqlite.buildInterfacesMod.IMigrate.MigrationParams
import typingsJapgolly.sqlite.sqlite3Mod.Database
import typingsJapgolly.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMigrateMod {
  
  @JSImport("sqlite/build/utils/migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrate(db: typingsJapgolly.sqlite.buildDatabaseMod.Database[Database, Statement]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def migrate(db: typingsJapgolly.sqlite.buildDatabaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(db.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def readMigrations(): js.Promise[js.Array[MigrationData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMigrations")().asInstanceOf[js.Promise[js.Array[MigrationData]]]
  inline def readMigrations(migrationPath: String): js.Promise[js.Array[MigrationData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMigrations")(migrationPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MigrationData]]]
}
