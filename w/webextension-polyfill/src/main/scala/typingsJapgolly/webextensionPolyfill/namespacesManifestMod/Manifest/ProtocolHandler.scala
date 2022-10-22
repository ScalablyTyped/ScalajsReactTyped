package typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest

import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bitcoin
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.dat
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.dweb
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ftp
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.geo
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.gopher
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.im
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ipfs
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ipns
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.irc
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ircs
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.magnet
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mailto
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.matrix
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mms
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.news
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nntp
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.sip
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.sms
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.smsto
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ssb
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ssh
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tel
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.urn
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.webcal
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wtai
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.xmpp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a protocol handler definition.
  */
trait ProtocolHandler extends StObject {
  
  /**
    * A user-readable title string for the protocol handler. This will be displayed to the user in interface objects as needed.
    */
  var name: String
  
  /**
    * The protocol the site wishes to handle, specified as a string. For example, you can register to handle SMS text message
    * links by registering to handle the "sms" scheme.
    */
  var protocol: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String
  
  /**
    * The URL of the handler, as a string. This string should include "%s" as a placeholder which will be replaced with the
    * escaped URL of the document to be handled. This URL might be a true URL, or it could be a phone number, email address,
    * or so forth.
    */
  var uriTemplate: ExtensionURL | HttpURL
}
object ProtocolHandler {
  
  inline def apply(
    name: String,
    protocol: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String,
    uriTemplate: ExtensionURL | HttpURL
  ): ProtocolHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uriTemplate = uriTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolHandler]
  }
  
  extension [Self <: ProtocolHandler](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocol(
      value: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String
    ): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setUriTemplate(value: ExtensionURL | HttpURL): Self = StObject.set(x, "uriTemplate", value.asInstanceOf[js.Any])
  }
}
