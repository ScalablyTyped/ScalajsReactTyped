package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
trait MobileBroadbandUicc extends StObject {
  
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  def getUiccAppsAsync(): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]
  
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  var simIccId: String
}
object MobileBroadbandUicc {
  
  inline def apply(
    getUiccAppsAsync: CallbackTo[IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]],
    simIccId: String
  ): MobileBroadbandUicc = {
    val __obj = js.Dynamic.literal(getUiccAppsAsync = getUiccAppsAsync.toJsFn, simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUicc]
  }
  
  extension [Self <: MobileBroadbandUicc](x: Self) {
    
    inline def setGetUiccAppsAsync(value: CallbackTo[IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]]): Self = StObject.set(x, "getUiccAppsAsync", value.toJsFn)
    
    inline def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
  }
}
