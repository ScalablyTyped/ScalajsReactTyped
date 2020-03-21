package typingsJapgolly.googleProtobuf.descriptorPbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[typingsJapgolly.googleProtobuf.descriptorPbMod.EnumOptions.AsObject] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[
    typingsJapgolly.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
  ]
  var valueList: js.Array[typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typingsJapgolly.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
    ],
    valueList: js.Array[typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject],
    name: String = null,
    options: typingsJapgolly.googleProtobuf.descriptorPbMod.EnumOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

