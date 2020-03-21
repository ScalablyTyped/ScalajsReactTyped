package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.LocationDescriptorObject
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "push")
@js.native
object push extends js.Object {
  def apply(href: String): pushAction[String] = js.native
  def apply(href: LocationDescriptorObject[LocationState]): pushAction[LocationDescriptorObject[LocationState]] = js.native
}

