package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import typingsJapgolly.protractor.driverProviderMod.DriverProvider
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/mock", JSImport.Namespace)
@js.native
object mockMod extends js.Object {
  @js.native
  class Mock () extends DriverProvider {
    def this(config: Config) = this()
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[_] = js.native
  }
  
  @js.native
  class MockExecutor () extends js.Object {
    def execute(command: js.Any): js.Any = js.native
  }
  
}

