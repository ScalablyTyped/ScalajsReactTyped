package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs a license acquisition process. */
trait IPlayReadyLicenseAcquisitionServiceRequest
  extends StObject
     with IPlayReadyServiceRequest {
  
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader
  
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String
}
object IPlayReadyLicenseAcquisitionServiceRequest {
  
  inline def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest.toJsFn, challengeCustomData = challengeCustomData.asInstanceOf[js.Any], contentHeader = contentHeader.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], generateManualEnablingChallenge = generateManualEnablingChallenge.toJsFn, nextServiceRequest = nextServiceRequest.toJsFn, processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
  
  extension [Self <: IPlayReadyLicenseAcquisitionServiceRequest](x: Self) {
    
    inline def setContentHeader(value: PlayReadyContentHeader): Self = StObject.set(x, "contentHeader", value.asInstanceOf[js.Any])
    
    inline def setDomainServiceId(value: String): Self = StObject.set(x, "domainServiceId", value.asInstanceOf[js.Any])
  }
}
