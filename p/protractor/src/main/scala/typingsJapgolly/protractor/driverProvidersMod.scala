package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import typingsJapgolly.q.mod.Promise
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object driverProvidersMod extends js.Object {
  @js.native
  class AttachSession protected ()
    extends typingsJapgolly.protractor.attachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @js.native
  class BrowserStack protected ()
    extends typingsJapgolly.protractor.browserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @js.native
  class Direct protected ()
    extends typingsJapgolly.protractor.directMod.Direct {
    def this(config: Config) = this()
  }
  
  @js.native
  abstract class DriverProvider protected ()
    extends typingsJapgolly.protractor.driverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  
  @js.native
  class Hosted protected ()
    extends typingsJapgolly.protractor.hostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @js.native
  class Kobiton protected ()
    extends typingsJapgolly.protractor.kobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @js.native
  class Local protected ()
    extends typingsJapgolly.protractor.localMod.Local {
    def this(config: Config) = this()
  }
  
  @js.native
  class Mock ()
    extends typingsJapgolly.protractor.mockMod.Mock {
    def this(config: Config) = this()
  }
  
  @js.native
  class MockExecutor ()
    extends typingsJapgolly.protractor.mockMod.MockExecutor
  
  @js.native
  class Sauce protected ()
    extends typingsJapgolly.protractor.sauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @js.native
  class TestObject protected ()
    extends typingsJapgolly.protractor.testObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @js.native
  class UseExistingWebDriver protected ()
    extends typingsJapgolly.protractor.useExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  var buildDriverProvider: js.Function1[/* config */ Config, typingsJapgolly.protractor.driverProviderMod.DriverProvider] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(
      provider: typingsJapgolly.protractor.driverProviderMod.DriverProvider,
      drivers: js.Array[WebDriver]
    ): Promise[Unit] = js.native
  }
  
}

