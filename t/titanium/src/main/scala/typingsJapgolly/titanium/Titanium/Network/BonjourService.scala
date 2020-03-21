package typingsJapgolly.titanium.Titanium.Network

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Describes a service on the network which is published by Bonjour.
		 */
trait BonjourService extends Proxy {
  /**
  			 * the domain of the service
  			 */
  var domain: String
  /**
  			 * whether or not the service is local to the device
  			 */
  var isLocal: Boolean
  /**
  			 * the name of the service
  			 */
  var name: String
  /**
  			 * the TCPSocket object that is used to connect to the service
  			 */
  var socket: js.Any
  /**
  			 * the type of the service
  			 */
  var `type`: String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def getIsLocal(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def getSocket(): js.Any
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def getType(): String
  /**
  			 * Publish a Bonjour service to the network.  Only works if isLocal is TRUE
  			 */
  def publish(socket: js.Any): Unit
  /**
  			 * Resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
  			 */
  def resolve(timeout: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def setIsLocal(isLocal: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def setSocket(socket: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def setType(`type`: String): Unit
  /**
  			 * Halts publication of a service.
  			 */
  def stop(): Unit
}

object BonjourService {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    domain: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDomain: CallbackTo[String],
    getIsLocal: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getSocket: CallbackTo[js.Any],
    getType: CallbackTo[String],
    isLocal: Boolean,
    name: String,
    publish: js.Any => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    resolve: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setDomain: String => Callback,
    setIsLocal: Boolean => Callback,
    setName: String => Callback,
    setSocket: js.Any => Callback,
    setType: String => Callback,
    socket: js.Any,
    stop: Callback,
    `type`: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BonjourService = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDomain")(getDomain.toJsFn)
    __obj.updateDynamic("getIsLocal")(getIsLocal.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getSocket")(getSocket.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("publish")(js.Any.fromFunction1((t0: js.Any) => publish(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: scala.Double) => resolve(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDomain")(js.Any.fromFunction1((t0: java.lang.String) => setDomain(t0).runNow()))
    __obj.updateDynamic("setIsLocal")(js.Any.fromFunction1((t0: scala.Boolean) => setIsLocal(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setSocket")(js.Any.fromFunction1((t0: js.Any) => setSocket(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: java.lang.String) => setType(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourService]
  }
}

