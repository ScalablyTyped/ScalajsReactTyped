package typingsJapgolly.leaflet.mod

import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "SVGOverlay")
@js.native
open class SVGOverlay_ protected () extends Layer {
  /** SVGOverlay doesn't extend ImageOverlay because SVGOverlay.getElement returns SVGElement */
  def this(svgImage: String, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  
  def bringToBack(): this.type = js.native
  
  def bringToFront(): this.type = js.native
  
  /** Get the bounds that this SVGOverlay covers */
  def getBounds(): LatLngBounds_ = js.native
  
  /** Get the center of the bounds this ImageOverlay covers */
  def getCenter(): Point_ = js.native
  
  /** Get the img element that represents the SVGOverlay on the map */
  def getElement(): js.UndefOr[SVGElement] = js.native
  
  var options: ImageOverlayOptions = js.native
  
  /** Update the bounds that this SVGOverlay covers */
  def setBounds(bounds: LatLngBounds_): this.type = js.native
  
  /** Changes the opacity of the image element */
  def setOpacity(opacity: Double): this.type = js.native
  
  /** Changes the style of the image element. As of 1.8, only the opacity is changed */
  def setStyle(styleOpts: SVGOverlayStyleOptions): this.type = js.native
  
  def setUrl(url: String): this.type = js.native
  
  /** Changes the zIndex of the image overlay */
  def setZIndex(value: Double): this.type = js.native
}
