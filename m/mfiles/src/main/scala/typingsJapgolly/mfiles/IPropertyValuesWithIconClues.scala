package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconClues extends js.Object {
  val IconClues: IPropertyValueIconClues
  val ObjVer: IObjVer
  val PropertyValues: IPropertyValues
  def Clone(): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconClues {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValuesWithIconClues],
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(IconClues = IconClues.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
}

