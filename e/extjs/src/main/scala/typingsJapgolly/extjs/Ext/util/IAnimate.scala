package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimate
  extends StObject
     with IBase {
  
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[Any]] = js.undefined
}
object IAnimate {
  
  inline def apply(): IAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimate]
  }
  
  extension [Self <: IAnimate](x: Self) {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setGetActiveAnimation(value: CallbackTo[Any]): Self = StObject.set(x, "getActiveAnimation", value.toJsFn)
    
    inline def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
    
    inline def setHasActiveFx(value: CallbackTo[Any]): Self = StObject.set(x, "hasActiveFx", value.toJsFn)
    
    inline def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
    
    inline def setSequenceFx(value: CallbackTo[Any]): Self = StObject.set(x, "sequenceFx", value.toJsFn)
    
    inline def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
    
    inline def setStopAnimation(value: CallbackTo[IElement]): Self = StObject.set(x, "stopAnimation", value.toJsFn)
    
    inline def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
    
    inline def setStopFx(value: CallbackTo[IElement]): Self = StObject.set(x, "stopFx", value.toJsFn)
    
    inline def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
    
    inline def setSyncFx(value: CallbackTo[Any]): Self = StObject.set(x, "syncFx", value.toJsFn)
    
    inline def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
  }
}
