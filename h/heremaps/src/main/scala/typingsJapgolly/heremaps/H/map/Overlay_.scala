package typingsJapgolly.heremaps.H.map

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.heremaps.H.map.Overlay.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an overlay, which offers a bitmap that covers a geographical reactangular area on the map.
  */
@JSGlobal("H.map.Overlay")
@js.native
class Overlay_ protected () extends Object {
  /**
    * Constructor
    * @param bounds {H.geo.Rect} - The geographical reactangular area of this overlay
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @param opt_options {H.map.Overlay.Options=} - Optional values values to initialize this overlay
    */
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: String) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLCanvasElement) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLImageElement) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: String, opt_options: Options) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLCanvasElement, opt_options: Options) = this()
  def this(bounds: typingsJapgolly.heremaps.H.geo.Rect, bitmap: HTMLImageElement, opt_options: Options) = this()
  /**
    * Returns this overlay's current bitmap.
    * @returns {?(HTMLImageElement | HTMLCanvasElement)} - the bitmap of this Overlay or null if it isn't ready yet
    */
  def getBitmap(): HTMLImageElement | HTMLCanvasElement = js.native
  /**
    * This method returns this overlay's current bounds.
    * @returns {H.geo.Rect}
    */
  def getBounds(): typingsJapgolly.heremaps.H.geo.Rect = js.native
  /**
    * Returns this overlay's current opacity.
    * @returns {number}
    */
  def getOpacity(): Double = js.native
  /**
    * Sets the overlay's current bitmap.
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBitmap(bitmap: String): Overlay = js.native
  def setBitmap(bitmap: typingsJapgolly.std.HTMLCanvasElement): Overlay = js.native
  def setBitmap(bitmap: typingsJapgolly.std.HTMLImageElement): Overlay = js.native
  /**
    * This method sets the overlay's current bounds.
    * @param bounds {H.geo.Rect}
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBounds(bounds: typingsJapgolly.heremaps.H.geo.Rect): Overlay = js.native
  /**
    * Sets the overlay's current opacity.
    * @param opacity {number} - The opacity in range from 0 (transparent) to 1 (opaque).
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setOpacity(opacity: Double): Overlay = js.native
}

