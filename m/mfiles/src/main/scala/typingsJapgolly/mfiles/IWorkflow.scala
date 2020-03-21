package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInDocumentClass
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflow extends js.Object {
  var ID: Double
  var Name: String
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  def Clone(): IWorkflow
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IWorkflow {
  @scala.inline
  def apply(
    Clone: CallbackTo[IWorkflow],
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectClass = ObjectClass.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAsLookup")(GetAsLookup.toJsFn)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue.toJsFn)
    __obj.asInstanceOf[IWorkflow]
  }
}

