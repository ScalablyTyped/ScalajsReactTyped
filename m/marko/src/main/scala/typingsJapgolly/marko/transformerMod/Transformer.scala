package typingsJapgolly.marko.transformerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.marko.tagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  var id: Double
  var name: String | Null
  var path: String | Null
  var priority: js.Any
  var properties: js.Any
  var tag: ^  | Null
  var taglibId: String
  def getFunc(): js.Any
}

object Transformer {
  @scala.inline
  def apply(
    getFunc: CallbackTo[js.Any],
    id: Double,
    priority: js.Any,
    properties: js.Any,
    taglibId: String,
    name: String = null,
    path: String = null,
    tag: ^ = null
  ): Transformer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], taglibId = taglibId.asInstanceOf[js.Any])
    __obj.updateDynamic("getFunc")(getFunc.toJsFn)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer]
  }
}

