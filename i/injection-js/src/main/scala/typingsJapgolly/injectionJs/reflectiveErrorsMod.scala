package typingsJapgolly.injectionJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.injectionJs.facadeTypeMod.Type
import typingsJapgolly.injectionJs.reflectiveInjectorMod.ReflectiveInjector
import typingsJapgolly.injectionJs.reflectiveKeyMod.ReflectiveKey
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectiveErrorsMod {
  
  @JSImport("injection-js/reflective_errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cyclicDependencyError(injector: ReflectiveInjector, key: ReflectiveKey): InjectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("cyclicDependencyError")(injector.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InjectionError]
  
  inline def instantiationError(injector: ReflectiveInjector, originalException: Any, originalStack: Any, key: ReflectiveKey): InjectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiationError")(injector.asInstanceOf[js.Any], originalException.asInstanceOf[js.Any], originalStack.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InjectionError]
  
  inline def invalidProviderError(provider: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidProviderError")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def mixingMultiProvidersWithRegularProvidersError(provider1: Any, provider2: Any): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("mixingMultiProvidersWithRegularProvidersError")(provider1.asInstanceOf[js.Any], provider2.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def noAnnotationError(typeOrFunc: js.Function, params: js.Array[js.Array[Any]]): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("noAnnotationError")(typeOrFunc.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def noAnnotationError(typeOrFunc: Type[Any], params: js.Array[js.Array[Any]]): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("noAnnotationError")(typeOrFunc.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def noProviderError(injector: ReflectiveInjector, key: ReflectiveKey): InjectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("noProviderError")(injector.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InjectionError]
  
  inline def outOfBoundsError(index: Double): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("outOfBoundsError")(index.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  trait InjectionError
    extends StObject
       with Error {
    
    def addKey(injector: ReflectiveInjector, key: ReflectiveKey): Unit
    
    def constructResolvingMessage(): String
    
    var injectors: js.Array[ReflectiveInjector]
    
    var keys: js.Array[ReflectiveKey]
  }
  object InjectionError {
    
    inline def apply(
      addKey: (ReflectiveInjector, ReflectiveKey) => Callback,
      constructResolvingMessage: CallbackTo[String],
      injectors: js.Array[ReflectiveInjector],
      keys: js.Array[ReflectiveKey],
      message: String,
      name: String
    ): InjectionError = {
      val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2((t0: ReflectiveInjector, t1: ReflectiveKey) => (addKey(t0, t1)).runNow()), constructResolvingMessage = constructResolvingMessage.toJsFn, injectors = injectors.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectionError]
    }
    
    extension [Self <: InjectionError](x: Self) {
      
      inline def setAddKey(value: (ReflectiveInjector, ReflectiveKey) => Callback): Self = StObject.set(x, "addKey", js.Any.fromFunction2((t0: ReflectiveInjector, t1: ReflectiveKey) => (value(t0, t1)).runNow()))
      
      inline def setConstructResolvingMessage(value: CallbackTo[String]): Self = StObject.set(x, "constructResolvingMessage", value.toJsFn)
      
      inline def setInjectors(value: js.Array[ReflectiveInjector]): Self = StObject.set(x, "injectors", value.asInstanceOf[js.Any])
      
      inline def setInjectorsVarargs(value: ReflectiveInjector*): Self = StObject.set(x, "injectors", js.Array(value*))
      
      inline def setKeys(value: js.Array[ReflectiveKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: ReflectiveKey*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
}
