package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import typingsJapgolly.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/hosted", JSImport.Namespace)
@js.native
object hostedMod extends js.Object {
  @js.native
  class Hosted protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

