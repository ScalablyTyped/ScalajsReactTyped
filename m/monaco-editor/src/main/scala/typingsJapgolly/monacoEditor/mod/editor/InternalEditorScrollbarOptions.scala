package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalEditorScrollbarOptions extends StObject {
  
  val alwaysConsumeMouseWheel: Boolean
  
  val arrowSize: Double
  
  val handleMouseWheel: Boolean
  
  val horizontal: ScrollbarVisibility
  
  val horizontalHasArrows: Boolean
  
  val horizontalScrollbarSize: Double
  
  val horizontalSliderSize: Double
  
  val scrollByPage: Boolean
  
  val useShadows: Boolean
  
  val vertical: ScrollbarVisibility
  
  val verticalHasArrows: Boolean
  
  val verticalScrollbarSize: Double
  
  val verticalSliderSize: Double
}
object InternalEditorScrollbarOptions {
  
  inline def apply(
    alwaysConsumeMouseWheel: Boolean,
    arrowSize: Double,
    handleMouseWheel: Boolean,
    horizontal: ScrollbarVisibility,
    horizontalHasArrows: Boolean,
    horizontalScrollbarSize: Double,
    horizontalSliderSize: Double,
    scrollByPage: Boolean,
    useShadows: Boolean,
    vertical: ScrollbarVisibility,
    verticalHasArrows: Boolean,
    verticalScrollbarSize: Double,
    verticalSliderSize: Double
  ): InternalEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal(alwaysConsumeMouseWheel = alwaysConsumeMouseWheel.asInstanceOf[js.Any], arrowSize = arrowSize.asInstanceOf[js.Any], handleMouseWheel = handleMouseWheel.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], horizontalHasArrows = horizontalHasArrows.asInstanceOf[js.Any], horizontalScrollbarSize = horizontalScrollbarSize.asInstanceOf[js.Any], horizontalSliderSize = horizontalSliderSize.asInstanceOf[js.Any], scrollByPage = scrollByPage.asInstanceOf[js.Any], useShadows = useShadows.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalHasArrows = verticalHasArrows.asInstanceOf[js.Any], verticalScrollbarSize = verticalScrollbarSize.asInstanceOf[js.Any], verticalSliderSize = verticalSliderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorScrollbarOptions]
  }
  
  extension [Self <: InternalEditorScrollbarOptions](x: Self) {
    
    inline def setAlwaysConsumeMouseWheel(value: Boolean): Self = StObject.set(x, "alwaysConsumeMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
    
    inline def setHandleMouseWheel(value: Boolean): Self = StObject.set(x, "handleMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: ScrollbarVisibility): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalHasArrows(value: Boolean): Self = StObject.set(x, "horizontalHasArrows", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollbarSize(value: Double): Self = StObject.set(x, "horizontalScrollbarSize", value.asInstanceOf[js.Any])
    
    inline def setHorizontalSliderSize(value: Double): Self = StObject.set(x, "horizontalSliderSize", value.asInstanceOf[js.Any])
    
    inline def setScrollByPage(value: Boolean): Self = StObject.set(x, "scrollByPage", value.asInstanceOf[js.Any])
    
    inline def setUseShadows(value: Boolean): Self = StObject.set(x, "useShadows", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: ScrollbarVisibility): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalHasArrows(value: Boolean): Self = StObject.set(x, "verticalHasArrows", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollbarSize(value: Double): Self = StObject.set(x, "verticalScrollbarSize", value.asInstanceOf[js.Any])
    
    inline def setVerticalSliderSize(value: Double): Self = StObject.set(x, "verticalSliderSize", value.asInstanceOf[js.Any])
  }
}
