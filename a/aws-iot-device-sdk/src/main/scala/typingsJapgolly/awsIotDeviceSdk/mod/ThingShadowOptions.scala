package typingsJapgolly.awsIotDeviceSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkStrings.mqtts
import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkStrings.newest
import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkStrings.oldest
import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkStrings.wss
import typingsJapgolly.mqtt.AnonAuthenticationData
import typingsJapgolly.mqtt.AnonHost
import typingsJapgolly.mqtt.AnonPayload
import typingsJapgolly.mqtt.clientMod.MqttClient
import typingsJapgolly.mqtt.clientOptionsMod.IClientOptions
import typingsJapgolly.mqtt.storeMod.Store
import typingsJapgolly.node.Buffer
import typingsJapgolly.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingShadowOptions extends DeviceOptions {
  /** the timeout for thing operations (default 10 seconds) */
  var operationTimeout: js.UndefOr[Double] = js.undefined
}

object ThingShadowOptions {
  @scala.inline
  def apply(
    accessKeyId: String = null,
    autoResubscribe: js.UndefOr[Boolean] = js.undefined,
    baseReconnectTimeMs: Int | Double = null,
    ca: String | (js.Array[Buffer | String]) | Buffer = null,
    caCert: String | Buffer = null,
    caPath: String = null,
    cert: String | (js.Array[Buffer | String]) | Buffer = null,
    certPath: String = null,
    clean: js.UndefOr[Boolean] = js.undefined,
    clientCert: String | Buffer = null,
    clientId: String = null,
    connectTimeout: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    drainTimeMs: Int | Double = null,
    host: String = null,
    hostname: String = null,
    incomingStore: Store = null,
    keepalive: Int | Double = null,
    key: String | (js.Array[Buffer | js.Object | String]) | Buffer = null,
    keyPath: String = null,
    maximumReconnectTimeMs: Int | Double = null,
    minimumConnectionTimeMs: Int | Double = null,
    offlineQueueDropBehavior: oldest | newest = null,
    offlineQueueMaxSize: Int | Double = null,
    offlineQueueing: js.UndefOr[Boolean] = js.undefined,
    operationTimeout: Int | Double = null,
    outgoingStore: Store = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    privateKey: String | Buffer = null,
    properties: AnonAuthenticationData = null,
    protocol: mqtts | wss = null,
    protocolId: String = null,
    protocolVersion: Int | Double = null,
    queueQoSZero: js.UndefOr[Boolean] = js.undefined,
    reconnectPeriod: Int | Double = null,
    region: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    reschedulePings: js.UndefOr[Boolean] = js.undefined,
    resubscribe: js.UndefOr[Boolean] = js.undefined,
    secretKey: String = null,
    servers: js.Array[AnonHost] = null,
    sessionToken: String = null,
    transformWsUrl: (/* url */ String, /* options */ IClientOptions, /* client */ MqttClient) => CallbackTo[String] = null,
    username: String = null,
    websocketOptions: ClientOptions = null,
    will: AnonPayload = null,
    wsOptions: StringDictionary[js.Any] = null
  ): ThingShadowOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResubscribe)) __obj.updateDynamic("autoResubscribe")(autoResubscribe.asInstanceOf[js.Any])
    if (baseReconnectTimeMs != null) __obj.updateDynamic("baseReconnectTimeMs")(baseReconnectTimeMs.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (caCert != null) __obj.updateDynamic("caCert")(caCert.asInstanceOf[js.Any])
    if (caPath != null) __obj.updateDynamic("caPath")(caPath.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certPath != null) __obj.updateDynamic("certPath")(certPath.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (clientCert != null) __obj.updateDynamic("clientCert")(clientCert.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (drainTimeMs != null) __obj.updateDynamic("drainTimeMs")(drainTimeMs.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (maximumReconnectTimeMs != null) __obj.updateDynamic("maximumReconnectTimeMs")(maximumReconnectTimeMs.asInstanceOf[js.Any])
    if (minimumConnectionTimeMs != null) __obj.updateDynamic("minimumConnectionTimeMs")(minimumConnectionTimeMs.asInstanceOf[js.Any])
    if (offlineQueueDropBehavior != null) __obj.updateDynamic("offlineQueueDropBehavior")(offlineQueueDropBehavior.asInstanceOf[js.Any])
    if (offlineQueueMaxSize != null) __obj.updateDynamic("offlineQueueMaxSize")(offlineQueueMaxSize.asInstanceOf[js.Any])
    if (!js.isUndefined(offlineQueueing)) __obj.updateDynamic("offlineQueueing")(offlineQueueing.asInstanceOf[js.Any])
    if (operationTimeout != null) __obj.updateDynamic("operationTimeout")(operationTimeout.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(queueQoSZero)) __obj.updateDynamic("queueQoSZero")(queueQoSZero.asInstanceOf[js.Any])
    if (reconnectPeriod != null) __obj.updateDynamic("reconnectPeriod")(reconnectPeriod.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(reschedulePings)) __obj.updateDynamic("reschedulePings")(reschedulePings.asInstanceOf[js.Any])
    if (!js.isUndefined(resubscribe)) __obj.updateDynamic("resubscribe")(resubscribe.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (transformWsUrl != null) __obj.updateDynamic("transformWsUrl")(js.Any.fromFunction3((t0: /* url */ java.lang.String, t1: /* options */ typingsJapgolly.mqtt.clientOptionsMod.IClientOptions, t2: /* client */ typingsJapgolly.mqtt.clientMod.MqttClient) => transformWsUrl(t0, t1, t2).runNow()))
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (websocketOptions != null) __obj.updateDynamic("websocketOptions")(websocketOptions.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingShadowOptions]
  }
}

