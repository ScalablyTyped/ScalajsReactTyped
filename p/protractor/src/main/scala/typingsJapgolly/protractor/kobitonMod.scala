package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import typingsJapgolly.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/kobiton", JSImport.Namespace)
@js.native
object kobitonMod extends js.Object {
  @js.native
  class Kobiton protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

