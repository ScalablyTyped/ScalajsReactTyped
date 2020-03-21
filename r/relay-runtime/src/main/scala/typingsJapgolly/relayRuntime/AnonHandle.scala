package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationScalarField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.scalar
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandle extends MissingFieldHandler {
  var kind: scalar = js.native
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
}

