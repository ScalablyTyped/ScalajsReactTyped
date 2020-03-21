package typingsJapgolly.relayRuntime.relayModernQueryExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.relayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.relayObservableMod.Sink
import typingsJapgolly.relayRuntime.relayResponseNormalizerMod.GetDataID
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationTracker
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typingsJapgolly.relayRuntime.relayStoreTypesMod.PublishQueue
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteConfig extends js.Object {
  @JSName("getDataID")
  var getDataID_Original: GetDataID = js.native
  var operation: OperationDescriptor = js.native
  var operationLoader: OperationLoader = js.native
  var operationTracker: js.UndefOr[OperationTracker] = js.native
  var optimisticConfig: OptimisticResponseConfig = js.native
  var publishQueue: PublishQueue = js.native
  var scheduler: js.UndefOr[TaskScheduler] = js.native
  var sink: Sink[GraphQLResponse] = js.native
  var source: RelayObservable[GraphQLResponse] = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.native
  def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
}

