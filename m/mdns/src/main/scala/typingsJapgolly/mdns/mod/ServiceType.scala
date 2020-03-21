package typingsJapgolly.mdns.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.mdns.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceType
  extends Instantiable1[
      (/* serviceTypeIdentifier */ AnonName) | (/* serviceTypeIdentifier */ js.Array[String]) | (/* serviceType */ ServiceType) | (/* serviceTypeIdentifier */ String), 
      ServiceType
    ]
     with Instantiable3[
      /* name */ String, 
      /* protocol */ String, 
      /* subtypes (repeated) */ String, 
      ServiceType
    ] {
  var fullyQualified: Boolean = js.native
  var name: String = js.native
  var protocol: String = js.native
  var subtypes: js.Array[String] = js.native
  def fromArray(serviceTypeIdentifier: js.Array[String]): ServiceType = js.native
  def fromJSON(serviceTypeIdentifier: AnonName): ServiceType = js.native
  def fromJSON(serviceType: ServiceType): ServiceType = js.native
  def fromString(serviceTypeIdentifier: String): ServiceType = js.native
  def toArray(): js.Array[String] = js.native
}

@JSImport("mdns", "ServiceType")
@js.native
object ServiceType extends TopLevel[ServiceType]

