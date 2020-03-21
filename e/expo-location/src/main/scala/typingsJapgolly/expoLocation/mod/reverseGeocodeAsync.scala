package typingsJapgolly.expoLocation.mod

import typingsJapgolly.expoLocation.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "reverseGeocodeAsync")
@js.native
object reverseGeocodeAsync extends js.Object {
  def apply(location: AnonLatitude): js.Promise[js.Array[Address]] = js.native
}

