package typingsJapgolly.awsSdk.chainableTemporaryCredentialsMod

import typingsJapgolly.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typingsJapgolly.awsSdk.credentialsMod.Credentials
import typingsJapgolly.awsSdk.stsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/chainable_temporary_credentials", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials_ () extends Credentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
  /**
    * The STS service instance used to get and refresh temporary credentials from AWS STS.
    */
  val service: ^ = js.native
}

