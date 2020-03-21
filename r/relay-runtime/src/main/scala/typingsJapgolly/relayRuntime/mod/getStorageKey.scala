package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationField
import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationHandle
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderField
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getStorageKey")
@js.native
object getStorageKey extends js.Object {
  def apply(field: NormalizationField, variables: Variables): String = js.native
  def apply(field: NormalizationHandle, variables: Variables): String = js.native
  def apply(field: ReaderField, variables: Variables): String = js.native
}

