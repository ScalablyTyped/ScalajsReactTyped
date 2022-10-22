package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See {@link XConfigurationController} for a description of the configuration controller.
  *
  * This service is used at the moment by the {@link XControllerManager} to create a configuration controller. This allows developers to replace the
  * default implementation of the configuration controller with their own. This may not be a useful feature. Furthermore the sub controllers may need a
  * tighter coupling than the interfaces allow. These are reasons for removing this service in the future and let the controller manager create the sub
  * controllers directly.
  */
trait ConfigurationController
  extends StObject
     with XConfigurationController {
  
  def create(xController: XController): Unit
}
object ConfigurationController {
  
  inline def apply(
    CurrentConfiguration: XConfiguration,
    RequestedConfiguration: XConfiguration,
    addConfigurationChangeListener: (XConfigurationChangeListener, String, Any) => Callback,
    addResourceFactory: (String, XResourceFactory) => Callback,
    create: XController => Callback,
    getCurrentConfiguration: CallbackTo[XConfiguration],
    getRequestedConfiguration: CallbackTo[XConfiguration],
    getResource: XResourceId => XResource,
    getResourceFactory: String => XResourceFactory,
    hasPendingRequests: CallbackTo[Boolean],
    lock: Callback,
    notifyEvent: ConfigurationChangeEvent => Callback,
    postChangeRequest: XConfigurationChangeRequest => Callback,
    removeConfigurationChangeListener: XConfigurationChangeListener => Callback,
    removeResourceFactoryForReference: XResourceFactory => Callback,
    removeResourceFactoryForURL: String => Callback,
    requestResourceActivation: (XResourceId, ResourceActivationMode) => Callback,
    requestResourceDeactivation: XResourceId => Callback,
    restoreConfiguration: XConfiguration => Callback,
    unlock: Callback,
    update: Callback
  ): ConfigurationController = {
    val __obj = js.Dynamic.literal(CurrentConfiguration = CurrentConfiguration.asInstanceOf[js.Any], RequestedConfiguration = RequestedConfiguration.asInstanceOf[js.Any], addConfigurationChangeListener = js.Any.fromFunction3((t0: XConfigurationChangeListener, t1: String, t2: Any) => (addConfigurationChangeListener(t0, t1, t2)).runNow()), addResourceFactory = js.Any.fromFunction2((t0: String, t1: XResourceFactory) => (addResourceFactory(t0, t1)).runNow()), create = js.Any.fromFunction1((t0: XController) => create(t0).runNow()), getCurrentConfiguration = getCurrentConfiguration.toJsFn, getRequestedConfiguration = getRequestedConfiguration.toJsFn, getResource = js.Any.fromFunction1(getResource), getResourceFactory = js.Any.fromFunction1(getResourceFactory), hasPendingRequests = hasPendingRequests.toJsFn, lock = lock.toJsFn, notifyEvent = js.Any.fromFunction1((t0: ConfigurationChangeEvent) => notifyEvent(t0).runNow()), postChangeRequest = js.Any.fromFunction1((t0: XConfigurationChangeRequest) => postChangeRequest(t0).runNow()), removeConfigurationChangeListener = js.Any.fromFunction1((t0: XConfigurationChangeListener) => removeConfigurationChangeListener(t0).runNow()), removeResourceFactoryForReference = js.Any.fromFunction1((t0: XResourceFactory) => removeResourceFactoryForReference(t0).runNow()), removeResourceFactoryForURL = js.Any.fromFunction1((t0: String) => removeResourceFactoryForURL(t0).runNow()), requestResourceActivation = js.Any.fromFunction2((t0: XResourceId, t1: ResourceActivationMode) => (requestResourceActivation(t0, t1)).runNow()), requestResourceDeactivation = js.Any.fromFunction1((t0: XResourceId) => requestResourceDeactivation(t0).runNow()), restoreConfiguration = js.Any.fromFunction1((t0: XConfiguration) => restoreConfiguration(t0).runNow()), unlock = unlock.toJsFn, update = update.toJsFn)
    __obj.asInstanceOf[ConfigurationController]
  }
  
  extension [Self <: ConfigurationController](x: Self) {
    
    inline def setCreate(value: XController => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XController) => value(t0).runNow()))
  }
}
