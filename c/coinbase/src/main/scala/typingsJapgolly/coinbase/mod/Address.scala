package typingsJapgolly.coinbase.mod

import typingsJapgolly.coinbase.coinbaseStrings.address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Address")
@js.native
class Address () extends Resource {
  /**
    * Bitcoin, Litecoin or Ethereum address
    */
  var address: String = js.native
  /**
    * User defined label for the address
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
    * Type of resource, constant string "address"
    */
  @JSName("resource")
  var resource_Address: address = js.native
  /**
    * List transactions that have been sent to a specific address.
    * Scope: wallet:transactions:read
    */
  def getTransactions(
    opts: js.Object,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.Array[Transaction], Unit]
  ): Unit = js.native
}

