package typingsJapgolly.googleProtobuf

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.FieldValue
import typingsJapgolly.googleProtobuf.mod.Map
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.googleProtobuf.mod.Message.MessageArray
import typingsJapgolly.googleProtobuf.mod.Message.StaticToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMessage extends Instantiable0[Message] {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any): Unit = js.native
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any, index: Double): Unit = js.native
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: AnonInstantiable[T]): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: AnonInstantiable[T], index: Double): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.UndefOr[scala.Nothing], ctor: AnonInstantiable[T]): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](
    msg: Message,
    fieldNumber: Double,
    value: js.UndefOr[scala.Nothing],
    ctor: AnonInstantiable[T],
    index: Double
  ): T = js.native
  def bytesAsB64(bytes: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def bytesAsU8(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def bytesListAsB64(bytesList: js.Array[scala.scalajs.js.typedarray.Uint8Array]): js.Array[String] = js.native
  def bytesListAsU8(strList: js.Array[String]): js.Array[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def clone[T /* <: Message */](msg: T): T = js.native
  def cloneMessage[T /* <: Message */](msg: T): T = js.native
  def compareExtensions(extension1: js.Object, extension2: js.Object): Boolean = js.native
  def compareFields(field1: js.Any, field2: js.Any): Boolean = js.native
  def computeOneofCase(msg: Message, oneof: js.Array[Double]): Double = js.native
  def copyInto(fromMessage: Message, toMessage: Message): Unit = js.native
  // These are `abstract static`, but that isn't allowed. Subclasses of Message will have these methods and properties
  // and not having them on Message makes using this class for its intended purpose quite difficult.
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): Message = js.native
  def deserializeBinaryFromReader(message: Message, reader: BinaryReader): Message = js.native
  def difference[T /* <: Message */](m1: T, m2: T): T = js.native
  def equals(m1: Message, m2: Message): Boolean = js.native
  def getField(msg: Message, fieldNumber: Double): FieldValue | Null = js.native
  def getFieldWithDefault[T](msg: Message, fieldNumber: Double, defaultValue: T): T = js.native
  def getMapField(
    msg: Message,
    fieldNumber: Double,
    noLazyCreate: Boolean,
    valueCtor: /* import warning: importer.ImportType#apply Failed type conversion: typeof Message */ js.Any
  ): Map[_, _] = js.native
  def getOptionalFloatingPointField(msg: Message, fieldNumber: Double): js.UndefOr[Double] = js.native
  def getRepeatedFloatingPointField(msg: Message, fieldNumber: Double): js.Array[Double] = js.native
  def getRepeatedWrapperField[T /* <: Message */](msg: Message, ctor: AnonInstantiable[T], fieldNumber: Double): js.Array[T] = js.native
  def getWrapperField[T /* <: Message */](msg: Message, ctor: AnonInstantiable[T], fieldNumber: Double): T = js.native
  def getWrapperField[T /* <: Message */](msg: Message, ctor: AnonInstantiable[T], fieldNumber: Double, required: Double): T = js.native
  def initialize(msg: Message, data: MessageArray, messageId: String, suggestedPivot: Double): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  def initialize(msg: Message, data: MessageArray, messageId: Double, suggestedPivot: Double): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  def registerMessageType(
    id: Double,
    constructor: /* import warning: importer.ImportType#apply Failed type conversion: typeof Message */ js.Any
  ): Unit = js.native
  def serializeBinaryToWriter(message: Message, writer: BinaryWriter): Unit = js.native
  def setField(msg: Message, fieldNumber: Double, value: FieldValue): Unit = js.native
  def setOneofField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: FieldValue): Unit = js.native
  def setOneofWrapperField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: js.Any): Unit = js.native
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = js.native
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.Array[T]): Unit = js.native
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = js.native
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T): Unit = js.native
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Map[_, _]): Unit = js.native
  def toMap(field: js.Array[_], mapKeyGetterFn: js.Function1[/* field */ js.Any, String]): Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject
  ): Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject,
    includeInstance: Boolean
  ): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Message): js.Object = js.native
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type]
  ): Unit = js.native
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type],
    includeInstance: Boolean
  ): Unit = js.native
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object]
  ): js.Array[js.Object] = js.native
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object],
    includeInstance: Boolean
  ): js.Array[js.Object] = js.native
}

