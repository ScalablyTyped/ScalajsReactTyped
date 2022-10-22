package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.LifeCycleCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCanBeDestroyed extends StObject {
  
  def componentCanBeDestroyed(): Unit
  
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def ionViewDidEnter(): Unit
  
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewDidLeave(): Unit
  
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewWillEnter(): Unit
  
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewWillLeave(): Unit
  
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback]
  
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit
  
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit
  
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit
  
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit
  
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit
}
object ComponentCanBeDestroyed {
  
  inline def apply(
    componentCanBeDestroyed: japgolly.scalajs.react.Callback,
    ionViewDidEnter: japgolly.scalajs.react.Callback,
    ionViewDidEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewDidLeave: japgolly.scalajs.react.Callback,
    ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback],
    ionViewWillEnter: japgolly.scalajs.react.Callback,
    ionViewWillEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewWillLeave: japgolly.scalajs.react.Callback,
    ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback],
    onComponentCanBeDestroyed: js.Function0[Unit] => japgolly.scalajs.react.Callback,
    onIonViewDidEnter: LifeCycleCallback => japgolly.scalajs.react.Callback,
    onIonViewDidLeave: LifeCycleCallback => japgolly.scalajs.react.Callback,
    onIonViewWillEnter: LifeCycleCallback => japgolly.scalajs.react.Callback,
    onIonViewWillLeave: LifeCycleCallback => japgolly.scalajs.react.Callback
  ): ComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(componentCanBeDestroyed = componentCanBeDestroyed.toJsFn, ionViewDidEnter = ionViewDidEnter.toJsFn, ionViewDidEnterCallbacks = ionViewDidEnterCallbacks.asInstanceOf[js.Any], ionViewDidLeave = ionViewDidLeave.toJsFn, ionViewDidLeaveCallbacks = ionViewDidLeaveCallbacks.asInstanceOf[js.Any], ionViewWillEnter = ionViewWillEnter.toJsFn, ionViewWillEnterCallbacks = ionViewWillEnterCallbacks.asInstanceOf[js.Any], ionViewWillLeave = ionViewWillLeave.toJsFn, ionViewWillLeaveCallbacks = ionViewWillLeaveCallbacks.asInstanceOf[js.Any], onComponentCanBeDestroyed = js.Any.fromFunction1((t0: js.Function0[Unit]) => onComponentCanBeDestroyed(t0).runNow()), onIonViewDidEnter = js.Any.fromFunction1((t0: LifeCycleCallback) => onIonViewDidEnter(t0).runNow()), onIonViewDidLeave = js.Any.fromFunction1((t0: LifeCycleCallback) => onIonViewDidLeave(t0).runNow()), onIonViewWillEnter = js.Any.fromFunction1((t0: LifeCycleCallback) => onIonViewWillEnter(t0).runNow()), onIonViewWillLeave = js.Any.fromFunction1((t0: LifeCycleCallback) => onIonViewWillLeave(t0).runNow()))
    __obj.asInstanceOf[ComponentCanBeDestroyed]
  }
  
  extension [Self <: ComponentCanBeDestroyed](x: Self) {
    
    inline def setComponentCanBeDestroyed(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "componentCanBeDestroyed", value.toJsFn)
    
    inline def setComponentCanBeDestroyedCallback(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "componentCanBeDestroyedCallback", value.toJsFn)
    
    inline def setComponentCanBeDestroyedCallbackUndefined: Self = StObject.set(x, "componentCanBeDestroyedCallback", js.undefined)
    
    inline def setIonViewDidEnter(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ionViewDidEnter", value.toJsFn)
    
    inline def setIonViewDidEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidEnterCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewDidEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidEnterCallbacks", js.Array(value*))
    
    inline def setIonViewDidLeave(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ionViewDidLeave", value.toJsFn)
    
    inline def setIonViewDidLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidLeaveCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewDidLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidLeaveCallbacks", js.Array(value*))
    
    inline def setIonViewWillEnter(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ionViewWillEnter", value.toJsFn)
    
    inline def setIonViewWillEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillEnterCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewWillEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillEnterCallbacks", js.Array(value*))
    
    inline def setIonViewWillLeave(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ionViewWillLeave", value.toJsFn)
    
    inline def setIonViewWillLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillLeaveCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewWillLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillLeaveCallbacks", js.Array(value*))
    
    inline def setOnComponentCanBeDestroyed(value: js.Function0[Unit] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onComponentCanBeDestroyed", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnIonViewDidEnter(value: LifeCycleCallback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonViewDidEnter", js.Any.fromFunction1((t0: LifeCycleCallback) => value(t0).runNow()))
    
    inline def setOnIonViewDidLeave(value: LifeCycleCallback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonViewDidLeave", js.Any.fromFunction1((t0: LifeCycleCallback) => value(t0).runNow()))
    
    inline def setOnIonViewWillEnter(value: LifeCycleCallback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonViewWillEnter", js.Any.fromFunction1((t0: LifeCycleCallback) => value(t0).runNow()))
    
    inline def setOnIonViewWillLeave(value: LifeCycleCallback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonViewWillLeave", js.Any.fromFunction1((t0: LifeCycleCallback) => value(t0).runNow()))
  }
}
