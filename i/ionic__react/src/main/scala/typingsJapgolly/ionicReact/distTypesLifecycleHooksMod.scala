package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.LifeCycleCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLifecycleHooksMod {
  
  @JSImport("@ionic/react/dist/types/lifecycle/hooks", JSImport.Namespace)
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
}
