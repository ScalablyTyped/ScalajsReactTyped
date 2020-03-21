package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getVariablesFromFragment")
@js.native
object getVariablesFromFragment extends js.Object {
  def apply(fragment: ReaderFragment, item: js.Any): Variables = js.native
  def apply(fragment: ReaderFragment, item: js.Array[_]): Variables = js.native
}

