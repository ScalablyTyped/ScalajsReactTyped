package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForAttribute extends StObject {
  
  def click(): Any
  
  def exists(): Boolean
  
  def getForAttribute(): Any
  
  def getId(): Any
  
  def getLabelText(): Any
  
  def hasEllipsis(): Boolean
  
  def isDisabled(): Boolean
  
  def keyDown(key: Any): Any
}
object GetForAttribute {
  
  inline def apply(
    click: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    getForAttribute: CallbackTo[Any],
    getId: CallbackTo[Any],
    getLabelText: CallbackTo[Any],
    hasEllipsis: CallbackTo[Boolean],
    isDisabled: CallbackTo[Boolean],
    keyDown: Any => Any
  ): GetForAttribute = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getForAttribute = getForAttribute.toJsFn, getId = getId.toJsFn, getLabelText = getLabelText.toJsFn, hasEllipsis = hasEllipsis.toJsFn, isDisabled = isDisabled.toJsFn, keyDown = js.Any.fromFunction1(keyDown))
    __obj.asInstanceOf[GetForAttribute]
  }
  
  extension [Self <: GetForAttribute](x: Self) {
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetForAttribute(value: CallbackTo[Any]): Self = StObject.set(x, "getForAttribute", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabelText(value: CallbackTo[Any]): Self = StObject.set(x, "getLabelText", value.toJsFn)
    
    inline def setHasEllipsis(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasEllipsis", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setKeyDown(value: Any => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
  }
}
