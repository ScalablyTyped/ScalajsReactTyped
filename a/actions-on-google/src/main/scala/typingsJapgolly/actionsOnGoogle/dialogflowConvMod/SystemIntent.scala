package typingsJapgolly.actionsOnGoogle.dialogflowConvMod

import typingsJapgolly.actionsOnGoogle.ProtoAnystringJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemIntent extends js.Object {
  var data: ProtoAnystringJsonObject
  var intent: String
}

object SystemIntent {
  @scala.inline
  def apply(data: ProtoAnystringJsonObject, intent: String): SystemIntent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemIntent]
  }
}

