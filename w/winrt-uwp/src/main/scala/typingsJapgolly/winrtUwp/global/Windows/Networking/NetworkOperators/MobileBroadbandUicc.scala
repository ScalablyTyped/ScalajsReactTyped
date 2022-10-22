package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUicc")
@js.native
open class MobileBroadbandUicc ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUicc {
  
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  /* CompleteClass */
  override def getUiccAppsAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult
  ] = js.native
  
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  /* CompleteClass */
  var simIccId: String = js.native
}
