package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTooltipText extends StObject {
  
  /** clicks outside the tooltip target */
  def clickOutside(): js.Promise[Unit]
  
  /** returns true if trigger element exists on the DOM */
  def exists(): js.Promise[Boolean]
  
  /** returns tooltips content value in string */
  def getTooltipText(): js.UndefOr[String | Null]
  
  /**
    * Checks whether tooltip has a given size
    * @param {boolean} sizeName The tooltip size
    * @return {Promise<boolean>}
    */
  def hasSize(sizeName: TooltipSize): Boolean
  
  /** mouse over the target element */
  def mouseEnter(): js.Promise[js.UndefOr[Unit]]
  
  /** mouse leaves the target element */
  def mouseLeave(): js.Promise[js.UndefOr[Unit]]
  
  /** returns true if tooltip element exists on the DOM */
  def tooltipExists(): js.Promise[Boolean]
}
object GetTooltipText {
  
  inline def apply(
    clickOutside: CallbackTo[js.Promise[Unit]],
    exists: CallbackTo[js.Promise[Boolean]],
    getTooltipText: CallbackTo[js.UndefOr[String | Null]],
    hasSize: TooltipSize => Boolean,
    mouseEnter: CallbackTo[js.Promise[js.UndefOr[Unit]]],
    mouseLeave: CallbackTo[js.Promise[js.UndefOr[Unit]]],
    tooltipExists: CallbackTo[js.Promise[Boolean]]
  ): GetTooltipText = {
    val __obj = js.Dynamic.literal(clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, getTooltipText = getTooltipText.toJsFn, hasSize = js.Any.fromFunction1(hasSize), mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, tooltipExists = tooltipExists.toJsFn)
    __obj.asInstanceOf[GetTooltipText]
  }
  
  extension [Self <: GetTooltipText](x: Self) {
    
    inline def setClickOutside(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetTooltipText(value: CallbackTo[js.UndefOr[String | Null]]): Self = StObject.set(x, "getTooltipText", value.toJsFn)
    
    inline def setHasSize(value: TooltipSize => Boolean): Self = StObject.set(x, "hasSize", js.Any.fromFunction1(value))
    
    inline def setMouseEnter(value: CallbackTo[js.Promise[js.UndefOr[Unit]]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[js.Promise[js.UndefOr[Unit]]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setTooltipExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "tooltipExists", value.toJsFn)
  }
}
