package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetText extends StObject {
  
  def clickOutside(): js.Promise[Unit]
  
  def exists(): js.Promise[Boolean]
  
  def getAriaDescribedBy(): js.Promise[Any]
  
  def getTargetText(): js.Promise[Any]
  
  def getTooltipText(): js.Promise[Any]
  
  def mouseEnter(): js.Promise[Unit]
  
  def mouseLeave(): js.Promise[Unit]
  
  def tabIn(): js.Promise[Unit]
  
  def tabOut(): js.Promise[Unit]
  
  def tooltipExists(): js.Promise[Boolean]
}
object GetTargetText {
  
  inline def apply(
    clickOutside: CallbackTo[js.Promise[Unit]],
    exists: CallbackTo[js.Promise[Boolean]],
    getAriaDescribedBy: CallbackTo[js.Promise[Any]],
    getTargetText: CallbackTo[js.Promise[Any]],
    getTooltipText: CallbackTo[js.Promise[Any]],
    mouseEnter: CallbackTo[js.Promise[Unit]],
    mouseLeave: CallbackTo[js.Promise[Unit]],
    tabIn: CallbackTo[js.Promise[Unit]],
    tabOut: CallbackTo[js.Promise[Unit]],
    tooltipExists: CallbackTo[js.Promise[Boolean]]
  ): GetTargetText = {
    val __obj = js.Dynamic.literal(clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, getAriaDescribedBy = getAriaDescribedBy.toJsFn, getTargetText = getTargetText.toJsFn, getTooltipText = getTooltipText.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, tabIn = tabIn.toJsFn, tabOut = tabOut.toJsFn, tooltipExists = tooltipExists.toJsFn)
    __obj.asInstanceOf[GetTargetText]
  }
  
  extension [Self <: GetTargetText](x: Self) {
    
    inline def setClickOutside(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetAriaDescribedBy(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getAriaDescribedBy", value.toJsFn)
    
    inline def setGetTargetText(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTargetText", value.toJsFn)
    
    inline def setGetTooltipText(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTooltipText", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setTabIn(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "tabIn", value.toJsFn)
    
    inline def setTabOut(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "tabOut", value.toJsFn)
    
    inline def setTooltipExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "tooltipExists", value.toJsFn)
  }
}
