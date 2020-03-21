package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrestoParameters extends js.Object {
  /**
    * Catalog.
    */
  var Catalog: typingsJapgolly.awsSdk.quicksightMod.Catalog = js.native
  /**
    * Host.
    */
  var Host: typingsJapgolly.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typingsJapgolly.awsSdk.quicksightMod.Port = js.native
}

object PrestoParameters {
  @scala.inline
  def apply(Catalog: Catalog, Host: Host, Port: Port): PrestoParameters = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrestoParameters]
  }
}

