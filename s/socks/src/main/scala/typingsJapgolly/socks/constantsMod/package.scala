package typingsJapgolly.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object constantsMod {
  type SocksClientBoundEvent = typingsJapgolly.socks.constantsMod.SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = typingsJapgolly.socks.utilMod.RequireOnlyOne[
    typingsJapgolly.socks.AnonHost, 
    typingsJapgolly.socks.socksStrings.host | typingsJapgolly.socks.socksStrings.ipaddress
  ]
}
