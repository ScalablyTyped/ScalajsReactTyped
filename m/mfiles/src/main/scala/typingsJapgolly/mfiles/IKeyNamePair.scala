package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNamePair extends js.Object {
  val Key: Double
  val Name: String
  def Clone(): IKeyNamePair
}

object IKeyNamePair {
  @scala.inline
  def apply(Clone: CallbackTo[IKeyNamePair], Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IKeyNamePair]
  }
}

