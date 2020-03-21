package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RequestDescriptor
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createReaderSelector")
@js.native
object createReaderSelector extends js.Object {
  def apply(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
}

