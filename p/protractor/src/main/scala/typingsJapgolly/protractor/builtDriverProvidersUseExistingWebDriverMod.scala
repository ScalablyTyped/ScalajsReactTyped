package typingsJapgolly.protractor

import typingsJapgolly.protractor.builtConfigMod.Config
import typingsJapgolly.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersUseExistingWebDriverMod {
  
  @JSImport("protractor/built/driverProviders/useExistingWebDriver", "UseExistingWebDriver")
  @js.native
  open class UseExistingWebDriver protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Maintains the existing session and does not quit the driver.
      *
      * @public
      */
    def quitDriver(): js.Promise[Unit] = js.native
  }
}
