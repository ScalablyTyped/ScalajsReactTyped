package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.Instantiable
import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.LifeCycleCallback
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLifecycleMod {
  
  @JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonViewDidEnter(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidEnter")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIonViewDidEnter(callback: LifeCycleCallback, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidEnter")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useIonViewDidLeave(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidLeave")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIonViewDidLeave(callback: LifeCycleCallback, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidLeave")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useIonViewWillEnter(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillEnter")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIonViewWillEnter(callback: LifeCycleCallback, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillEnter")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useIonViewWillLeave(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillLeave")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIonViewWillLeave(callback: LifeCycleCallback, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillLeave")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withIonLifeCycle(WrappedComponent: ComponentType[Any]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("withIonLifeCycle")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
}
