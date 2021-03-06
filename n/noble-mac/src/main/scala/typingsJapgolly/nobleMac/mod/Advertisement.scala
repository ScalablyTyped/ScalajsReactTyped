package typingsJapgolly.nobleMac.mod

import typingsJapgolly.nobleMac.AnonData
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  var localName: String
  var manufacturerData: Buffer
  var serviceData: AnonData
  var serviceUuids: js.Array[String]
  var txPowerLevel: Double
}

object Advertisement {
  @scala.inline
  def apply(
    localName: String,
    manufacturerData: Buffer,
    serviceData: AnonData,
    serviceUuids: js.Array[String],
    txPowerLevel: Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Advertisement]
  }
}

