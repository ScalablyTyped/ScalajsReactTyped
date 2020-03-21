package typingsJapgolly.history

import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/LocationUtils", JSImport.Namespace)
@js.native
object locationUtilsMod extends js.Object {
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
}

