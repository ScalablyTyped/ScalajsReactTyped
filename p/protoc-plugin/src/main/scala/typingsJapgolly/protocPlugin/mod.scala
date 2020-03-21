package typingsJapgolly.protocPlugin

import typingsJapgolly.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ js.Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ js.Error, Unit] = js.native
  def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = js.native
  type OutputFiles = js.Array[typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[typingsJapgolly.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}

