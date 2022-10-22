package typingsJapgolly.leaflet.global.L

import typingsJapgolly.leaflet.mod.DivOverlayOptions
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("L.DivOverlay")
@js.native
open class DivOverlay ()
  extends typingsJapgolly.leaflet.mod.DivOverlay {
  def this(latlng: LatLngExpression) = this()
  def this(options: DivOverlayOptions) = this()
  def this(latlng: LatLngExpression, options: TooltipOptions) = this()
  def this(options: Unit, source: typingsJapgolly.leaflet.mod.Layer) = this()
  def this(options: DivOverlayOptions, source: typingsJapgolly.leaflet.mod.Layer) = this()
}
