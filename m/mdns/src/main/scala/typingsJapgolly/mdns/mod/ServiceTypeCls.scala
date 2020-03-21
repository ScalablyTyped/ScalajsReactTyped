package typingsJapgolly.mdns.mod

import typingsJapgolly.mdns.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "ServiceType")
@js.native
class ServiceTypeCls protected () extends ServiceType {
  def this(serviceTypeIdentifier: String) = this()
  def this(serviceTypeIdentifier: js.Array[String]) = this()
  def this(serviceTypeIdentifier: AnonName) = this()
  def this(serviceType: ServiceType) = this()
  def this(name: String, protocol: String, subtypes: String*) = this()
}

