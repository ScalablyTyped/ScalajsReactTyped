package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.IfNotExistsOption
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsExtensionsTypesMod {
  
  @js.native
  trait CreateExtension extends CreateExtensionFn {
    
    def reverse(`extension`: js.Array[StringExtension]): String | js.Array[String] = js.native
    def reverse(`extension`: js.Array[StringExtension], options: CreateExtensionOptions & DropOptions): String | js.Array[String] = js.native
    def reverse(`extension`: StringExtension): String | js.Array[String] = js.native
    def reverse(`extension`: StringExtension, options: CreateExtensionOptions & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateExtensionFn = js.native
  }
  
  type CreateExtensionFn = js.Function2[
    /* extension */ StringExtension | js.Array[StringExtension], 
    /* options */ js.UndefOr[CreateExtensionOptions & DropOptions], 
    String | js.Array[String]
  ]
  
  trait CreateExtensionOptions
    extends StObject
       with IfNotExistsOption {
    
    var schema: js.UndefOr[String] = js.undefined
  }
  object CreateExtensionOptions {
    
    inline def apply(): CreateExtensionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateExtensionOptions]
    }
    
    extension [Self <: CreateExtensionOptions](x: Self) {
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  type DropExtension = js.Function2[
    /* extension */ StringExtension | js.Array[StringExtension], 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.adminpack
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.amcheck
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auth_delay
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auto_explain
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.bloom
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gin
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gist
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.citext
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.cube
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dblink
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_int
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_xsyn
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.earthdistance
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.file_fdw
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.hstore
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intagg
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intarray
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.isn
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.lo
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ltree
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pageinspect
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.passwordcheck
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_buffercache
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgcrypto
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_prewarm
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgrowlocks
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgstattuple
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_trgm
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_visibility
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.postgres_fdw
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.seg
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sepgsql
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.spi
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sslinfo
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tablefunc
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tcn
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.test_decoding
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_time
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.unaccent
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp`
    - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.xml2
  */
  trait Extension extends StObject
  object Extension {
    
    inline def adminpack: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.adminpack = "adminpack".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.adminpack]
    
    inline def amcheck: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.amcheck = "amcheck".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.amcheck]
    
    inline def auth_delay: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auth_delay = "auth_delay".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auth_delay]
    
    inline def auto_explain: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auto_explain = "auto_explain".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.auto_explain]
    
    inline def bloom: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.bloom = "bloom".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.bloom]
    
    inline def btree_gin: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gin = "btree_gin".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gin]
    
    inline def btree_gist: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gist = "btree_gist".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.btree_gist]
    
    inline def citext: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.citext = "citext".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.citext]
    
    inline def cube: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.cube = "cube".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.cube]
    
    inline def dblink: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dblink = "dblink".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dblink]
    
    inline def dict_int: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_int = "dict_int".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_int]
    
    inline def dict_xsyn: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_xsyn = "dict_xsyn".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.dict_xsyn]
    
    inline def earthdistance: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.earthdistance = "earthdistance".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.earthdistance]
    
    inline def file_fdw: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.file_fdw = "file_fdw".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.file_fdw]
    
    inline def fuzzystrmatch: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch = "fuzzystrmatch".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.fuzzystrmatch]
    
    inline def hstore: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.hstore = "hstore".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.hstore]
    
    inline def intagg: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intagg = "intagg".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intagg]
    
    inline def intarray: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intarray = "intarray".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.intarray]
    
    inline def isn: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.isn = "isn".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.isn]
    
    inline def lo: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.lo = "lo".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.lo]
    
    inline def ltree: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ltree = "ltree".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ltree]
    
    inline def pageinspect: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pageinspect = "pageinspect".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pageinspect]
    
    inline def passwordcheck: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.passwordcheck = "passwordcheck".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.passwordcheck]
    
    inline def pg_buffercache: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_buffercache = "pg_buffercache".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_buffercache]
    
    inline def pg_freespacemap: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap = "pg_freespacemap".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_freespacemap]
    
    inline def pg_prewarm: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_prewarm = "pg_prewarm".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_prewarm]
    
    inline def pg_stat_statements: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements = "pg_stat_statements".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_stat_statements]
    
    inline def pg_trgm: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_trgm = "pg_trgm".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_trgm]
    
    inline def pg_visibility: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_visibility = "pg_visibility".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pg_visibility]
    
    inline def pgcrypto: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgcrypto = "pgcrypto".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgcrypto]
    
    inline def pgrowlocks: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgrowlocks = "pgrowlocks".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgrowlocks]
    
    inline def pgstattuple: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgstattuple = "pgstattuple".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.pgstattuple]
    
    inline def postgres_fdw: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.postgres_fdw = "postgres_fdw".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.postgres_fdw]
    
    inline def seg: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.seg = "seg".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.seg]
    
    inline def sepgsql: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sepgsql = "sepgsql".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sepgsql]
    
    inline def spi: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.spi = "spi".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.spi]
    
    inline def sslinfo: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sslinfo = "sslinfo".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sslinfo]
    
    inline def tablefunc: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tablefunc = "tablefunc".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tablefunc]
    
    inline def tcn: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tcn = "tcn".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tcn]
    
    inline def test_decoding: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.test_decoding = "test_decoding".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.test_decoding]
    
    inline def tsm_system_rows: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows = "tsm_system_rows".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_rows]
    
    inline def tsm_system_time: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_time = "tsm_system_time".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.tsm_system_time]
    
    inline def unaccent: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.unaccent = "unaccent".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.unaccent]
    
    inline def `uuid-ossp`: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp` = "uuid-ossp".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`uuid-ossp`]
    
    inline def xml2: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.xml2 = "xml2".asInstanceOf[typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.xml2]
  }
  
  type StringExtension = LiteralUnion[Extension]
}
