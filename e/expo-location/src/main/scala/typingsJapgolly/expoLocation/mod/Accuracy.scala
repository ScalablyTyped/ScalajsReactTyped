package typingsJapgolly.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "Accuracy")
@js.native
object Accuracy extends js.Object {
  /* 3 */ val Balanced: typingsJapgolly.expoLocation.mod.LocationAccuracy.Balanced with Double = js.native
  /* 6 */ val BestForNavigation: typingsJapgolly.expoLocation.mod.LocationAccuracy.BestForNavigation with Double = js.native
  /* 4 */ val High: typingsJapgolly.expoLocation.mod.LocationAccuracy.High with Double = js.native
  /* 5 */ val Highest: typingsJapgolly.expoLocation.mod.LocationAccuracy.Highest with Double = js.native
  /* 2 */ val Low: typingsJapgolly.expoLocation.mod.LocationAccuracy.Low with Double = js.native
  /* 1 */ val Lowest: typingsJapgolly.expoLocation.mod.LocationAccuracy.Lowest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
}

