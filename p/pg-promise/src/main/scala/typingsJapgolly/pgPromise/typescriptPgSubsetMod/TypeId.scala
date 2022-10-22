package typingsJapgolly.pgPromise.typescriptPgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends StObject
// Type id-s supported by PostgreSQL, copied from:
// http://github.com/brianc/node-pg-types/blob/master/lib/builtins.js
@JSImport("pg-promise/typescript/pg-subset", "TypeId")
@js.native
object TypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId & Double] = js.native
  
  @js.native
  sealed trait ABSTIME
    extends StObject
       with TypeId
  /* 702 */ val ABSTIME: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.ABSTIME & Double = js.native
  
  @js.native
  sealed trait ACLITEM
    extends StObject
       with TypeId
  /* 1033 */ val ACLITEM: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.ACLITEM & Double = js.native
  
  @js.native
  sealed trait BIT
    extends StObject
       with TypeId
  /* 1560 */ val BIT: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.BIT & Double = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with TypeId
  /* 16 */ val BOOL: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.BOOL & Double = js.native
  
  @js.native
  sealed trait BPCHAR
    extends StObject
       with TypeId
  /* 1042 */ val BPCHAR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.BPCHAR & Double = js.native
  
  @js.native
  sealed trait BYTEA
    extends StObject
       with TypeId
  /* 17 */ val BYTEA: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.BYTEA & Double = js.native
  
  @js.native
  sealed trait CHAR
    extends StObject
       with TypeId
  /* 18 */ val CHAR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.CHAR & Double = js.native
  
  @js.native
  sealed trait CID
    extends StObject
       with TypeId
  /* 29 */ val CID: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.CID & Double = js.native
  
  @js.native
  sealed trait CIDR
    extends StObject
       with TypeId
  /* 650 */ val CIDR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.CIDR & Double = js.native
  
  @js.native
  sealed trait CIRCLE
    extends StObject
       with TypeId
  /* 718 */ val CIRCLE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.CIRCLE & Double = js.native
  
  @js.native
  sealed trait DATE
    extends StObject
       with TypeId
  /* 1082 */ val DATE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.DATE & Double = js.native
  
  @js.native
  sealed trait FLOAT4
    extends StObject
       with TypeId
  /* 700 */ val FLOAT4: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.FLOAT4 & Double = js.native
  
  @js.native
  sealed trait FLOAT8
    extends StObject
       with TypeId
  /* 701 */ val FLOAT8: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.FLOAT8 & Double = js.native
  
  @js.native
  sealed trait GTSVECTOR
    extends StObject
       with TypeId
  /* 3642 */ val GTSVECTOR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.GTSVECTOR & Double = js.native
  
  @js.native
  sealed trait INET
    extends StObject
       with TypeId
  /* 869 */ val INET: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.INET & Double = js.native
  
  @js.native
  sealed trait INT2
    extends StObject
       with TypeId
  /* 21 */ val INT2: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.INT2 & Double = js.native
  
  @js.native
  sealed trait INT4
    extends StObject
       with TypeId
  /* 23 */ val INT4: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.INT4 & Double = js.native
  
  @js.native
  sealed trait INT8
    extends StObject
       with TypeId
  /* 20 */ val INT8: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.INT8 & Double = js.native
  
  @js.native
  sealed trait INTERVAL
    extends StObject
       with TypeId
  /* 1186 */ val INTERVAL: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.INTERVAL & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with TypeId
  /* 114 */ val JSON: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.JSON & Double = js.native
  
  @js.native
  sealed trait JSONB
    extends StObject
       with TypeId
  /* 3802 */ val JSONB: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.JSONB & Double = js.native
  
  @js.native
  sealed trait MACADDR
    extends StObject
       with TypeId
  /* 829 */ val MACADDR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.MACADDR & Double = js.native
  
  @js.native
  sealed trait MACADDR8
    extends StObject
       with TypeId
  /* 774 */ val MACADDR8: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.MACADDR8 & Double = js.native
  
  @js.native
  sealed trait MONEY
    extends StObject
       with TypeId
  /* 790 */ val MONEY: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.MONEY & Double = js.native
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with TypeId
  /* 1700 */ val NUMERIC: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.NUMERIC & Double = js.native
  
  @js.native
  sealed trait OID
    extends StObject
       with TypeId
  /* 26 */ val OID: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.OID & Double = js.native
  
  @js.native
  sealed trait PATH
    extends StObject
       with TypeId
  /* 602 */ val PATH: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.PATH & Double = js.native
  
  @js.native
  sealed trait PG_DEPENDENCIES
    extends StObject
       with TypeId
  /* 3402 */ val PG_DEPENDENCIES: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.PG_DEPENDENCIES & Double = js.native
  
  @js.native
  sealed trait PG_LSN
    extends StObject
       with TypeId
  /* 3220 */ val PG_LSN: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.PG_LSN & Double = js.native
  
  @js.native
  sealed trait PG_NDISTINCT
    extends StObject
       with TypeId
  /* 3361 */ val PG_NDISTINCT: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.PG_NDISTINCT & Double = js.native
  
  @js.native
  sealed trait PG_NODE_TREE
    extends StObject
       with TypeId
  /* 194 */ val PG_NODE_TREE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.PG_NODE_TREE & Double = js.native
  
  @js.native
  sealed trait POLYGON
    extends StObject
       with TypeId
  /* 604 */ val POLYGON: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.POLYGON & Double = js.native
  
  @js.native
  sealed trait REFCURSOR
    extends StObject
       with TypeId
  /* 1790 */ val REFCURSOR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REFCURSOR & Double = js.native
  
  @js.native
  sealed trait REGCLASS
    extends StObject
       with TypeId
  /* 2205 */ val REGCLASS: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGCLASS & Double = js.native
  
  @js.native
  sealed trait REGCONFIG
    extends StObject
       with TypeId
  /* 3734 */ val REGCONFIG: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGCONFIG & Double = js.native
  
  @js.native
  sealed trait REGDICTIONARY
    extends StObject
       with TypeId
  /* 3769 */ val REGDICTIONARY: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGDICTIONARY & Double = js.native
  
  @js.native
  sealed trait REGNAMESPACE
    extends StObject
       with TypeId
  /* 4089 */ val REGNAMESPACE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGNAMESPACE & Double = js.native
  
  @js.native
  sealed trait REGOPER
    extends StObject
       with TypeId
  /* 2203 */ val REGOPER: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGOPER & Double = js.native
  
  @js.native
  sealed trait REGOPERATOR
    extends StObject
       with TypeId
  /* 2204 */ val REGOPERATOR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGOPERATOR & Double = js.native
  
  @js.native
  sealed trait REGPROC
    extends StObject
       with TypeId
  /* 24 */ val REGPROC: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGPROC & Double = js.native
  
  @js.native
  sealed trait REGPROCEDURE
    extends StObject
       with TypeId
  /* 2202 */ val REGPROCEDURE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGPROCEDURE & Double = js.native
  
  @js.native
  sealed trait REGROLE
    extends StObject
       with TypeId
  /* 4096 */ val REGROLE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGROLE & Double = js.native
  
  @js.native
  sealed trait REGTYPE
    extends StObject
       with TypeId
  /* 2206 */ val REGTYPE: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.REGTYPE & Double = js.native
  
  @js.native
  sealed trait RELTIME
    extends StObject
       with TypeId
  /* 703 */ val RELTIME: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.RELTIME & Double = js.native
  
  @js.native
  sealed trait SMGR
    extends StObject
       with TypeId
  /* 210 */ val SMGR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.SMGR & Double = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with TypeId
  /* 25 */ val TEXT: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TEXT & Double = js.native
  
  @js.native
  sealed trait TID
    extends StObject
       with TypeId
  /* 27 */ val TID: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TID & Double = js.native
  
  @js.native
  sealed trait TIME
    extends StObject
       with TypeId
  /* 1083 */ val TIME: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TIME & Double = js.native
  
  @js.native
  sealed trait TIMESTAMP
    extends StObject
       with TypeId
  /* 1114 */ val TIMESTAMP: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TIMESTAMP & Double = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ
    extends StObject
       with TypeId
  /* 1184 */ val TIMESTAMPTZ: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TIMESTAMPTZ & Double = js.native
  
  @js.native
  sealed trait TIMETZ
    extends StObject
       with TypeId
  /* 1266 */ val TIMETZ: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TIMETZ & Double = js.native
  
  @js.native
  sealed trait TINTERVAL
    extends StObject
       with TypeId
  /* 704 */ val TINTERVAL: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TINTERVAL & Double = js.native
  
  @js.native
  sealed trait TSQUERY
    extends StObject
       with TypeId
  /* 3615 */ val TSQUERY: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TSQUERY & Double = js.native
  
  @js.native
  sealed trait TSVECTOR
    extends StObject
       with TypeId
  /* 3614 */ val TSVECTOR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TSVECTOR & Double = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT
    extends StObject
       with TypeId
  /* 2970 */ val TXID_SNAPSHOT: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.TXID_SNAPSHOT & Double = js.native
  
  @js.native
  sealed trait UUID
    extends StObject
       with TypeId
  /* 2950 */ val UUID: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.UUID & Double = js.native
  
  @js.native
  sealed trait VARBIT
    extends StObject
       with TypeId
  /* 1562 */ val VARBIT: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.VARBIT & Double = js.native
  
  @js.native
  sealed trait VARCHAR
    extends StObject
       with TypeId
  /* 1043 */ val VARCHAR: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.VARCHAR & Double = js.native
  
  @js.native
  sealed trait XID
    extends StObject
       with TypeId
  /* 28 */ val XID: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.XID & Double = js.native
  
  @js.native
  sealed trait XML
    extends StObject
       with TypeId
  /* 142 */ val XML: typingsJapgolly.pgPromise.typescriptPgSubsetMod.TypeId.XML & Double = js.native
}
