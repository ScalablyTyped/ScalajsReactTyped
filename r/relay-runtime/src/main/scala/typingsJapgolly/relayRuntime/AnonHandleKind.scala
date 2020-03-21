package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationLinkedField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.pluralLinked
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleKind extends MissingFieldHandler {
  var kind: pluralLinked = js.native
  def handle(
    field: NormalizationLinkedField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
}

