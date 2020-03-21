package typingsJapgolly.meshblu.Meshblu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  def authenticate(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def bufferedSocketEmit(): Unit
  def claimdevice(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection
  def close(fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def connect(): Unit
  /**
  		 * Send a meshblu data message.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def data(data: DataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Find a Meshblu device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def device(data: Device, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection
  /**
  		 * Find Meshblu devices.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def devices(data: Color, fn: js.Function1[/* result */ js.Array[DeviceResponse], Unit]): Connection
  def directText(data: js.Any): Connection
  /**
  		 * @param uuid
  		 * @param message {string|number|object|array|Buffer} - data for encrypting.
  		 * @param options
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def encryptMessage(
    uuid: String,
    message: js.Any,
    options: ConnectionOptions,
    fn: js.Function1[/* result */ js.Any, Unit]
  ): Connection
  def events(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Generate a new session token for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def generateAndStoreToken(data: Device, fn: js.Function1[/* result */ ConnectionOptions, Unit]): Unit
  def generateKeyPair(): KeyPair
  /**
  		 *
  		 * @param uuid
  		 * @param fn The callback to be called. It should take one parameter, err,
  		 * 	which will be null if there was no problem, and one parameter, publicKey,
  		 * 	of type NodeRSA.
  		 */
  def getPublicKey(uuid: String, fn: js.Function2[/* err */ js.Error, /* publicKey */ js.Any, Unit]): Unit
  /**
  		 * Get a meshblu data for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def getdata(data: GetDataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Authenticate with Meshblu.
  		 * @returns This Connection.
  		 */
  def identify(): Connection
  def localdevices(fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Send a meshblu message.
  		 * @param payload An array of devices UUIDs.
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def message(payload: MessagePayload, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def mydevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def parseUrl(serverUrl: String, port: String): String
  def reconnect(): Unit
  /**
  		 * Register a new device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def register(data: RegisterData, fn: js.Function1[/* result */ RegisterResponse, Unit]): Connection
  def resetToken(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Unit
  /**
  		 * Remove a session token from a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def revokeToken(data: ConnectionOptions, fn: js.Function1[/* result */ Device, Unit]): Unit
  /*
  		 * Lack of documentation about these api functions.
  		 */
  def send(text: String): Connection
  def setPrivateKey(privateKey: String): Unit
  def setup(): Connection
  /**
  		 * @param data {string|number|object|array|Buffer} - data for signing.
  		 */
  def sign(data: js.Any): String
  def status(data: js.Any): Connection
  /**
  		 * Returns device messages as they are sent and received.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def subscribe(data: SubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def subscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def textBroadcast(data: js.Any): Connection
  def unclaimeddevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Removes a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unregister(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection
  /**
  		 * Cancels device subscription.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unsubscribe(data: UnsubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def unsubscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Update a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def update(data: UpdateData, fn: js.Function1[/* result */ UpdateSuccess, Unit]): Connection
  /**
  		 * @param message {string|number|object|array|Buffer} - signed data.
  		 * @param signature
  		 * @returns {*}
  		 */
  def verify(message: js.Any, signature: js.Any): js.Any
  /**
  		 * Get my device info.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def whoami(data: js.Any, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection
}

object Connection {
  @scala.inline
  def apply(
    authenticate: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    bufferedSocketEmit: Callback,
    claimdevice: (Device, js.Function1[/* result */ Device, Unit]) => CallbackTo[Connection],
    close: js.Function1[/* result */ js.Any, Unit] => CallbackTo[Connection],
    connect: Callback,
    data: (DataInput, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    device: (Device, js.Function1[/* result */ DeviceResponse, Unit]) => CallbackTo[Connection],
    devices: (Color, js.Function1[/* result */ js.Array[DeviceResponse], Unit]) => CallbackTo[Connection],
    directText: js.Any => CallbackTo[Connection],
    encryptMessage: (String, js.Any, ConnectionOptions, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    events: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    generateAndStoreToken: (Device, js.Function1[/* result */ ConnectionOptions, Unit]) => Callback,
    generateKeyPair: CallbackTo[KeyPair],
    getPublicKey: (String, js.Function2[/* err */ js.Error, /* publicKey */ js.Any, Unit]) => Callback,
    getdata: (GetDataInput, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    identify: CallbackTo[Connection],
    localdevices: js.Function1[/* result */ js.Any, Unit] => CallbackTo[Connection],
    message: (MessagePayload, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    mydevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    parseUrl: (String, String) => CallbackTo[String],
    reconnect: Callback,
    register: (RegisterData, js.Function1[/* result */ RegisterResponse, Unit]) => CallbackTo[Connection],
    resetToken: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Callback,
    revokeToken: (ConnectionOptions, js.Function1[/* result */ Device, Unit]) => Callback,
    send: String => CallbackTo[Connection],
    setPrivateKey: String => Callback,
    setup: CallbackTo[Connection],
    sign: js.Any => CallbackTo[String],
    status: js.Any => CallbackTo[Connection],
    subscribe: (SubscribeData, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    subscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    textBroadcast: js.Any => CallbackTo[Connection],
    unclaimeddevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    unregister: (Device, js.Function1[/* result */ Device, Unit]) => CallbackTo[Connection],
    unsubscribe: (UnsubscribeData, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    unsubscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => CallbackTo[Connection],
    update: (UpdateData, js.Function1[/* result */ UpdateSuccess, Unit]) => CallbackTo[Connection],
    verify: (js.Any, js.Any) => CallbackTo[js.Any],
    whoami: (js.Any, js.Function1[/* result */ DeviceResponse, Unit]) => CallbackTo[Connection]
  ): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => authenticate(t0, t1).runNow()))
    __obj.updateDynamic("bufferedSocketEmit")(bufferedSocketEmit.toJsFn)
    __obj.updateDynamic("claimdevice")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.Device, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.Device, scala.Unit]) => claimdevice(t0, t1).runNow()))
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: js.Function1[/* result */ js.Any, scala.Unit]) => close(t0).runNow()))
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.updateDynamic("data")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.DataInput, t1: js.Function1[/* result */ js.Any, scala.Unit]) => data(t0, t1).runNow()))
    __obj.updateDynamic("device")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.Device, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.DeviceResponse, scala.Unit]) => device(t0, t1).runNow()))
    __obj.updateDynamic("devices")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.Color, t1: js.Function1[/* result */ js.Array[typingsJapgolly.meshblu.Meshblu.DeviceResponse], scala.Unit]) => devices(t0, t1).runNow()))
    __obj.updateDynamic("directText")(js.Any.fromFunction1((t0: js.Any) => directText(t0).runNow()))
    __obj.updateDynamic("encryptMessage")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.meshblu.Meshblu.ConnectionOptions, t3: js.Function1[/* result */ js.Any, scala.Unit]) => encryptMessage(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("events")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => events(t0, t1).runNow()))
    __obj.updateDynamic("generateAndStoreToken")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.Device, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.ConnectionOptions, scala.Unit]) => generateAndStoreToken(t0, t1).runNow()))
    __obj.updateDynamic("generateKeyPair")(generateKeyPair.toJsFn)
    __obj.updateDynamic("getPublicKey")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Error, /* publicKey */ js.Any, scala.Unit]) => getPublicKey(t0, t1).runNow()))
    __obj.updateDynamic("getdata")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.GetDataInput, t1: js.Function1[/* result */ js.Any, scala.Unit]) => getdata(t0, t1).runNow()))
    __obj.updateDynamic("identify")(identify.toJsFn)
    __obj.updateDynamic("localdevices")(js.Any.fromFunction1((t0: js.Function1[/* result */ js.Any, scala.Unit]) => localdevices(t0).runNow()))
    __obj.updateDynamic("message")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.MessagePayload, t1: js.Function1[/* result */ js.Any, scala.Unit]) => message(t0, t1).runNow()))
    __obj.updateDynamic("mydevices")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => mydevices(t0, t1).runNow()))
    __obj.updateDynamic("parseUrl")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => parseUrl(t0, t1).runNow()))
    __obj.updateDynamic("reconnect")(reconnect.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.RegisterData, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.RegisterResponse, scala.Unit]) => register(t0, t1).runNow()))
    __obj.updateDynamic("resetToken")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => resetToken(t0, t1).runNow()))
    __obj.updateDynamic("revokeToken")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.ConnectionOptions, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.Device, scala.Unit]) => revokeToken(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: java.lang.String) => send(t0).runNow()))
    __obj.updateDynamic("setPrivateKey")(js.Any.fromFunction1((t0: java.lang.String) => setPrivateKey(t0).runNow()))
    __obj.updateDynamic("setup")(setup.toJsFn)
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: js.Any) => sign(t0).runNow()))
    __obj.updateDynamic("status")(js.Any.fromFunction1((t0: js.Any) => status(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.SubscribeData, t1: js.Function1[/* result */ js.Any, scala.Unit]) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("subscribeText")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => subscribeText(t0, t1).runNow()))
    __obj.updateDynamic("textBroadcast")(js.Any.fromFunction1((t0: js.Any) => textBroadcast(t0).runNow()))
    __obj.updateDynamic("unclaimeddevices")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => unclaimeddevices(t0, t1).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.Device, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.Device, scala.Unit]) => unregister(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.UnsubscribeData, t1: js.Function1[/* result */ js.Any, scala.Unit]) => unsubscribe(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribeText")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ js.Any, scala.Unit]) => unsubscribeText(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.meshblu.Meshblu.UpdateData, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.UpdateSuccess, scala.Unit]) => update(t0, t1).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => verify(t0, t1).runNow()))
    __obj.updateDynamic("whoami")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* result */ typingsJapgolly.meshblu.Meshblu.DeviceResponse, scala.Unit]) => whoami(t0, t1).runNow()))
    __obj.asInstanceOf[Connection]
  }
}

