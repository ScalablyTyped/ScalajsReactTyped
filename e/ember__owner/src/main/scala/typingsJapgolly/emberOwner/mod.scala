package typingsJapgolly.emberOwner

import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Factory[T] extends StObject {
    
    /**
      * A function that will create an instance of the class with any
      * dependencies injected.
      *
      * @param initialValues Any values to set on an instance of the class
      */
    def create(): T = js.native
    def create(initialValues: Partial[T]): T = js.native
  }
  
  @js.native
  trait FactoryManager[T]
    extends StObject
       with Factory[T] {
    
    /** The registered or resolved class. */
    val `class`: Factory[T] = js.native
  }
  
  type FullName = /* template literal string: ${string}:${string} */ String
  
  @js.native
  trait Owner extends StObject {
    
    /**
      * Given a fullName of the form `'type:name'`, like `'route:application'`,
      * return a corresponding factory manager.
      *
      * Any instances created via the factory's `.create()` method must be
      * destroyed manually by the caller of `.create()`. Typically, this is done
      * during the creating objects own `destroy` or `willDestroy` methods.
      */
    def factoryFor(fullName: FullName): js.UndefOr[FactoryManager[Any]] = js.native
    
    /**
      * Given a {@linkcode FullName} return a corresponding instance.
      */
    def lookup(fullName: FullName): Any = js.native
    
    def register(fullName: FullName, factory: js.Object): Unit = js.native
    def register(fullName: FullName, factory: js.Object, options: RegisterOptions): Unit = js.native
    /**
      * Registers a factory or value that can be used for dependency injection
      * (with `inject`) or for service lookup. Each factory is registered with a
      * full name including two parts: `'type:name'`.
      *
      * - To override the default of instantiating the class on the `Factory`,
      *   pass the `{ instantiate: false }` option. This is useful when you have
      *   already instantiated the class to use with this factory.
      * - To override the default singleton behavior and instead create multiple
      *   instances, pass the `{ singleton: false }` option.
      */
    // Dear future maintainer: yes, I know that `Factory<unknown> | object` is
    // an exceedingly weird type here. This is how we type it internally in
    // Ember itself. We actually allow more or less *anything* to be passed
    // here. In the future, we may possibly be able to update this to actually
    // take advantage of the `FullName` here to require that the registered
    // factory and corresponding options do the right thing (passing an *actual*
    // factory, not needing `create` if `options.instantiate` is `false`, etc.)
    // but doing so will require rationalizing Ember's own internals and may
    // need a full Ember RFC.
    def register(fullName: FullName, factory: Factory[Any]): Unit = js.native
    def register(fullName: FullName, factory: Factory[Any], options: RegisterOptions): Unit = js.native
  }
  
  trait RegisterOptions extends StObject {
    
    var instantiate: js.UndefOr[Boolean] = js.undefined
    
    var singleton: js.UndefOr[Boolean] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    extension [Self <: RegisterOptions](x: Self) {
      
      inline def setInstantiate(value: Boolean): Self = StObject.set(x, "instantiate", value.asInstanceOf[js.Any])
      
      inline def setInstantiateUndefined: Self = StObject.set(x, "instantiate", js.undefined)
      
      inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
      
      inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    }
  }
}
