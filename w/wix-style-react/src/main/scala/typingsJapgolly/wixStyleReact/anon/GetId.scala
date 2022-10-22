package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetId extends StObject {
  
  /** Triggers change */
  def click(): Unit
  
  /** Checks if element exists */
  def exists(): Boolean
  
  /** Returns the id of the input */
  def getId(): Any
  
  /** Returns the toggle icon inside the knob */
  def getKnobIcon(): Any
  
  /** Returns the computed styles object of the knob icon */
  def getKnobIconStyles(): CSSStyleDeclaration
  
  /** Returns the computed styles object of the knob */
  def getKnobStyles(): CSSStyleDeclaration
  
  /** Returns the computed styles object of the root component */
  def getRootStyles(): CSSStyleDeclaration
  
  /** Returns the tab index */
  def getTabIndex(): Any
  
  /** Returns the computed styles object of the track */
  def getTrackStyles(): CSSStyleDeclaration
  
  /** Returns whether the toggle has an icon */
  def hasKnobIcon(): Boolean
  
  /** Returns a boolean indicating if the toggleSwitch is checked */
  def isChecked(): Any
  
  /** Returns a boolean indicating if the toggleSwitch is disabled */
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
