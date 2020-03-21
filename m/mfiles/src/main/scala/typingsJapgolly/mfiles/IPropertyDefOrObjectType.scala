package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefOrObjectType extends js.Object {
  var ID: Double
  var PropertyDef: Boolean
  def Clone(): IPropertyDefOrObjectType
  def GetAsExpression(): IExpression
}

object IPropertyDefOrObjectType {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyDefOrObjectType],
    GetAsExpression: CallbackTo[IExpression],
    ID: Double,
    PropertyDef: Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAsExpression")(GetAsExpression.toJsFn)
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
}

