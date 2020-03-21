package typingsJapgolly.openapiFramework.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkAPIContext extends js.Object {
  var basePaths: js.Array[default]
  def getApiDoc(): js.Any
}

object OpenAPIFrameworkAPIContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: CallbackTo[js.Any]): OpenAPIFrameworkAPIContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any])
    __obj.updateDynamic("getApiDoc")(getApiDoc.toJsFn)
    __obj.asInstanceOf[OpenAPIFrameworkAPIContext]
  }
}

