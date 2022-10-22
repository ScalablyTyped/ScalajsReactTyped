package typingsJapgolly.sqlFormatter

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.sqlFormatter.anon.PartialFormatOptions
import typingsJapgolly.sqlFormatter.libSrcLanguagesBigqueryBigqueryDotformatterMod.default
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcSqlFormatterMod {
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", "ConfigError")
  @js.native
  open class ConfigError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: PartialFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object formatters {
    
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.bigquery")
    @js.native
    open class bigquery () extends default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.bigquery")
    @js.native
    def bigquery: Instantiable0[default] = js.native
    inline def bigquery_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigquery")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.db2")
    @js.native
    open class db2 ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.db2")
    @js.native
    def db2: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default] = js.native
    inline def db2_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("db2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.hive")
    @js.native
    open class hive ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.hive")
    @js.native
    def hive: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default] = js.native
    inline def hive_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hive")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mariadb")
    @js.native
    open class mariadb ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mariadb")
    @js.native
    def mariadb: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default
      ] = js.native
    inline def mariadb_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mariadb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mysql")
    @js.native
    open class mysql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mysql")
    @js.native
    def mysql: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default] = js.native
    inline def mysql_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mysql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.n1ql")
    @js.native
    open class n1ql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.n1ql")
    @js.native
    def n1ql: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default] = js.native
    inline def n1ql_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n1ql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.plsql")
    @js.native
    open class plsql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.plsql")
    @js.native
    def plsql: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default] = js.native
    inline def plsql_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.postgresql")
    @js.native
    open class postgresql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.postgresql")
    @js.native
    def postgresql: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default
      ] = js.native
    inline def postgresql_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postgresql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.redshift")
    @js.native
    open class redshift ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.redshift")
    @js.native
    def redshift: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default
      ] = js.native
    inline def redshift_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redshift")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.singlestoredb")
    @js.native
    open class singlestoredb ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.singlestoredb")
    @js.native
    def singlestoredb: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
      ] = js.native
    inline def singlestoredb_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singlestoredb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.snowflake")
    @js.native
    open class snowflake ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.snowflake")
    @js.native
    def snowflake: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default
      ] = js.native
    inline def snowflake_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snowflake")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.spark")
    @js.native
    open class spark ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.spark")
    @js.native
    def spark: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default] = js.native
    inline def spark_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spark")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sql")
    @js.native
    open class sql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sql")
    @js.native
    def sql: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default] = js.native
    inline def sql_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sqlite")
    @js.native
    open class sqlite ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sqlite")
    @js.native
    def sqlite: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default] = js.native
    inline def sqlite_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sqlite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.transactsql")
    @js.native
    open class transactsql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.transactsql")
    @js.native
    def transactsql: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
      ] = js.native
    inline def transactsql_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transactsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.trino")
    @js.native
    open class trino ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.trino")
    @js.native
    def trino: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default] = js.native
    inline def trino_=(x: Instantiable0[typingsJapgolly.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trino")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.tsql")
    @js.native
    open class tsql ()
      extends typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.tsql")
    @js.native
    def tsql: Instantiable0[
        typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
      ] = js.native
    inline def tsql_=(
      x: Instantiable0[
          typingsJapgolly.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tsql")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", "supportedDialects")
  @js.native
  val supportedDialects: js.Array[String] = js.native
  
  type FormatFn = js.Function2[/* query */ String, /* cfg */ js.UndefOr[PartialFormatOptions], String]
  
  /* keyof sql-formatter.anon.Bigquery */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.bigquery
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.db2
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.hive
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.mariadb
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.mysql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.n1ql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.plsql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.postgresql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.redshift
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.singlestoredb
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.snowflake
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.spark
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.sql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.sqlite
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.transactsql
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.trino
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.tsql
  */
  trait SqlLanguage extends StObject
}
