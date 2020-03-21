package typingsJapgolly.libraCore.admissionControlGrpcPbMod

import typingsJapgolly.grpc.mod.ChannelCredentials
import typingsJapgolly.grpc.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlClient")
@js.native
class AdmissionControlClient protected ()
  extends Client
     with IAdmissionControlClient {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
}

