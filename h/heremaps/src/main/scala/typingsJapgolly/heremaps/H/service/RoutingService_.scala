package typingsJapgolly.heremaps.H.service

import typingsJapgolly.heremaps.H.service.RoutingService.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates the Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
  * H.service.Platform#getRoutingService.
  */
@JSGlobal("H.service.RoutingService")
@js.native
/**
  * Constructor
  * @param opt_options {H.service.RoutingService.Options=}
  */
class RoutingService_ () extends AbstractRestService {
  def this(opt_options: Options) = this()
  /**
    * This method sends a "calculateroute" request to Routing REST API and calls the onResult callback function once the service response was received - providing a
    * H.service.ServiceResult object - or the onError callback if a communication error occured.
    * @param calculateRouteParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def calculateRoute(
    calculateRouteParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}

