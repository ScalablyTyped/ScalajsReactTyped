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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDef extends StObject {
  
  var AccessControlList: IAccessControlList
  
  var AllObjectTypes: Boolean
  
  var AllowedAsGroupingLevel: Boolean
  
  var AutomaticValueDefinition: ITypedValue
  
  var AutomaticValueType: MFAutomaticValueType
  
  var BasedOnValueList: Boolean
  
  def Clone(): IPropertyDef
  
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
}
object IPropertyDef {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllObjectTypes = AllObjectTypes.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], AutomaticValueDefinition = AutomaticValueDefinition.asInstanceOf[js.Any], AutomaticValueType = AutomaticValueType.asInstanceOf[js.Any], BasedOnValueList = BasedOnValueList.asInstanceOf[js.Any], Clone = Clone.toJsFn, ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DependencyPD = DependencyPD.asInstanceOf[js.Any], DependencyRelation = DependencyRelation.asInstanceOf[js.Any], FormattingType = FormattingType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StaticFilter = StaticFilter.asInstanceOf[js.Any], ThisIsConflictPD = ThisIsConflictPD.asInstanceOf[js.Any], ThisIsDefaultPD = ThisIsDefaultPD.asInstanceOf[js.Any], ThisIsOwnerPD = ThisIsOwnerPD.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any], ValidationType = ValidationType.asInstanceOf[js.Any], ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDef]
  }
  
  extension [Self <: IPropertyDef](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAllObjectTypes(value: Boolean): Self = StObject.set(x, "AllObjectTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedAsGroupingLevel(value: Boolean): Self = StObject.set(x, "AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    
    inline def setAutomaticValueDefinition(value: ITypedValue): Self = StObject.set(x, "AutomaticValueDefinition", value.asInstanceOf[js.Any])
    
    inline def setAutomaticValueType(value: MFAutomaticValueType): Self = StObject.set(x, "AutomaticValueType", value.asInstanceOf[js.Any])
    
    inline def setBasedOnValueList(value: Boolean): Self = StObject.set(x, "BasedOnValueList", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IPropertyDef]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setContentType(value: MFContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDependencyPD(value: Double): Self = StObject.set(x, "DependencyPD", value.asInstanceOf[js.Any])
    
    inline def setDependencyRelation(value: MFDependencyRelation): Self = StObject.set(x, "DependencyRelation", value.asInstanceOf[js.Any])
    
    inline def setFormattingType(value: MFFormattingType): Self = StObject.set(x, "FormattingType", value.asInstanceOf[js.Any])
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setOwnerPropertyDef(value: IOwnerPropertyDef): Self = StObject.set(x, "OwnerPropertyDef", value.asInstanceOf[js.Any])
    
    inline def setPredefined(value: Boolean): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    inline def setStaticFilter(value: ISearchConditions): Self = StObject.set(x, "StaticFilter", value.asInstanceOf[js.Any])
    
    inline def setThisIsConflictPD(value: Boolean): Self = StObject.set(x, "ThisIsConflictPD", value.asInstanceOf[js.Any])
    
    inline def setThisIsDefaultPD(value: Boolean): Self = StObject.set(x, "ThisIsDefaultPD", value.asInstanceOf[js.Any])
    
    inline def setThisIsOwnerPD(value: Boolean): Self = StObject.set(x, "ThisIsOwnerPD", value.asInstanceOf[js.Any])
    
    inline def setUpdateType(value: MFUpdateType): Self = StObject.set(x, "UpdateType", value.asInstanceOf[js.Any])
    
    inline def setValidationType(value: MFValidationType): Self = StObject.set(x, "ValidationType", value.asInstanceOf[js.Any])
    
    inline def setValueList(value: MFBuiltInValueList | Double): Self = StObject.set(x, "ValueList", value.asInstanceOf[js.Any])
    
    inline def setValueListSortingType(value: MFValueListSortingType): Self = StObject.set(x, "ValueListSortingType", value.asInstanceOf[js.Any])
  }
}
