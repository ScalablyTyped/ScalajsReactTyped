package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.AnonGcReleaseBufferSize
import typingsJapgolly.relayRuntime.relayModernStoreMod.RelayModernStore
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: AnonGcReleaseBufferSize) = this()
}

