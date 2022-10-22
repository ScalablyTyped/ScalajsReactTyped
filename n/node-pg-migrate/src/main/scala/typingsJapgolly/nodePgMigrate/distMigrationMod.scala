package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distDbMod.DBConnection
import typingsJapgolly.nodePgMigrate.distMigrationBuilderMod.default
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typingsJapgolly.nodePgMigrate.distTypesMod.Logger
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationAction
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationDirection
import typingsJapgolly.nodePgMigrate.distTypesMod.RunnerOption
import typingsJapgolly.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.js_
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sql
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ts
import typingsJapgolly.pg.mod.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMigrationMod {
  
  @JSImport("node-pg-migrate/dist/migration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FilenameFormat extends StObject
  @JSImport("node-pg-migrate/dist/migration", "FilenameFormat")
  @js.native
  object FilenameFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilenameFormat & String] = js.native
    
    @js.native
    sealed trait timestamp
      extends StObject
         with FilenameFormat
    /* "timestamp" */ val timestamp: typingsJapgolly.nodePgMigrate.distMigrationMod.FilenameFormat.timestamp & String = js.native
    
    @js.native
    sealed trait utc
      extends StObject
         with FilenameFormat
    /* "utc" */ val utc: typingsJapgolly.nodePgMigrate.distMigrationMod.FilenameFormat.utc & String = js.native
  }
  
  @JSImport("node-pg-migrate/dist/migration", "Migration")
  @js.native
  open class Migration protected ()
    extends StObject
       with RunMigration {
    def this(db: DBConnection, migrationPath: String, hasUpDown: MigrationBuilderActions, options: RunnerOption) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: Unit,
      logger: Logger
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions,
      logger: Logger
    ) = this()
    
    def _apply(action: MigrationAction, pgm: default): js.Promise[Any] = js.native
    
    def _getAction(direction: MigrationDirection): MigrationAction = js.native
    
    def _getMarkAsRun(action: MigrationAction): String = js.native
    
    @JSName("apply")
    def apply(direction: MigrationDirection): js.Promise[Any] = js.native
    
    val db: DBConnection = js.native
    
    var down: js.UndefOr[`false` | MigrationAction] = js.native
    
    val logger: Logger = js.native
    
    def markAsRun(direction: MigrationDirection): js.Promise[QueryResult[Any]] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    val options: RunnerOption = js.native
    
    /* CompleteClass */
    override val path: String = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
    
    val typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
    
    var up: js.UndefOr[`false` | MigrationAction] = js.native
  }
  /* static members */
  object Migration {
    
    @JSImport("node-pg-migrate/dist/migration", "Migration")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(name: String, directory: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: js_ | ts | sql): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: js_ | ts | sql, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: js_ | ts | sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: js_ | ts | sql,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: Unit, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
  
  inline def getTimestamp(logger: Logger, filename: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimestamp")(logger.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loadMigrationFiles(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMigrationFiles")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def loadMigrationFiles(dir: String, ignorePattern: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMigrationFiles")(dir.asInstanceOf[js.Any], ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodePgMigrate.anon.CreateOptionsTemplatefile
    - typingsJapgolly.nodePgMigrate.anon.CreateOptionsDefaultfilen
  */
  trait CreateOptions extends StObject
  object CreateOptions {
    
    inline def CreateOptionsDefaultfilen(): typingsJapgolly.nodePgMigrate.anon.CreateOptionsDefaultfilen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.nodePgMigrate.anon.CreateOptionsDefaultfilen]
    }
    
    inline def CreateOptionsTemplatefile(templateFileName: String): typingsJapgolly.nodePgMigrate.anon.CreateOptionsTemplatefile = {
      val __obj = js.Dynamic.literal(templateFileName = templateFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodePgMigrate.anon.CreateOptionsTemplatefile]
    }
  }
  
  trait CreateOptionsDefault extends StObject {
    
    var ignorePattern: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[js_ | ts | sql] = js.undefined
  }
  object CreateOptionsDefault {
    
    inline def apply(): CreateOptionsDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptionsDefault]
    }
    
    extension [Self <: CreateOptionsDefault](x: Self) {
      
      inline def setIgnorePattern(value: String): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      inline def setLanguage(value: js_ | ts | sql): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait CreateOptionsTemplate extends StObject {
    
    var templateFileName: String
  }
  object CreateOptionsTemplate {
    
    inline def apply(templateFileName: String): CreateOptionsTemplate = {
      val __obj = js.Dynamic.literal(templateFileName = templateFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptionsTemplate]
    }
    
    extension [Self <: CreateOptionsTemplate](x: Self) {
      
      inline def setTemplateFileName(value: String): Self = StObject.set(x, "templateFileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunMigration extends StObject {
    
    val name: String
    
    val path: String
    
    val timestamp: Double
  }
  object RunMigration {
    
    inline def apply(name: String, path: String, timestamp: Double): RunMigration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunMigration]
    }
    
    extension [Self <: RunMigration](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
