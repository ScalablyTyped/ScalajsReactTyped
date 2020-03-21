package typingsJapgolly.awsSdkMiddlewareSerializer

import typingsJapgolly.awsSdkTypes.marshallerMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.middlewareMod.SerializeMiddleware
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-serializer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream]]): SerializeMiddleware[Input, Output, Stream] = js.native
}

