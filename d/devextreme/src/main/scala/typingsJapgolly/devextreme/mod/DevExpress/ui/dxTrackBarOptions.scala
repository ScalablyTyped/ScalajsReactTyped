package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTrackBarOptions[TComponent]
  extends StObject
     with EditorOptions[TComponent] {
  
  /**
    * The maximum value the UI component can accept.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value the UI component can accept.
    */
  var min: js.UndefOr[Double] = js.undefined
}
object dxTrackBarOptions {
  
  inline def apply[TComponent](): dxTrackBarOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTrackBarOptions[TComponent]]
  }
  
  extension [Self <: dxTrackBarOptions[?], TComponent](x: Self & dxTrackBarOptions[TComponent]) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
