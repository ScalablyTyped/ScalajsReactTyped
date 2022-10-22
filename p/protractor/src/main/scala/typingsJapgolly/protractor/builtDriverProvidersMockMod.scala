package typingsJapgolly.protractor

import typingsJapgolly.protractor.builtConfigMod.Config
import typingsJapgolly.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersMockMod {
  
  @JSImport("protractor/built/driverProviders/mock", "Mock")
  @js.native
  open class Mock () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[Any] = js.native
  }
  
  @JSImport("protractor/built/driverProviders/mock", "MockExecutor")
  @js.native
  open class MockExecutor () extends StObject {
    
    def execute(command: Any): Any = js.native
  }
}
