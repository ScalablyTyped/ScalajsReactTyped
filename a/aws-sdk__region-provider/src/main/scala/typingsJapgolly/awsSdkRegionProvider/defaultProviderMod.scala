package typingsJapgolly.awsSdkRegionProvider

import typingsJapgolly.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typingsJapgolly.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
@js.native
object defaultProviderMod extends js.Object {
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}

