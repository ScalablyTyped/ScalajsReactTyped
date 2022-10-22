package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.protobufjs.mod.Buffer
import typingsJapgolly.protobufjs.mod.Codegen
import typingsJapgolly.protobufjs.mod.IParseOptions
import typingsJapgolly.protobufjs.mod.IParserResult
import typingsJapgolly.protobufjs.mod.LoadCallback
import typingsJapgolly.protobufjs.mod.Root
import typingsJapgolly.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofprotobufBufferReader extends StObject {
  
  var BufferReader: Instantiable1[/* buffer */ Buffer, typingsJapgolly.googleGax.mod.protobuf.BufferReader] = js.native
  
  var BufferWriter: TypeofBufferWriterAlloc = js.native
  
  var Enum: TypeofEnumFromJSON = js.native
  
  var Field: TypeofFieldD = js.native
  
  var FieldBase: Instantiable3[
    /* name */ String, 
    /* id */ Double, 
    /* type */ String, 
    typingsJapgolly.googleGax.mod.protobuf.FieldBase
  ] = js.native
  
  var MapField: TypeofMapFieldD = js.native
  
  var Message: TypeofMessageCreate = js.native
  
  var Method: TypeofMethodFromJSON = js.native
  
  var Namespace: TypeofNamespaceArrayToJSON = js.native
  
  var NamespaceBase: Instantiable0[typingsJapgolly.googleGax.mod.protobuf.NamespaceBase] = js.native
  
  var OneOf: TypeofOneOfD = js.native
  
  var Reader: TypeofReaderCreate = js.native
  
  var ReflectionObject: Instantiable0[typingsJapgolly.googleGax.mod.protobuf.ReflectionObject] = js.native
  
  var Root: TypeofRootFromJSON = js.native
  
  var Service: TypeofServiceFromJSON = js.native
  
  var Type: TypeofTypeD = js.native
  
  var Writer: TypeofWriterAlloc = js.native
  
  val build: String = js.native
  
  val common: Typeofcommon = js.native
  
  def configure(): Unit = js.native
  
  val converter: Typeofconverter = js.native
  
  def decoder(mtype: Type): Codegen = js.native
  
  def encoder(mtype: Type): Codegen = js.native
  
  def load(filename: String): js.Promise[Root] = js.native
  def load(filename: String, callback: LoadCallback): Unit = js.native
  def load(filename: String, root: Root): js.Promise[Root] = js.native
  def load(filename: String, root: Root, callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String]): js.Promise[Root] = js.native
  def load(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String], root: Root): js.Promise[Root] = js.native
  def load(filename: js.Array[String], root: Root, callback: LoadCallback): Unit = js.native
  
  def loadSync(filename: String): Root = js.native
  def loadSync(filename: String, root: Root): Root = js.native
  def loadSync(filename: js.Array[String]): Root = js.native
  def loadSync(filename: js.Array[String], root: Root): Root = js.native
  
  def parse(source: String): IParserResult = js.native
  def parse(source: String, options: IParseOptions): IParserResult = js.native
  def parse(source: String, root: Root): IParserResult = js.native
  def parse(source: String, root: Root, options: IParseOptions): IParserResult = js.native
  
  val roots: Any = js.native
  
  val rpc: Typeofrpc0 = js.native
  
  val tokenize: Typeoftokenize = js.native
  
  val types: Typeoftypes = js.native
  
  val util: TypeofutilAsPromise = js.native
  
  def verifier(mtype: Type): Codegen = js.native
  
  val wrappers: Any = js.native
}
