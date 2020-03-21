package typingsJapgolly.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a model within a model.
  */
trait IRefModelInModel extends js.Object {
  var childId: String
  var childModel: IModel
  var parentModel: IModel
}

object IRefModelInModel {
  @scala.inline
  def apply(childId: String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRefModelInModel]
  }
}

