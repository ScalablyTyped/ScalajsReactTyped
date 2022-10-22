package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.PositionConfig
import typingsJapgolly.devextreme.mod.DevExpress.common.PositionAlignment
import typingsJapgolly.devextreme.mod.DevExpress.core.FloatingActionButtonDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseIcon extends StObject {
  
  /**
    * Specifies the icon the FAB displays when the speed dial is opened.
    */
  var closeIcon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the direction in which to open the speed dial menu.
    */
  var direction: js.UndefOr[FloatingActionButtonDirection] = js.undefined
  
  /**
    * Specifies the icon the FAB displays when the speed dial is closed.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text label displayed inside the FAB.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Limits the number of speed dial actions.
    */
  var maxSpeedDialActionCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Positions the FAB on the screen.
    */
  var position: js.UndefOr[PositionAlignment | PositionConfig | js.Function] = js.undefined
  
  /**
    * If true, the background should be shaded when the speed dial menu is open.
    */
  var shading: js.UndefOr[Boolean] = js.undefined
}
object CloseIcon {
  
  inline def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  extension [Self <: CloseIcon](x: Self) {
    
    inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setDirection(value: FloatingActionButtonDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxSpeedDialActionCount(value: Double): Self = StObject.set(x, "maxSpeedDialActionCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeedDialActionCountUndefined: Self = StObject.set(x, "maxSpeedDialActionCount", js.undefined)
    
    inline def setPosition(value: PositionAlignment | PositionConfig | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
  }
}
