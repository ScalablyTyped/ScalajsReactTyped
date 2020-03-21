package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDef extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double
  var Required: Boolean
  def Clone(): IAssociatedPropertyDef
}

object IAssociatedPropertyDef {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAssociatedPropertyDef],
    PropertyDef: MFBuiltInPropertyDef | Double,
    Required: Boolean
  ): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
}

