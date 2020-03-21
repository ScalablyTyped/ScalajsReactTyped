package typingsJapgolly.stormReactDiagrams

import org.scalajs.dom.raw.Element
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: Element
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object AnonElement {
  @scala.inline
  def apply(element: Element, model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElement]
  }
}

