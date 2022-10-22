package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.Instantiable
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLifecycleIonLifeCycleHOCMod {
  
  @JSImport("@ionic/react/dist/types/lifecycle/IonLifeCycleHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withIonLifeCycle(WrappedComponent: ComponentType[Any]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("withIonLifeCycle")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
}
