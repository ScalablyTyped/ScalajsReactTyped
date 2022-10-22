package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.mod.ValueSansProvider
  - typingsJapgolly.angularCore.mod.ExistingSansProvider
  - typingsJapgolly.angularCore.mod.StaticClassSansProvider
  - typingsJapgolly.angularCore.mod.ConstructorSansProvider
  - typingsJapgolly.angularCore.mod.FactorySansProvider
  - typingsJapgolly.angularCore.mod.ClassSansProvider
*/
trait InjectableProvider extends StObject
object InjectableProvider {
  
  inline def ClassSansProvider(useClass: Type[Any]): typingsJapgolly.angularCore.mod.ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ClassSansProvider]
  }
  
  inline def ConstructorSansProvider(): typingsJapgolly.angularCore.mod.ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ConstructorSansProvider]
  }
  
  inline def ExistingSansProvider(useExisting: Any): typingsJapgolly.angularCore.mod.ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ExistingSansProvider]
  }
  
  inline def FactorySansProvider(useFactory: js.Function): typingsJapgolly.angularCore.mod.FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.FactorySansProvider]
  }
  
  inline def StaticClassSansProvider(deps: js.Array[Any], useClass: Type[Any]): typingsJapgolly.angularCore.mod.StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.StaticClassSansProvider]
  }
  
  inline def ValueSansProvider(useValue: Any): typingsJapgolly.angularCore.mod.ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCore.mod.ValueSansProvider]
  }
}
