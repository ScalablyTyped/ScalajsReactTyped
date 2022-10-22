package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request queue of the configuration controller handles requests for changes to the current configuration.
  *
  * This interface allows callers to add requests to the back of the queue and to determine whether the queue is empty. Using this interface should
  * normally not be necessary for anyone else than the {@link XConfigurationController} . It may be removed in the future.
  */
trait XConfigurationControllerRequestQueue extends StObject {
  
  /**
    * Return whether there are pending requests for configuration changes.
    * @returns Returns `TRUE` when there is at least one request object in the queue that has not yet been processed. It returns `FALSE` when the queue is empty.
    */
  def hasPendingRequests(): Boolean
  
  /**
    * Add a request for a configuration change to the request queue.
    *
    * This method should not be called from outside the drawing framework. Other sub controllers of the drawing framework are typical callers. They can add
    * change requests that can not be made with the requestResourceActivation() and requestResourceDeactivation() methods.
    * @param xRequest The configuration change represented by this request object must only be committed to the configuration when the {@link com.sun.star.dra
    */
  def postChangeRequest(xRequest: XConfigurationChangeRequest): Unit
}
object XConfigurationControllerRequestQueue {
  
  inline def apply(
    hasPendingRequests: CallbackTo[Boolean],
    postChangeRequest: XConfigurationChangeRequest => Callback
  ): XConfigurationControllerRequestQueue = {
    val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests.toJsFn, postChangeRequest = js.Any.fromFunction1((t0: XConfigurationChangeRequest) => postChangeRequest(t0).runNow()))
    __obj.asInstanceOf[XConfigurationControllerRequestQueue]
  }
  
  extension [Self <: XConfigurationControllerRequestQueue](x: Self) {
    
    inline def setHasPendingRequests(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasPendingRequests", value.toJsFn)
    
    inline def setPostChangeRequest(value: XConfigurationChangeRequest => Callback): Self = StObject.set(x, "postChangeRequest", js.Any.fromFunction1((t0: XConfigurationChangeRequest) => value(t0).runNow()))
  }
}
