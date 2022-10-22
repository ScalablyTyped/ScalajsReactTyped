package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.blockTypesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGridColumnCount extends StObject {
  
  @JSName("$theme")
  var $theme: typingsJapgolly.baseui.stylesTypesMod.Theme
  
  var flexGridColumnCount: Double
  
  var flexGridColumnGap: Scale
  
  var flexGridItemCount: Double
  
  var flexGridItemIndex: Double
  
  var flexGridRowGap: Scale
}
object FlexGridColumnCount {
  
  inline def apply(
    $theme: typingsJapgolly.baseui.stylesTypesMod.Theme,
    flexGridColumnCount: Double,
    flexGridColumnGap: Scale,
    flexGridItemCount: Double,
    flexGridItemIndex: Double,
    flexGridRowGap: Scale
  ): FlexGridColumnCount = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any], flexGridColumnCount = flexGridColumnCount.asInstanceOf[js.Any], flexGridColumnGap = flexGridColumnGap.asInstanceOf[js.Any], flexGridItemCount = flexGridItemCount.asInstanceOf[js.Any], flexGridItemIndex = flexGridItemIndex.asInstanceOf[js.Any], flexGridRowGap = flexGridRowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGridColumnCount]
  }
  
  extension [Self <: FlexGridColumnCount](x: Self) {
    
    inline def set$theme(value: typingsJapgolly.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    
    inline def setFlexGridColumnCount(value: Double): Self = StObject.set(x, "flexGridColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFlexGridColumnGap(value: Scale): Self = StObject.set(x, "flexGridColumnGap", value.asInstanceOf[js.Any])
    
    inline def setFlexGridItemCount(value: Double): Self = StObject.set(x, "flexGridItemCount", value.asInstanceOf[js.Any])
    
    inline def setFlexGridItemIndex(value: Double): Self = StObject.set(x, "flexGridItemIndex", value.asInstanceOf[js.Any])
    
    inline def setFlexGridRowGap(value: Scale): Self = StObject.set(x, "flexGridRowGap", value.asInstanceOf[js.Any])
  }
}
