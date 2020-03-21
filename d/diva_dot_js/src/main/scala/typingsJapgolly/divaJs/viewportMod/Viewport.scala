package typingsJapgolly.divaJs.viewportMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.divaJs.interfacesMod.Dimensions
import typingsJapgolly.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var bottom: Double
  var height: Double
  var intersectionTolerance: Double
  var left: Double
  var outer: HTMLElement
  var right: Double
  var top: Double
  var width: Double
  def hasHorizontalOverlap(region: Region): Boolean
  def hasVerticalOverlap(region: Region): Boolean
  def intersectsRegion(region: Region): Boolean
  def invalidate(): Unit
  def setInnerDimensions(dimensions: Dimensions): Unit
}

object Viewport {
  @scala.inline
  def apply(
    bottom: Double,
    hasHorizontalOverlap: Region => CallbackTo[Boolean],
    hasVerticalOverlap: Region => CallbackTo[Boolean],
    height: Double,
    intersectionTolerance: Double,
    intersectsRegion: Region => CallbackTo[Boolean],
    invalidate: Callback,
    left: Double,
    outer: HTMLElement,
    right: Double,
    setInnerDimensions: Dimensions => Callback,
    top: Double,
    width: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasHorizontalOverlap")(js.Any.fromFunction1((t0: typingsJapgolly.divaJs.interfacesMod.Region) => hasHorizontalOverlap(t0).runNow()))
    __obj.updateDynamic("hasVerticalOverlap")(js.Any.fromFunction1((t0: typingsJapgolly.divaJs.interfacesMod.Region) => hasVerticalOverlap(t0).runNow()))
    __obj.updateDynamic("intersectsRegion")(js.Any.fromFunction1((t0: typingsJapgolly.divaJs.interfacesMod.Region) => intersectsRegion(t0).runNow()))
    __obj.updateDynamic("invalidate")(invalidate.toJsFn)
    __obj.updateDynamic("setInnerDimensions")(js.Any.fromFunction1((t0: typingsJapgolly.divaJs.interfacesMod.Dimensions) => setInnerDimensions(t0).runNow()))
    __obj.asInstanceOf[Viewport]
  }
}

