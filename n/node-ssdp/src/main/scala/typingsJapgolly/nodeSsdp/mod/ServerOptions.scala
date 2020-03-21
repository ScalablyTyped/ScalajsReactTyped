package typingsJapgolly.nodeSsdp.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends ClientOptions {
  /**
  	 * Interval at which to send out advertisement (ms)
  	 * @default 10000
  	 */
  var adInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * Allow wildcards in M-SEARCH packets (non-standard)
  	 * @default false
  	 */
  var allowWildcards: js.UndefOr[Boolean] = js.undefined
  /**
  	 * URL pointing to description of your service, or a function that returns that URL.
  	 * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
  	 * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
  	 */
  var location: js.UndefOr[String | ServiceDescriptionLocation] = js.undefined
  /**
  	 * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
  	 * @default false
  	 */
  var suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Packet TTL
  	 * @default 1800
  	 */
  var ttl: js.UndefOr[Double] = js.undefined
  /**
  	 * SSDP Unique Device Name
  	 * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
  	 */
  var udn: js.UndefOr[String] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    adInterval: Int | Double = null,
    allowWildcards: js.UndefOr[Boolean] = js.undefined,
    customLogger: (/* format */ String, /* repeated */ js.Any) => Callback = null,
    description: String = null,
    explicitSocketBind: js.UndefOr[Boolean] = js.undefined,
    headers: SsdpHeaders = null,
    interfaces: js.Array[String] = null,
    location: String | ServiceDescriptionLocation = null,
    reuseAddr: js.UndefOr[Boolean] = js.undefined,
    ssdpIp: String = null,
    ssdpPort: Int | Double = null,
    ssdpSig: String = null,
    ssdpTtl: Int | Double = null,
    suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null,
    udn: String = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (adInterval != null) __obj.updateDynamic("adInterval")(adInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWildcards)) __obj.updateDynamic("allowWildcards")(allowWildcards.asInstanceOf[js.Any])
    if (customLogger != null) __obj.updateDynamic("customLogger")(js.Any.fromFunction2((t0: /* format */ java.lang.String, t1: /* repeated */ js.Any) => customLogger(t0, t1).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitSocketBind)) __obj.updateDynamic("explicitSocketBind")(explicitSocketBind.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr.asInstanceOf[js.Any])
    if (ssdpIp != null) __obj.updateDynamic("ssdpIp")(ssdpIp.asInstanceOf[js.Any])
    if (ssdpPort != null) __obj.updateDynamic("ssdpPort")(ssdpPort.asInstanceOf[js.Any])
    if (ssdpSig != null) __obj.updateDynamic("ssdpSig")(ssdpSig.asInstanceOf[js.Any])
    if (ssdpTtl != null) __obj.updateDynamic("ssdpTtl")(ssdpTtl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressRootDeviceAdvertisements)) __obj.updateDynamic("suppressRootDeviceAdvertisements")(suppressRootDeviceAdvertisements.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (udn != null) __obj.updateDynamic("udn")(udn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

