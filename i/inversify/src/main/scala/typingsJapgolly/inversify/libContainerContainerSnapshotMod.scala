package typingsJapgolly.inversify

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingActivation
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingDeactivation
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Lookup
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ModuleActivationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerContainerSnapshotMod {
  
  trait ContainerSnapshot
    extends StObject
       with typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ContainerSnapshot
  object ContainerSnapshot {
    
    inline def apply(
      activations: Lookup[BindingActivation[Any]],
      bindings: Lookup[Binding[Any]],
      deactivations: Lookup[BindingDeactivation[Any]],
      moduleActivationStore: ModuleActivationStore
    ): ContainerSnapshot = {
      val __obj = js.Dynamic.literal(activations = activations.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], deactivations = deactivations.asInstanceOf[js.Any], moduleActivationStore = moduleActivationStore.asInstanceOf[js.Any], middleware = null)
      __obj.asInstanceOf[ContainerSnapshot]
    }
  }
}
