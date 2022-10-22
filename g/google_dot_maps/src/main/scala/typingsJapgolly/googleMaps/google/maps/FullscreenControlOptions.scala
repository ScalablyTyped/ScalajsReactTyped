package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the rendering of the fullscreen control.
  */
trait FullscreenControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map. The
    * default position is <code>RIGHT_TOP</code>.
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
}
object FullscreenControlOptions {
  
  inline def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  
  extension [Self <: FullscreenControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
