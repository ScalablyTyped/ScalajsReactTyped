package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.Injector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diR3InjectorMod {
  
  /* note: abstract class */ @JSImport("@ionic/angular/di/r3_injector", "EnvironmentInjector")
  @js.native
  open class EnvironmentInjector () extends Injector {
    
    def destroy(): Unit = js.native
    
    /**
      * @internal
      */
    var onDestroy: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  }
}
