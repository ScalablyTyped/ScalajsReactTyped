package typingsJapgolly.mali.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  @JSName("package")
  var _package: String = js.native
  var app: Mali = js.native
  var call: GrpcCall = js.native
  var fullName: String = js.native
  var metadata: js.Any = js.native
  var name: String = js.native
  var req: GrpcRequest = js.native
  var request: Request = js.native
  var res: GrpcResponse = js.native
  var response: Response = js.native
  var service: String = js.native
  var `type`: String = js.native
  def get(field: String): js.Any = js.native
  def getStatus(field: String): js.Any = js.native
  def sendMetadata(md: js.Any): Unit = js.native
  def set(field: js.Any): Unit = js.native
  def set(field: js.Any, `val`: js.Any): Unit = js.native
  def setStatus(field: js.Any): Unit = js.native
  def setStatus(field: js.Any, `val`: js.Any): Unit = js.native
}

