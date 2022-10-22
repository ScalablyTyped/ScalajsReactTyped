package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Record
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayRuntimeStrings.pluralLinked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleKind
  extends StObject
     with MissingFieldHandler {
  
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Unit, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(
    field: NormalizationLinkedField,
    record: Record[js.Object],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  
  var kind: pluralLinked = js.native
}
