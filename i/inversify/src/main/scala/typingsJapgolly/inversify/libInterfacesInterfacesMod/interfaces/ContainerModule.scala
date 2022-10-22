package typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerModule
  extends StObject
     with ContainerModuleBase {
  
  def registry(
    bind: Bind,
    unbind: Unbind,
    isBound: IsBound,
    rebind: Rebind,
    unbindAsync: UnbindAsync,
    onActivation: js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onActivation */ BindingActivation[Any], 
      Unit
    ],
    onDeactivation: js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onDeactivation */ BindingDeactivation[Any], 
      Unit
    ]
  ): Unit
  @JSName("registry")
  var registry_Original: ContainerModuleCallBack
}
object ContainerModule {
  
  inline def apply(
    id: Double,
    registry: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind, /* unbindAsync */ UnbindAsync, /* onActivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onActivation */ BindingActivation[Any], 
      Unit
    ], /* onDeactivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onDeactivation */ BindingDeactivation[Any], 
      Unit
    ]) => Callback
  ): ContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = js.Any.fromFunction7((t0: /* bind */ Bind, t1: /* unbind */ Unbind, t2: /* isBound */ IsBound, t3: /* rebind */ Rebind, t4: /* unbindAsync */ UnbindAsync, t5: /* onActivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onActivation */ BindingActivation[Any], 
      Unit
    ], t6: /* onDeactivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onDeactivation */ BindingDeactivation[Any], 
      Unit
    ]) => (registry(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    __obj.asInstanceOf[ContainerModule]
  }
  
  extension [Self <: ContainerModule](x: Self) {
    
    inline def setRegistry(
      value: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind, /* unbindAsync */ UnbindAsync, /* onActivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onActivation */ BindingActivation[Any], 
          Unit
        ], /* onDeactivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onDeactivation */ BindingDeactivation[Any], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "registry", js.Any.fromFunction7((t0: /* bind */ Bind, t1: /* unbind */ Unbind, t2: /* isBound */ IsBound, t3: /* rebind */ Rebind, t4: /* unbindAsync */ UnbindAsync, t5: /* onActivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onActivation */ BindingActivation[Any], 
          Unit
        ], t6: /* onDeactivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onDeactivation */ BindingDeactivation[Any], 
          Unit
        ]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
  }
}
