package typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleActivationStore
  extends StObject
     with Clonable[ModuleActivationStore] {
  
  def addActivation(moduleId: Double, serviceIdentifier: ServiceIdentifier[Any], onActivation: BindingActivation[Any]): Unit
  
  def addDeactivation(
    moduleId: Double,
    serviceIdentifier: ServiceIdentifier[Any],
    onDeactivation: BindingDeactivation[Any]
  ): Unit
  
  def remove(moduleId: Double): ModuleActivationHandlers
}
object ModuleActivationStore {
  
  inline def apply(
    addActivation: (Double, ServiceIdentifier[Any], BindingActivation[Any]) => Callback,
    addDeactivation: (Double, ServiceIdentifier[Any], BindingDeactivation[Any]) => Callback,
    remove: Double => ModuleActivationHandlers
  ): ModuleActivationStore = {
    val __obj = js.Dynamic.literal(addActivation = js.Any.fromFunction3((t0: Double, t1: ServiceIdentifier[Any], t2: BindingActivation[Any]) => (addActivation(t0, t1, t2)).runNow()), addDeactivation = js.Any.fromFunction3((t0: Double, t1: ServiceIdentifier[Any], t2: BindingDeactivation[Any]) => (addDeactivation(t0, t1, t2)).runNow()), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ModuleActivationStore]
  }
  
  extension [Self <: ModuleActivationStore](x: Self) {
    
    inline def setAddActivation(value: (Double, ServiceIdentifier[Any], BindingActivation[Any]) => Callback): Self = StObject.set(x, "addActivation", js.Any.fromFunction3((t0: Double, t1: ServiceIdentifier[Any], t2: BindingActivation[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddDeactivation(value: (Double, ServiceIdentifier[Any], BindingDeactivation[Any]) => Callback): Self = StObject.set(x, "addDeactivation", js.Any.fromFunction3((t0: Double, t1: ServiceIdentifier[Any], t2: BindingDeactivation[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemove(value: Double => ModuleActivationHandlers): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
