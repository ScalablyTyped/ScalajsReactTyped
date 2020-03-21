package typingsJapgolly.leafletImageoverlayRotated.mod

import typingsJapgolly.leaflet.mod.ImageOverlayOptions
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leafletImageoverlayRotated.mod.ImageOverlay_.Rotated
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "imageOverlay")
@js.native
object imageOverlay extends js.Object {
  def rotated(
    imgSrc: String,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: String,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLCanvasElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLCanvasElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLImageElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLImageElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
}

