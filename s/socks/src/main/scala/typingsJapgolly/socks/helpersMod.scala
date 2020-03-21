package typingsJapgolly.socks

import typingsJapgolly.socks.constantsMod.SocksClientChainOptions
import typingsJapgolly.socks.constantsMod.SocksClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks/typings/common/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  /**
    * Validates the SocksClientChainOptions
    * @param options { SocksClientChainOptions }
    */
  def validateSocksClientChainOptions(options: SocksClientChainOptions): Unit = js.native
  /**
    * Validates the provided SocksClientOptions
    * @param options { SocksClientOptions }
    * @param acceptedCommands { string[] } A list of accepted SocksProxy commands.
    */
  def validateSocksClientOptions(options: SocksClientOptions): Unit = js.native
  def validateSocksClientOptions(options: SocksClientOptions, acceptedCommands: js.Array[String]): Unit = js.native
}

