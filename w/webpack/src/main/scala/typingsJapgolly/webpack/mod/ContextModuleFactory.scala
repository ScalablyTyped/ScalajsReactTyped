package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.anon.ReadonlybeforeResolveAsyn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModuleFactory
  extends StObject
     with ModuleFactory {
  
  var hooks: ReadonlybeforeResolveAsyn
  
  def resolveDependencies(
    fs: InputFileSystem,
    options: ContextModuleOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
      Any
    ]
  ): Unit
  
  var resolverFactory: ResolverFactory
}
object ContextModuleFactory {
  
  inline def apply(
    create: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Callback,
    hooks: ReadonlybeforeResolveAsyn,
    resolveDependencies: (InputFileSystem, ContextModuleOptions, js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
      Any
    ]) => Callback,
    resolverFactory: ResolverFactory
  ): ContextModuleFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: ModuleFactoryCreateData, t1: js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => (create(t0, t1)).runNow()), hooks = hooks.asInstanceOf[js.Any], resolveDependencies = js.Any.fromFunction3((t0: InputFileSystem, t1: ContextModuleOptions, t2: js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
      Any
    ]) => (resolveDependencies(t0, t1, t2)).runNow()), resolverFactory = resolverFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleFactory]
  }
  
  extension [Self <: ContextModuleFactory](x: Self) {
    
    inline def setHooks(value: ReadonlybeforeResolveAsyn): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setResolveDependencies(
      value: (InputFileSystem, ContextModuleOptions, js.Function2[
          /* err */ js.UndefOr[Null | js.Error], 
          /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
          Any
        ]) => Callback
    ): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3((t0: InputFileSystem, t1: ContextModuleOptions, t2: js.Function2[
          /* err */ js.UndefOr[Null | js.Error], 
          /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
          Any
        ]) => (value(t0, t1, t2)).runNow()))
    
    inline def setResolverFactory(value: ResolverFactory): Self = StObject.set(x, "resolverFactory", value.asInstanceOf[js.Any])
  }
}
