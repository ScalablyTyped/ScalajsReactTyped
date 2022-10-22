package typingsJapgolly.heremaps.global.H.map

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.heremaps.H.map.Icon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual representation of the H.map.Marker.
  */
@JSGlobal("H.map.Icon")
@js.native
open class Icon protected ()
  extends StObject
     with typingsJapgolly.heremaps.H.map.Icon {
  /**
    * Constructor
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @param opt_options {H.map.Icon.Options=}
    */
  def this(bitmap: String) = this()
  def this(bitmap: HTMLCanvasElement) = this()
  def this(bitmap: HTMLImageElement) = this()
  def this(bitmap: String, opt_options: Options) = this()
  def this(bitmap: HTMLCanvasElement, opt_options: Options) = this()
  def this(bitmap: HTMLImageElement, opt_options: Options) = this()
}
object Icon {
  
  /**
    * The state types of an Icon
    */
  @JSGlobal("H.map.Icon.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.map.Icon.State & Double] = js.native
    
    /* 0 */ val ERROR: typingsJapgolly.heremaps.H.map.Icon.State.ERROR & Double = js.native
    
    /* 1 */ val LOADING: typingsJapgolly.heremaps.H.map.Icon.State.LOADING & Double = js.native
    
    /* 2 */ val READY: typingsJapgolly.heremaps.H.map.Icon.State.READY & Double = js.native
  }
}
