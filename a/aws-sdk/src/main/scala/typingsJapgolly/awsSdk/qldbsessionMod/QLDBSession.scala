package typingsJapgolly.awsSdk.qldbsessionMod

import typingsJapgolly.awsSdk.configMod.ConfigBase
import typingsJapgolly.awsSdk.errorMod.AWSError
import typingsJapgolly.awsSdk.requestMod.Request
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QLDBSession extends Service {
  @JSName("config")
  var config_QLDBSession: ConfigBase with ClientConfiguration = js.native
  /**
    * Sends a command to an Amazon QLDB ledger.
    */
  def sendCommand(): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]): Request[SendCommandResult, AWSError] = js.native
  /**
    * Sends a command to an Amazon QLDB ledger.
    */
  def sendCommand(params: SendCommandRequest): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(
    params: SendCommandRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]
  ): Request[SendCommandResult, AWSError] = js.native
}

