package typingsJapgolly.roadsServer.httpServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.roads.mod.Response
import typingsJapgolly.roads.mod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
    * If set, this holds the custom error handler defined by the user in the constructor
    *
    * @type null|function
    */
  var custom_error_handler: js.UndefOr[js.Function] = js.undefined
  /**
    * This is the road object that will handle all requests
    * @type Road
    */
  var road: Road
  /**
    * This is the node.js http server from the http library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  var server: typingsJapgolly.node.httpMod.Server
  /**
    * Standard logic to handle any errors thrown in the roads request.
    * If a custom error handler was provided in the constructor, it will use that. Otherwise
    * it will fall back to the roads default logic.
    *
    * The roads default logic is
    *  - If the error is a roads.HttpError, display the error message and status code exactly as thrown.
    *  - If the error is anything else, display a 500 error with the message "Server Error: ".
    *
    * @param  HTTPResponse http_response
    * @param  Error error
    */
  /* protected */ def error_handler(http_response: ServerResponse, error: js.Error): Unit
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param int port
    * @param string hostname
    */
  def listen(port: Double, hostname: String): Unit
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param  HTTPRequest http_request
    * @param  HTTPResponse http_response
    */
  /* protected */ def onRequest(http_request: IncomingMessage, http_response: ServerResponse): Unit
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param  HTTPResponse http_response
    * @param  Response response
    */
  /* protected */ def sendResponse(http_response: ServerResponse, response: Response): Unit
}

object Server {
  @scala.inline
  def apply(
    error_handler: (ServerResponse, js.Error) => Callback,
    listen: (Double, String) => Callback,
    onRequest: (IncomingMessage, ServerResponse) => Callback,
    road: Road,
    sendResponse: (ServerResponse, Response) => Callback,
    server: typingsJapgolly.node.httpMod.Server,
    custom_error_handler: js.Function = null
  ): Server = {
    val __obj = js.Dynamic.literal(road = road.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.updateDynamic("error_handler")(js.Any.fromFunction2((t0: typingsJapgolly.node.httpMod.ServerResponse, t1: js.Error) => error_handler(t0, t1).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => listen(t0, t1).runNow()))
    __obj.updateDynamic("onRequest")(js.Any.fromFunction2((t0: typingsJapgolly.node.httpMod.IncomingMessage, t1: typingsJapgolly.node.httpMod.ServerResponse) => onRequest(t0, t1).runNow()))
    __obj.updateDynamic("sendResponse")(js.Any.fromFunction2((t0: typingsJapgolly.node.httpMod.ServerResponse, t1: typingsJapgolly.roads.mod.Response) => sendResponse(t0, t1).runNow()))
    if (custom_error_handler != null) __obj.updateDynamic("custom_error_handler")(custom_error_handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

