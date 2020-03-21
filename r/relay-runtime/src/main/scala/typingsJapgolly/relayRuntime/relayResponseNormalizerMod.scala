package typingsJapgolly.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsJapgolly.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RelayResponsePayload
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayResponseNormalizer", JSImport.Namespace)
@js.native
object relayResponseNormalizerMod extends js.Object {
  @js.native
  trait NormalizationOptions extends js.Object {
    @JSName("getDataID")
    var getDataID_Original: GetDataID = js.native
    var path: js.UndefOr[js.Array[String]] = js.native
    var request: RequestDescriptor = js.native
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
  }
  
  def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = js.native
  type GetDataID = js.Function2[/* fieldValue */ StringDictionary[js.Any], /* typeName */ String, js.Any]
}

