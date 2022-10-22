package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicReact.anon.ComponentCanBeDestroyed
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContextsIonLifeCycleContextMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/contexts/IonLifeCycleContext", "DefaultIonLifeCycleContext")
  @js.native
  open class DefaultIonLifeCycleContext ()
    extends StObject
       with ComponentCanBeDestroyed {
    
    /* CompleteClass */
    override def componentCanBeDestroyed(): Unit = js.native
    
    /* CompleteClass */
    override def ionViewDidEnter(): Unit = js.native
    
    /* CompleteClass */
    var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewDidLeave(): Unit = js.native
    
    /* CompleteClass */
    var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewWillEnter(): Unit = js.native
    
    /* CompleteClass */
    var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewWillLeave(): Unit = js.native
    
    /* CompleteClass */
    var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
  }
  
  @JSImport("@ionic/react/dist/types/contexts/IonLifeCycleContext", "IonLifeCycleContext")
  @js.native
  val IonLifeCycleContext: Context[IonLifeCycleContextInterface] = js.native
  
  trait IonLifeCycleContextInterface extends StObject {
    
    def ionViewDidEnter(): Unit
    
    def ionViewDidLeave(): Unit
    
    def ionViewWillEnter(): Unit
    
    def ionViewWillLeave(): Unit
    
    def onIonViewDidEnter(callback: js.Function0[Unit]): Unit
    
    def onIonViewDidLeave(callback: js.Function0[Unit]): Unit
    
    def onIonViewWillEnter(callback: js.Function0[Unit]): Unit
    
    def onIonViewWillLeave(callback: js.Function0[Unit]): Unit
  }
  object IonLifeCycleContextInterface {
    
    inline def apply(
      ionViewDidEnter: Callback,
      ionViewDidLeave: Callback,
      ionViewWillEnter: Callback,
      ionViewWillLeave: Callback,
      onIonViewDidEnter: js.Function0[Unit] => Callback,
      onIonViewDidLeave: js.Function0[Unit] => Callback,
      onIonViewWillEnter: js.Function0[Unit] => Callback,
      onIonViewWillLeave: js.Function0[Unit] => Callback
    ): IonLifeCycleContextInterface = {
      val __obj = js.Dynamic.literal(ionViewDidEnter = ionViewDidEnter.toJsFn, ionViewDidLeave = ionViewDidLeave.toJsFn, ionViewWillEnter = ionViewWillEnter.toJsFn, ionViewWillLeave = ionViewWillLeave.toJsFn, onIonViewDidEnter = js.Any.fromFunction1((t0: js.Function0[Unit]) => onIonViewDidEnter(t0).runNow()), onIonViewDidLeave = js.Any.fromFunction1((t0: js.Function0[Unit]) => onIonViewDidLeave(t0).runNow()), onIonViewWillEnter = js.Any.fromFunction1((t0: js.Function0[Unit]) => onIonViewWillEnter(t0).runNow()), onIonViewWillLeave = js.Any.fromFunction1((t0: js.Function0[Unit]) => onIonViewWillLeave(t0).runNow()))
      __obj.asInstanceOf[IonLifeCycleContextInterface]
    }
    
    extension [Self <: IonLifeCycleContextInterface](x: Self) {
      
      inline def setIonViewDidEnter(value: Callback): Self = StObject.set(x, "ionViewDidEnter", value.toJsFn)
      
      inline def setIonViewDidLeave(value: Callback): Self = StObject.set(x, "ionViewDidLeave", value.toJsFn)
      
      inline def setIonViewWillEnter(value: Callback): Self = StObject.set(x, "ionViewWillEnter", value.toJsFn)
      
      inline def setIonViewWillLeave(value: Callback): Self = StObject.set(x, "ionViewWillLeave", value.toJsFn)
      
      inline def setOnIonViewDidEnter(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onIonViewDidEnter", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setOnIonViewDidLeave(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onIonViewDidLeave", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setOnIonViewWillEnter(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onIonViewWillEnter", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setOnIonViewWillLeave(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onIonViewWillLeave", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait LifeCycleCallback extends StObject {
    
    def apply(): Unit = js.native
    
    var id: js.UndefOr[Double] = js.native
  }
}
