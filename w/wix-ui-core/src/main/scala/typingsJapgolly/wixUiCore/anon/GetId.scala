package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetId extends StObject {
  
  def click(): Unit
  
  def exists(): Boolean
  
  def getId(): Any
  
  def getKnobIcon(): Any
  
  def getKnobIconStyles(): CSSStyleDeclaration
  
  def getKnobStyles(): CSSStyleDeclaration
  
  def getRootStyles(): CSSStyleDeclaration
  
  def getTabIndex(): Any
  
  def getTrackStyles(): CSSStyleDeclaration
  
  def hasKnobIcon(): Boolean
  
  def isChecked(): Any
  
  def isDisabled(): Any
}
object GetId {
  
  inline def apply(
    click: Callback,
    exists: CallbackTo[Boolean],
    getId: CallbackTo[Any],
    getKnobIcon: CallbackTo[Any],
    getKnobIconStyles: CallbackTo[CSSStyleDeclaration],
    getKnobStyles: CallbackTo[CSSStyleDeclaration],
    getRootStyles: CallbackTo[CSSStyleDeclaration],
    getTabIndex: CallbackTo[Any],
    getTrackStyles: CallbackTo[CSSStyleDeclaration],
    hasKnobIcon: CallbackTo[Boolean],
    isChecked: CallbackTo[Any],
    isDisabled: CallbackTo[Any]
  ): GetId = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getKnobIcon = getKnobIcon.toJsFn, getKnobIconStyles = getKnobIconStyles.toJsFn, getKnobStyles = getKnobStyles.toJsFn, getRootStyles = getRootStyles.toJsFn, getTabIndex = getTabIndex.toJsFn, getTrackStyles = getTrackStyles.toJsFn, hasKnobIcon = hasKnobIcon.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn)
    __obj.asInstanceOf[GetId]
  }
  
  extension [Self <: GetId](x: Self) {
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetKnobIcon(value: CallbackTo[Any]): Self = StObject.set(x, "getKnobIcon", value.toJsFn)
    
    inline def setGetKnobIconStyles(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getKnobIconStyles", value.toJsFn)
    
    inline def setGetKnobStyles(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getKnobStyles", value.toJsFn)
    
    inline def setGetRootStyles(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getRootStyles", value.toJsFn)
    
    inline def setGetTabIndex(value: CallbackTo[Any]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
    
    inline def setGetTrackStyles(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getTrackStyles", value.toJsFn)
    
    inline def setHasKnobIcon(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasKnobIcon", value.toJsFn)
    
    inline def setIsChecked(value: CallbackTo[Any]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isDisabled", value.toJsFn)
  }
}
