package typingsJapgolly.leaflet.mod

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("leaflet", "Path")
@js.native
open class Path () extends Layer {
  def this(options: LayerOptions) = this()
  
  def bringToBack(): this.type = js.native
  
  def bringToFront(): this.type = js.native
  
  def getElement(): js.UndefOr[Element] = js.native
  
  var options: PathOptions = js.native
  
  def redraw(): this.type = js.native
  
  def setStyle(style: PathOptions): this.type = js.native
}
