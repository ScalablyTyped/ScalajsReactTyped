package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardModel extends StObject {
  
  def AddProperty(propertyDefId: Double): Unit = js.native
  def AddProperty(propertyDefId: MFBuiltInPropertyDef): Unit = js.native
  
  val CheckedOutTo: IMetadataCardControl = js.native
  
  val ClassSelector: IMetadataCardControl = js.native
  
  val Comment: IMetadataCardControl = js.native
  
  val DataModels: ICollection = js.native
  
  val Events: IEvents = js.native
  
  def GetCommentVersionHistory(): Any = js.native
  
  def GetError(): Any = js.native
  
  def GetIconOverlayHint(): String = js.native
  
  def GetObjectSourceFiles(): Any = js.native
  
  def GetObjectTemplateDescription(): String = js.native
  
  def GetRemoteVaultAction(): IMetadataCardAction = js.native
  
  def GetSubObjectsAction(): IMetadataCardAction = js.native
  
  def GetValueListItemIdByGUID(propertyDefId: Double, guidToLookFor: String): Double = js.native
  def GetValueListItemIdByGUID(propertyDefId: MFBuiltInPropertyDef, guidToLookFor: String): Double = js.native
  
  val ID: String = js.native
  
  val IconURL: String = js.native
  
  val IsFileAvailableForPreview: Boolean = js.native
  
  def IsModified(): Boolean = js.native
  
  val IsUpdating: Boolean = js.native
  
  val ObjVers: IObjVers = js.native
  
  val ObjectId: IMetadataCardControl = js.native
  
  val ObjectType: IMetadataCardControl = js.native
  
  val ObjectTypeId: IMetadataCardControl = js.native
  
  val ObjectVersion: IMetadataCardControl = js.native
  
  val PermissionsDescription: String = js.native
  
  val PropertyControls: ICollection = js.native
  
  val PropertySelector: IMetadataCardControl = js.native
  
  def Rebuild(iterationCounter: Double, classChanged: Boolean, addedPropertyDef: Double): Boolean = js.native
  
  val SaveAsTypeSelector: IMetadataCardControl = js.native
  
  def SetAdditionalPropertyDefs(additionalPropertyDefs: Any): Unit = js.native
  
  def SetCustomPlaceholders(customPlaceholders: Any): Unit = js.native
  
  def SetRequiredPropertyDefs(requiredPropertyDefs: Any): Unit = js.native
  
  def SetUnevaluatedPropertyValues(unevaluatedValues: Any): Unit = js.native
  
  def ShowFilePreview(previewer: Any): Unit = js.native
  
  val Title: IMetadataCardControl = js.native
  
  val UncreatedObject: Boolean = js.native
}
