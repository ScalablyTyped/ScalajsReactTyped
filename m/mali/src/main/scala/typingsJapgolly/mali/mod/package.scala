package typingsJapgolly.mali

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GrpcCall = typingsJapgolly.grpc.mod.ServerUnaryCall[js.Any] | typingsJapgolly.grpc.mod.ServerReadableStream[js.Any] | typingsJapgolly.grpc.mod.ServerWriteableStream[js.Any] | (typingsJapgolly.grpc.mod.ServerDuplexStream[js.Any, js.Any])
  type GrpcRequest = js.Any
  type GrpcResponse = js.Any
}
