package typingsJapgolly.wouter

import typingsJapgolly.wouter.mod.LocationHook
import typingsJapgolly.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/static-location", JSImport.Namespace)
@js.native
object wouterMod extends js.Object {
  def apply(): LocationHook = js.native
  def apply(path: Path): LocationHook = js.native
}

