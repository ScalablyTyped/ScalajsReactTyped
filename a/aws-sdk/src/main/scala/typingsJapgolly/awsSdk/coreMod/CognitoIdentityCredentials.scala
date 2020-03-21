package typingsJapgolly.awsSdk.coreMod

import typingsJapgolly.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsJapgolly.awsSdk.configMod.ConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typingsJapgolly.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("aws-sdk/lib/core", "CognitoIdentityCredentials")
@js.native
object CognitoIdentityCredentials extends js.Object

