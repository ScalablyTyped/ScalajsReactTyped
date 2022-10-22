package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  def className(): Any
  
  def click(): Any
  
  def exists(): Boolean
  
  def getElement(): Any
  
  def getHighlightedStrings(): js.Array[String]
  
  def getText(): Any
  
  def isDisabled(): Boolean
  
  def isHovered(): Boolean
  
  def isSelectable(): Boolean
  
  def isSelected(): Boolean
  
  def mouseEnter(): Any
  
  def mouseLeave(): Any
}
object ClassName {
  
  inline def apply(
    className: CallbackTo[Any],
    click: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    getElement: CallbackTo[Any],
    getHighlightedStrings: CallbackTo[js.Array[String]],
    getText: CallbackTo[Any],
    isDisabled: CallbackTo[Boolean],
    isHovered: CallbackTo[Boolean],
    isSelectable: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    mouseEnter: CallbackTo[Any],
    mouseLeave: CallbackTo[Any]
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.toJsFn, click = click.toJsFn, exists = exists.toJsFn, getElement = getElement.toJsFn, getHighlightedStrings = getHighlightedStrings.toJsFn, getText = getText.toJsFn, isDisabled = isDisabled.toJsFn, isHovered = isHovered.toJsFn, isSelectable = isSelectable.toJsFn, isSelected = isSelected.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: CallbackTo[Any]): Self = StObject.set(x, "className", value.toJsFn)
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetElement(value: CallbackTo[Any]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetHighlightedStrings(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getHighlightedStrings", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[Any]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
    
    inline def setIsSelectable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelectable", value.toJsFn)
    
    inline def setIsSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelected", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
  }
}
