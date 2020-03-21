package typingsJapgolly.msRest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.msRest.mod.Mapper
import typingsJapgolly.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.undefined
  var name: MapperType
}

object AnonClassName {
  @scala.inline
  def apply(className: String, name: MapperType, modelProperties: StringDictionary[Mapper] = null): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (modelProperties != null) __obj.updateDynamic("modelProperties")(modelProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

