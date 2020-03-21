package typingsJapgolly.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceProperties extends js.Object {
  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var DnsProperties: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.DnsProperties] = js.native
  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  var HttpProperties: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.HttpProperties] = js.native
}

object NamespaceProperties {
  @scala.inline
  def apply(DnsProperties: DnsProperties = null, HttpProperties: HttpProperties = null): NamespaceProperties = {
    val __obj = js.Dynamic.literal()
    if (DnsProperties != null) __obj.updateDynamic("DnsProperties")(DnsProperties.asInstanceOf[js.Any])
    if (HttpProperties != null) __obj.updateDynamic("HttpProperties")(HttpProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceProperties]
  }
}

