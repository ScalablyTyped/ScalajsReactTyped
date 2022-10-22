package typingsJapgolly.protocPlugin

import typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: SimplePluginCallback): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("protoc-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CodeGeneratorRequest(): js.Promise[
    typingsJapgolly.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorRequest
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorRequest")().asInstanceOf[js.Promise[
    typingsJapgolly.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorRequest
  ]]
  inline def CodeGeneratorRequest(stdin: Readable): js.Promise[
    typingsJapgolly.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorRequest
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorRequest")(stdin.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typingsJapgolly.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorRequest
  ]]
  
  inline def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorResponse")().asInstanceOf[js.Function1[/* files */ OutputFiles, Unit]]
  inline def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorResponse")(stdout.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* files */ OutputFiles, Unit]]
  
  inline def CodeGeneratorResponseError(): js.Function1[/* err */ js.Error, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorResponseError")().asInstanceOf[js.Function1[/* err */ js.Error, Unit]]
  inline def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ js.Error, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("CodeGeneratorResponseError")(stdout.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ js.Error, Unit]]
  
  inline def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findCommentByPath")(path.asInstanceOf[js.Any], locationList.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type OutputFiles = js.Array[
    typingsJapgolly.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject
  ]
  
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto.AsObject
    ], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}
