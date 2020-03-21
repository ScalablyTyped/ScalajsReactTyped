package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSet extends js.Object {
  val ID: Double
  val Name: String
  def Clone(): IDataSet
}

object IDataSet {
  @scala.inline
  def apply(Clone: CallbackTo[IDataSet], ID: Double, Name: String): IDataSet = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IDataSet]
  }
}

