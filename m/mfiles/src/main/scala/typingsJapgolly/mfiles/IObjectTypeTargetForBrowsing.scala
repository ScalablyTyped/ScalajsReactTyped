package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetForBrowsing extends js.Object {
  var TargetObjectType: Double
  var ViewCollection: Double
  def Clone(): IObjectTypeTargetForBrowsing
}

object IObjectTypeTargetForBrowsing {
  @scala.inline
  def apply(Clone: CallbackTo[IObjectTypeTargetForBrowsing], TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(TargetObjectType = TargetObjectType.asInstanceOf[js.Any], ViewCollection = ViewCollection.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
}

