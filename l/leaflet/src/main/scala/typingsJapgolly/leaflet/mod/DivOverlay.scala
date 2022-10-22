package typingsJapgolly.leaflet.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("leaflet", "DivOverlay")
@js.native
open class DivOverlay () extends Layer {
  def this(latlng: LatLngExpression) = this()
  def this(options: DivOverlayOptions) = this()
  def this(latlng: LatLngExpression, options: TooltipOptions) = this()
  def this(options: Unit, source: Layer) = this()
  def this(options: DivOverlayOptions, source: Layer) = this()
  
  def bringToBack(): this.type = js.native
  
  def bringToFront(): this.type = js.native
  
  def close(): this.type = js.native
  
  def getContent(): js.UndefOr[Content | (js.Function1[/* source */ Layer, Content])] = js.native
  
  def getElement(): js.UndefOr[HTMLElement] = js.native
  
  def getLatLng(): js.UndefOr[LatLng_] = js.native
  
  def isOpen(): Boolean = js.native
  
  def openOn(map: Map_): this.type = js.native
  
  var options: DivOverlayOptions = js.native
  
  def setContent(htmlContent: js.Function1[/* source */ Layer, Content]): this.type = js.native
  def setContent(htmlContent: Content): this.type = js.native
  
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  
  def toggle(): this.type = js.native
  def toggle(layer: Layer): this.type = js.native
  
  def update(): Unit = js.native
}
