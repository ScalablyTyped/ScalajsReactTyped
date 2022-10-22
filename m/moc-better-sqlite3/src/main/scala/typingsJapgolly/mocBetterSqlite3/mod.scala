package typingsJapgolly.mocBetterSqlite3

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.integer.mod.IntClass
import typingsJapgolly.integer.mod.IntLike
import typingsJapgolly.mocBetterSqlite3.anon.FnCall
import typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.DatabaseConstructor
import typingsJapgolly.std.Error
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("moc-better-sqlite3", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database {
    def this(filename: String) = this()
    def this(filename: String, options: Options) = this()
  }
  @JSImport("moc-better-sqlite3", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DatabaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (message : string, code : string): any */ @JSImport("moc-better-sqlite3", "SqliteError")
  @js.native
  open class SqliteErrorCls protected () extends StObject {
    def this(message: String, code: String) = this()
  }
  
  trait AggregateOptions
    extends StObject
       with RegistrationOptions {
    
    var inverse: js.UndefOr[js.Function2[/* total */ Any, /* dropped */ Any, Any]] = js.undefined
    
    var result: js.UndefOr[js.Function1[/* total */ Any, Any]] = js.undefined
    
    var start: js.UndefOr[Any] = js.undefined
    
    def step(total: Any, next: Any): Any
  }
  object AggregateOptions {
    
    inline def apply(step: (Any, Any) => Any): AggregateOptions = {
      val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
      __obj.asInstanceOf[AggregateOptions]
    }
    
    extension [Self <: AggregateOptions](x: Self) {
      
      inline def setInverse(value: (/* total */ Any, /* dropped */ Any) => Any): Self = StObject.set(x, "inverse", js.Any.fromFunction2(value))
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setResult(value: /* total */ Any => Any): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: (Any, Any) => Any): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    F extends (args : infer A): any ? A : never
    }}}
    */
  @js.native
  trait ArgumentTypes[F /* <: VariableArgFunction */] extends StObject
  
  trait BackupMetadata extends StObject {
    
    var remainingPages: Double
    
    var totalPages: Double
  }
  object BackupMetadata {
    
    inline def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
      val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupMetadata]
    }
    
    extension [Self <: BackupMetadata](x: Self) {
      
      inline def setRemainingPages(value: Double): Self = StObject.set(x, "remainingPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackupOptions extends StObject {
    
    def progress(info: BackupMetadata): Double
  }
  object BackupOptions {
    
    inline def apply(progress: BackupMetadata => Double): BackupOptions = {
      val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
      __obj.asInstanceOf[BackupOptions]
    }
    
    extension [Self <: BackupOptions](x: Self) {
      
      inline def setProgress(value: BackupMetadata => Double): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    }
  }
  
  type ColumnDefinition = typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition
  
  type Database = typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database
  
  @js.native
  trait Integer extends StObject {
    
    def apply(): IntClass = js.native
    def apply(`val`: IntLike): IntClass = js.native
  }
  
  object MocBetterSqlite3 {
    
    trait ColumnDefinition extends StObject {
      
      var column: String | Null
      
      var database: String | Null
      
      var name: String
      
      var table: String | Null
      
      var `type`: String | Null
    }
    object ColumnDefinition {
      
      inline def apply(name: String): typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], column = null, database = null, table = null)
        __obj.updateDynamic("type")(null)
        __obj.asInstanceOf[typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition]
      }
      
      extension [Self <: typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition](x: Self) {
        
        inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setColumnNull: Self = StObject.set(x, "column", null)
        
        inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
        
        inline def setDatabaseNull: Self = StObject.set(x, "database", null)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableNull: Self = StObject.set(x, "table", null)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeNull: Self = StObject.set(x, "type", null)
      }
    }
    
    @js.native
    trait Database extends StObject {
      
      def aggregate(name: String, options: AggregateOptions): this.type = js.native
      
      def backup(destinationFile: String): js.Promise[BackupMetadata] = js.native
      def backup(destinationFile: String, options: BackupOptions): js.Promise[BackupMetadata] = js.native
      
      def checkpoint(): this.type = js.native
      def checkpoint(databaseName: String): this.type = js.native
      
      def close(): this.type = js.native
      
      def defaultSafeIntegers(): this.type = js.native
      def defaultSafeIntegers(toggleState: Boolean): this.type = js.native
      
      def exec(source: String): this.type = js.native
      
      def function(name: String, cb: js.Function1[/* repeated */ Any, Any]): this.type = js.native
      def function(name: String, options: RegistrationOptions, cb: js.Function1[/* repeated */ Any, Any]): this.type = js.native
      
      var inTransaction: Boolean = js.native
      
      def loadExtension(path: String): this.type = js.native
      
      var memory: Boolean = js.native
      
      var name: String = js.native
      
      var open: Boolean = js.native
      
      def pragma(source: String): Any = js.native
      def pragma(source: String, options: PragmaOptions): Any = js.native
      
      def prepare[BindParameters /* <: js.Array[Any] | js.Object */](source: String): /* import warning: importer.ImportType#apply Failed type conversion: BindParameters extends std.Array<any> ? moc-better-sqlite3.moc-better-sqlite3.MocBetterSqlite3.Statement<BindParameters> : moc-better-sqlite3.moc-better-sqlite3.MocBetterSqlite3.Statement<[BindParameters]> */ js.Any = js.native
      
      var readonly: Boolean = js.native
      
      def transaction[F /* <: VariableArgFunction */](fn: F): typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Transaction[F] = js.native
    }
    
    @js.native
    trait DatabaseConstructor
      extends StObject
         with Instantiable1[
              /* filename */ String, 
              typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database
            ]
         with Instantiable2[
              /* filename */ String, 
              /* options */ Options, 
              typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database
            ] {
      
      def apply(filename: String): typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database = js.native
      def apply(filename: String, options: Options): typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database = js.native
      
      def Integer(): IntClass = js.native
      def Integer(`val`: IntLike): IntClass = js.native
      @JSName("Integer")
      var Integer_Original: FnCall = js.native
      
      var SqliteError: Instantiable2[
            /* message */ String, 
            /* code */ String, 
            typingsJapgolly.mocBetterSqlite3.mod.SqliteError
          ] = js.native
    }
    
    @js.native
    trait Statement[BindParameters /* <: js.Array[Any] */] extends StObject {
      
      def all(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): js.Array[Any] = js.native
      
      def bind(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): this.type = js.native
      
      def columns(): js.Array[typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.ColumnDefinition] = js.native
      
      var database: typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Database = js.native
      
      def expand(): this.type = js.native
      def expand(toggleState: Boolean): this.type = js.native
      
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): Any = js.native
      
      def iterate(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): IterableIterator[Any] = js.native
      
      def pluck(): this.type = js.native
      def pluck(toggleState: Boolean): this.type = js.native
      
      def raw(): this.type = js.native
      def raw(toggleState: Boolean): this.type = js.native
      
      var reader: Boolean = js.native
      
      def run(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): RunResult = js.native
      
      def safeIntegers(): this.type = js.native
      def safeIntegers(toggleState: Boolean): this.type = js.native
      
      var source: String = js.native
    }
    
    @js.native
    trait Transaction[F /* <: VariableArgFunction */] extends StObject {
      
      def apply(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
      ): ReturnType[F] = js.native
      
      def default(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
      ): ReturnType[F] = js.native
      
      def deferred(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
      ): ReturnType[F] = js.native
      
      def exclusive(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
      ): ReturnType[F] = js.native
      
      def immediate(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
      ): ReturnType[F] = js.native
    }
  }
  
  trait Options extends StObject {
    
    var fileMustExist: js.UndefOr[Boolean] = js.undefined
    
    var memory: js.UndefOr[Boolean] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var verbose: js.UndefOr[js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
      
      inline def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
      
      inline def setMemory(value: Boolean): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVerbose(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait PragmaOptions extends StObject {
    
    var simple: js.UndefOr[Boolean] = js.undefined
  }
  object PragmaOptions {
    
    inline def apply(): PragmaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PragmaOptions]
    }
    
    extension [Self <: PragmaOptions](x: Self) {
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
    }
  }
  
  trait RegistrationOptions extends StObject {
    
    var deterministic: js.UndefOr[Boolean] = js.undefined
    
    var safeIntegers: js.UndefOr[Boolean] = js.undefined
    
    var varargs: js.UndefOr[Boolean] = js.undefined
  }
  object RegistrationOptions {
    
    inline def apply(): RegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistrationOptions]
    }
    
    extension [Self <: RegistrationOptions](x: Self) {
      
      inline def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      inline def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
      
      inline def setSafeIntegers(value: Boolean): Self = StObject.set(x, "safeIntegers", value.asInstanceOf[js.Any])
      
      inline def setSafeIntegersUndefined: Self = StObject.set(x, "safeIntegers", js.undefined)
      
      inline def setVarargs(value: Boolean): Self = StObject.set(x, "varargs", value.asInstanceOf[js.Any])
      
      inline def setVarargsUndefined: Self = StObject.set(x, "varargs", js.undefined)
    }
  }
  
  trait RunResult extends StObject {
    
    var changes: Double
    
    var lastInsertRowid: IntLike
  }
  object RunResult {
    
    inline def apply(changes: Double, lastInsertRowid: IntLike): RunResult = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResult]
    }
    
    extension [Self <: RunResult](x: Self) {
      
      inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setLastInsertRowid(value: IntLike): Self = StObject.set(x, "lastInsertRowid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SqliteError
    extends StObject
       with Error {
    
    var code: String
  }
  object SqliteError {
    
    inline def apply(code: String, message: String, name: String): SqliteError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqliteError]
    }
    
    extension [Self <: SqliteError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    BindParameters extends std.Array<any> ? moc-better-sqlite3.moc-better-sqlite3.MocBetterSqlite3.Statement<BindParameters> : moc-better-sqlite3.moc-better-sqlite3.MocBetterSqlite3.Statement<[BindParameters]>
    }}}
    */
  @js.native
  trait Statement[BindParameters /* <: js.Array[Any] | js.Object */] extends StObject
  
  type Transaction = typingsJapgolly.mocBetterSqlite3.mod.MocBetterSqlite3.Transaction[VariableArgFunction]
  
  @js.native
  trait VariableArgFunction extends StObject {
    
    def apply(params: Any*): Any = js.native
  }
  
  type _To = js.Object & DatabaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DatabaseConstructor = ^
}
