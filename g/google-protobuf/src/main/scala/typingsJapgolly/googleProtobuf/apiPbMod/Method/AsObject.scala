package typingsJapgolly.googleProtobuf.apiPbMod.Method

import typingsJapgolly.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject]
  var requestStreaming: Boolean
  var requestTypeUrl: String
  var responseStreaming: Boolean
  var responseTypeUrl: String
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    optionsList: js.Array[typingsJapgolly.googleProtobuf.typePbMod.Option.AsObject],
    requestStreaming: Boolean,
    requestTypeUrl: String,
    responseStreaming: Boolean,
    responseTypeUrl: String,
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], requestStreaming = requestStreaming.asInstanceOf[js.Any], requestTypeUrl = requestTypeUrl.asInstanceOf[js.Any], responseStreaming = responseStreaming.asInstanceOf[js.Any], responseTypeUrl = responseTypeUrl.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

