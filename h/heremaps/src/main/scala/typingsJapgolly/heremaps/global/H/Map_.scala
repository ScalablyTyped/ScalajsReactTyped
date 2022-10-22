package typingsJapgolly.heremaps.global.H

import org.scalajs.dom.Element
import typingsJapgolly.heremaps.H.Map_.Options
import typingsJapgolly.heremaps.H.map.layer.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** Map *****/
/**
  * Map class defines map instance in the application. By creating this object you will initialize a visible map object which is attached to the provided dom element.
  * Map class is an entry point to all operations related to layers, map objects and geo-screen transformations. By specifying options you can initialize map with predefined view.
  */
@JSGlobal("H.Map")
@js.native
open class Map_ protected ()
  extends StObject
     with typingsJapgolly.heremaps.H.Map_ {
  /**
    * Constructor
    * @param element {Element} - html element into which the map will be rendered
    * @param baseLayer {H.map.layer.Layer} - The layer to be used as the base (bottom most) layer.
    * @param opt_options {H.Map.Options=} - additional map options
    */
  def this(element: Element, baseLayer: Layer) = this()
  def this(element: Element, baseLayer: Layer, opt_options: Options) = this()
}
object Map_ {
  
  /**
    * Types of engines
    */
  @JSGlobal("H.Map.EngineType")
  @js.native
  object EngineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.Map_.EngineType & Double] = js.native
    
    /* 0 */ val P2D: typingsJapgolly.heremaps.H.Map_.EngineType.P2D & Double = js.native
    
    /* 1 */ val PANORAMA: typingsJapgolly.heremaps.H.Map_.EngineType.PANORAMA & Double = js.native
  }
}
