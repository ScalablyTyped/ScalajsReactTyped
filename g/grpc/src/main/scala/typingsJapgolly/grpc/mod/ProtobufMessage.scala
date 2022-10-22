package typingsJapgolly.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtobufMessage
  extends StObject
     with /* field */ StringDictionary[Any] {
  
  @JSName("$add")
  def $add(key: String, value: Any): ProtobufMessage = js.native
  @JSName("$add")
  def $add(key: String, value: Any, noAssert: Boolean): ProtobufMessage = js.native
  
  @JSName("$get")
  def $get[T](key: String): T = js.native
  
  @JSName("$set")
  def $set(key: String): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Any): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Any, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Boolean, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Unit, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any]): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any], value: Any): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any], value: Any, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any], value: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any], value: Boolean, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[Any], value: Unit, noAssert: Boolean): Unit = js.native
  
  def add(key: String, value: Any): ProtobufMessage = js.native
  def add(key: String, value: Any, noAssert: Boolean): ProtobufMessage = js.native
  
  def calculate(): Double = js.native
  
  def encode(): Any = js.native
  def encode(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any
  ): Any = js.native
  def encode(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any,
    noVerify: Boolean
  ): Any = js.native
  def encode(buffer: Boolean): Any = js.native
  def encode(buffer: Boolean, noVerify: Boolean): Any = js.native
  def encode(buffer: Unit, noVerify: Boolean): Any = js.native
  
  def encode64(): String = js.native
  
  def encodeAB(): js.typedarray.ArrayBuffer = js.native
  
  def encodeDelimited(): Any = js.native
  def encodeDelimited(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any
  ): Any = js.native
  def encodeDelimited(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any,
    noVerify: Boolean
  ): Any = js.native
  def encodeDelimited(buffer: Boolean): Any = js.native
  def encodeDelimited(buffer: Boolean, noVerify: Boolean): Any = js.native
  def encodeDelimited(buffer: Unit, noVerify: Boolean): Any = js.native
  
  def encodeHex(): String = js.native
  
  def encodeJSON(): String = js.native
  
  def encodeNB(): Buffer = js.native
  
  def get[T](key: String): T = js.native
  def get[T](key: String, noAssert: Boolean): T = js.native
  
  def set(key: String): Unit = js.native
  def set(key: String, value: Any): Unit = js.native
  def set(key: String, value: Any, noAssert: Boolean): Unit = js.native
  def set(key: String, value: Boolean): Unit = js.native
  def set(key: String, value: Boolean, noAssert: Boolean): Unit = js.native
  def set(key: String, value: Unit, noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[Any]): Unit = js.native
  def set(key: StringDictionary[Any], value: Any): Unit = js.native
  def set(key: StringDictionary[Any], value: Any, noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[Any], value: Boolean): Unit = js.native
  def set(key: StringDictionary[Any], value: Boolean, noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[Any], value: Unit, noAssert: Boolean): Unit = js.native
  
  def toArrayBuffer(): js.typedarray.ArrayBuffer = js.native
  
  def toBase64(): String = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toHex(): String = js.native
  
  def toRaw(): StringDictionary[Any] = js.native
  def toRaw(binaryAsBase64: Boolean): StringDictionary[Any] = js.native
  def toRaw(binaryAsBase64: Boolean, longsAsStrings: Boolean): StringDictionary[Any] = js.native
  def toRaw(binaryAsBase64: Unit, longsAsStrings: Boolean): StringDictionary[Any] = js.native
}
