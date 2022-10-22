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
trait TypeofprotobufMinimalBufferReader extends StObject {
  
  var BufferReader: Instantiable1[/* buffer */ Buffer, typingsJapgolly.googleGax.mod.protobufMinimal.BufferReader] = js.native
  
  var BufferWriter: TypeofBufferWriterInstantiableAlloc = js.native
  
  var Enum: TypeofEnumInstantiableFromJSON = js.native
  
  var Field: TypeofFieldFromJSON = js.native
  
  var FieldBase: Instantiable3[
    /* name */ String, 
    /* id */ Double, 
    /* type */ String, 
    typingsJapgolly.googleGax.mod.protobufMinimal.FieldBase
  ] = js.native
  
  var MapField: TypeofMapFieldFromJSON = js.native
  
  var Message: TypeofMessageDecode = js.native
  
  var Method: TypeofMethodInstantiableFromJSON = js.native
  
  var Namespace: TypeofNamespaceFromJSON = js.native
  
  var NamespaceBase: Instantiable0[typingsJapgolly.googleGax.mod.protobufMinimal.NamespaceBase] = js.native
  
  var OneOf: TypeofOneOfFromJSON = js.native
  
  var Reader: TypeofReaderInstantiableCreate = js.native
  
  var ReflectionObject: Instantiable0[typingsJapgolly.googleGax.mod.protobufMinimal.ReflectionObject] = js.native
  
  var Root: TypeofRootInstantiableFromJSON = js.native
  
  var Service: TypeofServiceInstantiableFromJSON = js.native
  
  var Type: TypeofTypeFromJSON = js.native
  
  var Writer: TypeofWriterCreate = js.native
  
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
  
  val rpc: Typeofrpc1 = js.native
  
  val tokenize: Typeoftokenize = js.native
  
  val types: Typeoftypes = js.native
  
  val util: TypeofutilBase64 = js.native
  
  def verifier(mtype: Type): Codegen = js.native
  
  val wrappers: Any = js.native
}
