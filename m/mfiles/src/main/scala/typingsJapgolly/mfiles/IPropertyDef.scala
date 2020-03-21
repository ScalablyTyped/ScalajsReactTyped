package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAutomaticValueType
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import typingsJapgolly.mfiles.MFiles.MFBuiltInValueList
import typingsJapgolly.mfiles.MFiles.MFContentType
import typingsJapgolly.mfiles.MFiles.MFDataType
import typingsJapgolly.mfiles.MFiles.MFDependencyRelation
import typingsJapgolly.mfiles.MFiles.MFFormattingType
import typingsJapgolly.mfiles.MFiles.MFUpdateType
import typingsJapgolly.mfiles.MFiles.MFValidationType
import typingsJapgolly.mfiles.MFiles.MFValueListSortingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDef extends js.Object {
  var AccessControlList: IAccessControlList
  var AllObjectTypes: Boolean
  var AllowedAsGroupingLevel: Boolean
  var AutomaticValueDefinition: ITypedValue
  var AutomaticValueType: MFAutomaticValueType
  var BasedOnValueList: Boolean
  var ContentType: MFContentType
  var DataType: MFDataType
  var DependencyPD: Double
  var DependencyRelation: MFDependencyRelation
  var FormattingType: MFFormattingType
  val GUID: String
  var ID: Double
  var Name: String
  var ObjectType: MFBuiltInObjectType | Double
  var OwnerPropertyDef: IOwnerPropertyDef
  var Predefined: Boolean
  var SortAscending: Boolean
  var StaticFilter: ISearchConditions
  val ThisIsConflictPD: Boolean
  val ThisIsDefaultPD: Boolean
  val ThisIsOwnerPD: Boolean
  var UpdateType: MFUpdateType
  var ValidationType: MFValidationType
  var ValueList: MFBuiltInValueList | Double
  var ValueListSortingType: MFValueListSortingType
  def Clone(): IPropertyDef
}

object IPropertyDef {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllObjectTypes: Boolean,
    AllowedAsGroupingLevel: Boolean,
    AutomaticValueDefinition: ITypedValue,
    AutomaticValueType: MFAutomaticValueType,
    BasedOnValueList: Boolean,
    Clone: CallbackTo[IPropertyDef],
    ContentType: MFContentType,
    DataType: MFDataType,
    DependencyPD: Double,
    DependencyRelation: MFDependencyRelation,
    FormattingType: MFFormattingType,
    GUID: String,
    ID: Double,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    OwnerPropertyDef: IOwnerPropertyDef,
    Predefined: Boolean,
    SortAscending: Boolean,
    StaticFilter: ISearchConditions,
    ThisIsConflictPD: Boolean,
    ThisIsDefaultPD: Boolean,
    ThisIsOwnerPD: Boolean,
    UpdateType: MFUpdateType,
    ValidationType: MFValidationType,
    ValueList: MFBuiltInValueList | Double,
    ValueListSortingType: MFValueListSortingType
  ): IPropertyDef = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllObjectTypes = AllObjectTypes.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], AutomaticValueDefinition = AutomaticValueDefinition.asInstanceOf[js.Any], AutomaticValueType = AutomaticValueType.asInstanceOf[js.Any], BasedOnValueList = BasedOnValueList.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DependencyPD = DependencyPD.asInstanceOf[js.Any], DependencyRelation = DependencyRelation.asInstanceOf[js.Any], FormattingType = FormattingType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StaticFilter = StaticFilter.asInstanceOf[js.Any], ThisIsConflictPD = ThisIsConflictPD.asInstanceOf[js.Any], ThisIsDefaultPD = ThisIsDefaultPD.asInstanceOf[js.Any], ThisIsOwnerPD = ThisIsOwnerPD.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any], ValidationType = ValidationType.asInstanceOf[js.Any], ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IPropertyDef]
  }
}

