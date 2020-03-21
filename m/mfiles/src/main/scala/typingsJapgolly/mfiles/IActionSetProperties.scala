package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetProperties extends js.Object {
  var Properties: IDefaultProperties
  def Clone(): IActionSetProperties
}

object IActionSetProperties {
  @scala.inline
  def apply(Clone: CallbackTo[IActionSetProperties], Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IActionSetProperties]
  }
}

