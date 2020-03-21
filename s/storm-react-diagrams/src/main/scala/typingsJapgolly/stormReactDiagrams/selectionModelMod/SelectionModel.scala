package typingsJapgolly.stormReactDiagrams.selectionModelMod

import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionModel extends js.Object {
  var initialX: Double
  var initialY: Double
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object SelectionModel {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
  ): SelectionModel = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionModel]
  }
}

