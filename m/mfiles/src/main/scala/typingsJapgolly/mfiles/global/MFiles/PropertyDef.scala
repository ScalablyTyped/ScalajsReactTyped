package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IOwnerPropertyDef
import typingsJapgolly.mfiles.IPropertyDef
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.ITypedValue
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

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyDef")
@js.native
open class PropertyDef ()
  extends StObject
     with IPropertyDef {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  var AllObjectTypes: Boolean = js.native
  
  /* CompleteClass */
  var AllowedAsGroupingLevel: Boolean = js.native
  
  /* CompleteClass */
  var AutomaticValueDefinition: ITypedValue = js.native
  
  /* CompleteClass */
  var AutomaticValueType: MFAutomaticValueType = js.native
  
  /* CompleteClass */
  var BasedOnValueList: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IPropertyDef = js.native
  
  /* CompleteClass */
  var ContentType: MFContentType = js.native
  
  /* CompleteClass */
  var DataType: MFDataType = js.native
  
  /* CompleteClass */
  var DependencyPD: Double = js.native
  
  /* CompleteClass */
  var DependencyRelation: MFDependencyRelation = js.native
  
  /* CompleteClass */
  var FormattingType: MFFormattingType = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var OwnerPropertyDef: IOwnerPropertyDef = js.native
  
  /* CompleteClass */
  var Predefined: Boolean = js.native
  
  /* CompleteClass */
  var SortAscending: Boolean = js.native
  
  /* CompleteClass */
  var StaticFilter: ISearchConditions = js.native
  
  /* CompleteClass */
  override val ThisIsConflictPD: Boolean = js.native
  
  /* CompleteClass */
  override val ThisIsDefaultPD: Boolean = js.native
  
  /* CompleteClass */
  override val ThisIsOwnerPD: Boolean = js.native
  
  /* CompleteClass */
  var UpdateType: MFUpdateType = js.native
  
  /* CompleteClass */
  var ValidationType: MFValidationType = js.native
  
  /* CompleteClass */
  var ValueList: MFBuiltInValueList | Double = js.native
  
  /* CompleteClass */
  var ValueListSortingType: MFValueListSortingType = js.native
}
