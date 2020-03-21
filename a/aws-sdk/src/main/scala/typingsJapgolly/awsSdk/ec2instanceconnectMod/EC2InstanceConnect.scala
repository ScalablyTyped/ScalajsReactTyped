package typingsJapgolly.awsSdk.ec2instanceconnectMod

import typingsJapgolly.awsSdk.configMod.ConfigBase
import typingsJapgolly.awsSdk.errorMod.AWSError
import typingsJapgolly.awsSdk.requestMod.Request
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceConnect extends Service {
  @JSName("config")
  var config_EC2InstanceConnect: ConfigBase with ClientConfiguration = js.native
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  def sendSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  def sendSSHPublicKey(
    params: SendSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]
  ): Request[SendSSHPublicKeyResponse, AWSError] = js.native
}

