package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClue extends js.Object {
  val PropertyDef: MFBuiltInPropertyDef | Double
  val ValueListItem: Double
  def Clone(): IPropertyValueIconClue
}

object IPropertyValueIconClue {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValueIconClue],
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
}

