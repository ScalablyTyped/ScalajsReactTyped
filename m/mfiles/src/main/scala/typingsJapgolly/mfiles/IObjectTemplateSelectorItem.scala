package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelectorItem extends js.Object {
  def GetClassID(): Double
  def GetClassName(): String
  def GetGroupID(): Double
  def GetGroupName(): String
  def GetID(): String
  def GetIconURL(): String
  def GetName(): String
  def GetTemplateID(): Double
  def IsBlankItem(): Boolean
  def IsDefaultTemplateForClass(): Boolean
}

object IObjectTemplateSelectorItem {
  @scala.inline
  def apply(
    GetClassID: CallbackTo[Double],
    GetClassName: CallbackTo[String],
    GetGroupID: CallbackTo[Double],
    GetGroupName: CallbackTo[String],
    GetID: CallbackTo[String],
    GetIconURL: CallbackTo[String],
    GetName: CallbackTo[String],
    GetTemplateID: CallbackTo[Double],
    IsBlankItem: CallbackTo[Boolean],
    IsDefaultTemplateForClass: CallbackTo[Boolean]
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetClassID")(GetClassID.toJsFn)
    __obj.updateDynamic("GetClassName")(GetClassName.toJsFn)
    __obj.updateDynamic("GetGroupID")(GetGroupID.toJsFn)
    __obj.updateDynamic("GetGroupName")(GetGroupName.toJsFn)
    __obj.updateDynamic("GetID")(GetID.toJsFn)
    __obj.updateDynamic("GetIconURL")(GetIconURL.toJsFn)
    __obj.updateDynamic("GetName")(GetName.toJsFn)
    __obj.updateDynamic("GetTemplateID")(GetTemplateID.toJsFn)
    __obj.updateDynamic("IsBlankItem")(IsBlankItem.toJsFn)
    __obj.updateDynamic("IsDefaultTemplateForClass")(IsDefaultTemplateForClass.toJsFn)
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
}

