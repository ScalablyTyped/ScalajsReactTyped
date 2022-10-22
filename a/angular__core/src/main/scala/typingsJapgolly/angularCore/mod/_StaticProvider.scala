package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StaticProvider extends StObject
object _StaticProvider {
  
  inline def ConstructorProvider(provide: Type[Any]): typingsJapgolly.angularCore.mod.ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ConstructorProvider]
  }
  
  inline def ExistingProvider(provide: Any, useExisting: Any): typingsJapgolly.angularCore.mod.ExistingProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ExistingProvider]
  }
  
  inline def FactoryProvider(provide: Any, useFactory: js.Function): typingsJapgolly.angularCore.mod.FactoryProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.FactoryProvider]
  }
  
  inline def StaticClassProvider(deps: js.Array[Any], provide: Any, useClass: Type[Any]): typingsJapgolly.angularCore.mod.StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.StaticClassProvider]
  }
  
  inline def ValueProvider(provide: Any, useValue: Any): typingsJapgolly.angularCore.mod.ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ValueProvider]
  }
}
