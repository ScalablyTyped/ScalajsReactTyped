package typingsJapgolly.libraCore.vmErrorsPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.languageStoragePbMod.ModuleId
import typingsJapgolly.libraCore.vmErrorsPbMod.VMVerificationStatus.StatusKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus")
@js.native
class VMVerificationStatus_ () extends Message {
  def clearDependencyId(): Unit = js.native
  def getDependencyId(): js.UndefOr[ModuleId] = js.native
  def getErrorKind(): VMVerificationErrorKind = js.native
  def getMessage(): String = js.native
  def getModuleIdx(): Double = js.native
  def getStatusKind(): StatusKind = js.native
  def hasDependencyId(): Boolean = js.native
  def setDependencyId(): Unit = js.native
  def setDependencyId(value: ModuleId): Unit = js.native
  def setErrorKind(value: VMVerificationErrorKind): Unit = js.native
  def setMessage(value: String): Unit = js.native
  def setModuleIdx(value: Double): Unit = js.native
  def setStatusKind(value: StatusKind): Unit = js.native
}

