package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMapping extends js.Object {
  var ObjectType: MFBuiltInObjectType | Double
  var Ordinal: Double
  var PartOfInsert: Boolean
  var PartOfUpdate: Boolean
  var SourceField: String
  var TargetPropertyDef: Double
  var Type: Double
  def Clone(): IObjectTypeColumnMapping
}

object IObjectTypeColumnMapping {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjectTypeColumnMapping],
    ObjectType: MFBuiltInObjectType | Double,
    Ordinal: Double,
    PartOfInsert: Boolean,
    PartOfUpdate: Boolean,
    SourceField: String,
    TargetPropertyDef: Double,
    Type: Double
  ): IObjectTypeColumnMapping = {
    val __obj = js.Dynamic.literal(ObjectType = ObjectType.asInstanceOf[js.Any], Ordinal = Ordinal.asInstanceOf[js.Any], PartOfInsert = PartOfInsert.asInstanceOf[js.Any], PartOfUpdate = PartOfUpdate.asInstanceOf[js.Any], SourceField = SourceField.asInstanceOf[js.Any], TargetPropertyDef = TargetPropertyDef.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IObjectTypeColumnMapping]
  }
}

