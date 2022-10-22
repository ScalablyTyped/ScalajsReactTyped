package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.anon.Readonlykindmissingfieldl
import typingsJapgolly.relayRuntime.anon.Readonlykindmissingfieldt
import typingsJapgolly.relayRuntime.anon.Readonlykindrelayresolver
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.ReactFlightServerTree
import typingsJapgolly.relayRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncLoadCallback = js.Function1[/* loadingState */ LoadingState, Unit]

type DataIDSet = Set[DataID]

type FragmentMap = StringDictionary[ReaderFragment]

type FragmentSpecResults = StringDictionary[Any]

type FragmentType = Any

type LogFunction = js.Function1[/* logEvent */ LogEvent, Unit]

type OperationTracker = RelayOperationTracker

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type Props = StringDictionary[Any]

type ReactFlightPayloadDeserializer = js.Function1[/* tree */ ReactFlightServerTree, ReactFlightClientResponse]

type Record[T /* <: js.Object */] = StringDictionary[T]

type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
StringDictionary[js.UndefOr[Record[js.Object] | Null]]

type RelayResolverErrors = js.Array[RelayResolverError]

type RequiredFieldLogger = js.Function1[
/* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt | Readonlykindrelayresolver, 
Unit]

type Scheduler = js.Function1[/* callback */ js.Function0[Unit], Unit]

type SelectorData = StringDictionary[Any]

type SelectorStoreUpdater[T] = js.Function2[/* store */ RecordSourceSelectorProxy[T], /* data */ T, Unit]

type Snapshot = TypedSnapshot[SelectorData]

type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, Unit]
