package typingsJapgolly.awsSdkRegionProvider

import typingsJapgolly.awsSdkRegionProvider.awsSdkRegionProviderStrings.AWS_PROFILE
import typingsJapgolly.awsSdkRegionProvider.awsSdkRegionProviderStrings.AWS_REGION
import typingsJapgolly.awsSdkRegionProvider.defaultProviderMod.RegionProviderConfiguration
import typingsJapgolly.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typingsJapgolly.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ENV_PROFILE: AWS_PROFILE = js.native
  val ENV_REGION: AWS_REGION = js.native
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  def fromEnv(): Provider[String] = js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
  def fromSharedConfigFiles(): Provider[String] = js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
}

