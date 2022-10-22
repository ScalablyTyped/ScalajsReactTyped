package typingsJapgolly.injectionJs

import typingsJapgolly.injectionJs.facadeTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  trait ClassProvider
    extends StObject
       with _Provider {
    
    /**
      * If true, then injector returns an array of instances. This is useful to allow multiple
      * providers spread across many files to provide configuration information to a common token.
      *
      * ### Example
      *
      * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
      */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
      */
    var provide: Any
    
    /**
      * Class to instantiate for the `token`.
      */
    var useClass: Type[Any]
  }
  object ClassProvider {
    
    inline def apply(provide: Any, useClass: Type[Any]): ClassProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassProvider]
    }
    
    extension [Self <: ClassProvider](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setProvide(value: Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseClass(value: Type[Any]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExistingProvider
    extends StObject
       with _Provider {
    
    /**
      * If true, then injector returns an array of instances. This is useful to allow multiple
      * providers spread across many files to provide configuration information to a common token.
      *
      * ### Example
      *
      * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
      */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
      */
    var provide: Any
    
    /**
      * Existing `token` to return. (equivalent to `injector.get(useExisting)`)
      */
    var useExisting: Any
  }
  object ExistingProvider {
    
    inline def apply(provide: Any, useExisting: Any): ExistingProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExistingProvider]
    }
    
    extension [Self <: ExistingProvider](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setProvide(value: Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseExisting(value: Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    }
  }
  
  trait FactoryProvider
    extends StObject
       with _Provider {
    
    /**
      * A list of `token`s which need to be resolved by the injector. The list of values is then
      * used as arguments to the `useFactory` function.
      */
    var deps: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * If true, then injector returns an array of instances. This is useful to allow multiple
      * providers spread across many files to provide configuration information to a common token.
      *
      * ### Example
      *
      * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
      */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
      */
    var provide: Any
    
    /**
      * A function to invoke to create a value for this `token`. The function is invoked with
      * resolved values of `token`s in the `deps` field.
      */
    var useFactory: js.Function
  }
  object FactoryProvider {
    
    inline def apply(provide: Any, useFactory: js.Function): FactoryProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactoryProvider]
    }
    
    extension [Self <: FactoryProvider](x: Self) {
      
      inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setProvide(value: Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.injectionJs.providerMod.TypeProvider
    - typingsJapgolly.injectionJs.providerMod.ValueProvider
    - typingsJapgolly.injectionJs.providerMod.ClassProvider
    - typingsJapgolly.injectionJs.providerMod.ExistingProvider
    - typingsJapgolly.injectionJs.providerMod.FactoryProvider
    - js.Array[scala.Any]
  */
  type Provider = _Provider | js.Array[Any] | TypeProvider
  
  type TypeProvider = Type[Any]
  
  trait ValueProvider
    extends StObject
       with _Provider {
    
    /**
      * If true, then injector returns an array of instances. This is useful to allow multiple
      * providers spread across many files to provide configuration information to a common token.
      *
      * ### Example
      *
      * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
      */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
      */
    var provide: Any
    
    /**
      * The value to inject.
      */
    var useValue: Any
  }
  object ValueProvider {
    
    inline def apply(provide: Any, useValue: Any): ValueProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueProvider]
    }
    
    extension [Self <: ValueProvider](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setProvide(value: Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Provider extends StObject
  object _Provider {
    
    inline def ClassProvider(provide: Any, useClass: Type[Any]): typingsJapgolly.injectionJs.providerMod.ClassProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.injectionJs.providerMod.ClassProvider]
    }
    
    inline def ExistingProvider(provide: Any, useExisting: Any): typingsJapgolly.injectionJs.providerMod.ExistingProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.injectionJs.providerMod.ExistingProvider]
    }
    
    inline def FactoryProvider(provide: Any, useFactory: js.Function): typingsJapgolly.injectionJs.providerMod.FactoryProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.injectionJs.providerMod.FactoryProvider]
    }
    
    inline def ValueProvider(provide: Any, useValue: Any): typingsJapgolly.injectionJs.providerMod.ValueProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.injectionJs.providerMod.ValueProvider]
    }
  }
}
