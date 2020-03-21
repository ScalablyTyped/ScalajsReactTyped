package typingsJapgolly.openapiFramework.basePathMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openapiFramework.AnonEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePath extends js.Object {
  val path: String
  val variables: StringDictionary[AnonEnum]
  def hasVariables(): Boolean
}

object BasePath {
  @scala.inline
  def apply(hasVariables: CallbackTo[Boolean], path: String, variables: StringDictionary[AnonEnum]): BasePath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("hasVariables")(hasVariables.toJsFn)
    __obj.asInstanceOf[BasePath]
  }
}

