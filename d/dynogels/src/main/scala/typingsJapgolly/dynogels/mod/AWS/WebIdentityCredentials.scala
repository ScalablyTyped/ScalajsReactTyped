package typingsJapgolly.dynogels.mod.AWS

import typingsJapgolly.awsSdk.libCredentialsWebIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.WebIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
  */
open class WebIdentityCredentials ()
  extends typingsJapgolly.awsSdk.mod.WebIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  def this(options: WebIdentityCredentialsOptions) = this()
  def this(
    options: WebIdentityCredentialsOptions,
    clientConfig: typingsJapgolly.awsSdk.libConfigBaseMod.ConfigurationOptions
  ) = this()
}
