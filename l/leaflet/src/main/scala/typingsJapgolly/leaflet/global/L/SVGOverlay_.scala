package typingsJapgolly.leaflet.global.L

import org.scalajs.dom.SVGElement
import typingsJapgolly.leaflet.mod.ImageOverlayOptions
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.SVGOverlay")
@js.native
open class SVGOverlay_ protected ()
  extends typingsJapgolly.leaflet.mod.SVGOverlay_ {
  /** SVGOverlay doesn't extend ImageOverlay because SVGOverlay.getElement returns SVGElement */
  def this(svgImage: String, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
}
