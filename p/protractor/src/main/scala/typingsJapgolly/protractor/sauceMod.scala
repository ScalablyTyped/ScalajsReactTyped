package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import typingsJapgolly.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/sauce", JSImport.Namespace)
@js.native
object sauceMod extends js.Object {
  @js.native
  class Sauce protected () extends DriverProvider {
    def this(config: Config) = this()
    var sauceServer_ : js.Any = js.native
    /**
      * Get the Sauce Labs endpoint
      * @private
      * @param {string} region
      * @return {string} The endpoint that needs to be used
      */
    /* private */ def getSauceEndpoint(region: js.Any): js.Any = js.native
  }
  
}

