package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardControl extends js.Object {
  val AllowAdding: Boolean
  val Events: IEvents
  val Hierarchical: Boolean
  val ID: String
  var Label: String
  val Linked: Boolean
  var Modified: Boolean
  var MustExist: Boolean
  val PropertyDef: MFBuiltInPropertyDef | Double
  var ReadOnly: Boolean
  val RealObjectType: Boolean
  val Type: String
  var Value: js.Any
  var ValueRequired: Boolean
  val Valuelist: MFBuiltInValueList | Double
  var Visible: Boolean
  def ActivateLink(valuePart: js.Any): Unit
  def AddNewItem(name: String): js.Any
  def AddNewSubItem(name: String, valueParent: js.Any): js.Any
  def AllowHitHighlighting(): Boolean
  def CanActivateLink(valuePart: js.Any): Boolean
  def CanAddNewSubItem(name: String, valueParent: js.Any): Boolean
  def CanEditItem(value: js.Any): Boolean
  def CreateSelectionList(): IMetadataCardSelectionList
  def CreateUnvalidatedValue(valueString: String): IMetadataCardUnvalidatedValue
  def EditItem(value: js.Any): js.Any
  def FindItem(name: String): js.Any
  def FindItemByID(itemID: Double): js.Any
  def GetSelectableValueItemStates(): js.Any
  def GetValueSuggestions(): js.Any
  def HasAutomaticValue(): Boolean
  def HasInitialValue(): Boolean
  def HasUncalculatedAutomaticValue(): Boolean
  def IsExternal(): Boolean
  def RefreshList(): Unit
  def Remove(): Unit
  def RevertToInitialValue(): Unit
  def SetValueItemState(itemID: String, state: js.Any): Unit
}

object IMetadataCardControl {
  @scala.inline
  def apply(
    ActivateLink: js.Any => Callback,
    AddNewItem: String => CallbackTo[js.Any],
    AddNewSubItem: (String, js.Any) => CallbackTo[js.Any],
    AllowAdding: Boolean,
    AllowHitHighlighting: CallbackTo[Boolean],
    CanActivateLink: js.Any => CallbackTo[Boolean],
    CanAddNewSubItem: (String, js.Any) => CallbackTo[Boolean],
    CanEditItem: js.Any => CallbackTo[Boolean],
    CreateSelectionList: CallbackTo[IMetadataCardSelectionList],
    CreateUnvalidatedValue: String => CallbackTo[IMetadataCardUnvalidatedValue],
    EditItem: js.Any => CallbackTo[js.Any],
    Events: IEvents,
    FindItem: String => CallbackTo[js.Any],
    FindItemByID: Double => CallbackTo[js.Any],
    GetSelectableValueItemStates: CallbackTo[js.Any],
    GetValueSuggestions: CallbackTo[js.Any],
    HasAutomaticValue: CallbackTo[Boolean],
    HasInitialValue: CallbackTo[Boolean],
    HasUncalculatedAutomaticValue: CallbackTo[Boolean],
    Hierarchical: Boolean,
    ID: String,
    IsExternal: CallbackTo[Boolean],
    Label: String,
    Linked: Boolean,
    Modified: Boolean,
    MustExist: Boolean,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ReadOnly: Boolean,
    RealObjectType: Boolean,
    RefreshList: Callback,
    Remove: Callback,
    RevertToInitialValue: Callback,
    SetValueItemState: (String, js.Any) => Callback,
    Type: String,
    Value: js.Any,
    ValueRequired: Boolean,
    Valuelist: MFBuiltInValueList | Double,
    Visible: Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(AllowAdding = AllowAdding.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Linked = Linked.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], MustExist = MustExist.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueRequired = ValueRequired.asInstanceOf[js.Any], Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("ActivateLink")(js.Any.fromFunction1((t0: js.Any) => ActivateLink(t0).runNow()))
    __obj.updateDynamic("AddNewItem")(js.Any.fromFunction1((t0: java.lang.String) => AddNewItem(t0).runNow()))
    __obj.updateDynamic("AddNewSubItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => AddNewSubItem(t0, t1).runNow()))
    __obj.updateDynamic("AllowHitHighlighting")(AllowHitHighlighting.toJsFn)
    __obj.updateDynamic("CanActivateLink")(js.Any.fromFunction1((t0: js.Any) => CanActivateLink(t0).runNow()))
    __obj.updateDynamic("CanAddNewSubItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => CanAddNewSubItem(t0, t1).runNow()))
    __obj.updateDynamic("CanEditItem")(js.Any.fromFunction1((t0: js.Any) => CanEditItem(t0).runNow()))
    __obj.updateDynamic("CreateSelectionList")(CreateSelectionList.toJsFn)
    __obj.updateDynamic("CreateUnvalidatedValue")(js.Any.fromFunction1((t0: java.lang.String) => CreateUnvalidatedValue(t0).runNow()))
    __obj.updateDynamic("EditItem")(js.Any.fromFunction1((t0: js.Any) => EditItem(t0).runNow()))
    __obj.updateDynamic("FindItem")(js.Any.fromFunction1((t0: java.lang.String) => FindItem(t0).runNow()))
    __obj.updateDynamic("FindItemByID")(js.Any.fromFunction1((t0: scala.Double) => FindItemByID(t0).runNow()))
    __obj.updateDynamic("GetSelectableValueItemStates")(GetSelectableValueItemStates.toJsFn)
    __obj.updateDynamic("GetValueSuggestions")(GetValueSuggestions.toJsFn)
    __obj.updateDynamic("HasAutomaticValue")(HasAutomaticValue.toJsFn)
    __obj.updateDynamic("HasInitialValue")(HasInitialValue.toJsFn)
    __obj.updateDynamic("HasUncalculatedAutomaticValue")(HasUncalculatedAutomaticValue.toJsFn)
    __obj.updateDynamic("IsExternal")(IsExternal.toJsFn)
    __obj.updateDynamic("RefreshList")(RefreshList.toJsFn)
    __obj.updateDynamic("Remove")(Remove.toJsFn)
    __obj.updateDynamic("RevertToInitialValue")(RevertToInitialValue.toJsFn)
    __obj.updateDynamic("SetValueItemState")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => SetValueItemState(t0, t1).runNow()))
    __obj.asInstanceOf[IMetadataCardControl]
  }
}

