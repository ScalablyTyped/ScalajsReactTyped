package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import typingsJapgolly.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookup extends js.Object {
  var Deleted: Boolean
  val DisplayID: String
  val DisplayIDAvailable: Boolean
  var DisplayValue: String
  val Hidden: Boolean
  var Item: Double
  var ItemGUID: String
  val ObjectFlags: MFSpecialObjectFlag
  var ObjectType: MFBuiltInObjectType | Double
  var Version: Double
  def Clone(): ILookup
  def CloneFrom(Lookup: ILookup): Unit
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String
}

object ILookup {
  @scala.inline
  def apply(
    Clone: CallbackTo[ILookup],
    CloneFrom: ILookup => Callback,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    DisplayValue: String,
    GetFormattedDisplayValue: (Boolean, Boolean, Boolean) => CallbackTo[String],
    Hidden: Boolean,
    Item: Double,
    ItemGUID: String,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectType: MFBuiltInObjectType | Double,
    Version: Double
  ): ILookup = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILookup) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("GetFormattedDisplayValue")(js.Any.fromFunction3((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean) => GetFormattedDisplayValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ILookup]
  }
}

