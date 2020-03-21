package typingsJapgolly.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequest {
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[typingsJapgolly.firefoxWebextBrowser.AnonBinaryValue]
  type OnBeforeRedirectOptions = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  type OnCompletedOptions = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  type OnResponseStartedOptions = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  type OnSendHeadersOptions = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  type TransportWeaknessReasons = typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cipher
  /** If the request has been classified this is an array of `UrlClassificationFlags`. */
  type UrlClassificationParty = js.Array[typingsJapgolly.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags]
}
