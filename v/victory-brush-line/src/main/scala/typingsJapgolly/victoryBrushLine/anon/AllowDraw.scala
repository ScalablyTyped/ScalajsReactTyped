package typingsJapgolly.victoryBrushLine.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDraw extends StObject {
  
  var allowDrag: Boolean
  
  var allowDraw: Boolean
  
  var allowResize: Boolean
  
  var brushAreaComponent: Element
  
  var brushComponent: Element
  
  var groupComponent: Element
  
  var handleComponent: Element
  
  var handleWidth: Double
  
  var lineComponent: Element
  
  var width: Double
}
object AllowDraw {
  
  inline def apply(
    allowDrag: Boolean,
    allowDraw: Boolean,
    allowResize: Boolean,
    brushAreaComponent: VdomElement,
    brushComponent: VdomElement,
    groupComponent: VdomElement,
    handleComponent: VdomElement,
    handleWidth: Double,
    lineComponent: VdomElement,
    width: Double
  ): AllowDraw = {
    val __obj = js.Dynamic.literal(allowDrag = allowDrag.asInstanceOf[js.Any], allowDraw = allowDraw.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any], brushAreaComponent = brushAreaComponent.rawElement.asInstanceOf[js.Any], brushComponent = brushComponent.rawElement.asInstanceOf[js.Any], groupComponent = groupComponent.rawElement.asInstanceOf[js.Any], handleComponent = handleComponent.rawElement.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any], lineComponent = lineComponent.rawElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDraw]
  }
  
  extension [Self <: AllowDraw](x: Self) {
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setBrushAreaComponent(value: VdomElement): Self = StObject.set(x, "brushAreaComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setBrushComponent(value: VdomElement): Self = StObject.set(x, "brushComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHandleComponent(value: VdomElement): Self = StObject.set(x, "handleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    
    inline def setLineComponent(value: VdomElement): Self = StObject.set(x, "lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
