package typingsJapgolly.cassandraDriver.libTypesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dataTypes extends StObject
@JSImport("cassandra-driver/lib/types", "types.dataTypes")
@js.native
object dataTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dataTypes & Double] = js.native
  
  @js.native
  sealed trait ascii
    extends StObject
       with dataTypes
  /* 0x0001 */ val ascii: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.ascii & Double = js.native
  
  @js.native
  sealed trait bigint
    extends StObject
       with dataTypes
  /* 0x0002 */ val bigint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.bigint & Double = js.native
  
  @js.native
  sealed trait blob
    extends StObject
       with dataTypes
  /* 0x0003 */ val blob: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.blob & Double = js.native
  
  @js.native
  sealed trait boolean
    extends StObject
       with dataTypes
  /* 0x0004 */ val boolean: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.boolean & Double = js.native
  
  @js.native
  sealed trait counter
    extends StObject
       with dataTypes
  /* 0x0005 */ val counter: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.counter & Double = js.native
  
  @js.native
  sealed trait custom
    extends StObject
       with dataTypes
  /* 0x0000 */ val custom: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.custom & Double = js.native
  
  @js.native
  sealed trait date
    extends StObject
       with dataTypes
  /* 0x0011 */ val date: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.date & Double = js.native
  
  @js.native
  sealed trait decimal
    extends StObject
       with dataTypes
  /* 0x0006 */ val decimal: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.decimal & Double = js.native
  
  @js.native
  sealed trait double
    extends StObject
       with dataTypes
  /* 0x0007 */ val double: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.double & Double = js.native
  
  @js.native
  sealed trait duration
    extends StObject
       with dataTypes
  /* 0x0015 */ val duration: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.duration & Double = js.native
  
  @js.native
  sealed trait float
    extends StObject
       with dataTypes
  /* 0x0008 */ val float: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.float & Double = js.native
  
  @js.native
  sealed trait inet
    extends StObject
       with dataTypes
  /* 0x0010 */ val inet: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.inet & Double = js.native
  
  @js.native
  sealed trait int
    extends StObject
       with dataTypes
  /* 0x0009 */ val int: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.int & Double = js.native
  
  @js.native
  sealed trait list
    extends StObject
       with dataTypes
  /* 0x0020 */ val list: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.list & Double = js.native
  
  @js.native
  sealed trait map
    extends StObject
       with dataTypes
  /* 0x0021 */ val map: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.map & Double = js.native
  
  @js.native
  sealed trait set
    extends StObject
       with dataTypes
  /* 0x0022 */ val set: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.set & Double = js.native
  
  @js.native
  sealed trait smallint
    extends StObject
       with dataTypes
  /* 0x0013 */ val smallint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.smallint & Double = js.native
  
  @js.native
  sealed trait text
    extends StObject
       with dataTypes
  /* 0x000a */ val text: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.text & Double = js.native
  
  @js.native
  sealed trait time
    extends StObject
       with dataTypes
  /* 0x0012 */ val time: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.time & Double = js.native
  
  @js.native
  sealed trait timestamp
    extends StObject
       with dataTypes
  /* 0x000b */ val timestamp: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.timestamp & Double = js.native
  
  @js.native
  sealed trait timeuuid
    extends StObject
       with dataTypes
  /* 0x000f */ val timeuuid: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.timeuuid & Double = js.native
  
  @js.native
  sealed trait tinyint
    extends StObject
       with dataTypes
  /* 0x0014 */ val tinyint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.tinyint & Double = js.native
  
  @js.native
  sealed trait tuple
    extends StObject
       with dataTypes
  /* 0x0031 */ val tuple: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.tuple & Double = js.native
  
  @js.native
  sealed trait udt
    extends StObject
       with dataTypes
  /* 0x0030 */ val udt: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.udt & Double = js.native
  
  @js.native
  sealed trait uuid
    extends StObject
       with dataTypes
  /* 0x000c */ val uuid: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.uuid & Double = js.native
  
  @js.native
  sealed trait varchar
    extends StObject
       with dataTypes
  /* 0x000d */ val varchar: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.varchar & Double = js.native
  
  @js.native
  sealed trait varint
    extends StObject
       with dataTypes
  /* 0x000e */ val varint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.varint & Double = js.native
}
