package typingsJapgolly.awsSdk.mod

import typingsJapgolly.awsSdk.libConfigMod.APIVersions
import typingsJapgolly.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import typingsJapgolly.awsSdk.libCoreMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
open class Config_ () extends Config {
  def this(options: typingsJapgolly.awsSdk.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
}
