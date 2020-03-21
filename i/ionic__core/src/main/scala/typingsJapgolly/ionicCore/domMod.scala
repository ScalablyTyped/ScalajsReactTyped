package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.interfaceMod.RouteEntry
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def readNavState(): js.Promise[AnonIds] = js.native
  def readNavState(root: HTMLElement): js.Promise[AnonIds] = js.native
  def waitUntilNavNode(): js.Promise[_] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: typingsJapgolly.std.HTMLElement,
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double
  ): js.Promise[Boolean] = js.native
  def writeNavState(
    root: typingsJapgolly.std.HTMLElement,
    chain: js.Array[RouteEntry],
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
}

