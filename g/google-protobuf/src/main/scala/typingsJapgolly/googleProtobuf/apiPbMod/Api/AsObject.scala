package typingsJapgolly.googleProtobuf.apiPbMod.Api

import typingsJapgolly.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodsList: js.Array[typingsJapgolly.googleProtobuf.apiPbMod.Method.AsObject]
  var mixinsList: js.Array[typingsJapgolly.googleProtobuf.apiPbMod.Mixin.AsObject]
  var name: String
  var optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[typingsJapgolly.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
  var syntax: Syntax
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    methodsList: js.Array[typingsJapgolly.googleProtobuf.apiPbMod.Method.AsObject],
    mixinsList: js.Array[typingsJapgolly.googleProtobuf.apiPbMod.Mixin.AsObject],
    name: String,
    optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax,
    version: String,
    sourceContext: typingsJapgolly.googleProtobuf.sourceContextPbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodsList = methodsList.asInstanceOf[js.Any], mixinsList = mixinsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

