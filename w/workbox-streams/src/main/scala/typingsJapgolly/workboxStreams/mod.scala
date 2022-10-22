package typingsJapgolly.workboxStreams

import typingsJapgolly.std.HeadersInit
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerCallback
import typingsJapgolly.workboxStreams.concatenateMod.ConcatenateReturn
import typingsJapgolly.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typingsJapgolly.workboxStreams.strategyMod.StreamsHandlerCallback
import typingsJapgolly.workboxStreams.typesStreamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateReturn]
  
  inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateToResponseReturn]
  inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[ConcatenateToResponseReturn]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
  inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[RouteHandlerCallback]
}
