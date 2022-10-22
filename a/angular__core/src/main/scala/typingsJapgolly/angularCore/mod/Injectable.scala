package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreStrings.any
import typingsJapgolly.angularCore.angularCoreStrings.platform
import typingsJapgolly.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Injectable extends StObject {
  
  /**
    * Determines which injectors will provide the injectable.
    *
    * - `Type<any>` - associates the injectable with an `@NgModule` or other `InjectorType`,
    * - 'null' : Equivalent to `undefined`. The injectable is not provided in any scope automatically
    * and must be added to a `providers` array of an [@NgModule](api/core/NgModule#providers),
    * [@Component](api/core/Directive#providers) or [@Directive](api/core/Directive#providers).
    *
    * The following options specify that this injectable should be provided in one of the following
    * injectors:
    * - 'root' : The application-level injector in most apps.
    * - 'platform' : A special singleton platform injector shared by all
    * applications on the page.
    * - 'any' : Provides a unique instance in each lazy loaded module while all eagerly loaded
    * modules share one instance.
    *
    */
  var providedIn: js.UndefOr[Type[Any] | root | platform | any | Null] = js.undefined
}
object Injectable {
  
  @JSImport("@angular/core", "Injectable")
  @js.native
  val ^ : InjectableDecorator = js.native
  
  extension [Self <: Injectable](x: Self) {
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}
