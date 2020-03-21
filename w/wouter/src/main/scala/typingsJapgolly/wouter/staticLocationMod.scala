package typingsJapgolly.wouter

import typingsJapgolly.wouter.preactMod.LocationHook
import typingsJapgolly.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact/static-location", JSImport.Namespace)
@js.native
object staticLocationMod extends js.Object {
  def apply(): LocationHook = js.native
  def apply(path: Path): LocationHook = js.native
}

