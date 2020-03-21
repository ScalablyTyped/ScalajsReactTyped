package typingsJapgolly.nodePushnotifications

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var autoAdjustCache: js.UndefOr[Boolean] = js.undefined
  var buffersNotifications: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a
    * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
    * will be used. - You may need to use this as some environments don't include the CA used by
    * Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[Buffer | String]] = js.undefined
  var cacheLength: js.UndefOr[Double] = js.undefined
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the
    * certificate data.
    */
  var cert: js.UndefOr[String] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var connectionRetryLimit: js.UndefOr[Double] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var disableEPIPEFix: js.UndefOr[Boolean] = js.undefined
  var disableNagle: js.UndefOr[Boolean] = js.undefined
  var fastMode: js.UndefOr[Boolean] = js.undefined
  /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
  var key: js.UndefOr[String] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var minConnections: js.UndefOr[Double] = js.undefined
  /** The passphrase for the connection key, if required */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
    * the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[Buffer | String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var production: js.UndefOr[Boolean] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /** APN Token */
  var token: js.UndefOr[AnonKey] = js.undefined
  var voip: js.UndefOr[Boolean] = js.undefined
}

object AnonAddress {
  @scala.inline
  def apply(
    address: String = null,
    autoAdjustCache: js.UndefOr[Boolean] = js.undefined,
    buffersNotifications: js.UndefOr[Boolean] = js.undefined,
    ca: js.Array[Buffer | String] = null,
    cacheLength: Int | Double = null,
    cert: String = null,
    connectTimeout: Int | Double = null,
    connectionRetryLimit: Int | Double = null,
    connectionTimeout: Int | Double = null,
    disableEPIPEFix: js.UndefOr[Boolean] = js.undefined,
    disableNagle: js.UndefOr[Boolean] = js.undefined,
    fastMode: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxConnections: Int | Double = null,
    minConnections: Int | Double = null,
    passphrase: String = null,
    pfx: Buffer | String = null,
    port: Int | Double = null,
    production: js.UndefOr[Boolean] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    token: AnonKey = null,
    voip: js.UndefOr[Boolean] = js.undefined
  ): AnonAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustCache)) __obj.updateDynamic("autoAdjustCache")(autoAdjustCache.asInstanceOf[js.Any])
    if (!js.isUndefined(buffersNotifications)) __obj.updateDynamic("buffersNotifications")(buffersNotifications.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cacheLength != null) __obj.updateDynamic("cacheLength")(cacheLength.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionRetryLimit != null) __obj.updateDynamic("connectionRetryLimit")(connectionRetryLimit.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEPIPEFix)) __obj.updateDynamic("disableEPIPEFix")(disableEPIPEFix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagle)) __obj.updateDynamic("disableNagle")(disableNagle.asInstanceOf[js.Any])
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (minConnections != null) __obj.updateDynamic("minConnections")(minConnections.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(voip)) __obj.updateDynamic("voip")(voip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

