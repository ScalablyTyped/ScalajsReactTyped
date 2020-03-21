package typingsJapgolly.workboxStreams

import typingsJapgolly.std.HeadersInit
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsJapgolly.workboxStreams.concatenateMod.ConcatenateReturn
import typingsJapgolly.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typingsJapgolly.workboxStreams.strategyMod.StreamsHandlerCallback
import typingsJapgolly.workboxStreams.streamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  def isSupported(): Boolean = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
}

