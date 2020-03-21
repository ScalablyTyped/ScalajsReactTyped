package typingsJapgolly.openapiFramework.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkPathContext extends js.Object {
  var basePaths: js.Array[default]
  def getApiDoc(): js.Any
  def getPathDoc(): js.Any
}

object OpenAPIFrameworkPathContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: CallbackTo[js.Any], getPathDoc: CallbackTo[js.Any]): OpenAPIFrameworkPathContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any])
    __obj.updateDynamic("getApiDoc")(getApiDoc.toJsFn)
    __obj.updateDynamic("getPathDoc")(getPathDoc.toJsFn)
    __obj.asInstanceOf[OpenAPIFrameworkPathContext]
  }
}

