package typingsJapgolly.awsSdk.mod

import typingsJapgolly.awsSdk.libCredentialsEc2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "EC2MetadataCredentials")
@js.native
/**
  * Creates credentials from the metadata service on an EC2 instance.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class EC2MetadataCredentials ()
  extends typingsJapgolly.awsSdk.libCoreMod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}
