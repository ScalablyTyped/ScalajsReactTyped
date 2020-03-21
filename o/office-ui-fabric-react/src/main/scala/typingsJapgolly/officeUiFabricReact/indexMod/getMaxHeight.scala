package typingsJapgolly.officeUiFabricReact.indexMod

import typingsJapgolly.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPoint
import typingsJapgolly.std.Element
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", "getMaxHeight")
@js.native
object getMaxHeight extends js.Object {
  def apply(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
}

