package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordProxy[T] extends StObject {
  
  def copyFieldsFrom(source: RecordProxy[js.Object]): Unit = js.native
  
  def getDataID(): DataID = js.native
  
  // If a parent type is provided, provide the child type
  def getLinkedRecord[K /* <: /* keyof T */ String */](name: K): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  def getLinkedRecord[K /* <: /* keyof T */ String */](name: K, args: Variables): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  // If a hint is provided, the return value is guaranteed to be the hint type
  def getLinkedRecord[H](name: String): /* import warning: importer.ImportType#apply Failed type conversion: [H] extends [never] ? relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<{}> | null : relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<H> */ js.Any = js.native
  def getLinkedRecord[H](name: String, args: Variables): /* import warning: importer.ImportType#apply Failed type conversion: [H] extends [never] ? relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<{}> | null : relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<H> */ js.Any = js.native
  
  def getLinkedRecords[K /* <: /* keyof T */ String */](name: K): js.Array[
    RecordProxy[
      Unarray[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ] = js.native
  def getLinkedRecords[K /* <: /* keyof T */ String */](name: K, args: Variables): js.Array[
    RecordProxy[
      Unarray[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ] = js.native
  def getLinkedRecords[H](name: String): /* import warning: importer.ImportType#apply Failed type conversion: [H] extends [never] ? std.Array<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<{}>> | null : std.NonNullable<H> extends std.Array<infer U> ? std.Array<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<U>> | H extends null ? null : never : never */ js.Any = js.native
  def getLinkedRecords[H](name: String, args: Variables): /* import warning: importer.ImportType#apply Failed type conversion: [H] extends [never] ? std.Array<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<{}>> | null : std.NonNullable<H> extends std.Array<infer U> ? std.Array<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordProxy<U>> | H extends null ? null : never : never */ js.Any = js.native
  
  def getOrCreateLinkedRecord(name: String, typeName: String): RecordProxy[T] = js.native
  def getOrCreateLinkedRecord(name: String, typeName: String, args: Variables): RecordProxy[T] = js.native
  
  def getType(): String = js.native
  
  def getValue(name: String): Primitive | js.Array[Primitive] = js.native
  def getValue(name: String, args: Variables): Primitive | js.Array[Primitive] = js.native
  def getValue[K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  def getValue[K /* <: /* keyof T */ String */](name: K, args: Variables): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def invalidateRecord(): Unit = js.native
  
  def setLinkedRecord(record: Null, name: String): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: Null, name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: RecordProxy[js.Object], name: String): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: RecordProxy[js.Object], name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](record: Null, name: K): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](record: Null, name: K, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](
    record: RecordProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    name: K
  ): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](
    record: RecordProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
  
  def setLinkedRecords(records: js.Array[RecordProxy[js.Object] | Null], name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: js.Array[RecordProxy[js.Object] | Null], name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords(records: Null, name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: Null, name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords(records: Unit, name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: Unit, name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](
    records: js.Array[
      (RecordProxy[
        Unarray[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]) | Null
    ],
    name: K
  ): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](
    records: js.Array[
      (RecordProxy[
        Unarray[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]) | Null
    ],
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Null, name: K): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Null, name: K, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Unit, name: K): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Unit, name: K, args: Variables): RecordProxy[T] = js.native
  
  def setValue(value: js.Array[Primitive], name: String): RecordProxy[js.Object] = js.native
  def setValue(value: js.Array[Primitive], name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setValue(value: Primitive, name: String): RecordProxy[js.Object] = js.native
  def setValue(value: Primitive, name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setValue[K /* <: /* keyof T */ String */](
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    name: K
  ): RecordProxy[T] = js.native
  def setValue[K /* <: /* keyof T */ String */](
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
}
