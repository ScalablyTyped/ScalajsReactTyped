package typingsJapgolly.zurbTwentytwenty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwentyTwentyOptions extends StObject {
  
  var after_label: js.UndefOr[String] = js.undefined
  
  var before_label: js.UndefOr[String] = js.undefined
  
  var click_to_move: js.UndefOr[Boolean] = js.undefined
  
  var default_offset_pct: js.UndefOr[Double] = js.undefined
  
  var move_slider_on_hover: js.UndefOr[Boolean] = js.undefined
  
  var move_with_handle_only: js.UndefOr[Boolean] = js.undefined
  
  var no_overlay: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
}
object TwentyTwentyOptions {
  
  inline def apply(): TwentyTwentyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwentyTwentyOptions]
  }
  
  extension [Self <: TwentyTwentyOptions](x: Self) {
    
    inline def setAfter_label(value: String): Self = StObject.set(x, "after_label", value.asInstanceOf[js.Any])
    
    inline def setAfter_labelUndefined: Self = StObject.set(x, "after_label", js.undefined)
    
    inline def setBefore_label(value: String): Self = StObject.set(x, "before_label", value.asInstanceOf[js.Any])
    
    inline def setBefore_labelUndefined: Self = StObject.set(x, "before_label", js.undefined)
    
    inline def setClick_to_move(value: Boolean): Self = StObject.set(x, "click_to_move", value.asInstanceOf[js.Any])
    
    inline def setClick_to_moveUndefined: Self = StObject.set(x, "click_to_move", js.undefined)
    
    inline def setDefault_offset_pct(value: Double): Self = StObject.set(x, "default_offset_pct", value.asInstanceOf[js.Any])
    
    inline def setDefault_offset_pctUndefined: Self = StObject.set(x, "default_offset_pct", js.undefined)
    
    inline def setMove_slider_on_hover(value: Boolean): Self = StObject.set(x, "move_slider_on_hover", value.asInstanceOf[js.Any])
    
    inline def setMove_slider_on_hoverUndefined: Self = StObject.set(x, "move_slider_on_hover", js.undefined)
    
    inline def setMove_with_handle_only(value: Boolean): Self = StObject.set(x, "move_with_handle_only", value.asInstanceOf[js.Any])
    
    inline def setMove_with_handle_onlyUndefined: Self = StObject.set(x, "move_with_handle_only", js.undefined)
    
    inline def setNo_overlay(value: Boolean): Self = StObject.set(x, "no_overlay", value.asInstanceOf[js.Any])
    
    inline def setNo_overlayUndefined: Self = StObject.set(x, "no_overlay", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
