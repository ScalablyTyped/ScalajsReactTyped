package typingsJapgolly.googleProtobuf.descriptorPbMod

import typingsJapgolly.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto_ () extends Message {
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  def addReservedRange(): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange, index: Double): EnumReservedRange = js.native
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto, index: Double): EnumValueDescriptorProto = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearReservedNameList(): Unit = js.native
  def clearReservedRangeList(): Unit = js.native
  def clearValueList(): Unit = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[EnumOptions] = js.native
  def getReservedNameList(): js.Array[String] = js.native
  def getReservedRangeList(): js.Array[EnumReservedRange] = js.native
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: EnumOptions): Unit = js.native
  def setReservedNameList(value: js.Array[String]): Unit = js.native
  def setReservedRangeList(value: js.Array[EnumReservedRange]): Unit = js.native
  def setValueList(value: js.Array[EnumValueDescriptorProto]): Unit = js.native
}

