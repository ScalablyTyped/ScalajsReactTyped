package typingsJapgolly.awsSdk.globalMod

import typingsJapgolly.awsSdk.configMod.APIVersions
import typingsJapgolly.awsSdk.configMod.ConfigurationOptions
import typingsJapgolly.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import typingsJapgolly.awsSdk.coreMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config_ () extends Config {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}

