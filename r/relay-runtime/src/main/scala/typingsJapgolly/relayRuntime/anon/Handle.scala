package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Record
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayRuntimeStrings.scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle
  extends StObject
     with MissingFieldHandler {
  
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): Any = js.native
  def handle(field: NormalizationScalarField, record: Unit, args: Variables, store: ReadOnlyRecordSourceProxy): Any = js.native
  def handle(
    field: NormalizationScalarField,
    record: Record[js.Object],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): Any = js.native
  
  var kind: scalar = js.native
}
