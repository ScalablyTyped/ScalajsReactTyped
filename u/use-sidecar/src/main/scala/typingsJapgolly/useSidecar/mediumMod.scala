package typingsJapgolly.useSidecar

import typingsJapgolly.useSidecar.typesMod.MiddlewareCallback
import typingsJapgolly.useSidecar.typesMod.SideCarMediumOptions
import typingsJapgolly.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/medium", JSImport.Namespace)
@js.native
object mediumMod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
}

