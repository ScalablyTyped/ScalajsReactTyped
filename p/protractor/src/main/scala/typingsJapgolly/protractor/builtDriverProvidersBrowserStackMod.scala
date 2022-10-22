package typingsJapgolly.protractor

import typingsJapgolly.protractor.builtConfigMod.Config
import typingsJapgolly.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersBrowserStackMod {
  
  @JSImport("protractor/built/driverProviders/browserStack", "BrowserStack")
  @js.native
  open class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    
    var browserstackClient: Any = js.native
  }
}
