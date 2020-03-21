package typingsJapgolly.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This section describes the configuration object that is sent into enigma.create(config).
  */
trait IConfig extends js.Object {
  /**
    * ES6-compatible Promise library.
    */
  var Promise: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to use when instantiating the WebSocket, mandatory for Node.js.
    */
  var createSocket: js.UndefOr[js.Any] = js.undefined
  /**
    * Mixins to extend/augment the QIX Engine API.
    * See Mixins section for more information how each entry in this array should look like.
    * Mixins are applied in the array order.
    */
  var mixins: js.UndefOr[js.Array[IMixin]] = js.undefined
  /**
    * An object containing additional JSON-RPC request parameters.
    * protocol.delta :  Set to false to disable the use of the bandwidth-reducing delta protocol.
    */
  var protocol: js.UndefOr[js.Any] = js.undefined
  /**
    * Interceptors for augmenting requests before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var requestInterceptors: js.UndefOr[js.Array[IRequestInterceptors]] = js.undefined
  /**
    * Interceptors for augmenting responses before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var responseInterceptors: js.UndefOr[js.Array[IResponseInterceptors]] = js.undefined
  /**
    * Object containing the specification for the API to generate. Corresponds to a specific version of the QIX Engine API.
    */
  var schema: js.Object
  /**
    * Set to true if the session should be suspended instead of closed when the websocket is closed.
    */
  var suspendOnClose: js.UndefOr[Boolean] = js.undefined
  /**
    * String containing a proper websocket URL to QIX Engine.
    */
  var url: String
}

object IConfig {
  @scala.inline
  def apply(
    schema: js.Object,
    url: String,
    Promise: js.Any = null,
    createSocket: js.Any = null,
    mixins: js.Array[IMixin] = null,
    protocol: js.Any = null,
    requestInterceptors: js.Array[IRequestInterceptors] = null,
    responseInterceptors: js.Array[IResponseInterceptors] = null,
    suspendOnClose: js.UndefOr[Boolean] = js.undefined
  ): IConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (createSocket != null) __obj.updateDynamic("createSocket")(createSocket.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (requestInterceptors != null) __obj.updateDynamic("requestInterceptors")(requestInterceptors.asInstanceOf[js.Any])
    if (responseInterceptors != null) __obj.updateDynamic("responseInterceptors")(responseInterceptors.asInstanceOf[js.Any])
    if (!js.isUndefined(suspendOnClose)) __obj.updateDynamic("suspendOnClose")(suspendOnClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

