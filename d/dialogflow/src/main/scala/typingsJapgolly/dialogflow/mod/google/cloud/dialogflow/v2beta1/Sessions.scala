package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Sessions.DetectIntentCallback
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Sessions.StreamingDetectIntentCallback
import typingsJapgolly.protobufjs.mod.RPCImpl
import typingsJapgolly.protobufjs.mod.rpc.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Sessions */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sessions")
@js.native
class Sessions protected () extends Service {
  /**
    * Constructs a new Sessions service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  /**
    * Calls DetectIntent.
    * @param request DetectIntentRequest message or plain object
    * @returns Promise
    */
  def detectIntent(request: IDetectIntentRequest): js.Promise[DetectIntentResponse] = js.native
  /**
    * Calls DetectIntent.
    * @param request DetectIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and DetectIntentResponse
    */
  def detectIntent(request: IDetectIntentRequest, callback: DetectIntentCallback): Unit = js.native
  /**
    * Calls StreamingDetectIntent.
    * @param request StreamingDetectIntentRequest message or plain object
    * @returns Promise
    */
  def streamingDetectIntent(request: IStreamingDetectIntentRequest): js.Promise[StreamingDetectIntentResponse] = js.native
  /**
    * Calls StreamingDetectIntent.
    * @param request StreamingDetectIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and StreamingDetectIntentResponse
    */
  def streamingDetectIntent(request: IStreamingDetectIntentRequest, callback: StreamingDetectIntentCallback): Unit = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sessions")
@js.native
object Sessions extends js.Object {
  /**
    * Creates new Sessions service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): Sessions = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Sessions = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Sessions = js.native
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Sessions#detectIntent}.
    * @param error Error, if any
    * @param [response] DetectIntentResponse
    */
  type DetectIntentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[DetectIntentResponse], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Sessions#streamingDetectIntent}.
    * @param error Error, if any
    * @param [response] StreamingDetectIntentResponse
    */
  type StreamingDetectIntentCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[StreamingDetectIntentResponse], 
    Unit
  ]
}

