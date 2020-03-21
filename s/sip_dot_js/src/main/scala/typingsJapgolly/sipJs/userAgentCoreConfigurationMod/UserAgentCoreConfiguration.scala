package typingsJapgolly.sipJs.userAgentCoreConfigurationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sipJs.coreTransportMod.Transport
import typingsJapgolly.sipJs.logMod.LoggerFactory
import typingsJapgolly.sipJs.messagesMod.DigestAuthentication
import typingsJapgolly.sipJs.messagesMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentCoreConfiguration extends js.Object {
  /**
    * Address-of-Record (AOR).
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-6
    */
  var aor: URI
  /**
    * Contact.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-8.1.1.8
    */
  var contact: Contact
  /**
    * From header display name.
    */
  var displayName: String
  /**
    * Force Via header field transport to TCP.
    */
  var hackViaTcp: Boolean
  /**
    * Logger factory.
    */
  var loggerFactory: LoggerFactory
  /**
    * Preloaded route set.
    */
  var routeSet: js.Array[String]
  /**
    * Unique instance id.
    */
  var sipjsId: String
  /**
    * Option tags of supported SIP extenstions.
    */
  var supportedOptionTags: js.Array[String]
  /**
    * Option tags of supported SIP extenstions.
    * Used in resposnes.
    * @remarks
    * FIXME: Make this go away.
    */
  var supportedOptionTagsResponse: js.Array[String]
  /**
    * User-Agent header field value.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-20.41
    */
  var userAgentHeaderFieldValue: js.UndefOr[String] = js.undefined
  /**
    * Force use of "rport" Via header field parameter.
    * @remarks
    * https://www.ietf.org/rfc/rfc3581.txt
    */
  var viaForceRport: Boolean
  /**
    * Via header field host name or network address.
    * @remarks
    * The Via header field indicates the path taken by the request so far
    * and indicates the path that should be followed in routing responses.
    */
  var viaHost: String
  /**
    * DEPRECATED
    * Authentication factory function.
    */
  def authenticationFactory(): js.UndefOr[DigestAuthentication]
  /**
    * DEPRECATED: This is a hack to get around `Transport`
    * requiring the `UA` to start for construction.
    */
  def transportAccessor(): js.UndefOr[Transport]
}

object UserAgentCoreConfiguration {
  @scala.inline
  def apply(
    aor: URI,
    authenticationFactory: CallbackTo[js.UndefOr[DigestAuthentication]],
    contact: Contact,
    displayName: String,
    hackViaTcp: Boolean,
    loggerFactory: LoggerFactory,
    routeSet: js.Array[String],
    sipjsId: String,
    supportedOptionTags: js.Array[String],
    supportedOptionTagsResponse: js.Array[String],
    transportAccessor: CallbackTo[js.UndefOr[Transport]],
    viaForceRport: Boolean,
    viaHost: String,
    userAgentHeaderFieldValue: String = null
  ): UserAgentCoreConfiguration = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hackViaTcp = hackViaTcp.asInstanceOf[js.Any], loggerFactory = loggerFactory.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], sipjsId = sipjsId.asInstanceOf[js.Any], supportedOptionTags = supportedOptionTags.asInstanceOf[js.Any], supportedOptionTagsResponse = supportedOptionTagsResponse.asInstanceOf[js.Any], viaForceRport = viaForceRport.asInstanceOf[js.Any], viaHost = viaHost.asInstanceOf[js.Any])
    __obj.updateDynamic("authenticationFactory")(authenticationFactory.toJsFn)
    __obj.updateDynamic("transportAccessor")(transportAccessor.toJsFn)
    if (userAgentHeaderFieldValue != null) __obj.updateDynamic("userAgentHeaderFieldValue")(userAgentHeaderFieldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentCoreConfiguration]
  }
}

