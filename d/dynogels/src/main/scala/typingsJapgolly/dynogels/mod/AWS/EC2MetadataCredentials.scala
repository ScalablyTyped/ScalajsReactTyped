package typingsJapgolly.dynogels.mod.AWS

import typingsJapgolly.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials ()
  extends typingsJapgolly.awsSdk.mod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

