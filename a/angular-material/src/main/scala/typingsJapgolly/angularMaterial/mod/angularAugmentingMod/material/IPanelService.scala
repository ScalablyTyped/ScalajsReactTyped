package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angularMaterial.anon.ABOVE
import typingsJapgolly.angularMaterial.anon.ALIGNEND
import typingsJapgolly.angularMaterial.anon.BOTTOM
import typingsJapgolly.angularMaterial.anon.CLICKOUTSIDE
import typingsJapgolly.angularMaterial.anon.CLOSE_
import typingsJapgolly.angularMaterial.anon.FADE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanelService extends StObject {
  
  var absPosition: BOTTOM
  
  var animation: FADE
  
  var closeReasons: CLICKOUTSIDE
  
  def create(opt_config: IPanelConfig): IPanelRef
  
  var interceptorTypes: CLOSE_
  
  def newPanelAnimation(): IPanelAnimation
  
  def newPanelPosition(): IPanelPosition
  
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
  
  var xPosition: ALIGNEND
  
  var yPosition: ABOVE
}
object IPanelService {
  
  inline def apply(
    absPosition: BOTTOM,
    animation: FADE,
    closeReasons: CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: CLOSE_,
    newPanelAnimation: CallbackTo[IPanelAnimation],
    newPanelPosition: CallbackTo[IPanelPosition],
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: ALIGNEND,
    yPosition: ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes.asInstanceOf[js.Any], newPanelAnimation = newPanelAnimation.toJsFn, newPanelPosition = newPanelPosition.toJsFn, open = js.Any.fromFunction1(open), xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelService]
  }
  
  extension [Self <: IPanelService](x: Self) {
    
    inline def setAbsPosition(value: BOTTOM): Self = StObject.set(x, "absPosition", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: FADE): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setCloseReasons(value: CLICKOUTSIDE): Self = StObject.set(x, "closeReasons", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: IPanelConfig => IPanelRef): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setInterceptorTypes(value: CLOSE_): Self = StObject.set(x, "interceptorTypes", value.asInstanceOf[js.Any])
    
    inline def setNewPanelAnimation(value: CallbackTo[IPanelAnimation]): Self = StObject.set(x, "newPanelAnimation", value.toJsFn)
    
    inline def setNewPanelPosition(value: CallbackTo[IPanelPosition]): Self = StObject.set(x, "newPanelPosition", value.toJsFn)
    
    inline def setOpen(value: IPanelConfig => IPromise[IPanelRef]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setXPosition(value: ALIGNEND): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setYPosition(value: ABOVE): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
  }
}
