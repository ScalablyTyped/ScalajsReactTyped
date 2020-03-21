package typingsJapgolly.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayStoreTypesMod {
  type AsyncLoadCallback = js.Function1[
    /* loadingState */ typingsJapgolly.relayRuntime.relayStoreTypesMod.LoadingState, 
    scala.Unit
  ]
  type FragmentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment]
  type FragmentReference = js.Any
  type FragmentSpecResults = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LogFunction = js.Function1[
    /* logEvent */ typingsJapgolly.relayRuntime.relayStoreTypesMod.LogEvent, 
    scala.Unit
  ]
  type OperationTracker = typingsJapgolly.relayRuntime.relayOperationTrackerMod.RelayOperationTracker
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Record = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsJapgolly.relayRuntime.relayStoreTypesMod.Record | scala.Null]]
  type Scheduler = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type SelectorData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SelectorStoreUpdater[T] = js.Function2[
    /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[T], 
    /* data */ T, 
    scala.Unit
  ]
  type Snapshot = typingsJapgolly.relayRuntime.relayStoreTypesMod.TypedSnapshot[typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorData]
  type StoreUpdater = js.Function1[
    /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceProxy, 
    scala.Unit
  ]
  type Unarray[T] = T
  type UpdatedRecords = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
