package typingsJapgolly.awsSdk.mod

import typingsJapgolly.awsSdk.remoteCredentialsMod.RemoteCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials ()
  extends typingsJapgolly.awsSdk.coreMod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}

