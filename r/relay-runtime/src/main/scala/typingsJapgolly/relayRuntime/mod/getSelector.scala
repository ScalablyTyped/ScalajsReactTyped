package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getSelector")
@js.native
object getSelector extends js.Object {
  def apply(fragment: ReaderFragment, item: js.Any): ReaderSelector = js.native
  def apply(fragment: ReaderFragment, item: js.Array[_]): ReaderSelector = js.native
}

