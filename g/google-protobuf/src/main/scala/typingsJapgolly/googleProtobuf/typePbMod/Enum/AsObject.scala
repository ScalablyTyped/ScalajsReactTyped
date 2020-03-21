package typingsJapgolly.googleProtobuf.typePbMod.Enum

import typingsJapgolly.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumvalueList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.EnumValue.AsObject]
  var name: String
  var optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[typingsJapgolly.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.EnumValue.AsObject],
    name: String,
    optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax,
    sourceContext: typingsJapgolly.googleProtobuf.sourceContextPbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumvalueList = enumvalueList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

